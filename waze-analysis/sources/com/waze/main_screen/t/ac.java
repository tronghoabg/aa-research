package com.waze.main_screen.t;

/* loaded from: classes6.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27453a;

    /* renamed from: b, reason: collision with root package name */
    int f27454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f27455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f27455c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27453a = obj;
        this.f27454b |= Integer.MIN_VALUE;
        return this.f27455c.emit(null, this);
    }
}
