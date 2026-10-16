package com.waze.settings;

/* loaded from: classes7.dex */
public final class fl extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37264a;

    /* renamed from: b, reason: collision with root package name */
    int f37265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37266c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37264a = obj;
        this.f37265b |= Integer.MIN_VALUE;
        return this.f37266c.emit(null, this);
    }
}
