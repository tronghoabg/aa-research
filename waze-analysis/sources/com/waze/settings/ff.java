package com.waze.settings;

/* loaded from: classes7.dex */
public final class ff extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37250a;

    /* renamed from: b, reason: collision with root package name */
    int f37251b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37252c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37250a = obj;
        this.f37251b |= Integer.MIN_VALUE;
        return this.f37252c.emit(null, this);
    }
}
