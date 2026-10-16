package com.waze.main_screen.t.a.a;

/* loaded from: classes6.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27437a;

    /* renamed from: b, reason: collision with root package name */
    int f27438b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f27439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f27439c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27437a = obj;
        this.f27438b |= Integer.MIN_VALUE;
        return this.f27439c.emit(null, this);
    }
}
