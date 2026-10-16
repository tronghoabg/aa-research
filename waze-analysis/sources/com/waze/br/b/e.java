package com.waze.br.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17323a;

    /* renamed from: b, reason: collision with root package name */
    Object f17324b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f17325c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f17326d;

    /* renamed from: e, reason: collision with root package name */
    int f17327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f17326d = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17325c = obj;
        this.f17327e |= Integer.MIN_VALUE;
        return this.f17326d.d(null, this);
    }
}
