package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ex extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28295a;

    /* renamed from: b, reason: collision with root package name */
    int f28296b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28297c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28295a = obj;
        this.f28296b |= Integer.MIN_VALUE;
        return this.f28297c.emit(null, this);
    }
}
