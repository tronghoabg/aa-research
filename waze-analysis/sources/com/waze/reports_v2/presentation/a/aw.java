package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34686a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f34687b;

    /* renamed from: c, reason: collision with root package name */
    int f34688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f34687b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34686a = obj;
        this.f34688c |= Integer.MIN_VALUE;
        return this.f34687b.emit(null, this);
    }
}
