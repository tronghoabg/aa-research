package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6369a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f6370b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f6371c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6372d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6373e;

    ad(ag agVar, int i2, View view, int i3, int i4, int i5) {
        this.f6369a = i2;
        this.f6370b = view;
        this.f6371c = i3;
        this.f6372d = i4;
        this.f6373e = i5;
        Objects.requireNonNull(agVar);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = this.f6369a;
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        if (i2 >= 0) {
            View view2 = this.f6370b;
            view2.getLayoutParams().height = i2 + insets.top;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f6370b;
        view3.setPadding(this.f6371c + insets.left, this.f6372d + insets.top, this.f6373e + insets.right, view3.getPaddingBottom());
        return windowInsetsCompat;
    }
}
