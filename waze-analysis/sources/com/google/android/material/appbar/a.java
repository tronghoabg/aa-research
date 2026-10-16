package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends AccessibilityDelegateCompat {
    a(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        Objects.requireNonNull(appBarLayout$BaseBehavior);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        throw null;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        if (i2 == 4096) {
            throw null;
        }
        if (i2 == 8192) {
            return false;
        }
        return super.performAccessibilityAction(view, i2, bundle);
    }
}
