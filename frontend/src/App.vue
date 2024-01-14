<template>
  <img alt="Vue logo" src="./assets/mu.png">
  <AppHeader></AppHeader>
</template>

<script>
import AppHeader from './components/common/AppHeader.vue'

export default {
  name: 'App',
  components: {
    AppHeader,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
