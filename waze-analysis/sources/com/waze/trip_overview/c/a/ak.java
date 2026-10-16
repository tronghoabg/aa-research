package com.waze.trip_overview.c.a;

/* loaded from: classes7.dex */
public final class ak extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41192a;

    /* renamed from: b, reason: collision with root package name */
    int f41193b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f41194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(am amVar, h.c.e eVar) {
        super(eVar);
        this.f41194c = amVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41192a = obj;
        this.f41193b |= Integer.MIN_VALUE;
        return this.f41194c.emit(null, this);
    }
}
