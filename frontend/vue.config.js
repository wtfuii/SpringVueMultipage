const Chunks2JsonPlugin = require('chunks-2-json-webpack-plugin');
const fs = require('fs');

function getEntries() {
  const entryPath = 'src/entries';
  const entryFiles = fs.readdirSync(entryPath);
  result = {}
  entryFiles.forEach((entry) => {
    const fileTitle = entry.split('.')
    result[fileTitle[0]] = {
      entry: entryPath + '/' + entry
    }
  });
  return result
}

module.exports = {
  configureWebpack: {
    plugins: [
      new Chunks2JsonPlugin({outputDir: 'dist/'})
    ]
  },
  pages: getEntries()
}
