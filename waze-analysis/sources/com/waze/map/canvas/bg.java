package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f28587b;

    /* renamed from: c, reason: collision with root package name */
    int f28588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bi biVar, h.c.e eVar) {
        super(eVar);
        this.f28587b = biVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28586a = obj;
        this.f28588c |= Integer.MIN_VALUE;
        return this.f28587b.c(this);
    }
}
