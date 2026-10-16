package com.waze.ifs.ui;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f24541a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditTextDialogActivity f24542b;

    c(EditTextDialogActivity editTextDialogActivity, View view) {
        this.f24541a = view;
        Objects.requireNonNull(editTextDialogActivity);
        this.f24542b = editTextDialogActivity;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        EditTextDialogActivity editTextDialogActivity = this.f24542b;
        if (editTextDialogActivity.aB()) {
            int iC = com.waze.design_components.d.b.c(this.f24541a);
            LinearLayout linearLayout = (LinearLayout) editTextDialogActivity.findViewById(R.id.whiteFrame);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), iC);
            return windowInsetsCompat;
        }
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(128);
        this.f24541a.setPadding(insets.left + insets2.left, 0, insets.right + insets2.right, insets.bottom + insets2.bottom);
        return windowInsetsCompat;
    }
}
