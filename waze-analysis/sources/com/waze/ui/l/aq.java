package com.waze.ui.l;

/* loaded from: classes7.dex */
public final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42518a;

    /* renamed from: b, reason: collision with root package name */
    int f42519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f42520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f42520c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42518a = obj;
        this.f42519b |= Integer.MIN_VALUE;
        return this.f42520c.emit(null, this);
    }
}
