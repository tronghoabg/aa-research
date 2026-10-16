package com.waze.w;

/* loaded from: classes5.dex */
public final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45462a;

    /* renamed from: b, reason: collision with root package name */
    int f45463b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f45464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, h.c.e eVar) {
        super(eVar);
        this.f45464c = vVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45462a = obj;
        this.f45463b |= Integer.MIN_VALUE;
        return this.f45464c.emit(null, this);
    }
}
