import Vue from 'vue';
import Router from 'vue-router';
import './views/Home.vue';

import {getRoutes} from "@propero/vue-extra-decorators";

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: getRoutes()
});
