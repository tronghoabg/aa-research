package com.google.d.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class az extends p {

    /* renamed from: a, reason: collision with root package name */
    be f7337a;

    /* renamed from: b, reason: collision with root package name */
    be f7338b;

    az(bb bbVar) {
        Objects.requireNonNull(bbVar);
        this.f7337a = this;
        this.f7338b = this;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be g() {
        return this.f7337a;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be i() {
        return this.f7338b;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void m(be beVar) {
        this.f7337a = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void o(be beVar) {
        this.f7338b = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void q(long j2) {
    }
}
