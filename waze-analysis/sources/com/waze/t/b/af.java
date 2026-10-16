package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f40666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40667b;

    public af(kotlinx.coroutines.b.k kVar, ag agVar) {
        this.f40666a = kVar;
        this.f40667b = agVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f40666a.collect(new ae(lVar, this.f40667b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
