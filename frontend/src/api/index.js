import axios from 'axios';

// const url = {
//     baseURL: 'http://localhost:7070/mu/players'
// };

function showPlayerList() {
    return axios.get("/mu/players");
}

export { showPlayerList }