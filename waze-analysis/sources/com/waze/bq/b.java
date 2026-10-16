package com.waze.bq;

/* loaded from: classes7.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17233a;

    /* renamed from: b, reason: collision with root package name */
    int f17234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f17235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f17235c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17233a = obj;
        this.f17234b |= Integer.MIN_VALUE;
        return this.f17235c.emit(null, this);
    }
}
