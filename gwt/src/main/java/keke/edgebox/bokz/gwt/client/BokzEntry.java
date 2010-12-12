package keke.edgebox.bokz.gwt.client;

import java.util.logging.Logger;

import keke.edgebox.bokz.gwt.client.inject.BokzGinjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class BokzEntry implements EntryPoint {
  private static final Logger LOG = Logger.getLogger(BokzEntry.class.getName());

  @Override
  public void onModuleLoad() {
    LOG.info("Start loading module");
    RootLayoutPanel root = RootLayoutPanel.get();
    BokzGinjector injector = GWT.create(BokzGinjector.class);
    root.add(injector.getMainView());
  }
}
