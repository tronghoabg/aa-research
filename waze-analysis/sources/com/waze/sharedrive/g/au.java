package com.waze.sharedrive.g;

/* loaded from: classes7.dex */
public final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38670a;

    /* renamed from: b, reason: collision with root package name */
    int f38671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f38672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(av avVar, h.c.e eVar) {
        super(eVar);
        this.f38672c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38670a = obj;
        this.f38671b |= Integer.MIN_VALUE;
        return this.f38672c.emit(null, this);
    }
}
