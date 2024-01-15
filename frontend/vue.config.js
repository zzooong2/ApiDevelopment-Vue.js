const { defineConfig } = require('@vue/cli-service');
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    // API 주소와 웹 페이지 주소를 동일하게 함으로써 CORS를 해결하고
    // proxy를 설정을 통해 실제 API 주소로 변경해줌으로써 정상적인 응답값을 얻을 수 있다.
    proxy: {
      "/mu/players": {
      target: 'http://localhost:7070',
      changeOrigin: true,
      }
    },
    client: {
      overlay: false, // ESLint의 overlay를 꺼준다 -> 콘솔에서는 오류가 보이고 실제 웹 화면에서는 아무런 동작이 없음
    },
  },
});
