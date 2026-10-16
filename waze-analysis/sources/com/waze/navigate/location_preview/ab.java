package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31482a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f31483b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ai f31484c;

    /* renamed from: d, reason: collision with root package name */
    int f31485d;

    /* renamed from: e, reason: collision with root package name */
    ay f31486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f31484c = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31483b = obj;
        this.f31485d |= Integer.MIN_VALUE;
        return this.f31484c.n(null, null, this);
    }
}
