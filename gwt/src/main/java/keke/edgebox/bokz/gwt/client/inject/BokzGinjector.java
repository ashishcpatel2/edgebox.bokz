package keke.edgebox.bokz.gwt.client.inject;

import keke.edgebox.bokz.gwt.client.ui.MainBundle;
import keke.edgebox.bokz.gwt.client.view.BokzMainView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(BokzModule.class)
public interface BokzGinjector extends Ginjector {
  EventBus getEventBus();

  MainBundle getMainBundle();

  BokzMainView getMainView();
}
