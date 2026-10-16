package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements com.google.android.gms.o.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.o.w f4848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4849b;

    t(u uVar, com.google.android.gms.o.w wVar) {
        this.f4848a = wVar;
        Objects.requireNonNull(uVar);
        this.f4849b = uVar;
    }

    @Override // com.google.android.gms.o.k
    public final void a(com.google.android.gms.o.t tVar) {
        this.f4849b.f4851b.remove(this.f4848a);
    }
}
