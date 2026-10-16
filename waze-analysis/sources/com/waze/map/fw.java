package com.waze.map;

/* loaded from: classes6.dex */
public final class fw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29028a;

    /* renamed from: b, reason: collision with root package name */
    int f29029b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fx f29030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f29030c = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29028a = obj;
        this.f29029b |= Integer.MIN_VALUE;
        return this.f29030c.emit(null, this);
    }
}
