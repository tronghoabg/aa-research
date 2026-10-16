package com.waze.settings;

/* loaded from: classes7.dex */
public final class gp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37324a;

    /* renamed from: b, reason: collision with root package name */
    int f37325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37326c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37324a = obj;
        this.f37325b |= Integer.MIN_VALUE;
        return this.f37326c.emit(null, this);
    }
}
