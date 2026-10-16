package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bd implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f25904a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25905b;

    public bd(kotlinx.coroutines.b.k kVar, int i2) {
        this.f25905b = i2;
        this.f25904a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f25905b != 0) {
            Object objCollect = this.f25904a.collect(new bc(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f25904a.collect(new bc(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
