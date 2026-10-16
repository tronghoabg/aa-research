package com.waze.sharedrive.d;

/* loaded from: classes7.dex */
public final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38163a;

    /* renamed from: b, reason: collision with root package name */
    int f38164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f38165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38165c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38163a = obj;
        this.f38164b |= Integer.MIN_VALUE;
        return this.f38165c.emit(null, this);
    }
}
