package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NavigateUtilsNativeManager f31219b;

    /* renamed from: c, reason: collision with root package name */
    int f31220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(NavigateUtilsNativeManager navigateUtilsNativeManager, h.c.e eVar) {
        super(eVar);
        this.f31219b = navigateUtilsNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31218a = obj;
        this.f31220c |= Integer.MIN_VALUE;
        return this.f31219b.getNavigationRouteArea(false, this);
    }
}
