import axios from 'axios';

export function queryAllVehicles(url) {
    return axios.get(url)
}

export function queryVehicles(url, reqEntity) {
    return axios.post(url, reqEntity)
}