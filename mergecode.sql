insert into checking_account_stg values(4, 'Potter World', 20,current_date(),current_date());

merge into checking_account ca using checking_account_stg cas
on ca.accountnumber=cas.accountnumber 
when not matched then 
insert (accountnumber,accountname,accountbalance,createdatetime,updatedatetime)
values(cas.accountnumber, cas.accountname,cas.accountbalance,cas.createdatetime,cas.updatedatetime);
 
