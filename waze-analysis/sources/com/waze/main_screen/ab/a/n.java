package com.waze.main_screen.ab.a;

/* loaded from: classes6.dex */
public final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25641a;

    /* renamed from: b, reason: collision with root package name */
    int f25642b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f25643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f25643c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25641a = obj;
        this.f25642b |= Integer.MIN_VALUE;
        return this.f25643c.emit(null, this);
    }
}
