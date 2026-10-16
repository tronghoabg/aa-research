package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f23573a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f23574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dt f23575c;

    /* renamed from: d, reason: collision with root package name */
    int f23576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dp(dt dtVar, h.c.e eVar) {
        super(eVar);
        this.f23575c = dtVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23574b = obj;
        this.f23576d |= Integer.MIN_VALUE;
        return dt.e(this.f23575c, null, null, this);
    }
}
