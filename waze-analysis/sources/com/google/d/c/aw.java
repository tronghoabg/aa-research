package com.google.d.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class aw extends WeakReference implements be {

    /* renamed from: g, reason: collision with root package name */
    final int f7330g;

    /* renamed from: h, reason: collision with root package name */
    final be f7331h;

    /* renamed from: i, reason: collision with root package name */
    volatile as f7332i;

    aw(ReferenceQueue referenceQueue, Object obj, int i2, be beVar) {
        super(obj, referenceQueue);
        this.f7332i = bd.f7345b;
        this.f7330g = i2;
        this.f7331h = beVar;
    }

    @Override // com.google.d.c.be
    public final int a() {
        return this.f7330g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.c.be
    public final as d() {
        return this.f7332i;
    }

    @Override // com.google.d.c.be
    public final be e() {
        return this.f7331h;
    }

    public be f() {
        throw new UnsupportedOperationException();
    }

    public be g() {
        throw new UnsupportedOperationException();
    }

    public be h() {
        throw new UnsupportedOperationException();
    }

    public be i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.c.be
    public final Object j() {
        return get();
    }

    public void k(long j2) {
        throw new UnsupportedOperationException();
    }

    public void l(be beVar) {
        throw new UnsupportedOperationException();
    }

    public void m(be beVar) {
        throw new UnsupportedOperationException();
    }

    public void n(be beVar) {
        throw new UnsupportedOperationException();
    }

    public void o(be beVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.c.be
    public final void p(as asVar) {
        this.f7332i = asVar;
    }

    public void q(long j2) {
        throw new UnsupportedOperationException();
    }
}
