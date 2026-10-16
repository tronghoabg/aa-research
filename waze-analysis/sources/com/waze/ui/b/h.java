package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f42064a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f42065b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f42066c;

    /* renamed from: d, reason: collision with root package name */
    int f42067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f42066c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42065b = obj;
        this.f42067d |= Integer.MIN_VALUE;
        return this.f42066c.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
