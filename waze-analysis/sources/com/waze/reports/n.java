package com.waze.reports;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.waze.R;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends z {

    /* renamed from: b, reason: collision with root package name */
    private int f33946b;

    /* renamed from: c, reason: collision with root package name */
    private int f33947c;

    /* renamed from: e, reason: collision with root package name */
    private WazeTextView f33949e;

    /* renamed from: f, reason: collision with root package name */
    private View f33950f;

    /* renamed from: g, reason: collision with root package name */
    private TitleBar f33951g;

    /* renamed from: h, reason: collision with root package name */
    private OvalButton f33952h;

    /* renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f33945a = new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 15);

    /* renamed from: d, reason: collision with root package name */
    private boolean f33948d = false;

    /* renamed from: i, reason: collision with root package name */
    private int f33953i = R.string.LOCATION;

    /* renamed from: j, reason: collision with root package name */
    private int f33954j = R.string.MOVE_THE_MAP_TO_ADJUST_PIN_LOCATION;

    /* renamed from: k, reason: collision with root package name */
    private String f33955k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f33956l = 0;
    private final com.waze.shared_infra.o.a m = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ h.ab a(n nVar, String str) {
        nVar.f33949e.setText(str);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab b(n nVar, Boolean bool) {
        if (bool.booleanValue()) {
            nVar.f33951g.h(R.drawable.confirm_white_icon);
        } else {
            nVar.f33951g.h(R.drawable.v);
        }
        return h.ab.f48028a;
    }

    private final void o() {
        com.waze.shared_infra.g.e.c(this.f33950f.findViewById(R.id.editPlaceLocationRoot));
        TitleBar titleBar = (TitleBar) this.f33950f.findViewById(R.id.theTitleBar);
        this.f33951g = titleBar;
        com.waze.shared_infra.o.a aVar = this.m;
        titleBar.c(aVar.c(this.f33953i, new Object[0]));
        TextView textView = (TextView) this.f33950f.findViewById(R.id.editPlaceOk);
        this.f33952h = (OvalButton) this.f33950f.findViewById(R.id.editPlaceOkButton);
        String str = this.f33955k;
        if (str != null) {
            textView.setText(str);
            this.f33952h.setVisibility(0);
            this.f33952h.setOnClickListener(this.f33945a);
            this.f33951g.n(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 13));
        } else {
            this.f33951g.h(R.drawable.confirm_white_icon);
            this.f33951g.n(this.f33945a);
        }
        this.f33951g.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 14));
        WazeTextView wazeTextView = (WazeTextView) this.f33950f.findViewById(R.id.editPlaceLocationText);
        this.f33949e = wazeTextView;
        int i2 = this.f33956l;
        if (i2 == 3 || i2 == 4) {
            wazeTextView.setText(aVar.c(R.string.CARPOOL_LOCATION_PICKER_LOCATING, new Object[0]));
            this.f33949e.setTextSize(2, 16.0f);
            this.f33949e.setMinHeight(com.waze.ui.z.as.f(48));
            this.f33949e.setGravity(17);
        } else {
            wazeTextView.setText(aVar.c(this.f33954j, new Object[0]));
            if (this.f33955k != null) {
                OvalButton ovalButton = this.f33952h;
                ovalButton.setAlpha(1.0f);
                ovalButton.setOnClickListener(this.f33945a);
            }
        }
        k((FrameLayout) this.f33950f.findViewById(R.id.editPlaceLocationMapContainer), new com.waze.shared_infra.h.c(this.f33946b, this.f33947c), this.f33948d, new com.waze.car_lib.screens.am(this, 11), new com.waze.car_lib.screens.am(this, 12));
    }

    public final void c(String str) {
        this.f33955k = str;
    }

    public final void d(int i2) {
        this.f33954j = i2;
    }

    final void e(boolean z) {
        this.f33948d = z;
    }

    public final void f(int i2, int i3) {
        this.f33947c = i2;
        this.f33946b = i3;
    }

    public final void g(int i2) {
        this.f33953i = i2;
    }

    public final void h(int i2) {
        this.f33956l = i2;
    }

    @Override // android.support.v4.app.ar, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o();
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.edit_place_location, viewGroup, false);
        this.f33950f = viewInflate;
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        o();
    }
}
