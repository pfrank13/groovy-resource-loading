package com.github.pfrank13;

import java.io.InputStream;

/**
 * @author pfrank
 */
public class JavaResourceLoader {
  public InputStream getResourceAsStreamFromClassLoader(final String name){
    return JavaResourceLoader.class.getClassLoader().getResourceAsStream(name);
  }

  public InputStream getResourceAsStreamFromClass(final String name){
    return JavaResourceLoader.class.getResourceAsStream(name);
  }

}
