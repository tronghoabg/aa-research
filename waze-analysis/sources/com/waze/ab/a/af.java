package com.waze.ab.a;

/* loaded from: classes5.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13697a;

    /* renamed from: b, reason: collision with root package name */
    int f13698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f13699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f13699c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13697a = obj;
        this.f13698b |= Integer.MIN_VALUE;
        return this.f13699c.emit(null, this);
    }
}
