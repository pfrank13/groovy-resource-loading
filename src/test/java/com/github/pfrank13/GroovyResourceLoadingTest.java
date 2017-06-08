package com.github.pfrank13;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import org.assertj.core.api.Assertions;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * @author pfrank
 */
public class GroovyResourceLoadingTest {
  @Test
  public void runScriptLoadViaClassloader() throws IOException, URISyntaxException{
    final File scriptFile = new File(this.getClass().getResource("/scripts/GroovyResourceLoadingViaClassLoader.groovy").toURI());
    Assertions.assertThat(scriptFile).isNotNull();
    Assertions.assertThat(scriptFile.exists()).isTrue();

    final Properties compilerProperties = new Properties();
    compilerProperties.put("sourceEncoding", "UTF-8");
    final CompilerConfiguration compilerConfiguration = new CompilerConfiguration(compilerProperties);

    final GroovyShell groovyShell = new GroovyShell(Thread.currentThread().getContextClassLoader(), new Binding(), compilerConfiguration);
    try {
      groovyShell.evaluate(scriptFile);
    }catch(AssertionError ae){
      ae.printStackTrace();
      throw ae;
    }
  }

  @Test
  public void runScriptLoadViaClass() throws IOException, URISyntaxException{
    final File scriptFile = new File(this.getClass().getResource("/scripts/GroovyResourceLoadingViaClass.groovy").toURI());
    Assertions.assertThat(scriptFile).isNotNull();
    Assertions.assertThat(scriptFile.exists()).isTrue();

    final Properties compilerProperties = new Properties();
    compilerProperties.put("sourceEncoding", "UTF-8");
    final CompilerConfiguration compilerConfiguration = new CompilerConfiguration(compilerProperties);

    final GroovyShell groovyShell = new GroovyShell(Thread.currentThread().getContextClassLoader(), new Binding(), compilerConfiguration);
    try {
      groovyShell.evaluate(scriptFile);
    }catch(AssertionError ae){
      ae.printStackTrace();
      throw ae;
    }
  }
}
