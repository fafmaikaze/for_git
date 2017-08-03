public class gg_controller extends BaseController {
  private ForumModel m_model = new ForumModel();
  
  public setModel(ForumModel m_model){
    this.m_model= m_model;
  }
  
  lots_of_methods(){
    //so many methods
  }
}

public class yy_controller extends gg_controller{
  yy_controller(){
    super();
  }
  //I want to change m_model to class:SaleForumModel(extends from ForumModel)
  private SaleForumModel new_model = new SaleForumModel();
  super.setModel(ForumModel new_model);
  
}
