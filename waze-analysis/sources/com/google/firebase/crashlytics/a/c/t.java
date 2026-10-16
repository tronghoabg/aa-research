package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements com.google.android.gms.o.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f9209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f9210b;

    t(u uVar, Executor executor) {
        this.f9209a = executor;
        Objects.requireNonNull(uVar);
        this.f9210b = uVar;
    }

    @Override // com.google.android.gms.o.s
    public final /* bridge */ /* synthetic */ com.google.android.gms.o.t a(Object obj) throws NumberFormatException, ClassNotFoundException {
        if (((com.google.firebase.crashlytics.a.h.d) obj) == null) {
            com.google.firebase.crashlytics.a.i.a().h("Received null app settings at app startup. Cannot send cached reports");
            return com.google.android.gms.o.ag.c(null);
        }
        aa aaVar = this.f9210b.f9213c.f9215b;
        aa.b(aaVar);
        aaVar.s.j(this.f9209a);
        aaVar.f9077d.e(null);
        return com.google.android.gms.o.ag.c(null);
    }
}
