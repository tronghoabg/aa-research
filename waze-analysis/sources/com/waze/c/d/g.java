package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f18353a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18354b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f18355c;

    /* renamed from: d, reason: collision with root package name */
    int f18356d;

    /* renamed from: e, reason: collision with root package name */
    h f18357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f18355c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18354b = obj;
        this.f18356d |= Integer.MIN_VALUE;
        return h.b(this.f18355c, null, this);
    }
}
