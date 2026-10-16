package com.waze.shared_infra.r;

/* loaded from: classes7.dex */
public final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38001a;

    /* renamed from: b, reason: collision with root package name */
    int f38002b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f38003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g gVar, h.c.e eVar) {
        super(eVar);
        this.f38003c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38001a = obj;
        this.f38002b |= Integer.MIN_VALUE;
        return this.f38003c.emit(null, this);
    }
}
