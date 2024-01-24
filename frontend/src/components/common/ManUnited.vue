<template>
  <div>
    <h1>Manchester United</h1>
    <router-link to="/list"> ListPage </router-link>
    <img alt="Vue logo" src="@/assets/mu.png">
  </div>
</template>

<script>
export default {
}
</script>

<!--router-link를 html로 보면 <a> 태그로 사용된다.-->
<!--a에 대한 css 를 지정하여 ListPage의 밑줄 제거-->
<style>
h1 {
  text-align: center;
}
img{
  margin: auto;
  display: block;
  width: 60%;
}
a {
  text-decoration: none;
}

</style>