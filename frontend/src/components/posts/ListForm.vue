<template>
  <router-link to="/"> MainPage </router-link>
  <br>
  <div v-for="(item, idx) in list" :key="idx">
    <p>name: {{ item.name }}</p>
    <p>position: {{ item.position }}</p>
    <p>backnumber: {{ item.backnumber }}</p>
  </div>
</template>

<script>
import { showPlayerList } from '@/api/index.js'
export default {
  data() {
    return {
      list: {
        name: '',
        position: '',
        backnumber: '',
      },
    };
  },
  created() {
    showPlayerList()
        .then(response => (this.list = response.data.list))
        .catch(error => console.log(error));
  }
}
</script>

<style>

</style>