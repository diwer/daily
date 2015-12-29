CREATE TABLE `dy_daily` (
  `id` char(128) NOT NULL,
  `content` text,
  `htmlcontent` text,
  `isdelete` tinyint(4) DEFAULT NULL COMMENT '1为删除，0为正常',
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日记表';

