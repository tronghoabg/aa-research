package com.waze.main_screen.a.b.a;

/* loaded from: classes6.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25573a;

    /* renamed from: b, reason: collision with root package name */
    int f25574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f25575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f25575c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25573a = obj;
        this.f25574b |= Integer.MIN_VALUE;
        return this.f25575c.emit(null, this);
    }
}
