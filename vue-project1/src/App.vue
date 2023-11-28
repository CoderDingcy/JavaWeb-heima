<template>
  <div>
    <!-- <element-view></element-view> -->
    <!-- <h1>{{message}}</h1> -->
    
    <!-- 引入新的组件-员工管理 -->
    <!-- <emp-view></emp-view> -->
    <router-view></router-view>

  </div>
</template>
<script>
// import EmpView from './views/tlias/EmpView.vue'
// import ElementView from './views/element/ElementView.vue'
export default {
  components: { /*EmpView*/ },
  // components: { ElementView },
  data(){
    return {
      message:"Hello Vue"
    }
  }

}
</script>
<style>

</style>
