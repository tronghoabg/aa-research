package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k[] f26113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.u f26114b;

    public al(kotlinx.coroutines.b.k[] kVarArr, h.g.a.u uVar) {
        this.f26113a = kVarArr;
        this.f26114b = uVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        kotlinx.coroutines.b.k[] kVarArr = this.f26113a;
        Object objC = kotlinx.coroutines.b.a.x.c(lVar, kVarArr, new aj(kVarArr), new ak(null, this.f26114b), eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }
}
