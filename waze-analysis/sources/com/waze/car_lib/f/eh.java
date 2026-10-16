package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class eh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19538a;

    /* renamed from: b, reason: collision with root package name */
    int f19539b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19540c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19538a = obj;
        this.f19539b |= Integer.MIN_VALUE;
        return this.f19540c.emit(null, this);
    }
}
