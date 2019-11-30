-- 创建数据库
CREATE DATABASE booksystem;

-- 使用数据库
USE booksystem;

-- 创建图书表
CREATE TABLE `book`
(
    `book_id` BIGINT(20)   NOT NULL AUTO_INCREMENT COMMENT '图书ID',
    `name`    VARCHAR(100) NOt NULL COMMENT '图书名称',
    `number`  INT(11)      NOt NULL COMMENT '图书数量',
    `detail`  VARCHAR(200) NOT NULL COMMENT '图书描述',
    PRIMARY KEY (`book_id`)

) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='图书表';

-- 初始化数据
INSERT INTO book (book_id, name, number, detail)
VALUES (1, 'Spring实战', '1202', 'Spring经典图书之一'),
       (2, '算法', '1022', '计算机必备书籍之一'),
       (3, '算法导论', '1206', '算法进阶必备书籍'),
       (4, 'Thinking in Java', '1110', 'Java四大名著之首');
