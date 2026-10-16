package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class bj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38434a;

    /* renamed from: b, reason: collision with root package name */
    int f38435b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38436c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38434a = obj;
        this.f38435b |= Integer.MIN_VALUE;
        return this.f38436c.emit(null, this);
    }
}
