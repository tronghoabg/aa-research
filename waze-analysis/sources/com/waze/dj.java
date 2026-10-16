package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23560a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dk f23561b;

    /* renamed from: c, reason: collision with root package name */
    int f23562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dj(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f23561b = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23560a = obj;
        this.f23562c |= Integer.MIN_VALUE;
        return this.f23561b.a(0L, this);
    }
}
