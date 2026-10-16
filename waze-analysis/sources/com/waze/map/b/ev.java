package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ev extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28289a;

    /* renamed from: b, reason: collision with root package name */
    int f28290b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28291c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28289a = obj;
        this.f28290b |= Integer.MIN_VALUE;
        return this.f28291c.emit(null, this);
    }
}
