package com.github.pfrank13

/**
 * @author pfrank
 */
class ResourceLoader {
  InputStream getResourceAsStreamFromClassLoader(String name){
    ResourceLoader.classLoader.getResourceAsStream(name)
  }

  InputStream getResourceAsStreamFromClass(String name){
    ResourceLoader.getResourceAsStream(name)
  }
}
