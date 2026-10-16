package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends com.google.android.material.k.i {
    private final RectF w;

    /* synthetic */ j(j jVar) {
        super(jVar);
        this.w = jVar.w;
    }

    @Override // com.google.android.material.k.i, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i2 = l.f6898d;
        k kVar = new k(this);
        kVar.invalidateSelf();
        return kVar;
    }

    /* synthetic */ j(com.google.android.material.k.r rVar, RectF rectF) {
        super(rVar);
        this.w = rectF;
    }
}
