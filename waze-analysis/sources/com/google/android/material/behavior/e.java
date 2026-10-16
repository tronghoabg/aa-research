package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends j {
    @Override // com.google.android.material.behavior.j
    final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.behavior.j
    final int b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.j
    final ViewPropertyAnimator c(View view, int i2) {
        return view.animate().translationX(i2);
    }

    @Override // com.google.android.material.behavior.j
    final void d() {
    }
}
