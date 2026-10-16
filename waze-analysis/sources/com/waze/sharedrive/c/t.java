package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f38135b;

    /* renamed from: c, reason: collision with root package name */
    int f38136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(y yVar, h.c.e eVar) {
        super(eVar);
        this.f38135b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38134a = obj;
        this.f38136c |= Integer.MIN_VALUE;
        return y.d(this.f38135b, null, null, null, this);
    }
}
