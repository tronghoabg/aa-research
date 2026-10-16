package com.waze.main_screen.v;

/* loaded from: classes6.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27815a;

    /* renamed from: b, reason: collision with root package name */
    int f27816b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f27817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, h.c.e eVar) {
        super(eVar);
        this.f27817c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27815a = obj;
        this.f27816b |= Integer.MIN_VALUE;
        return this.f27817c.emit(null, this);
    }
}
