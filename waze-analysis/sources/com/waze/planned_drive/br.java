package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class br implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f33272a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f33273b;

    public br(kotlinx.coroutines.b.k kVar, h.g.a.l lVar) {
        this.f33272a = kVar;
        this.f33273b = lVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f33272a.collect(new bq(lVar, this.f33273b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
