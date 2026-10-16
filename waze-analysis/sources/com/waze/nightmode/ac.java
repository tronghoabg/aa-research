package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f32445a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f32446b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32447c;

    public ac(kotlinx.coroutines.b.k kVar, Object obj, int i2) {
        this.f32447c = i2;
        this.f32445a = kVar;
        this.f32446b = obj;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f32447c != 0) {
            Object objCollect = this.f32445a.collect(new ab(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f32445a.collect(new ab(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
