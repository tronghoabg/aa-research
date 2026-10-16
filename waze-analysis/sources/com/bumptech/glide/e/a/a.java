package com.bumptech.glide.e.a;

import com.bumptech.glide.g.r;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private com.bumptech.glide.e.d f2825a;

    @Override // com.bumptech.glide.e.a.g
    public com.bumptech.glide.e.d bm() {
        return this.f2825a;
    }

    @Override // com.bumptech.glide.e.a.g
    public void c() {
    }

    @Override // com.bumptech.glide.e.a.g
    public void d(f fVar) {
        if (!r.o(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648, either provide dimensions in the constructor or call override()");
        }
        fVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.e.a.g
    public void e(f fVar) {
    }

    @Override // com.bumptech.glide.e.a.g
    public void f(com.bumptech.glide.e.d dVar) {
        this.f2825a = dVar;
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
    }

    @Override // com.bumptech.glide.manager.g
    public void h() {
    }

    @Override // com.bumptech.glide.manager.g
    public void i() {
    }

    @Override // com.bumptech.glide.e.a.g
    public void l() {
    }

    @Override // com.bumptech.glide.e.a.g
    public void m() {
    }
}
