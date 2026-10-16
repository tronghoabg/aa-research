package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f6493a;

    w(z zVar) {
        Objects.requireNonNull(zVar);
        this.f6493a = zVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        z zVar = this.f6493a;
        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, zVar.f6507l.getVisibility() == 0 ? zVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : zVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
