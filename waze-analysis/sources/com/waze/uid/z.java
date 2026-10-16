package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f44809b;

    /* renamed from: c, reason: collision with root package name */
    int f44810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f44809b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44808a = obj;
        this.f44810c |= Integer.MIN_VALUE;
        return this.f44809b.h(this);
    }
}
