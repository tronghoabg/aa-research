package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k[] f14542a;

    public ab(kotlinx.coroutines.b.k[] kVarArr) {
        this.f14542a = kVarArr;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        kotlinx.coroutines.b.k[] kVarArr = this.f14542a;
        Object objC = kotlinx.coroutines.b.a.x.c(lVar, kVarArr, new z(kVarArr), new aa(null), eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }
}
