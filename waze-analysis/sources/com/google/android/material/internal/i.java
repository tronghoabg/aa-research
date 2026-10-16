package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NavigationMenuItemView f6601a;

    i(NavigationMenuItemView navigationMenuItemView) {
        Objects.requireNonNull(navigationMenuItemView);
        this.f6601a = navigationMenuItemView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        NavigationMenuItemView navigationMenuItemView = this.f6601a;
        accessibilityNodeInfoCompat.setCheckable(navigationMenuItemView.f6571c);
        accessibilityNodeInfoCompat.setRoleDescription(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
    }
}
