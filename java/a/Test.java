package com.reproducer.java.a;

import com.reproducer.module.util.MyClass;

public class Test {
  public void myClass(final Properties props) {
    final MyClass myClass = MyClass.apply(props.a, props.b, props.c, props.d);
    System.out.println(myClass);
  }

  static class Properties {
      public Integer a = 2;
      public Integer b = 16;
      public Long c = 10000L;
      public Integer d = 20000;
  }
}

