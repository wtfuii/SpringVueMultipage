<template>
  <div>
    {{name}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function () {
    return {
      name: 'First JS'
    }
  }
}
</script>

<style scoped lang="scss">
div {
  font-size: 16px;
}
</style>
