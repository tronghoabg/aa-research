package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f9204a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f9205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Thread f9206c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aa f9207d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.crashlytics.a.h.f f9208e;

    r(aa aaVar, long j2, Throwable th, Thread thread, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9204a = j2;
        this.f9205b = th;
        this.f9206c = thread;
        this.f9208e = fVar;
        Objects.requireNonNull(aaVar);
        this.f9207d = aaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        aa aaVar = this.f9207d;
        String strC = aaVar.C();
        if (strC == null) {
            com.google.firebase.crashlytics.a.i.a().d("Tried to write a fatal exception while no session was open.");
            return com.google.android.gms.o.ag.c(null);
        }
        long j2 = this.f9204a;
        aaVar.f9081i.c();
        aaVar.s.e(this.f9205b, this.f9206c, strC, aa.B(j2));
        aaVar.D(j2);
        com.google.firebase.crashlytics.a.h.f fVar = this.f9208e;
        aaVar.v(fVar);
        aa.m(aaVar, new e(aaVar.f9084l).toString(), false);
        if (!aaVar.f9080h.e()) {
            return com.google.android.gms.o.ag.c(null);
        }
        Executor executorD = aaVar.f9083k.d();
        return fVar.a().e(executorD, new q(this, executorD));
    }
}
