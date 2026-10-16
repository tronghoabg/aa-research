package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6287a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6288b;

    e(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f6287a = i2;
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6288b = bottomSheetBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f6288b.x(this.f6287a);
        return true;
    }
}
