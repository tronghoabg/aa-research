package com.google.d.c;

import java.lang.ref.ReferenceQueue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class au extends aw {

    /* renamed from: a, reason: collision with root package name */
    volatile long f7321a;

    /* renamed from: b, reason: collision with root package name */
    be f7322b;

    /* renamed from: c, reason: collision with root package name */
    be f7323c;

    au(ReferenceQueue referenceQueue, Object obj, int i2, be beVar) {
        super(referenceQueue, obj, i2, beVar);
        this.f7321a = Long.MAX_VALUE;
        int i3 = bd.x;
        ai aiVar = ai.f7284a;
        this.f7322b = aiVar;
        this.f7323c = aiVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final long b() {
        return this.f7321a;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be f() {
        return this.f7322b;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final be h() {
        return this.f7323c;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void k(long j2) {
        this.f7321a = j2;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void l(be beVar) {
        this.f7322b = beVar;
    }

    @Override // com.google.d.c.aw, com.google.d.c.be
    public final void n(be beVar) {
        this.f7323c = beVar;
    }
}
