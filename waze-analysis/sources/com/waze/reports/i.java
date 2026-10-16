package com.waze.reports;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f33938a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f33939b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ClosureMap f33940c;

    i(ClosureMap closureMap, View view, View view2) {
        this.f33938a = view;
        this.f33939b = view2;
        Objects.requireNonNull(closureMap);
        this.f33940c = closureMap;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ClosureMap closureMap = this.f33940c;
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(2);
        if (closureMap.aB()) {
            this.f33938a.setPadding(insets.left, 0, insets.right, insets2.bottom);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33939b.getLayoutParams();
            marginLayoutParams.leftMargin = insets.left;
            marginLayoutParams.rightMargin = insets.right;
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
