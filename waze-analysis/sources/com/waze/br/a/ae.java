package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f17264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f17265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f17266c;

    public ae(kotlinx.coroutines.b.k kVar, aj ajVar, String str) {
        this.f17264a = kVar;
        this.f17265b = ajVar;
        this.f17266c = str;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f17264a.collect(new ad(lVar, this.f17265b, this.f17266c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
