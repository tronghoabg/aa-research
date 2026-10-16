package com.waze.map.b;

/* loaded from: classes6.dex */
public final class bo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28096a;

    /* renamed from: b, reason: collision with root package name */
    int f28097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp f28098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(bp bpVar, h.c.e eVar) {
        super(eVar);
        this.f28098c = bpVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28096a = obj;
        this.f28097b |= Integer.MIN_VALUE;
        return this.f28098c.emit(null, this);
    }
}
