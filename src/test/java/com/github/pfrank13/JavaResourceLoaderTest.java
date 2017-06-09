package com.github.pfrank13;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pfrank
 */
public class JavaResourceLoaderTest {
  private JavaResourceLoader resourceLoader;

  @Before
  public void setUp() throws Exception {
    resourceLoader = new JavaResourceLoader();
  }

  @Test
  public void absolutePathLoadFromClassLoader(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClassLoader("/config.properties")).isNotNull();
  }

  @Test
  public void absolutePathLoadFromClass(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClass("/config.properties")).isNotNull();
  }

  @Test
  public void relativePathLoadFromClassLoader(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClassLoader("config.properties")).isNotNull();
  }

  @Test
  public void relativePathLoadFromClass(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClass("config.properties")).isNotNull();
  }
}