package com.waze.navigate.social;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f31812a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f31813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ShareHelpActivity f31814c;

    a(ShareHelpActivity shareHelpActivity, View view, View view2) {
        this.f31812a = view;
        this.f31813b = view2;
        Objects.requireNonNull(shareHelpActivity);
        this.f31814c = shareHelpActivity;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int safeInsetBottom;
        int safeInsetLeft;
        int safeInsetRight;
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(2);
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout != null) {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            safeInsetRight = displayCutout.getSafeInsetRight();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
        } else {
            safeInsetBottom = 0;
            safeInsetLeft = 0;
            safeInsetRight = 0;
        }
        if (this.f31814c.aB()) {
            this.f31812a.setPadding(insets.left + safeInsetLeft, 0, insets.right + safeInsetRight, insets2.bottom + safeInsetBottom);
        } else {
            this.f31813b.setPadding(insets.left + safeInsetLeft, 0, insets.right + safeInsetRight, insets2.bottom + safeInsetBottom);
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
