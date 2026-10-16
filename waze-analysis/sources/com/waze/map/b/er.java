package com.waze.map.b;

/* loaded from: classes6.dex */
public final class er extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28277a;

    /* renamed from: b, reason: collision with root package name */
    int f28278b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28279c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28277a = obj;
        this.f28278b |= Integer.MIN_VALUE;
        return this.f28279c.emit(null, this);
    }
}
