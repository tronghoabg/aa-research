package com.waze.map.b;

/* loaded from: classes6.dex */
public final class eu extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28286a;

    /* renamed from: b, reason: collision with root package name */
    int f28287b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28288c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28286a = obj;
        this.f28287b |= Integer.MIN_VALUE;
        return this.f28288c.emit(null, this);
    }
}
