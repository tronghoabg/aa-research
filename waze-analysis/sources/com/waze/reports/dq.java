package com.waze.reports;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.waze.R;
import com.waze.sharedui.views.AutoResizeTextView;
import com.waze.view.button.ReportMenuButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dr f33858a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f33859b;

    /* renamed from: c, reason: collision with root package name */
    private int f33860c;

    dq(dr drVar, RelativeLayout relativeLayout) {
        Objects.requireNonNull(drVar);
        this.f33858a = drVar;
        this.f33859b = relativeLayout;
    }

    final void a(String str, int i2, int i3, View.OnClickListener onClickListener) {
        dr drVar = this.f33858a;
        LinearLayout linearLayout = new LinearLayout(drVar.f33867g);
        linearLayout.setClickable(true);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setId(i2);
        ReportMenuButton reportMenuButton = new ReportMenuButton(drVar.f33867g);
        reportMenuButton.g(drVar.f33867g.getResources().getDimensionPixelSize(R.dimen.reportCategoryImageSize));
        reportMenuButton.f(i2);
        reportMenuButton.setBackgroundColor(i3);
        reportMenuButton.setOnClickListener(onClickListener);
        linearLayout.addView(reportMenuButton, com.waze.ui.z.as.g(drVar.f33867g, 100), com.waze.ui.z.as.g(drVar.f33867g, 105));
        AutoResizeTextView autoResizeTextView = new AutoResizeTextView(new ContextThemeWrapper(drVar.f33867g, R.style.MenuButton_v4));
        autoResizeTextView.setText(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, com.waze.ui.z.as.g(drVar.f33867g, -7), 0, 0);
        linearLayout.addView(autoResizeTextView, layoutParams);
        drVar.f33868h.add(reportMenuButton);
        drVar.f33869i.add(autoResizeTextView);
        linearLayout.setId(this.f33860c + 100);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(drVar.f33870j, drVar.f33871k);
        this.f33860c++;
        this.f33859b.addView(linearLayout, layoutParams2);
    }
}
