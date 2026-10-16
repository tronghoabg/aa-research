package com.waze.o.b.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f32656a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f32657b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32658c;

    public d(k kVar, e eVar, int i2) {
        this.f32658c = i2;
        this.f32656a = kVar;
        this.f32657b = eVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        int i2 = this.f32658c;
        e eVar2 = this.f32657b;
        if (i2 != 0) {
            Object objCollect = this.f32656a.collect(new c(lVar, eVar2, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f32656a.collect(new c(lVar, eVar2, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
