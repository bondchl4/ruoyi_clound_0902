package com.ruoyi.controller;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.service.ProductService;
import com.ruoyi.system.api.RemoteUserService;
import com.ruoyi.system.api.RemoteUserServiceTest;
import com.ruoyi.system.api.model.LoginUser;
import com.ruoyi.vo.Product;
import com.ruoyi.vo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RemoteSystemApiTest {

    @Autowired
    RemoteUserService remoteUserService;

    @Autowired
    RemoteUserServiceTest remoteUserServiceTest;

    @Autowired
    ProductService productService;

    @PostMapping("/api/one")
    public AjaxResult one(@RequestBody Product product){

        Product productNew=new Product();
        productNew.setId(product.getId());
        productNew.setName(product.getName());
        return AjaxResult.success(productNew);
    }
    @PostMapping("/api/two")
    public AjaxResult two(@RequestBody Product product){
        Product productNewNew=new Product();
        productNewNew.setId(product.getId());
        return AjaxResult.success(productNewNew);



    }

    @GetMapping("/user/info/{username}")
    R<LoginUser> getUserInfo (@PathVariable("username") String username){
        return remoteUserService.getUserInfo(username, "inner");
    }

    @GetMapping("/user/info")
    AjaxResult getinfo(){
        return remoteUserService.getInfo();
    }

    @GetMapping("/user/infotest/{username}")
    AjaxResult getUserInfoTesttest(@PathVariable("username") long username){
        //tianjiazhuxi
        //return remoteUserServiceTest.getUserInfo(username);
        return AjaxResult.success(productService.getProductWithServices(username));
    }


    @GetMapping("/user/infotesttest/{id}")
    AjaxResult getUserInfoTesttest1(@PathVariable("id") long id) {
        //tianjiazhuxi
        return AjaxResult.success(productService.getProductWithServices(id));


    }
    @PostMapping("/user/product")
    AjaxResult postinfo(@RequestBody Product product){
        Service service = new Service();
        service.setName(product.getName());
        return AjaxResult.success(service);


    }



}
