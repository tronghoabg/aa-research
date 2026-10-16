package com.bumptech.glide.load.c.a;

import android.content.res.Resources;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.u f3290a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f3291b;

    public a(Resources resources, com.bumptech.glide.load.u uVar) {
        com.bumptech.glide.g.p.f(resources);
        this.f3291b = resources;
        com.bumptech.glide.g.p.f(uVar);
        this.f3290a = uVar;
    }

    @Override // com.bumptech.glide.load.u
    public final com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return ak.f(this.f3291b, this.f3290a.a(obj, i2, i3, sVar));
    }

    @Override // com.bumptech.glide.load.u
    public final boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return this.f3290a.b(obj, sVar);
    }
}
