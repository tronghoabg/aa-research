package com.waze.main_screen.o;

/* loaded from: classes6.dex */
public final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26698a;

    /* renamed from: b, reason: collision with root package name */
    int f26699b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f26700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f26700c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26698a = obj;
        this.f26699b |= Integer.MIN_VALUE;
        return this.f26700c.emit(null, this);
    }
}
