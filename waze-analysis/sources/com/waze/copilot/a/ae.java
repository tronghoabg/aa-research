package com.waze.copilot.a;

import com.waze.ev.EVNetworksNativeManager;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22680a;

    public ae(EVNetworksNativeManager eVNetworksNativeManager) {
        h.g.b.x.f(eVNetworksNativeManager, "evNetworksNativeManager");
        this.f22680a = eVNetworksNativeManager.getNetworkList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.copilot.data.b.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.copilot.a.ad
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.a.ad r0 = (com.waze.copilot.a.ad) r0
            int r1 = r0.f22679c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22679c = r1
            goto L18
        L13:
            com.waze.copilot.a.ad r0 = new com.waze.copilot.a.ad
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f22677a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22679c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            java.lang.Object r4 = r8.b()
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r8)
            java.lang.Object r4 = r4.f22680a
            r0.f22679c = r3
            java.lang.Object r4 = r4.a(r5, r6, r7, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.ae.a(java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch b() {
        return this.f22680a;
    }

    public ae(com.waze.copilot.data.b.h hVar) {
        h.g.b.x.f(hVar, "copilotRepository");
        this.f22680a = hVar;
    }
}
