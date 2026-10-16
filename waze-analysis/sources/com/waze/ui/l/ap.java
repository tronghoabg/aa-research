package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f42512a;

    /* renamed from: b, reason: collision with root package name */
    float f42513b;

    /* renamed from: c, reason: collision with root package name */
    float f42514c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f42515d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba f42516e;

    /* renamed from: f, reason: collision with root package name */
    int f42517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f42516e = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42515d = obj;
        this.f42517f |= Integer.MIN_VALUE;
        return ba.o(this.f42516e, null, this);
    }
}
