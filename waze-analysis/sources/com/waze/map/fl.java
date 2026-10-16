package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fl implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f28955a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f28956b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.b.ec f28957c;

    public fl(kotlinx.coroutines.b.k kVar, gb gbVar, com.waze.map.b.ec ecVar) {
        this.f28955a = kVar;
        this.f28956b = gbVar;
        this.f28957c = ecVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f28955a.collect(new fk(lVar, this.f28956b, this.f28957c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
