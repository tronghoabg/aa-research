package com.google.d.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    be f7387a;

    /* renamed from: b, reason: collision with root package name */
    be f7388b;

    q(s sVar) {
        Objects.requireNonNull(sVar);
        this.f7387a = this;
        this.f7388b = this;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long b() {
        return Long.MAX_VALUE;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be f() {
        return this.f7387a;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be h() {
        return this.f7388b;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void k(long j2) {
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void l(be beVar) {
        this.f7387a = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void n(be beVar) {
        this.f7388b = beVar;
    }
}
