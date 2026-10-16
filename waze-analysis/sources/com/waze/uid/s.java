package com.waze.uid;

/* loaded from: classes7.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44560a;

    /* renamed from: b, reason: collision with root package name */
    int f44561b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f44562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f44562c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44560a = obj;
        this.f44561b |= Integer.MIN_VALUE;
        return this.f44562c.emit(null, this);
    }
}
