package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f14198a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14199b;

    public u(Object obj, int i2) {
        this.f14199b = i2;
        this.f14198a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f14199b == 0) {
            Object objCollect = this.f14198a.collect(new t(lVar), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        kotlinx.coroutines.b.k[] kVarArr = (kotlinx.coroutines.b.k[]) this.f14198a;
        Object objC = kotlinx.coroutines.b.a.x.c(lVar, kVarArr, new e(kVarArr), new f(null), eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }
}
