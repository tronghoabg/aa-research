package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f4794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f4795b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4796c;

    bh(ad adVar, Bundle bundle, int i2) {
        this.f4796c = i2;
        this.f4795b = bundle;
        Objects.requireNonNull(adVar);
        this.f4794a = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4796c != 0) {
            ((ad) this.f4794a).G((Bundle) this.f4795b);
        } else {
            bj.d((bj) this.f4795b, (com.google.android.gms.m.a.h) this.f4794a);
        }
    }

    bh(bj bjVar, com.google.android.gms.m.a.h hVar, int i2) {
        this.f4796c = i2;
        this.f4794a = hVar;
        Objects.requireNonNull(bjVar);
        this.f4795b = bjVar;
    }
}
