package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckableImageButton f6578a;

    a(CheckableImageButton checkableImageButton) {
        Objects.requireNonNull(checkableImageButton);
        this.f6578a = checkableImageButton;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f6578a.isChecked());
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        CheckableImageButton checkableImageButton = this.f6578a;
        accessibilityNodeInfoCompat.setCheckable(checkableImageButton.d());
        accessibilityNodeInfoCompat.setChecked(checkableImageButton.isChecked());
    }
}
