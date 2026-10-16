package com.waze.settings;

/* loaded from: classes7.dex */
public final class bd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36859a;

    /* renamed from: b, reason: collision with root package name */
    int f36860b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f36861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f36861c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36859a = obj;
        this.f36860b |= Integer.MIN_VALUE;
        return this.f36861c.emit(null, this);
    }
}
