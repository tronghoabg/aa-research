package com.waze.ui.k;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f42453a;

    public p(View view) {
        this.f42453a = view;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ViewCompat.setOnApplyWindowInsetsListener(this.f42453a, null);
    }
}
