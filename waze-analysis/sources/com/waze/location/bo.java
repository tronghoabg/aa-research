package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25380a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bp f25381b;

    /* renamed from: c, reason: collision with root package name */
    int f25382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bp bpVar, h.c.e eVar) {
        super(eVar);
        this.f25381b = bpVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25380a = obj;
        this.f25382c |= Integer.MIN_VALUE;
        return this.f25381b.c(this);
    }
}
