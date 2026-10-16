package com.google.android.datatransport.runtime;

import android.content.Context;
import java.io.Closeable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final c.b.e f4141a;

    /* renamed from: b, reason: collision with root package name */
    final c.b.e f4142b;

    /* renamed from: c, reason: collision with root package name */
    final c.b.e f4143c;

    /* renamed from: d, reason: collision with root package name */
    final c.b.e f4144d;

    /* renamed from: e, reason: collision with root package name */
    final c.b.e f4145e;

    /* renamed from: f, reason: collision with root package name */
    final c.b.e f4146f;

    /* renamed from: g, reason: collision with root package name */
    final c.b.e f4147g;

    /* renamed from: h, reason: collision with root package name */
    final c.b.e f4148h;

    /* renamed from: i, reason: collision with root package name */
    final c.b.e f4149i;

    /* renamed from: j, reason: collision with root package name */
    final c.b.e f4150j;

    /* renamed from: k, reason: collision with root package name */
    final c.b.e f4151k;

    /* renamed from: l, reason: collision with root package name */
    final c.b.e f4152l;
    final c.b.e m;

    ad(Context context) {
        c.b.e eVarA = c.b.b.a(o.f4225a);
        this.f4141a = eVarA;
        c.b.c cVarA = c.b.d.a(context);
        this.f4142b = cVarA;
        com.google.android.datatransport.runtime.backends.h hVarB = com.google.android.datatransport.runtime.backends.h.b(cVarA);
        this.f4143c = hVarB;
        c.b.e eVarA2 = c.b.b.a(com.google.android.datatransport.runtime.backends.k.a(cVarA, hVarB));
        this.f4144d = eVarA2;
        com.google.android.datatransport.runtime.scheduling.a.w wVarB = com.google.android.datatransport.runtime.scheduling.a.w.b(cVarA);
        this.f4145e = wVarB;
        c.b.e eVarA3 = c.b.b.a(com.google.android.play.core.a.h.b(cVarA));
        this.f4146f = eVarA3;
        c.b.e eVarA4 = c.b.b.a(com.google.android.datatransport.runtime.scheduling.a.s.a(wVarB, eVarA3));
        this.f4147g = eVarA4;
        this.f4148h = p.h();
        com.google.android.datatransport.runtime.scheduling.d dVarB = com.google.android.datatransport.runtime.scheduling.d.b(cVarA, eVarA4);
        this.f4149i = dVarB;
        com.google.android.datatransport.runtime.scheduling.b bVarB = com.google.android.datatransport.runtime.scheduling.b.b(eVarA, eVarA2, dVarB, eVarA4, eVarA4);
        this.f4150j = bVarB;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVarA = com.google.android.datatransport.runtime.scheduling.jobscheduling.l.a(cVarA, eVarA2, eVarA4, dVarB, eVarA, eVarA4, eVarA4);
        this.f4151k = lVarA;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.n nVarB = com.google.android.datatransport.runtime.scheduling.jobscheduling.n.b(eVarA, eVarA4, dVarB, eVarA4);
        this.f4152l = nVarB;
        this.m = c.b.b.a(ae.a(bVarB, lVarA, nVarB));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.datatransport.runtime.scheduling.a.r) this.f4147g.get()).close();
    }
}
