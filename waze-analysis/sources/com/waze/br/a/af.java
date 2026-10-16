package com.waze.br.a;

/* loaded from: classes7.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17267a;

    /* renamed from: b, reason: collision with root package name */
    int f17268b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f17269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f17269c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17267a = obj;
        this.f17268b |= Integer.MIN_VALUE;
        return this.f17269c.emit(null, this);
    }
}
