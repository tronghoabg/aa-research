package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q implements com.google.android.gms.o.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f9202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f9203b;

    q(r rVar, Executor executor) {
        this.f9202a = executor;
        Objects.requireNonNull(rVar);
        this.f9203b = rVar;
    }

    @Override // com.google.android.gms.o.s
    public final /* bridge */ /* synthetic */ com.google.android.gms.o.t a(Object obj) {
        if (((com.google.firebase.crashlytics.a.h.d) obj) == null) {
            com.google.firebase.crashlytics.a.i.a().h("Received null app settings, cannot send reports at crash time.");
            return com.google.android.gms.o.ag.c(null);
        }
        aa aaVar = this.f9203b.f9207d;
        return com.google.android.gms.o.ag.d(Arrays.asList(aa.b(aaVar), aaVar.s.j(this.f9202a)));
    }
}
