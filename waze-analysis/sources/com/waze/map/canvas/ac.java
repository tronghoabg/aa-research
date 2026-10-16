package com.waze.map.canvas;

/* loaded from: classes6.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28503a;

    /* renamed from: b, reason: collision with root package name */
    int f28504b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f28505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f28505c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28503a = obj;
        this.f28504b |= Integer.MIN_VALUE;
        return this.f28505c.emit(null, this);
    }
}
