package com.shop.service.impl;

import com.shop.mapper.ProductMapper;
import com.shop.pojo.Product;
import com.shop.pojo.ProductExample;
import com.shop.service.ProductService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    //这个只是接口只有一个实现类时才这样 多个类还需要结合@Qualifier()
    // ,推荐@Resource这个适合一个接口 的多个实现类
    @Autowired
    ProductMapper productMapper;//自动注入了，因为dao.xml里面把那些SqlsessionFactory
    // Sqlsession配置好了 不需要最原始的那个 单独的mybatis-config来  操作 ,那样就是单独的了,没有合起来
    //以后就是这种模式
// <tx:method name="get*" propagation="SUPPORTS" read-only="true"/>

    //跟这些 切面 里面的这些传播行为 对上了,是sevice层里面的,不是web里面的contrller里面的
    //contlroler里面的是日志描述的哎
    @Override
    public List<Product> getProductList() {

        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
//        criteria.andImgLike("1").andDetailBetween("1","2");
        //巧妙的用了XxxExample的复杂条件查询,但又没有加条件,只是声明出来了,没有加条件 仔细看看
        List<Product> productList = productMapper.selectByExample(productExample);

        return productList;
    }

    @Override
    public Product getProductById(Integer id) {

        Product product = productMapper.selectByPrimaryKey(id);

        return product;
    }

    @Override
    public void updateItemById(Product product) {

        //productMapper直接用,因为在dao.xml里面配置了
        productMapper.updateByPrimaryKey(product);//这个也有法 ,仔细看看这些updte的区别和yongfa

    }


}
