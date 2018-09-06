package com.ido.zcsd.util;

import java.util.Map;

public interface FunctionInterface {

    @FunctionalInterface
    public interface BeforeCleanUp<K>{
        public void beforeCleanUp(Map<K,Object> toRemove);
    }
}
