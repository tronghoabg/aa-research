package com.waze.map.b;

/* loaded from: classes6.dex */
public final class ey extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28298a;

    /* renamed from: b, reason: collision with root package name */
    int f28299b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28300c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28298a = obj;
        this.f28299b |= Integer.MIN_VALUE;
        return this.f28300c.emit(null, this);
    }
}
