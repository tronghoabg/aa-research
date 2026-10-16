package com.waze.settings.tree.a;

/* loaded from: classes7.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37487a;

    /* renamed from: b, reason: collision with root package name */
    int f37488b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f37489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, h.c.e eVar) {
        super(eVar);
        this.f37489c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37487a = obj;
        this.f37488b |= Integer.MIN_VALUE;
        return this.f37489c.emit(null, this);
    }
}
