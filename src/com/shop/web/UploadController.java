package com.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@ResponseBody
public class UploadController {
    @RequestMapping(value = "/uploadOneItem.action")//@RequestMaping有点厉害
    //都接收了,即接收文本,也接收了文件
    //这个用的是mvc的框架，文本都封装到了 对象里了，哎，文件 也接收,只不过分成了方法的两个参数
    //文本之类的,前端的只要name后后端的类(bean的属性对应),直接后端mvc接收时,直接就封装进去了
    //可能就是springmvc web的优势
    public String updateItemById(HttpServletRequest httpServletRequest,
                                 MultipartFile file) throws IOException {

        //MultipartFile  这个是不是就是 多文件接口 对

        //还没判空的,万一用户不选择上传 就 要出错了

        // System.out.println(productService + "2");
//        MultipartFile竟然sping mvc 的web里面有这个
//        MultipartFile fileUpload一定要写前端里面的那个type=file的name要对应
        //拿那个 comomos io 和commos file upload两个jar没必要引入
        //以为springmvc 里的那个web，webmvc包里面有


//        MultipartFile这不就跟原生导入那几个包 差不多了,servelt 3.0新特性差不多，
//        3.0用的时Part里面也是封装的这些

        //  fileUpload.getOriginalFilename()
        // System.out.println("--------------" + fileUpload.getOriginalFilename());
        //productService.updateItemById(product);

        //System.out.println("1111111111111" + fileUpload);
        // System.out.println("22222222222" + fileUpload.getOriginalFilename());

//ileUpload.getOriginalFilename()包括了后缀名,就是用户上传的文件的全部名称包括后缀
        String newName = UUID.randomUUID().toString() + file.getOriginalFilename().
                substring(file.getOriginalFilename().lastIndexOf("."));

        

        //用户不选择上传的话就会,导致这里出错

//   substring(fileUpload.getOriginalFilename().lastIndexOf("."))  substring 是从
        //substring 是从 指定的索引开始的知道末尾，对，lastindexof 虽然从后面开始，但索引还是正向的

//        product.setImg(newName);//这个非常重要
        //从左到右这么看

//        this.productService.updateItemById(product);
//fileUpload相当于一个流，io里面的，这么想
        //这而的目的是上传一个文件到服务器，我们的电脑目前就相当于客户端和服务端
        //这个更那个展示的图片无关
//        fileUpload.transferTo(new File("C:\\src\\C01\\" + newName));
        //    fileUpload.transferTo(new File("C:\\src\\C01\\" + newName));文件没得可以帮你创建
        //目录没得就会报错，非常重要

        //这些方法不就相当于时servlet,我在里面写,上传文件,没有影响把
//难怪啊,使用web资源 还是 创建都是需要全部的物理全路径a啊
        //很明显,最好下载到web下面,通过gerrealpath(),只有这样前端才能快速的拿到相应的资源

        //
//        fileUpload.transferTo(new File(httpServletRequest.getContextPath()+
//                "/images/"+newName));
        file.transferTo(new File(httpServletRequest
                .getServletContext().getRealPath("./")+
                "userUpload/"+newName));//这个值得仔细看看
//        用户上传的 保存到的目录不要为空,目录名字不要带特殊字符,否则要出很多错,非常重要,坑啊
//这就是拿到的路径,仔细看看
//C:\Users\Administrator\IdeaProjects\
//
// ideaLearn\out\artifacts\SpringMVClearn2_war_exploded\
// images\f86d47fa-dcdb-4604-82b7-2e3c0bbde037.png]
        return "1"; //因为用的html所以,不是jsp所以那个路径 就没法,
        //配置了@responsebody  就返回类似文本,json等都是文本
    }

}
