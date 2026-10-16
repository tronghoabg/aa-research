package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26082a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f26083b;

    public ab(kotlinx.coroutines.b.k kVar, ai aiVar) {
        this.f26082a = kVar;
        this.f26083b = aiVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f26082a.collect(new aa(lVar, this.f26083b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
