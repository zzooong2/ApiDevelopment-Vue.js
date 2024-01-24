<template>
  <router-link to="/"> MainPage </router-link>
  <br>
  <table style="margin-left: auto; margin-right: auto;">
    <thead>
      <tr>
        <th>선수명</th>
        <th>포지션</th>
        <th>등번호</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="item in list" :key="item.backnumber">
        <td>{{item.name}}</td>
        <td>{{item.position}}</td>
        <td>{{item.backnumber}}</td>
      </tr>
    </tbody>
  </table>
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
      }
    }
  },
  created() {
    var vm = this;
    showPlayerList()
        .then(function (response){
          console.log(response);
          vm.list = response.data;
        })
        .catch(function (error) {
          console.log(error);
        });
  },
}
</script>

<style>
table {
  text-align: center;
}
</style>