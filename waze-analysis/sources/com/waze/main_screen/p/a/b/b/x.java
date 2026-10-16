package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26998a;

    /* renamed from: b, reason: collision with root package name */
    int f26999b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f27000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m mVar, h.c.e eVar) {
        super(eVar);
        this.f27000c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26998a = obj;
        this.f26999b |= Integer.MIN_VALUE;
        return this.f27000c.emit(null, this);
    }
}
