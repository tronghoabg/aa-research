package com.google.d.c;

import java.lang.ref.ReferenceQueue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ay extends aw {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7334a;

    /* renamed from: b, reason: collision with root package name */
    be f7335b;

    /* renamed from: c, reason: collision with root package name */
    be f7336c;

    ay(ReferenceQueue referenceQueue, Object obj, int i2, be beVar) {
        super(referenceQueue, obj, i2, beVar);
        this.f7334a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7335b = aiVar;
        this.f7336c = aiVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final long c() {
        return this.f7334a;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be g() {
        return this.f7335b;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be i() {
        return this.f7336c;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void m(be beVar) {
        this.f7335b = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void o(be beVar) {
        this.f7336c = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void q(long j2) {
        this.f7334a = j2;
    }
}
