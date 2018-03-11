Create Table Staff
(
StaffID int identity (101,1)  CONSTRAINT PKSTID PRIMARY KEY,
StaffPassWord  int   not null,
STAFFName vARCHAR(25) not null,
StaffLastName Varchar(25) not null,
StaffPhoneNo char(16) not null,
StaffPosition char (20) not null,
StaffSex char(7) not null,
StaffImage image

)
select* 
from Staff 
drop table Staff

insert into staff(StaffPassword, Staffname, StaffLastName, StaffPhoneNo,StaffPosition, StaffSex)
values (1234, 'Lucky', 'Okror', 0802222222222,'Registrar', 'Female' )


create table Student(

StudentRegCode int identity (10003,1) constraint PKSTUID primary key,
StudentName char (25) not null,
StudentSurname char (25) not null,
StudentAge int  not null,
StudentSex char (7) not null,
StudentAddress char (30) not null,
StudentClass Char (15) not null,

StudentID as StudentRegCode +1 ,
StudentRegDate datetime constraint def3 default getdate() not null,
StudentPosition char (25),
StudentAttendance int not null,
StudentImage image, 
StaffId int constraint FkStid foreign key references Staff (staffid) not null 


/* Sample used to auto increment StudentId
detail_id INTEGER NOT NULL IDENTITY(1,2)
detail_print_id AS detail_id + 1*/
)
select * from Student where StudentID = 10004; select * from ReportCard where StudentID =10004
drop table Student
select*
from Student
select* from Student where StudentName = StudentId = 10004 
insert into Student (StudentName, StudentSurname,StudentAge,StudentSex,StudentAddress,StudentClass,StudentPosition, StudentAttendance, StaffId)
values ('Mike','Duke', 16,'Male','12 Awoyemi Close','SSS 2', 'PRO', 97,102 )

alter table Student
add
StudentSex char (7) not null,
StudentAddress char (30) not null,
StudentClass Char (15) not null



create table ReportCard(
StudentId int constraint FKSTUID foreign key references Student (StudentRegCode) not null,
Subjects char (20) not null,

Grade char (3) ,

GradeScore int ,
Semester int ,
ReportDate datetime constraint Def4 default getDate (),

 PromotionStatus char (30) 
)
select *
from ReportCard
select *
from ReportCard where StudentID = 10004
select * from ReportCard where Subjects = 'Math'
drop table ReportCard
insert into ReportCard (Studentid,Subjects)
values (10003, 'Further mathematics')
select GradeScore from ReportCard where StudentID = 10004 and  Subjects = 'Math'


/*Math, 'English', 'Biology','Physic','Chemistry', 'Commerce', 'Account', 
'Igbo','Yoruba', 'Hausa',' French', 'Government','Agricultural Science', 'Geography', 'Economics','Literature', 'Computer Studies',
 'CRS', 'IRS','Further mathematics')*/

 alter Table ReportCard
 add StudentId int constraint FKSTUID foreign key references Student (StudentRegCode) not null