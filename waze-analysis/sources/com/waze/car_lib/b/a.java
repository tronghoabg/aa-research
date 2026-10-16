package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f18925a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f18927c;

    /* renamed from: d, reason: collision with root package name */
    int f18928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f fVar, h.c.e eVar) {
        super(eVar);
        this.f18927c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18926b = obj;
        this.f18928d |= Integer.MIN_VALUE;
        return f.e(this.f18927c, null, this);
    }
}
