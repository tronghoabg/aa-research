package com.waze.settings.tree.a;

/* loaded from: classes7.dex */
public final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37500a;

    /* renamed from: b, reason: collision with root package name */
    int f37501b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f37502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, h.c.e eVar) {
        super(eVar);
        this.f37502c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37500a = obj;
        this.f37501b |= Integer.MIN_VALUE;
        return this.f37502c.emit(null, this);
    }
}
