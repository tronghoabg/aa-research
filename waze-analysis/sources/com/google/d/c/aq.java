package com.google.d.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aq extends ao {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7317a;

    /* renamed from: b, reason: collision with root package name */
    be f7318b;

    /* renamed from: c, reason: collision with root package name */
    be f7319c;

    aq(Object obj, int i2, be beVar) {
        super(obj, i2, beVar);
        this.f7317a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7318b = aiVar;
        this.f7319c = aiVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final long c() {
        return this.f7317a;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be g() {
        return this.f7318b;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be i() {
        return this.f7319c;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void m(be beVar) {
        this.f7318b = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void o(be beVar) {
        this.f7319c = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void q(long j2) {
        this.f7317a = j2;
    }
}
