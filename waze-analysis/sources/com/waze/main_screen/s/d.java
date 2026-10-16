package com.waze.main_screen.s;

/* loaded from: classes6.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27424a;

    /* renamed from: b, reason: collision with root package name */
    int f27425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f27426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f27426c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27424a = obj;
        this.f27425b |= Integer.MIN_VALUE;
        return this.f27426c.emit(null, this);
    }
}
