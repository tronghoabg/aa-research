package com.waze.ui.r.a.a;

import android.graphics.Bitmap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f43306a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f43307b;

    public s(MutableState mutableState, MutableState mutableState2) {
        this.f43306a = mutableState;
        this.f43307b = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f43306a.setValue(null);
        MutableState mutableState = this.f43307b;
        Bitmap bitmapA = t.a(mutableState);
        if (bitmapA != null) {
            bitmapA.recycle();
        }
        mutableState.setValue(null);
    }
}
