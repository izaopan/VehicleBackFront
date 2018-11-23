import {queryVehicles, queryAllVehicles} from '../utils/HttpUtils'

export function getAllVehicles(url) {
    return queryAllVehicles(url).then(resp => resp.data);
}

export function getVehicles(url, reqEntity) {
    return queryVehicles(url, reqEntity).then(resp => resp.data);
}