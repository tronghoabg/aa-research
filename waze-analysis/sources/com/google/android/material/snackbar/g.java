package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f6751a;

    g(o oVar) {
        Objects.requireNonNull(oVar);
        this.f6751a = oVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(1048576);
        accessibilityNodeInfoCompat.setDismissable(true);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        if (i2 != 1048576) {
            return super.performAccessibilityAction(view, i2, bundle);
        }
        this.f6751a.o(3);
        return true;
    }
}
