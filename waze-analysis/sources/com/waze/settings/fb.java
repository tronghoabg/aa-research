package com.waze.settings;

/* loaded from: classes7.dex */
public final class fb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37239a;

    /* renamed from: b, reason: collision with root package name */
    int f37240b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37241c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37239a = obj;
        this.f37240b |= Integer.MIN_VALUE;
        return this.f37241c.emit(null, this);
    }
}
