package scripts

import org.assertj.core.api.Assertions

final InputStream is = this.getClass().classLoader.getResourceAsStream('config.properties')

Assertions.assertThat(is).isNotNull() //This will pass just fine

final Properties properties = new Properties();
properties.load(is)
Assertions.assertThat(properties.getProperty('foo')).isEqualTo('bar')
