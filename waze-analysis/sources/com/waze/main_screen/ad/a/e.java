package com.waze.main_screen.ad.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f25701a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f25702b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25703c;

    public e(k kVar, h hVar, int i2) {
        this.f25703c = i2;
        this.f25701a = kVar;
        this.f25702b = hVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        int i2 = this.f25703c;
        if (i2 == 0) {
            Object objCollect = this.f25701a.collect(new d(lVar, this.f25702b, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        h hVar = this.f25702b;
        if (i2 != 1) {
            Object objCollect2 = this.f25701a.collect(new d(lVar, hVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
        }
        Object objCollect3 = this.f25701a.collect(new d(lVar, hVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : ab.f48028a;
    }
}
