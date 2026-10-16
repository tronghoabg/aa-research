package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u extends AccessibilityDelegateCompat {
    u(z zVar) {
        Objects.requireNonNull(zVar);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setScrollable(false);
    }
}
