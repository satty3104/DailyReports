-- #df:changeUser(root)#
-- #df:checkUser(mainUser, grant)#
grant all privileges on /*$dfprop.mainCatalog*/.*
  to /*$dfprop.mainUser*/@localhost identified by '/*$dfprop.mainPassword*/';

flush privileges;
