create table dy_image(
	id varchar(128) not null,
	filename varchar(255) null,
	filepath varchar(255) null,
	orderno int default NULL,
	iddelete tinyint null,
	type int  not null,
	flagdesc varchar(255) null,
	usedId varchar(128) null,
	createtime datetime not null,
	creater varchar(128) null,
	primary key(id)
)engine =myisam default charset =utf8 comment="图片表"