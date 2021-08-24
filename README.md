# SpringBootAndNuxtJs


## SpringBoot와 NuxtJs 연결함으로써 SSR 페이지 구현 완료
참고 사이트 : 
1. https://github.com/jittagornp/spring-boot-webflux-nuxtjs
2. https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=buskerlic&logNo=221435561090

```
nuxt.js.config의

  export default {

  target: 'static',
  mode: 'universal',
  generate: {
    dir: '../main/resources/static' //  generate 파일을 spring의 static 경로에 넣기 위함.
  
  },
  를 넣는 것이 핵심
  
  
후에 nuxt.js 프로젝트에서 npm run generate spring의 static 경로에 index.html 파일 생성
