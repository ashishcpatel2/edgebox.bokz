package keke.edgebox.bokz.gwt.client.ui;

import keke.edgebox.bokz.gwt.client.model.BookInfo;
import keke.edgebox.bokz.gwt.client.view.BokzMainView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * @author keke
 */
public class BokzMainPanel extends ResizeComposite implements BokzMainView {
  interface BokzMainPanelUiBinder extends UiBinder<Widget, BokzMainPanel> {
  }

  private static BokzMainPanelUiBinder Binder = GWT
      .create(BokzMainPanelUiBinder.class);

  @UiField
  HTML bokzBar;
  @UiField(provided = true)
  MainBundle res;
  @UiField
  StackLayoutPanel stackPanel;
  @UiField
  BookInfoList bookInfoList;

  @Inject
  public BokzMainPanel(MainBundle res, CellTable<BookInfo> cellTable) {
    this.res = res;
    initWidget(Binder.createAndBindUi(this));
    bookInfoList.setDiaplay(cellTable);
  }
}