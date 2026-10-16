package com.waze.sound;

/* loaded from: classes7.dex */
public final class dl extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39785a;

    /* renamed from: b, reason: collision with root package name */
    int f39786b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dn f39787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(dn dnVar, h.c.e eVar) {
        super(eVar);
        this.f39787c = dnVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39785a = obj;
        this.f39786b |= Integer.MIN_VALUE;
        return this.f39787c.emit(null, this);
    }
}
