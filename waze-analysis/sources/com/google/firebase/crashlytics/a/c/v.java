package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v implements com.google.android.gms.o.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.o.t f9214a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f9215b;

    v(aa aaVar, com.google.android.gms.o.t tVar) {
        this.f9214a = tVar;
        Objects.requireNonNull(aaVar);
        this.f9215b = aaVar;
    }

    @Override // com.google.android.gms.o.s
    public final /* bridge */ /* synthetic */ com.google.android.gms.o.t a(Object obj) {
        return this.f9215b.f9083k.b(new u(this, (Boolean) obj, this.f9214a));
    }
}
