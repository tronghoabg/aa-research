package com.waze.settings.f.a;

/* loaded from: classes7.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37208a;

    /* renamed from: b, reason: collision with root package name */
    int f37209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f37210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f37210c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37208a = obj;
        this.f37209b |= Integer.MIN_VALUE;
        return this.f37210c.emit(null, this);
    }
}
