// Generated code from Butter Knife. Do not modify!
package uk.ac.ed.inf.mandelbrotmaps.menu;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MenuDialog$$ViewInjector {
  public static void inject(Finder finder, final uk.ac.ed.inf.mandelbrotmaps.menu.MenuDialog target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558476, "method 'resetButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.resetButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558479, "method 'toggleSmallButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.toggleSmallButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558488, "method 'theoremButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.theoremButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558485, "method 'settingsButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.settingsButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558482, "method 'detailButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.detailButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558491, "method 'saveButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.saveButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558494, "method 'shareButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.shareButtonClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558497, "method 'helpButtonClicked'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.helpButtonClicked();
        }
      });
  }

  public static void reset(uk.ac.ed.inf.mandelbrotmaps.menu.MenuDialog target) {
  }
}
