package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac implements com.google.android.gms.common.internal.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f4712a;

    ac(ad adVar) {
        Objects.requireNonNull(adVar);
        this.f4712a = adVar;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void a() {
        this.f4712a.f4713a.s.post(new ab(this));
    }
}
