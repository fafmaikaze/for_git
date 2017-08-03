public class GG_controller extends BaseController {
  private ForumModel m_model = new ForumModel();
  
  public setModel(ForumModel m_model){
    this.m_model= m_model;
  }
  
  lots_of_methods(){
    //so many methods
  }
}

public class YY_controller extends GG_controller{
  YY_controller(){
    super();
  }
  //I want to change m_model to class:SaleForumModel(extends from ForumModel)
  private SaleForumModel new_model = new SaleForumModel();
  super.setModel(ForumModel new_model);
  
}
