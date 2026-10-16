package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38431a;

    /* renamed from: b, reason: collision with root package name */
    int f38432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38433c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38431a = obj;
        this.f38432b |= Integer.MIN_VALUE;
        return this.f38433c.emit(null, this);
    }
}
