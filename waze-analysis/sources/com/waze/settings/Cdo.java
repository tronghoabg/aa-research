package com.waze.settings;

/* renamed from: com.waze.settings.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37050a;

    /* renamed from: b, reason: collision with root package name */
    int f37051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk f37052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(dk dkVar, h.c.e eVar) {
        super(eVar);
        this.f37052c = dkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37050a = obj;
        this.f37051b |= Integer.MIN_VALUE;
        return this.f37052c.emit(null, this);
    }
}
