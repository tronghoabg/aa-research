package com.waze.map;

/* loaded from: classes6.dex */
public final class fb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28918a;

    /* renamed from: b, reason: collision with root package name */
    int f28919b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fc f28920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(fc fcVar, h.c.e eVar) {
        super(eVar);
        this.f28920c = fcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28918a = obj;
        this.f28919b |= Integer.MIN_VALUE;
        return this.f28920c.emit(null, this);
    }
}
