package com.waze.closure.c;

/* loaded from: classes5.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22466a;

    /* renamed from: b, reason: collision with root package name */
    int f22467b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f22468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f22468c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22466a = obj;
        this.f22467b |= Integer.MIN_VALUE;
        return this.f22468c.emit(null, this);
    }
}
