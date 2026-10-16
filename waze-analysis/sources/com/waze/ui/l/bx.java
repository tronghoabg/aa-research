package com.waze.ui.l;

/* loaded from: classes7.dex */
public final class bx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42636a;

    /* renamed from: b, reason: collision with root package name */
    int f42637b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ by f42638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(by byVar, h.c.e eVar) {
        super(eVar);
        this.f42638c = byVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42636a = obj;
        this.f42637b |= Integer.MIN_VALUE;
        return this.f42638c.emit(null, this);
    }
}
