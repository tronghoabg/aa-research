package com.waze.perf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f33040b;

    /* renamed from: c, reason: collision with root package name */
    int f33041c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.m f33042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f33040b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33039a = obj;
        this.f33041c |= Integer.MIN_VALUE;
        return this.f33040b.a(this);
    }
}
