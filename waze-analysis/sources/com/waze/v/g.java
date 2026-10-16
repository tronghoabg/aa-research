package com.waze.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f44926b;

    /* renamed from: c, reason: collision with root package name */
    int f44927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, h.c.e eVar) {
        super(eVar);
        this.f44926b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44925a = obj;
        this.f44927c |= Integer.MIN_VALUE;
        return i.a(this.f44926b, this);
    }
}
