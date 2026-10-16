package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38556a;

    /* renamed from: b, reason: collision with root package name */
    int f38557b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f38558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f38558c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38556a = obj;
        this.f38557b |= Integer.MIN_VALUE;
        return this.f38558c.emit(null, this);
    }
}
