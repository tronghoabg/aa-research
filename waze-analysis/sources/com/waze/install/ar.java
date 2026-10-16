package com.waze.install;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar implements OnApplyWindowInsetsListener {
    ar(LocationFailedActivity locationFailedActivity) {
        Objects.requireNonNull(locationFailedActivity);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int safeInsetLeft;
        int safeInsetBottom;
        int safeInsetTop;
        int safeInsetRight;
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(2);
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout != null) {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetRight = displayCutout.getSafeInsetRight();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
        } else {
            safeInsetLeft = 0;
            safeInsetBottom = 0;
            safeInsetTop = 0;
            safeInsetRight = 0;
        }
        view.setPadding(insets.left + safeInsetLeft, insets.top + safeInsetTop, insets.right + safeInsetRight, insets2.bottom + safeInsetBottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
