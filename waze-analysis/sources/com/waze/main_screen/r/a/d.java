package com.waze.main_screen.r.a;

/* loaded from: classes6.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27411a;

    /* renamed from: b, reason: collision with root package name */
    int f27412b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f27413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f27413c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27411a = obj;
        this.f27412b |= Integer.MIN_VALUE;
        return this.f27413c.emit(null, this);
    }
}
