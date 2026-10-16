package com.waze.main_screen.c;

/* loaded from: classes6.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26091a;

    /* renamed from: b, reason: collision with root package name */
    int f26092b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f26093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f26093c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26091a = obj;
        this.f26092b |= Integer.MIN_VALUE;
        return this.f26093c.emit(null, this);
    }
}
