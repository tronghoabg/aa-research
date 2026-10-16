package com.waze.location.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f25307a;

    /* renamed from: b, reason: collision with root package name */
    Object f25308b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f25309c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f25310d;

    /* renamed from: e, reason: collision with root package name */
    int f25311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, h.c.e eVar) {
        super(eVar);
        this.f25310d = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25309c = obj;
        this.f25311e |= Integer.MIN_VALUE;
        return this.f25310d.a(this);
    }
}
