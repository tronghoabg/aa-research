package com.waze.settings;

/* loaded from: classes7.dex */
public final class dq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37056a;

    /* renamed from: b, reason: collision with root package name */
    int f37057b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37058c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37056a = obj;
        this.f37057b |= Integer.MIN_VALUE;
        return this.f37058c.emit(null, this);
    }
}
