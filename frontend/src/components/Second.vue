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
      name: 'Second JS'
    }
  }
}
</script>

<style scoped lang="scss">
  div {
    font-size: 10px;
  }
</style>
