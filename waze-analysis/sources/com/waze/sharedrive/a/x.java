package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38040b;

    /* renamed from: c, reason: collision with root package name */
    int f38041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38040b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38039a = obj;
        this.f38041c |= Integer.MIN_VALUE;
        return this.f38040b.e(null, null, this);
    }
}
