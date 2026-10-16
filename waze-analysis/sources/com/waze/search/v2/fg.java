package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36509a;

    /* renamed from: b, reason: collision with root package name */
    int f36510b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36511c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36509a = obj;
        this.f36510b |= Integer.MIN_VALUE;
        return this.f36511c.emit(null, this);
    }
}
