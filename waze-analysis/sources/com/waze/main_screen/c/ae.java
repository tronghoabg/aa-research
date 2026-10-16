package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f26090b;

    public ae(kotlinx.coroutines.b.k kVar, ai aiVar) {
        this.f26089a = kVar;
        this.f26090b = aiVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f26089a.collect(new ad(lVar, this.f26090b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
