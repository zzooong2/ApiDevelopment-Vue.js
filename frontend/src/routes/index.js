import {createRouter, createWebHistory} from "vue-router";
import ListPage from "@/components/views/ListPage.vue";

const routes = [
    {
        path: '/mu/players',
        name: 'ListPage',
        // code-splitting
        component: ListPage,
    },
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL), routes
})



export default router
