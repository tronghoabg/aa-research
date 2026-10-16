package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f9211a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.o.t f9212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f9213c;

    u(v vVar, Boolean bool, com.google.android.gms.o.t tVar) {
        this.f9211a = bool;
        this.f9212b = tVar;
        Objects.requireNonNull(vVar);
        this.f9213c = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Boolean bool = this.f9211a;
        if (bool.booleanValue()) {
            com.google.firebase.crashlytics.a.i.a().b("Sending cached crash reports...");
            v vVar = this.f9213c;
            boolean zBooleanValue = bool.booleanValue();
            aa aaVar = vVar.f9215b;
            aaVar.f9080h.c(zBooleanValue);
            Executor executorD = aaVar.f9083k.d();
            return this.f9212b.e(executorD, new t(this, executorD));
        }
        com.google.firebase.crashlytics.a.i.a().g("Deleting cached crash reports...");
        aa aaVar2 = this.f9213c.f9215b;
        Iterator it = aaVar2.l().iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        aaVar2.s.h();
        aaVar2.f9077d.e(null);
        return com.google.android.gms.o.ag.c(null);
    }
}
