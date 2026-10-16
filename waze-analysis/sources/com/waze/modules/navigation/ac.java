package com.waze.modules.navigation;

import com.waze.NativeManager;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac implements com.waze.modules.navigation.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.trip_overview.bl f30276a;

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f30277b;

    /* renamed from: c, reason: collision with root package name */
    private final NativeManager f30278c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f30279d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f30280e;

    public ac(com.waze.trip_overview.bl blVar, DriveToNativeManager driveToNativeManager, NativeManager nativeManager, com.waze.app_nav.hub.b.c cVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(blVar, "tripOverviewStats");
        h.g.b.x.f(driveToNativeManager, "navigationManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(aVar, "stringProvider");
        this.f30276a = blVar;
        this.f30277b = driveToNativeManager;
        this.f30278c = nativeManager;
        this.f30279d = cVar;
        this.f30280e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r1 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b8, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.modules.navigation.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.modules.navigation.ao r28, h.c.e r29) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.ac.a(com.waze.modules.navigation.ao, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // com.waze.modules.navigation.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.waze.av.b.n r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newDestination"
            h.g.b.x.f(r7, r0)
            com.waze.navigate.DriveToNativeManager r0 = r6.f30277b
            com.waze.navigate.AddressItem r0 = r0.getCurrentNavigatingAddressItem()
            if (r0 == 0) goto L14
            com.waze.av.b.x r1 = com.waze.av.b.x.f16010a
            com.waze.av.b.n r0 = r1.a(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L62
            if (r0 != 0) goto L1c
            goto L62
        L1c:
            com.waze.av.a.p r3 = r7.e()
            com.waze.av.a.o r3 = r3.c()
            java.lang.String r3 = r3.c()
            com.waze.av.a.p r7 = r7.e()
            com.waze.shared_infra.h.c r7 = r7.d()
            com.waze.av.a.p r4 = r0.e()
            com.waze.av.a.o r4 = r4.c()
            java.lang.String r4 = r4.c()
            com.waze.av.a.p r0 = r0.e()
            com.waze.shared_infra.h.c r0 = r0.d()
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L58
            boolean r5 = h.n.o.G(r5)
            if (r5 == 0) goto L50
            goto L58
        L50:
            boolean r3 = h.g.b.x.n(r3, r4)
            if (r3 == 0) goto L58
            r3 = r1
            goto L59
        L58:
            r3 = r2
        L59:
            boolean r7 = h.g.b.x.n(r7, r0)
            if (r3 != 0) goto L6b
            if (r7 == 0) goto L62
            goto L6b
        L62:
            com.waze.NativeManager r6 = r6.f30278c
            boolean r6 = r6.isNear()
            if (r6 != 0) goto L6b
            return r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.ac.b(com.waze.av.b.n):boolean");
    }
}
