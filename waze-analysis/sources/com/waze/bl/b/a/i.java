package com.waze.bl.b.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f16909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f16910b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16911c;

    public i(k kVar, j jVar, int i2) {
        this.f16911c = i2;
        this.f16909a = kVar;
        this.f16910b = jVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        int i2 = this.f16911c;
        j jVar = this.f16910b;
        if (i2 != 0) {
            Object objCollect = this.f16909a.collect(new h(lVar, jVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f16909a.collect(new h(lVar, jVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
