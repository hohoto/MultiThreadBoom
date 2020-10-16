package com.example.demo.controller;

import com.example.demo.bean.NumBean;
import com.example.demo.bean.PlayerBean;
import com.example.demo.command.IndexCommand;
import com.example.demo.command.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BoomController {

    IndexCommand indexCommand = new IndexCommand();

    String endName;

    @RequestMapping("/")
    public ModelAndView UserController(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("getName");
        return mv;
    }

    @RequestMapping("index")
    public ModelAndView IndexController(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


    @ResponseBody
    @RequestMapping("/Boom")
    public HashMap MyController(NumBean numBean, PlayerBean playerBean){
        String oldName = playerBean.getUsername();
        String text = "游戏继续";

        HashMap hashMap = new HashMap();

        if(numBean.getUserCode()!=null){
            oldName = numBean.getUserCode();
        }
        Player a = new Player(indexCommand,oldName);
        if(numBean.getNum()==null){
            a.setNum(0);
            a.start();
        }
        else{
            a.setNum(Integer.valueOf(numBean.num));
            a.run();
            if(indexCommand.isToF()){
                if(endName==null){
                    endName = a.getUsername();
                }
                text = "游戏结束,当前数字为"+indexCommand.getIndex()+"，玩家"+endName+"触发炸弹";
            }
        }
        hashMap.put("ToF",text);
        hashMap.put("nowNum",indexCommand.getIndex());
        return hashMap;
    }
}
