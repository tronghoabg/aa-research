package com.waze.av.a;

/* loaded from: classes6.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15809a;

    /* renamed from: b, reason: collision with root package name */
    int f15810b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15811c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15809a = obj;
        this.f15810b |= Integer.MIN_VALUE;
        return this.f15811c.emit(null, this);
    }
}
