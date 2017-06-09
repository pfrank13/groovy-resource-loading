package com.github.pfrank13

import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test

/**
 * @author pfrank
 */
class ResourceLoadingTest {
  ResourceLoader resourceLoader

  @Before
  void setUp(){
    resourceLoader = new ResourceLoader()
  }

  @Test
  void absolutePathLoadFromClassLoader(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClassLoader('/config.properties')).isNotNull()
  }

  @Test
  void absolutePathLoadFromClass(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClass('/config.properties')).isNotNull()
  }

  @Test
  void relativePathLoadFromClassLoader(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClassLoader('config.properties')).isNotNull()
  }

  @Test
  void relativePathLoadFromClass(){
    Assertions.assertThat(resourceLoader.getResourceAsStreamFromClass('config.properties')).isNotNull()
  }
}
