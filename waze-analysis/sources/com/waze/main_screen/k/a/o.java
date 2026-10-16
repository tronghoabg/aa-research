package com.waze.main_screen.k.a;

/* loaded from: classes6.dex */
public final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26549a;

    /* renamed from: b, reason: collision with root package name */
    int f26550b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f26551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, h.c.e eVar) {
        super(eVar);
        this.f26551c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26549a = obj;
        this.f26550b |= Integer.MIN_VALUE;
        return this.f26551c.emit(null, this);
    }
}
