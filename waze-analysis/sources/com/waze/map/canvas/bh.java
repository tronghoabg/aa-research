package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f28590b;

    /* renamed from: c, reason: collision with root package name */
    int f28591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bi biVar, h.c.e eVar) {
        super(eVar);
        this.f28590b = biVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28589a = obj;
        this.f28591c |= Integer.MIN_VALUE;
        return this.f28590b.d(this);
    }
}
