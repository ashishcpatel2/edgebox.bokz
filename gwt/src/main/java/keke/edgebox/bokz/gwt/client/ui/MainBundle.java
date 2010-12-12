package keke.edgebox.bokz.gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * @author keke
 */
public interface MainBundle extends ClientBundle {
  MainBundle INS = GWT.create(MainBundle.class);

  @Source("main.css")
  Style css();

  interface Style extends CssResource {
    String rightalign();

    String bbar();

    String listPanel();

    String infoList();

    String searchBar();

    String toolBar();
  }
}
