package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4711a;

    ab(ac acVar) {
        Objects.requireNonNull(acVar);
        this.f4711a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f4711a.f4712a;
        adVar.f4715c.m(String.valueOf(adVar.f4715c.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
