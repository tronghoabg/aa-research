package com.waze.ui.l;

/* loaded from: classes7.dex */
public final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42530a;

    /* renamed from: b, reason: collision with root package name */
    int f42531b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f42532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f42532c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42530a = obj;
        this.f42531b |= Integer.MIN_VALUE;
        return this.f42532c.emit(null, this);
    }
}
