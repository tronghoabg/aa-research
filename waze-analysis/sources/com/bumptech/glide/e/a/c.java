package com.bumptech.glide.e.a;

import com.bumptech.glide.g.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private com.bumptech.glide.e.d f2826a;

    public c() {
        if (!r.o(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // com.bumptech.glide.e.a.g
    public final com.bumptech.glide.e.d bm() {
        return this.f2826a;
    }

    @Override // com.bumptech.glide.e.a.g
    public final void d(f fVar) {
        fVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.e.a.g
    public final void e(f fVar) {
    }

    @Override // com.bumptech.glide.e.a.g
    public final void f(com.bumptech.glide.e.d dVar) {
        this.f2826a = dVar;
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
    }

    @Override // com.bumptech.glide.e.a.g
    public void l() {
    }

    @Override // com.bumptech.glide.e.a.g
    public void m() {
    }
}
