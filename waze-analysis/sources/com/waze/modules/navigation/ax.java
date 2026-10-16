package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ax extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30342b;

    /* renamed from: c, reason: collision with root package name */
    int f30343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30342b = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30341a = obj;
        this.f30343c |= Integer.MIN_VALUE;
        return bk.t(this.f30342b, null, this);
    }
}
