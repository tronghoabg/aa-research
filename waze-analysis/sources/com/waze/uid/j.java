package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44527a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f44528b;

    /* renamed from: c, reason: collision with root package name */
    int f44529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f44528b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44527a = obj;
        this.f44529c |= Integer.MIN_VALUE;
        return this.f44528b.a(null, this);
    }
}
