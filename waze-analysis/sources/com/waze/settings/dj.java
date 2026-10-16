package com.waze.settings;

/* loaded from: classes7.dex */
public final class dj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37037a;

    /* renamed from: b, reason: collision with root package name */
    int f37038b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37039c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37037a = obj;
        this.f37038b |= Integer.MIN_VALUE;
        return this.f37039c.emit(null, this);
    }
}
