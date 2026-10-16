package com.waze.map.b;

/* loaded from: classes6.dex */
public final class es extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28280a;

    /* renamed from: b, reason: collision with root package name */
    int f28281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f28282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(av avVar, h.c.e eVar) {
        super(eVar);
        this.f28282c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28280a = obj;
        this.f28281b |= Integer.MIN_VALUE;
        return this.f28282c.emit(null, this);
    }
}
