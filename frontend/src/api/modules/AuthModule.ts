import {Module, Mutation, MutationAction, VuexModule} from "vuex-module-decorators";
import {store} from "@/store";
import axios from "axios";

const api = axios.create({ baseURL: "/api"});

@Module({dynamic: true, namespaced: true, store})
export class AuthModule extends VuexModule {

    user: any = null;

    @MutationAction({ mutate: ["user"]})
    public async login(user: string, password: string) {
        const {data} = await api.post<any>('/auth/login');
        return {
            user: data
        };
    }

}