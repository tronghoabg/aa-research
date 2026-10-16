package com.google.d.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an extends ao {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7306a;

    /* renamed from: b, reason: collision with root package name */
    be f7307b;

    /* renamed from: c, reason: collision with root package name */
    be f7308c;

    /* renamed from: d, reason: collision with root package name */
    volatile long f7309d;

    /* renamed from: e, reason: collision with root package name */
    be f7310e;

    /* renamed from: f, reason: collision with root package name */
    be f7311f;

    an(Object obj, int i2, be beVar) {
        super(obj, i2, beVar);
        this.f7306a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7307b = aiVar;
        this.f7308c = aiVar;
        this.f7309d = Long.MAX_VALUE;
        this.f7310e = aiVar;
        this.f7311f = aiVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long b() {
        return this.f7306a;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long c() {
        return this.f7309d;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be f() {
        return this.f7307b;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be g() {
        return this.f7310e;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be h() {
        return this.f7308c;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be i() {
        return this.f7311f;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void k(long j2) {
        this.f7306a = j2;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void l(be beVar) {
        this.f7307b = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void m(be beVar) {
        this.f7310e = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void n(be beVar) {
        this.f7308c = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void o(be beVar) {
        this.f7311f = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void q(long j2) {
        this.f7309d = j2;
    }
}
