package pw.deja.springvuemultipage.pebble

import com.mitchellbosecke.pebble.extension.AbstractExtension
import com.mitchellbosecke.pebble.extension.Function
import pw.deja.springvuemultipage.pebble.functions.WebpackCssFunction
import pw.deja.springvuemultipage.pebble.functions.WebpackJsFunction


class PebbleExtension : AbstractExtension() {
    override fun getFunctions(): MutableMap<String, Function> {
        val result = HashMap<String, Function>()
        result["webpackJsPath"] = WebpackJsFunction()
        result["webpackCssPath"] = WebpackCssFunction()
        return result
    }
}