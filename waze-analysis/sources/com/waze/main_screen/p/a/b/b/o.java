package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26968a;

    /* renamed from: b, reason: collision with root package name */
    int f26969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f26970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, h.c.e eVar) {
        super(eVar);
        this.f26970c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26968a = obj;
        this.f26969b |= Integer.MIN_VALUE;
        return this.f26970c.emit(null, this);
    }
}
