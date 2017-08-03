public abstract class GG_controller extends BaseController {
  private ForumModel m_model = new ForumModel();
  
  protected abstract ForumModel createModel();
 
  public GG_Controller() {
    super();
    m_model = createModel();
  }
  
  lots_of_methods(){
    //so many methods
  }
}

public class YY_controller extends GG_controller{
  YY_controller(){
    super();
  }
 
  protected ForumModel createModel() {
    return new GG_ForumModel_WitchImplementForumModel();
  }
  
}
