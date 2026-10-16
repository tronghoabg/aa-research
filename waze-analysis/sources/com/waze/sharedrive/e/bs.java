package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class bs extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38456a;

    /* renamed from: b, reason: collision with root package name */
    int f38457b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38458c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38456a = obj;
        this.f38457b |= Integer.MIN_VALUE;
        return this.f38458c.emit(null, this);
    }
}
