package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f35279a;

    f(m mVar) {
        Objects.requireNonNull(mVar);
        this.f35279a = mVar;
    }

    @Override // com.b.b.a.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        com.b.b.d.m mVar = (com.b.b.d.m) obj;
        m.aj("getRecommendedContentItems: ".concat(String.valueOf(String.valueOf(mVar))));
        com.b.b.a.b bVarH = this.f35279a.f35298d.f().h(mVar.f2666d[0]);
        bVarH.c(new e(this));
        bVarH.g(new a(this, 7));
    }
}
