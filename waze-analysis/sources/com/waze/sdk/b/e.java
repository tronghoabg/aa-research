package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f35278a;

    e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f35278a = fVar;
    }

    @Override // com.b.b.a.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        m mVar = this.f35278a.f35279a;
        com.b.b.d.m mVar2 = (com.b.b.d.m) obj;
        if (mVar.f35302h != null && mVar.f35302h.length > 0 && mVar2.f2666d.length == 0) {
            m.aj("getChildrenOfItem[0] Recommened Content is empty but have already data, ignore: ".concat(String.valueOf(String.valueOf(mVar2))));
            return;
        }
        mVar.f35302h = mVar2.f2666d;
        m.aj("getChildrenOfItem[0] Recommened Content: ".concat(String.valueOf(String.valueOf(mVar2))));
        m.G(mVar);
        m.J(mVar);
    }
}
