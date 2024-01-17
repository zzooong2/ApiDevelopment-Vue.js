<template>
  <h1>List Page</h1>
  <div>
    <p>{{showList.name}}</p>
    <p>{{showList.position}}</p>
    <p>{{showList.backnumber}}</p>
  </div>
</template>

<script>
import {showPlayerList} from "@/api";

export default {
  data() {
    return {
      name: '',
      position: '',
      backnumber: '',
    }
  },
  methods: {
    showList() {
      return showPlayerList();
    }
  }
}
</script>

<style>

</style>