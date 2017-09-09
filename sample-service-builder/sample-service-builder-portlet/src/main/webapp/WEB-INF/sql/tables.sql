create table sample_sb_Student (
	studentId LONG not null primary key,
	studentName LONG,
	dob VARCHAR(75) null,
	standard DATE null
);

create table sample_sb_Teacher (
	teacherId LONG not null primary key,
	teacherName LONG,
	dob LONG,
	subject LONG
);