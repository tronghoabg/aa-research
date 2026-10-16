package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f25281a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25282b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25283c;

    public aw(kotlinx.coroutines.b.k kVar, Object obj, int i2) {
        this.f25283c = i2;
        this.f25281a = kVar;
        this.f25282b = obj;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f25283c;
        Object obj = this.f25282b;
        if (i2 != 0) {
            Object objCollect = this.f25281a.collect(new f(lVar, (g) obj), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f25281a.collect(new av(lVar, (ax) obj), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
