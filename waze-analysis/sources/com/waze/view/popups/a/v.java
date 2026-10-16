package com.waze.view.popups.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45229a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f45230b;

    /* renamed from: c, reason: collision with root package name */
    int f45231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f45230b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45229a = obj;
        this.f45231c |= Integer.MIN_VALUE;
        return this.f45230b.m(null, this);
    }
}
