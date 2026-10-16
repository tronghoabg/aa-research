package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f9219a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f9220b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Thread f9221c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aa f9222d;

    x(aa aaVar, long j2, Throwable th, Thread thread) {
        this.f9219a = j2;
        this.f9220b = th;
        this.f9221c = thread;
        Objects.requireNonNull(aaVar);
        this.f9222d = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar = this.f9222d;
        if (aaVar.u()) {
            return;
        }
        long j2 = this.f9219a;
        String strC = aaVar.C();
        if (strC == null) {
            com.google.firebase.crashlytics.a.i.a().h("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        long jB = aa.B(j2);
        aaVar.s.f(this.f9220b, this.f9221c, strC, jB);
    }
}
