package com.waze.ui.ae;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f41792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f41793b;

    public b(Context context, c cVar) {
        this.f41792a = context;
        this.f41793b = cVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        try {
            com.bumptech.glide.c.e(this.f41792a).f(this.f41793b);
        } catch (Exception unused) {
        }
    }
}
