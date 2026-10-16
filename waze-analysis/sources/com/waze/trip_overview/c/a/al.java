package com.waze.trip_overview.c.a;

/* loaded from: classes7.dex */
public final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41195a;

    /* renamed from: b, reason: collision with root package name */
    int f41196b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f41197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(am amVar, h.c.e eVar) {
        super(eVar);
        this.f41197c = amVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41195a = obj;
        this.f41196b |= Integer.MIN_VALUE;
        return this.f41197c.emit(null, this);
    }
}
