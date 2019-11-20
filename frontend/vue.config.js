const AssetsPlugin = require('assets-webpack-plugin')
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
  outputDir: "../src/main/resources/static",
  configureWebpack: {
    plugins: [
      new AssetsPlugin({path: "../src/main/resources/static"})
    ]
  },
  pages: getEntries(),
}
