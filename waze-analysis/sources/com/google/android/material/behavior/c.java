package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends j {
    @Override // com.google.android.material.behavior.j
    final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.j
    final int b() {
        return 1;
    }

    @Override // com.google.android.material.behavior.j
    final ViewPropertyAnimator c(View view, int i2) {
        return view.animate().translationY(i2);
    }

    @Override // com.google.android.material.behavior.j
    final void d() {
    }
}
