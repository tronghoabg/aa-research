package com.bumptech.glide.load.a.a;

import android.graphics.Bitmap;
import com.bumptech.glide.g.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    int f2967a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2968b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap.Config f2969c;

    public o(p pVar) {
        this.f2968b = pVar;
    }

    public final void a(int i2, Bitmap.Config config) {
        this.f2967a = i2;
        this.f2969c = config;
    }

    @Override // com.bumptech.glide.load.a.a.m
    public final void b() {
        this.f2968b.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f2967a == oVar.f2967a && r.k(this.f2969c, oVar.f2969c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f2967a * 31;
        Bitmap.Config config = this.f2969c;
        return i2 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return q.f(this.f2967a, this.f2969c);
    }
}
