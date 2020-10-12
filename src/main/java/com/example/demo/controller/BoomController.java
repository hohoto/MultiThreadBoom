package com.example.demo.controller;

import com.example.demo.bean.NumBean;
import com.example.demo.bean.PlayerBean;
import com.example.demo.command.IndexCommand;
import com.example.demo.command.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/Boom")
    public ModelAndView MyController(NumBean numBean, PlayerBean playerBean){
        ModelAndView mv = new ModelAndView();
        String oldName = playerBean.getUsername();
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
                mv.addObject("ToF","游戏结束,当前数字为"+indexCommand.getIndex()+"，玩家"+endName+"触发炸弹");
            }
        }
        mv.addObject("nowNum",indexCommand.getIndex());
        mv.setViewName("index");
        return mv;
    }
}
