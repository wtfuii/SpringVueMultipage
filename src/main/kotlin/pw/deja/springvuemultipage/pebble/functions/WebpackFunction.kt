package pw.deja.springvuemultipage.pebble.functions

import com.mitchellbosecke.pebble.extension.Function
import com.mitchellbosecke.pebble.template.EvaluationContext
import com.mitchellbosecke.pebble.template.PebbleTemplate
import org.json.JSONObject
import org.springframework.core.io.ClassPathResource
import java.io.BufferedReader

abstract class WebpackFunction : Function {
    abstract val assetType: String

    override fun getArgumentNames(): MutableList<String> {
        return mutableListOf("entryName")
    }

    override fun execute(args: MutableMap<String, Any>?, self: PebbleTemplate?, context: EvaluationContext?, lineNumber: Int): Any {
        if (args == null) {
            return ""
        }
        val json = getAssetJson()

        val entryName = args["entryName"] ?: return ""
        val assetsByKey = json.optJSONObject(entryName.toString()) ?: return ""
        val path = assetsByKey.optString(assetType)
        return path ?: ""
    }

    private fun getAssetJson(): JSONObject {
        val resource = ClassPathResource("static/webpack-assets.json")
        val jsonString = resource.inputStream.bufferedReader().use(BufferedReader::readText)
        val json = JSONObject(jsonString)
        return json
    }
}