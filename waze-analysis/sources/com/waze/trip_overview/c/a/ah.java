package com.waze.trip_overview.c.a;

/* loaded from: classes7.dex */
public final class ah extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41184a;

    /* renamed from: b, reason: collision with root package name */
    int f41185b;

    /* renamed from: c, reason: collision with root package name */
    Object f41186c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ai f41187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f41187d = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41184a = obj;
        this.f41185b |= Integer.MIN_VALUE;
        return this.f41187d.emit(null, this);
    }
}
