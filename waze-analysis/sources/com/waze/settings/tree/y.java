package com.waze.settings.tree;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37661a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f37662b;

    /* renamed from: c, reason: collision with root package name */
    int f37663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(z zVar, h.c.e eVar) {
        super(eVar);
        this.f37662b = zVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37661a = obj;
        this.f37663c |= Integer.MIN_VALUE;
        return this.f37662b.emit(null, this);
    }
}
