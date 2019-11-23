package pw.deja.springvuemultipage

import com.mitchellbosecke.pebble.extension.Extension
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pw.deja.springvuemultipage.pebble.PebbleExtension

@Configuration
class Configure {
    @Bean
    fun pebbleExtension(): Extension {
        return PebbleExtension()
    }
}