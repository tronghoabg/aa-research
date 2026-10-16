package com.bumptech.glide.load.c.d;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    final k f3406a;

    d(k kVar) {
        this.f3406a = kVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this);
    }
}
