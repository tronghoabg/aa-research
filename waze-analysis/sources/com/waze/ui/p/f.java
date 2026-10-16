package com.waze.ui.p;

/* loaded from: classes7.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f43192a;

    /* renamed from: b, reason: collision with root package name */
    int f43193b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f43194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, h.c.e eVar) {
        super(eVar);
        this.f43194c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f43192a = obj;
        this.f43193b |= Integer.MIN_VALUE;
        return this.f43194c.emit(null, this);
    }
}
