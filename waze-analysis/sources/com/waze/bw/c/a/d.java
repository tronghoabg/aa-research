package com.waze.bw.c.a;

/* loaded from: classes7.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17757a;

    /* renamed from: b, reason: collision with root package name */
    int f17758b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f17759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f17759c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17757a = obj;
        this.f17758b |= Integer.MIN_VALUE;
        return this.f17759c.emit(null, this);
    }
}
