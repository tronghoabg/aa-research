package com.google.android.material.k;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f6651a;

    g(k kVar) {
        Objects.requireNonNull(kVar);
        this.f6651a = kVar;
    }

    @Override // com.google.android.material.k.q
    public final d a(d dVar) {
        return dVar instanceof m ? dVar : new b(-this.f6651a.P(), dVar);
    }
}
