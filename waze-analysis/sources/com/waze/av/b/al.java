package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f15863a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15864b;

    public al(Object obj, int i2) {
        this.f15864b = i2;
        this.f15863a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f15864b;
        if (i2 == 0) {
            Object objCollect = this.f15863a.collect(new ak(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 == 1) {
            Object objCollect2 = this.f15863a.collect(new ak(lVar, 1), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        if (i2 == 2) {
            Object objCollect3 = this.f15863a.collect(new ak(lVar, 2), eVar);
            return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
        }
        if (i2 == 3) {
            Object objCollect4 = this.f15863a.collect(new ak(lVar, 3), eVar);
            return objCollect4 == h.c.a.a.f48038a ? objCollect4 : h.ab.f48028a;
        }
        kotlinx.coroutines.b.k[] kVarArr = (kotlinx.coroutines.b.k[]) this.f15863a;
        Object objC = kotlinx.coroutines.b.a.x.c(lVar, kVarArr, new ba(kVarArr), new bb(null), eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }
}
