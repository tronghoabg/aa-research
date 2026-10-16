package com.waze.settings.tree.a;

/* loaded from: classes7.dex */
public final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37506a;

    /* renamed from: b, reason: collision with root package name */
    int f37507b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f37508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q qVar, h.c.e eVar) {
        super(eVar);
        this.f37508c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37506a = obj;
        this.f37507b |= Integer.MIN_VALUE;
        return this.f37508c.emit(null, this);
    }
}
