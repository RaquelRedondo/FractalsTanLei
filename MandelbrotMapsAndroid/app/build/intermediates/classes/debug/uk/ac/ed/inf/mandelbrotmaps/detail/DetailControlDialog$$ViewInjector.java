// Generated code from Butter Knife. Do not modify!
package uk.ac.ed.inf.mandelbrotmaps.detail;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailControlDialog$$ViewInjector {
  public static void inject(Finder finder, final uk.ac.ed.inf.mandelbrotmaps.detail.DetailControlDialog target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558471, "field 'applyButton' and method 'onDetailApplyButtonClicked'");
    target.applyButton = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDetailApplyButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558472, "field 'defaultsButton' and method 'onDefaultDetailButtonClicked'");
    target.defaultsButton = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDefaultDetailButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558473, "field 'cancelButton' and method 'onDetailCancelButtonClicked'");
    target.cancelButton = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDetailCancelButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558467, "field 'mandelbrotBar'");
    target.mandelbrotBar = (android.widget.SeekBar) view;
    view = finder.findRequiredView(source, 2131558469, "field 'juliaBar'");
    target.juliaBar = (android.widget.SeekBar) view;
    view = finder.findRequiredView(source, 2131558468, "field 'mandelbrotText'");
    target.mandelbrotText = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131558470, "field 'juliaText'");
    target.juliaText = (android.widget.TextView) view;
  }

  public static void reset(uk.ac.ed.inf.mandelbrotmaps.detail.DetailControlDialog target) {
    target.applyButton = null;
    target.defaultsButton = null;
    target.cancelButton = null;
    target.mandelbrotBar = null;
    target.juliaBar = null;
    target.mandelbrotText = null;
    target.juliaText = null;
  }
}
