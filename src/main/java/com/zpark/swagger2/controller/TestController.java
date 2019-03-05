/**
 * @Title: TestController
 * @ProjectName swagger2
 * @Description: TODO
 * @author 谢浩哲
 * @date 2019/3/420:30
 */

package com.zpark.swagger2.controller;

import com.zpark.swagger2.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(value = "TestSwagger Controller", tags = "swagger 操作接口")
@RestController
@RequestMapping("/swagger")
public class TestController {
    @ApiOperation(value = "根据用户名，获取欢迎语", notes = "注意事项")
    @GetMapping("/sayHello")
    public String sayHello(@ApiParam(name = "name", value = "用户名", required = true)
                                       @RequestParam(required = true) String name) {
        System.out.println("name = [" + name + "]");
        return "hello:" + name;
    }

    @ApiOperation(value = "新增用户信息")
    @PostMapping("/add")
    public String  addUser (@RequestBody @ApiParam(name = "user", value = "用户对象", required = true) User user){
        System.out.println("user = " + user);
        return "ok";
    }

    @ApiOperation(value = "根据年龄和姓名查询用户信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "userAge", value = "用户年龄", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "name", value = "用户姓名", dataType = "String", paramType = "query")})
    @GetMapping("/select")
    public String selectUser(@RequestParam("userAge") Integer age, String name) {
        return age + "|" + name;
    }
}
