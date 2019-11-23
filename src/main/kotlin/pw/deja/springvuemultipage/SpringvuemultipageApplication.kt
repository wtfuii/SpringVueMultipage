package pw.deja.springvuemultipage

import com.mitchellbosecke.pebble.extension.Extension
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import pw.deja.springvuemultipage.pebble.PebbleExtension

@SpringBootApplication
class SpringvuemultipageApplication

fun main(args: Array<String>) {
	runApplication<SpringvuemultipageApplication>(*args)
}
