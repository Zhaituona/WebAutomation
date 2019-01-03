package search;

import base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu(){
        //  typeOnElementNEnter("#twotabsearchtextbox","books");
      typeOnElement("#twotabsearchtextbox","Books");
      clickOnSearch();
      navigateBack();
      //  typeOnElementNEnter("#twotabsearchtextbox","honey");
      //  navigateBack();
      //  typeOnElementNEnter("#twotabsearchtextbox","mac");
      //  navigateBack();
     // typeOnElementNEnter("#twotabsearchtextbox","Books");
       // navigateBack();
       // clearField("twotabsearchtextbox");
    }

    public void dropDownList(){
        dropDown();
    }
}
