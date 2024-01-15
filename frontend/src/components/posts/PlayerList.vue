<template>
 <a href="javascript:;" @click="showList"> Player List </a>
</template>

<script>
import { showPlayerList } from "@/api/index.js";

export default {

  methods: {
    showList() {
      return showPlayerList();
    }
  }
}
</script>

<style>

</style>