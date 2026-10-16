package com.waze.main_screen.c.e;

/* loaded from: classes6.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26198a;

    /* renamed from: b, reason: collision with root package name */
    int f26199b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f26200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f26200c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26198a = obj;
        this.f26199b |= Integer.MIN_VALUE;
        return this.f26200c.emit(null, this);
    }
}
