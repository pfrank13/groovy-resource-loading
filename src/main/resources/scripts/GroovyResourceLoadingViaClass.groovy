package scripts

import org.assertj.core.api.Assertions

final InputStream is = this.getClass().getResourceAsStream('config.properties')

Assertions.assertThat(is).isNotNull()

final Properties properties = new Properties();
properties.load(is)
Assertions.assertThat(properties.getProperty('foo')).isEqualTo('bar')
