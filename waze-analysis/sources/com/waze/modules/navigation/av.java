package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30331b;

    /* renamed from: c, reason: collision with root package name */
    int f30332c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.sharedrive.e.bn f30333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30331b = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30330a = obj;
        this.f30332c |= Integer.MIN_VALUE;
        return this.f30331b.v(null, null, null, this);
    }
}
