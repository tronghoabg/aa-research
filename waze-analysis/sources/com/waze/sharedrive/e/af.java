package com.waze.sharedrive.e;

/* loaded from: classes7.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38310a;

    /* renamed from: b, reason: collision with root package name */
    int f38311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f38312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(l lVar, h.c.e eVar) {
        super(eVar);
        this.f38312c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38310a = obj;
        this.f38311b |= Integer.MIN_VALUE;
        return this.f38312c.emit(null, this);
    }
}
