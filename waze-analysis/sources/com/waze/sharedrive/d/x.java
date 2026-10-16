package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38280a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f38281b;

    /* renamed from: c, reason: collision with root package name */
    int f38282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f38281b = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38280a = obj;
        this.f38282c |= Integer.MIN_VALUE;
        return aq.d(this.f38281b, this);
    }
}
