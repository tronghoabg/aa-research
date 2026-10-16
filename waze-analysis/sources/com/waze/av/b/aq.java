package com.waze.av.b;

/* loaded from: classes6.dex */
public final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15877a;

    /* renamed from: b, reason: collision with root package name */
    int f15878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f15879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f15879c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15877a = obj;
        this.f15878b |= Integer.MIN_VALUE;
        return this.f15879c.emit(null, this);
    }
}
