package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26971a;

    /* renamed from: b, reason: collision with root package name */
    int f26972b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f26973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, h.c.e eVar) {
        super(eVar);
        this.f26973c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26971a = obj;
        this.f26972b |= Integer.MIN_VALUE;
        return this.f26973c.emit(null, this);
    }
}
