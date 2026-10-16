package com.waze.settings.f.b;

/* loaded from: classes7.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37225a;

    /* renamed from: b, reason: collision with root package name */
    int f37226b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f37227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f37227c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37225a = obj;
        this.f37226b |= Integer.MIN_VALUE;
        return this.f37227c.emit(null, this);
    }
}
