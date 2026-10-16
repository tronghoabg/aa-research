package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class di extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39773a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39774b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dr f39775c;

    /* renamed from: d, reason: collision with root package name */
    int f39776d;

    /* renamed from: e, reason: collision with root package name */
    ak f39777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(dr drVar, h.c.e eVar) {
        super(eVar);
        this.f39775c = drVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39774b = obj;
        this.f39776d |= Integer.MIN_VALUE;
        return dr.k(this.f39775c, null, this);
    }
}
