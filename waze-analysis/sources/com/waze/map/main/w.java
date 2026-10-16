package com.waze.map.main;

import com.waze.navigate.ef;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w implements com.waze.map.g.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.k.b f29473a;

    w(org.a.d.k.b bVar) {
        this.f29473a = bVar;
    }

    @Override // com.waze.map.g.h
    public final Object a(h.c.e eVar) {
        int i2 = h.g.b.ar.f48106a;
        return ((ef) this.f29473a.a(new h.g.b.m(ef.class), null, null)).getNavigationRouteArea(false, eVar);
    }
}
