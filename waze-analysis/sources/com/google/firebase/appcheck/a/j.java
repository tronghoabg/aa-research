package com.google.firebase.appcheck.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements com.google.android.gms.common.api.internal.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f8872a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f8873b;

    j(k kVar, e eVar) {
        this.f8872a = eVar;
        Objects.requireNonNull(kVar);
        this.f8873b = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(boolean z) {
        k kVar = this.f8873b;
        kVar.f8874a = z;
        if (z) {
            this.f8872a.a();
        } else {
            kVar.e();
        }
    }
}
