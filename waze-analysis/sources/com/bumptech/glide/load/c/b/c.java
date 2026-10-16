package com.bumptech.glide.load.c.b;

import com.bumptech.glide.g.p;
import com.bumptech.glide.load.a.aw;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3386a;

    public c(byte[] bArr) {
        p.f(bArr);
        this.f3386a = bArr;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        return this.f3386a.length;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final /* synthetic */ Object c() {
        return this.f3386a;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final void e() {
    }
}
