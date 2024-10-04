# mysql

### 启动mysql

docker run -itd --name myspring -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql


### 进入mysql

docker exec -it myspring bash

### 查看数据库

show databases;

### 创建数据库

create database myspring;

### 选择数据库

use myspring

### 创建表

```sql
CREATE TABLE user (
    id SERIAL PRIMARY KEY,
    no VARCHAR(20) NOT NULL,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    sex INT NOT NULL,
    phone VARCHAR(20) NOT NULL,
    role_id INT NOT NULL,
    isValid VARCHAR(4) DEFAULT 'Y' NOT NULL
);
```


