package com.waze.install;

/* loaded from: classes6.dex */
public final class aj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24746a;

    /* renamed from: b, reason: collision with root package name */
    int f24747b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f24748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f24748c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24746a = obj;
        this.f24747b |= Integer.MIN_VALUE;
        return this.f24748c.emit(null, this);
    }
}
