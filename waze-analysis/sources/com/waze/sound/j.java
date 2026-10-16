package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40268a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f40269b;

    /* renamed from: c, reason: collision with root package name */
    int f40270c;

    /* renamed from: d, reason: collision with root package name */
    String f40271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, h.c.e eVar) {
        super(eVar);
        this.f40269b = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40268a = obj;
        this.f40270c |= Integer.MIN_VALUE;
        return this.f40269b.c(null, false, this);
    }
}
