package com.waze.main_screen.c;

/* loaded from: classes6.dex */
public final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26299a;

    /* renamed from: b, reason: collision with root package name */
    int f26300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f26301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f26301c = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26299a = obj;
        this.f26300b |= Integer.MIN_VALUE;
        return this.f26301c.emit(null, this);
    }
}
