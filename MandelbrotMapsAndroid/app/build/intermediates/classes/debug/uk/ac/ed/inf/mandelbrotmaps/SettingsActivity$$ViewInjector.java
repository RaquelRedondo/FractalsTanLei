// Generated code from Butter Knife. Do not modify!
package uk.ac.ed.inf.mandelbrotmaps;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SettingsActivity$$ViewInjector {
  public static void inject(Finder finder, final uk.ac.ed.inf.mandelbrotmaps.SettingsActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558500, "field 'mainToolbar'");
    target.mainToolbar = (android.support.v7.widget.Toolbar) view;
  }

  public static void reset(uk.ac.ed.inf.mandelbrotmaps.SettingsActivity target) {
    target.mainToolbar = null;
  }
}
