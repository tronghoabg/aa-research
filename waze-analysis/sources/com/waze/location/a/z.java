package com.waze.location.a;

/* loaded from: classes6.dex */
public final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25233a;

    /* renamed from: b, reason: collision with root package name */
    int f25234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f25235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f25235c = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25233a = obj;
        this.f25234b |= Integer.MIN_VALUE;
        return this.f25235c.emit(null, this);
    }
}
