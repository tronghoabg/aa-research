package com.waze.c.e.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f18436a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18437b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f18438c;

    /* renamed from: d, reason: collision with root package name */
    int f18439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(t tVar, h.c.e eVar) {
        super(eVar);
        this.f18438c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18437b = obj;
        this.f18439d |= Integer.MIN_VALUE;
        return t.e(this.f18438c, null, false, this);
    }
}
