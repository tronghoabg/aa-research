package com.google.firebase.sessions.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f10865a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f10866b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f10867c;

    /* renamed from: d, reason: collision with root package name */
    int f10868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f10867c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10866b = obj;
        this.f10868d |= Integer.MIN_VALUE;
        return this.f10867c.c(this);
    }
}
