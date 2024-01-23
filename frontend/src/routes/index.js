import {createRouter, createWebHistory} from "vue-router";
import ListPage from "@/components/views/ListPage.vue";
import ManUnited from "@/components/common/ManUnited.vue";

const routes = [
    {
      path: '/',
      component: ManUnited,
    },
    {
        path: '/list',
        name: 'ListPage',
        component: ListPage,
    },
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL), routes
})

export default router
