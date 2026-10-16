package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bq f32163b;

    /* renamed from: c, reason: collision with root package name */
    int f32164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bq bqVar, h.c.e eVar) {
        super(eVar);
        this.f32163b = bqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32162a = obj;
        this.f32164c |= Integer.MIN_VALUE;
        Object objA = this.f32163b.a(null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
