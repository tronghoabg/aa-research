package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bf implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f15564a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15565b;

    bf(Object obj, int i2) {
        this.f15565b = i2;
        this.f15564a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f15565b != 0) {
            ah.f((ah) this.f15564a, (bd) obj);
            return h.ab.f48028a;
        }
        ((bj) this.f15564a).n(new bc(((Number) obj).intValue()));
        return h.ab.f48028a;
    }
}
