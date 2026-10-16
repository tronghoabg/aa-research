package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class l extends com.google.android.material.k.k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6898d = 0;

    /* renamed from: c, reason: collision with root package name */
    j f6899c;

    /* synthetic */ l(j jVar) {
        super(jVar);
        this.f6899c = jVar;
    }

    final void O(float f2, float f3, float f4, float f5) {
        if (f2 == this.f6899c.w.left && f3 == this.f6899c.w.top && f4 == this.f6899c.w.right && f5 == this.f6899c.w.bottom) {
            return;
        }
        this.f6899c.w.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    @Override // com.google.android.material.k.k, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f6899c = new j(this.f6899c);
        return this;
    }
}
