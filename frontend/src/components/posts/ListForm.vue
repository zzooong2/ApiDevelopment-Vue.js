<template>
  <button @click="showPlayerList"> Show Player List </button>
  <p>{{ data }}</p>
<!--  <v-table>-->
<!--    <thead>-->
<!--      <tr>-->
<!--        <th>name</th>-->
<!--        <th>position</th>-->
<!--        <th>backnumber</th>-->
<!--      </tr>-->
<!--    </thead>-->
<!--    <tbody>-->
<!--      <tr v-for="item in list" :key="item">-->
<!--        <td>{{ item.name }}</td>-->
<!--        <td>{{ item.position }}</td>-->
<!--        <td>{{ item.backnumber }}</td>-->
<!--      </tr>-->
<!--    </tbody>-->
<!--  </v-table>-->
</template>

<script>
import {showPlayerList} from "@/api";

export default {
  data() {
    return {
      data: [],
    };
  },
  methods: {
    showPlayerList,
  }
}
</script>

<style>

</style>