package com.waze.location;

/* loaded from: classes6.dex */
public final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25276a;

    /* renamed from: b, reason: collision with root package name */
    int f25277b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f25278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(av avVar, h.c.e eVar) {
        super(eVar);
        this.f25278c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25276a = obj;
        this.f25277b |= Integer.MIN_VALUE;
        return this.f25278c.emit(null, this);
    }
}
