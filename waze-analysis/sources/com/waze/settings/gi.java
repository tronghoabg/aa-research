package com.waze.settings;

/* loaded from: classes7.dex */
public final class gi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37310a;

    /* renamed from: b, reason: collision with root package name */
    int f37311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37312c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37310a = obj;
        this.f37311b |= Integer.MIN_VALUE;
        return this.f37312c.emit(null, this);
    }
}
