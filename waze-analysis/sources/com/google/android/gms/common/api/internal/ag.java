package com.google.android.gms.common.api.internal;

import android.util.Log;
import j$.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag implements bi, com.google.android.gms.common.internal.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f4729a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.h f4730b;

    /* renamed from: c, reason: collision with root package name */
    private final i f4731c;

    /* renamed from: d, reason: collision with root package name */
    private Set f4732d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4733e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.gms.common.internal.ao f4734f;

    public ag(ah ahVar, com.google.android.gms.common.api.h hVar, i iVar) {
        Objects.requireNonNull(ahVar);
        this.f4729a = ahVar;
        this.f4734f = null;
        this.f4732d = null;
        this.f4733e = false;
        this.f4730b = hVar;
        this.f4731c = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        com.google.android.gms.common.internal.ao aoVar;
        if (!this.f4733e || (aoVar = this.f4734f) == null) {
            return;
        }
        this.f4730b.u(aoVar, this.f4732d);
    }

    @Override // com.google.android.gms.common.internal.f
    public final void d(com.google.android.gms.common.d dVar) {
        this.f4729a.s.post(new af(this, dVar));
    }

    @Override // com.google.android.gms.common.api.internal.bi
    public final void e(com.google.android.gms.common.d dVar) {
        ad adVar = (ad) this.f4729a.o.get(this.f4731c);
        if (adVar != null) {
            adVar.t(dVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.bi
    public final void f(int i2) {
        ad adVar = (ad) this.f4729a.o.get(this.f4731c);
        if (adVar != null) {
            if (adVar.f4723k) {
                adVar.t(new com.google.android.gms.common.d(17));
            } else {
                adVar.b(i2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.bi
    public final void h(com.google.android.gms.common.internal.ao aoVar, Set set) {
        if (aoVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            e(new com.google.android.gms.common.d(4));
        } else {
            this.f4734f = aoVar;
            this.f4732d = set;
            i();
        }
    }
}
