package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38120a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38121b;

    /* renamed from: c, reason: collision with root package name */
    int f38122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38121b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38120a = obj;
        this.f38122c |= Integer.MIN_VALUE;
        return this.f38121b.g(null, null, null, this);
    }
}
