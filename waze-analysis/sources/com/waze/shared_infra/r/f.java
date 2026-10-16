package com.waze.shared_infra.r;

/* loaded from: classes7.dex */
public final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37962a;

    /* renamed from: b, reason: collision with root package name */
    int f37963b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f37964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f37964c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37962a = obj;
        this.f37963b |= Integer.MIN_VALUE;
        return this.f37964c.emit(null, this);
    }
}
