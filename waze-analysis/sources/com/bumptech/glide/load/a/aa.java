package com.bumptech.glide.load.a;

import androidx.core.util.Pools;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    final Pools.Pool f2978a = com.bumptech.glide.g.a.h.a(150, new z(this));

    /* renamed from: b, reason: collision with root package name */
    final ad f2979b;

    /* renamed from: c, reason: collision with root package name */
    private int f2980c;

    aa(ad adVar) {
        this.f2979b = adVar;
    }

    final r a(com.bumptech.glide.m mVar, Object obj, am amVar, com.bumptech.glide.load.o oVar, int i2, int i3, Class cls, Class cls2, com.bumptech.glide.p pVar, y yVar, Map map, boolean z, boolean z2, com.bumptech.glide.load.s sVar, ak akVar) {
        r rVar = (r) this.f2978a.acquire();
        com.bumptech.glide.g.p.f(rVar);
        int i4 = this.f2980c;
        this.f2980c = i4 + 1;
        rVar.h(mVar, obj, amVar, oVar, i2, i3, cls, cls2, pVar, yVar, map, z, z2, sVar, akVar, i4);
        return rVar;
    }
}
