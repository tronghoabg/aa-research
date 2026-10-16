package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f33587b;

    /* renamed from: c, reason: collision with root package name */
    int f33588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f33587b = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33586a = obj;
        this.f33588c |= Integer.MIN_VALUE;
        return ak.f(this.f33587b, null, this);
    }
}
