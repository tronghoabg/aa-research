package com.bumptech.glide.load.c.d;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3404a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3405b;

    public c(com.bumptech.glide.load.a.a.c cVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3404a = cVar;
        this.f3405b = jVar;
    }

    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        return this.f3404a.b(i2, i3, config);
    }

    public final void b(Bitmap bitmap) {
        this.f3404a.d(bitmap);
    }

    public final void c(byte[] bArr) {
        com.bumptech.glide.load.a.a.j jVar = this.f3405b;
        if (jVar == null) {
            return;
        }
        jVar.c(bArr);
    }

    public final void d(int[] iArr) {
        com.bumptech.glide.load.a.a.j jVar = this.f3405b;
        if (jVar == null) {
            return;
        }
        jVar.c(iArr);
    }

    public final byte[] e(int i2) {
        com.bumptech.glide.load.a.a.j jVar = this.f3405b;
        return jVar == null ? new byte[i2] : (byte[]) jVar.a(i2, byte[].class);
    }

    public final int[] f(int i2) {
        com.bumptech.glide.load.a.a.j jVar = this.f3405b;
        return jVar == null ? new int[i2] : (int[]) jVar.a(i2, int[].class);
    }
}
