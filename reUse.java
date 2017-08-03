public clasee DoThing(){
  
  //網頁進入點1
  public Result getList(){
    // 先檢查權限
    if(checkUser()){
      return "GG";
    }
    
    do_lots_thing1();
  }
  
  
  //網頁進入點2
  public Result getList1(){
    // 先檢查權限
    if(checkUser()){
      return "GG";
    }
    
    do_lots_thing2();
  }
  
  public boolean checkUser(){
    if(boss){
      return true;
    }
    return false;
  }

}
