package com.waze.modules.d;

/* loaded from: classes6.dex */
public final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30251a;

    /* renamed from: b, reason: collision with root package name */
    int f30252b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f30253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, h.c.e eVar) {
        super(eVar);
        this.f30253c = vVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30251a = obj;
        this.f30252b |= Integer.MIN_VALUE;
        return this.f30253c.emit(null, this);
    }
}
