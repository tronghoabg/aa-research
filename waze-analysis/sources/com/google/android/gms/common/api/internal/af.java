package com.google.android.gms.common.api.internal;

import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.d f4727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f4728b;

    af(ag agVar, com.google.android.gms.common.d dVar) {
        this.f4727a = dVar;
        Objects.requireNonNull(agVar);
        this.f4728b = agVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag agVar = this.f4728b;
        ad adVar = (ad) agVar.f4729a.o.get(agVar.f4731c);
        if (adVar == null) {
            return;
        }
        if (!this.f4727a.g()) {
            adVar.r(this.f4727a);
            return;
        }
        agVar.f4733e = true;
        if (agVar.f4730b.q()) {
            agVar.i();
            return;
        }
        try {
            agVar.f4730b.u(null, agVar.f4730b.k());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            this.f4728b.f4730b.m("Failed to get service from broker.");
            adVar.r(new com.google.android.gms.common.d(10));
        }
    }
}
