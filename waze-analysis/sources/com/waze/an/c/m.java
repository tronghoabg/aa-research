package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f14786a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14787b;

    m(Object obj, int i2) {
        this.f14787b = i2;
        this.f14786a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f14787b != 0) {
            ((com.waze.main_screen.k.a.u) this.f14786a).i(((Boolean) obj).booleanValue());
            return h.ab.f48028a;
        }
        Object objG = this.f14786a.g((com.waze.main_screen.k.a.b) obj, eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }
}
