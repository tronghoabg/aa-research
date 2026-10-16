package com.waze.map;

/* loaded from: classes6.dex */
public final class fj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28949a;

    /* renamed from: b, reason: collision with root package name */
    int f28950b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fk f28951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(fk fkVar, h.c.e eVar) {
        super(eVar);
        this.f28951c = fkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28949a = obj;
        this.f28950b |= Integer.MIN_VALUE;
        return this.f28951c.emit(null, this);
    }
}
