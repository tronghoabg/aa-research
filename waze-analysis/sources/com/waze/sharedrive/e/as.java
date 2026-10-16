package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class as extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38349a;

    /* renamed from: b, reason: collision with root package name */
    int f38350b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38351c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38349a = obj;
        this.f38350b |= Integer.MIN_VALUE;
        return this.f38351c.emit(null, this);
    }
}
