package search;

import base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu(){
       // typeOnElement(C,"Books");
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
}
