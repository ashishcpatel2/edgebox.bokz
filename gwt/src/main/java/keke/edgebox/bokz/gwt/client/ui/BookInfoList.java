package keke.edgebox.bokz.gwt.client.ui;

import com.google.gwt.user.cellview.client.AbstractPager;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.view.client.HasRows;

public class BookInfoList extends AbstractPager {
  private ScrollPanel scrollPanel = new ScrollPanel();

  public BookInfoList() {
    super();
    initWidget(scrollPanel);
  }

  public void setDiaplay(HasRows display) {
    scrollPanel.setWidget((IsWidget) display);
    super.setDisplay(display);
  }

  @Override
  protected void onRangeOrRowCountChanged() {

  }

}
