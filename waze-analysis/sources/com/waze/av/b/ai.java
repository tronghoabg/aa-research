package com.waze.av.b;

/* loaded from: classes6.dex */
public final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15855a;

    /* renamed from: b, reason: collision with root package name */
    int f15856b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f15857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f15857c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15855a = obj;
        this.f15856b |= Integer.MIN_VALUE;
        return this.f15857c.emit(null, this);
    }
}
