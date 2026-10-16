package com.google.d.c;

import java.lang.ref.ReferenceQueue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av extends aw {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7324a;

    /* renamed from: b, reason: collision with root package name */
    be f7325b;

    /* renamed from: c, reason: collision with root package name */
    be f7326c;

    /* renamed from: d, reason: collision with root package name */
    volatile long f7327d;

    /* renamed from: e, reason: collision with root package name */
    be f7328e;

    /* renamed from: f, reason: collision with root package name */
    be f7329f;

    av(ReferenceQueue referenceQueue, Object obj, int i2, be beVar) {
        super(referenceQueue, obj, i2, beVar);
        this.f7324a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7325b = aiVar;
        this.f7326c = aiVar;
        this.f7327d = Long.MAX_VALUE;
        this.f7328e = aiVar;
        this.f7329f = aiVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final long b() {
        return this.f7324a;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final long c() {
        return this.f7327d;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be f() {
        return this.f7325b;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be g() {
        return this.f7328e;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be h() {
        return this.f7326c;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be i() {
        return this.f7329f;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void k(long j2) {
        this.f7324a = j2;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void l(be beVar) {
        this.f7325b = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void m(be beVar) {
        this.f7328e = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void n(be beVar) {
        this.f7326c = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void o(be beVar) {
        this.f7329f = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void q(long j2) {
        this.f7327d = j2;
    }
}
