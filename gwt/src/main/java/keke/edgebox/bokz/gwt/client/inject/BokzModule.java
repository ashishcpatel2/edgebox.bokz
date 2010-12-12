package keke.edgebox.bokz.gwt.client.inject;

import java.util.Arrays;

import keke.edgebox.bokz.gwt.client.model.BookInfo;
import keke.edgebox.bokz.gwt.client.ui.BokzMainPanel;
import keke.edgebox.bokz.gwt.client.ui.MainBundle;
import keke.edgebox.bokz.gwt.client.view.BokzMainView;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.IdentityColumn;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class BokzModule extends AbstractGinModule {

  @Override
  protected void configure() {
    bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    bind(BokzMainView.class).to(BokzMainPanel.class);
  }

  @Provides
  @Singleton
  MainBundle createMainBundle() {
    MainBundle r = GWT.create(MainBundle.class);
    r.css().ensureInjected();
    return r;
  }

  @Provides
  CellTable<BookInfo> createCellTable() {
    CellTable<BookInfo> table = new CellTable<BookInfo>();    
    Column<BookInfo, Boolean> checkColumn = new Column<BookInfo, Boolean>(
        new CheckboxCell()) {

      @Override
      public Boolean getValue(BookInfo object) {
        // TODO Auto-generated method stub
        return null;
      }
    };
    table.addColumn(checkColumn,
        SafeHtmlUtils.fromSafeConstant("<input type=\"checkbox\"/>"));
    TextColumn<BookInfo> name = new TextColumn<BookInfo>() {

      @Override
      public String getValue(BookInfo object) {
        return object.getName();
      }
    };
    table.addColumn(name, "Name");

    // test
    table.setRowData(0, Arrays.asList(new BookInfo(1, "test", "pdf")));
    return table;
  }
}
