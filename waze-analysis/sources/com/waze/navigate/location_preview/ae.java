package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31504a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f31505b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ai f31506c;

    /* renamed from: d, reason: collision with root package name */
    int f31507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f31506c = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31505b = obj;
        this.f31507d |= Integer.MIN_VALUE;
        return this.f31506c.w(null, null, null, null, this);
    }
}
