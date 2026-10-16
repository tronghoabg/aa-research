package com.waze.map.canvas;

import com.waze.map.MapViewChooser;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28643a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f28644b;

    /* renamed from: c, reason: collision with root package name */
    int f28645c;

    /* renamed from: d, reason: collision with root package name */
    MapViewChooser f28646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f28644b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28643a = obj;
        this.f28645c |= Integer.MIN_VALUE;
        return this.f28644b.b(this);
    }
}
