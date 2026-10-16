package com.google.d.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends ao {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7303a;

    /* renamed from: b, reason: collision with root package name */
    be f7304b;

    /* renamed from: c, reason: collision with root package name */
    be f7305c;

    am(Object obj, int i2, be beVar) {
        super(obj, i2, beVar);
        this.f7303a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7304b = aiVar;
        this.f7305c = aiVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long b() {
        return this.f7303a;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be f() {
        return this.f7304b;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be h() {
        return this.f7305c;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void k(long j2) {
        this.f7303a = j2;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void l(be beVar) {
        this.f7304b = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void n(be beVar) {
        this.f7305c = beVar;
    }
}
