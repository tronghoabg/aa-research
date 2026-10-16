package com.waze.install;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Space;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListView f24768a;

    av(SelectCountryActivity selectCountryActivity, ListView listView) {
        this.f24768a = listView;
        Objects.requireNonNull(selectCountryActivity);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int safeInsetBottom;
        int safeInsetLeft;
        int safeInsetRight;
        Insets insets = windowInsetsCompat.getInsets(2);
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
        view.setPadding(safeInsetLeft, 0, safeInsetRight, 0);
        ListView listView = this.f24768a;
        Space space = new Space(listView.getContext());
        space.setLayoutParams(new AbsListView.LayoutParams(-1, insets.bottom + safeInsetBottom));
        listView.addFooterView(space);
        return WindowInsetsCompat.CONSUMED;
    }
}
