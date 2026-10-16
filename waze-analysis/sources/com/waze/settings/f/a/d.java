package com.waze.settings.f.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f37213a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37214b;

    public d(k kVar, int i2) {
        this.f37214b = i2;
        this.f37213a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        if (this.f37214b != 0) {
            Object objCollect = this.f37213a.collect(new c(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f37213a.collect(new c(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
