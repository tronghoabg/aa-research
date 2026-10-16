package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f17272a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f17273b;

    public ah(kotlinx.coroutines.b.k kVar, aj ajVar) {
        this.f17272a = kVar;
        this.f17273b = ajVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f17272a.collect(new ag(lVar, this.f17273b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
