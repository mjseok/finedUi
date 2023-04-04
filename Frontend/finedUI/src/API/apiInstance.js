import axios from 'axios';
import {MAIN_URL} from '@env';

console.log(MAIN_URL);
const apiInstance = () => {
  const instance = axios.create({
    baseURL: 'http://j8a108.p.ssafy.io:8080',
    headers: {
      'Content-Type': 'application/json;charset=UTF-8',
    },
  });

  return instance;
};

export default apiInstance;
