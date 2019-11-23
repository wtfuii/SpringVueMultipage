const AssetsPlugin = require('assets-webpack-plugin')
const fs = require('fs');

const entryPath = 'src/entries';

function getEntriyFiles() {
  return fs.readdirSync(entryPath);
}

function getEntries() {
  result = {}
  getEntriyFiles().forEach((entry) => {
    const fileTitle = entry.split('.')
    result[fileTitle[0]] = {
      entry: entryPath + '/' + entry
    }
  });
  return result
}

module.exports = {
  chainWebpack: function (config) {
    getEntriyFiles().map(file => file.split('.')[0]).forEach(entryName => {
      config.plugins.delete(`html-${entryName}`)
      config.plugins.delete(`preload-${entryName}`)
      config.plugins.delete(`prefetch-${entryName}`)
    })
  },
  outputDir: "../src/main/resources/static",
  configureWebpack: {
    plugins: [
      new AssetsPlugin({path: "../src/main/resources/static"})
    ]
  },
  pages: getEntries(),
}
