package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f22764b;

    /* renamed from: c, reason: collision with root package name */
    int f22765c;

    /* renamed from: d, reason: collision with root package name */
    aa f22766d;

    /* renamed from: e, reason: collision with root package name */
    String f22767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22764b = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22763a = obj;
        this.f22765c |= Integer.MIN_VALUE;
        return this.f22764b.p(null, null, this);
    }
}
