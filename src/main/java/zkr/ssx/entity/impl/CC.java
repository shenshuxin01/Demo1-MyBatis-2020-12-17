package zkr.ssx.entity.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CC implements AA {




   public  void fun1(){
       System.out.println("CC");
    }
}
