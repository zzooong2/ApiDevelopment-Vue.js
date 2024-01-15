<template>
  <img alt="Vue logo" src="./assets/mu.png">
  <AppHeader></AppHeader>
  <ListPage></ListPage>
</template>

<script>
import AppHeader from './components/common/AppHeader.vue'
import ListPage from "@/components/views/ListPage.vue";

export default {
  name: 'App',
  components: {
    AppHeader,
    ListPage,
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
