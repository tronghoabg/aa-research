package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ap implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f15874a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f15875b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f15876c;

    public ap(kotlinx.coroutines.b.k kVar, long j2, long j3) {
        this.f15874a = kVar;
        this.f15875b = j2;
        this.f15876c = j3;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f15874a.collect(new ao(lVar, this.f15875b, this.f15876c), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
