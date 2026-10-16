package com.waze.bw.a.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17608a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17609b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f17610c;

    /* renamed from: d, reason: collision with root package name */
    int f17611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(v vVar, h.c.e eVar) {
        super(eVar);
        this.f17610c = vVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17609b = obj;
        this.f17611d |= Integer.MIN_VALUE;
        return v.i(this.f17610c, null, this);
    }
}
