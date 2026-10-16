package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18256a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18257b;

    /* renamed from: c, reason: collision with root package name */
    int f18258c;

    /* renamed from: d, reason: collision with root package name */
    ah f18259d;

    /* renamed from: e, reason: collision with root package name */
    ae f18260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f18257b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18256a = obj;
        this.f18258c |= Integer.MIN_VALUE;
        return this.f18257b.t(null, false, this);
    }
}
