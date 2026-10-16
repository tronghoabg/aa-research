package com.waze.sound;

/* compiled from: WazeSource */
/* renamed from: com.waze.sound.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f39793a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39794b;

    public Cdo(kotlinx.coroutines.b.k kVar, int i2) {
        this.f39794b = i2;
        this.f39793a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f39794b;
        if (i2 == 0) {
            Object objCollect = this.f39793a.collect(new dn(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        if (i2 != 1) {
            Object objCollect2 = this.f39793a.collect(new dn(lVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
        }
        Object objCollect3 = this.f39793a.collect(new dn(lVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : h.ab.f48028a;
    }
}
