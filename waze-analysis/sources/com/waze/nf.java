package com.waze;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class nf implements com.waze.resources.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f32426a;

    nf(kotlinx.coroutines.k kVar) {
        this.f32426a = kVar;
    }

    @Override // com.waze.resources.b
    public final void a(Drawable drawable) {
        this.f32426a.resumeWith(drawable != null ? DrawableKt.toBitmapOrNull$default(drawable, 0, 0, null, 7, null) : null);
    }
}
