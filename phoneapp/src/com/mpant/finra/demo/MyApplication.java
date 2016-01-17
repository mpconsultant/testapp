package com.mpant.finra.demo;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.mpant.finra.demo.NumToaAlphaCnvService;

public class MyApplication extends Application {
     public Set<Class<?>> getClasses() {
         Set<Class<?>> s = new HashSet<Class<?>>();
         s.add(NumToaAlphaCnvService.class);
         return s;
     }
}
