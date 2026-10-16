package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bp implements com.waze.sharedui.e.g {

    /* renamed from: a, reason: collision with root package name */
    private final LocationNativeManager f25383a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25384b;

    public bp() {
        LocationNativeManager locationNativeManager = LocationNativeManager.INSTANCE;
        this.f25383a = locationNativeManager;
        this.f25384b = kotlinx.coroutines.b.ai.D(locationNativeManager.getLocationStateFlow());
    }

    @Override // com.waze.sharedui.e.g
    public final com.waze.sharedui.e.c a() {
        LocationNativeManager locationNativeManager = this.f25383a;
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) locationNativeManager.getLocationStateFlow().d();
        return cVar == null ? locationNativeManager.getLatestSavedLocation() : cVar;
    }

    @Override // com.waze.sharedui.e.g
    public final /* synthetic */ Object b(h.c.e eVar) {
        return kotlinx.coroutines.b.ai.i(d(), new com.waze.sharedui.e.f(null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sharedui.e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.location.bo
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.location.bo r0 = (com.waze.location.bo) r0
            int r1 = r0.f25382c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25382c = r1
            goto L18
        L13:
            com.waze.location.bo r0 = new com.waze.location.bo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25380a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f25382c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.waze.location.LocationNativeManager r4 = r4.f25383a
            com.waze.location.ae r4 = (com.waze.location.ae) r4
            r0.f25382c = r3
            kotlinx.coroutines.CompletableDeferred r5 = kotlinx.coroutines.bo.j()
            com.waze.asks.ax r2 = new com.waze.asks.ax
            r3 = 2
            r2.<init>(r5, r3)
            r4.hasGPSReception(r2)
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L5a
        L4b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L54
            boolean r4 = r5.booleanValue()
            goto L55
        L54:
            r4 = 0
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.bp.c(h.c.e):java.lang.Object");
    }

    @Override // com.waze.sharedui.e.g
    public final kotlinx.coroutines.b.k d() {
        return this.f25384b;
    }
}
