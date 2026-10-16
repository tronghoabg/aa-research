package com.waze.map.b;

/* loaded from: classes6.dex */
public final class fb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28308a;

    /* renamed from: b, reason: collision with root package name */
    int f28309b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28310c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28308a = obj;
        this.f28309b |= Integer.MIN_VALUE;
        return this.f28310c.emit(null, this);
    }
}
