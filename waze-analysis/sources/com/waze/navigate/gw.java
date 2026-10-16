package com.waze.navigate;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gw {

    /* renamed from: a, reason: collision with root package name */
    public static final gw f31465a = new gw();

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f31466b;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("VenueFreshnessUtils");
        h.g.b.x.e(eVarD, "create(...)");
        f31466b = eVarD;
    }

    static final h.ab a(gm gmVar, CompletableDeferred completableDeferred) {
        f31466b.a("UpdateVenueLocationPopup confirmed");
        gmVar.a(gl.f31435b);
        completableDeferred.a(true);
        return h.ab.f48028a;
    }

    static final h.ab b(h.g.a.a aVar) {
        f31466b.a("UpdateVenueLocationPopup cancelled");
        aVar.invoke();
        return h.ab.f48028a;
    }

    static final h.ab c(CompletableDeferred completableDeferred, h.g.a.a aVar) {
        if (!completableDeferred.ca()) {
            f31466b.a("UpdateVenueLocationPopup dismissed");
            aVar.invoke();
        }
        return h.ab.f48028a;
    }

    public static final boolean d(com.waze.av.b.l lVar, com.waze.av.d.k kVar, long j2) {
        h.g.b.x.f(lVar, "oldPlace");
        h.g.b.x.f(kVar, "freshVenue");
        float fB = com.waze.sharedui.utils.f.b(kVar.h(), lVar.e().d());
        f31466b.e("venue coordinates moved by " + fB + "m: {" + lVar.e().d() + "} to {" + kVar.h() + "}");
        return fB >= ((float) j2);
    }

    public static final com.waze.shared_infra.i.e e() {
        return f31466b;
    }

    public static final void f(com.waze.av.b.n nVar, com.waze.av.d.k kVar, com.waze.ct ctVar, com.waze.ao aoVar) {
        h.g.b.x.f(nVar, "freshPlace");
        h.g.b.x.f(kVar, "freshVenue");
        h.g.b.x.f(ctVar, "locationPreviewBroadcaster");
        h.g.b.x.f(aoVar, "carManager");
        f31466b.a("launchLocationPreview: venueId=" + kVar.A() + ", carConnected=" + aoVar.e());
        if (aoVar.e()) {
            ctVar.c(nVar, kVar);
        } else {
            ctVar.d(new com.google.firebase.messaging.l(nVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlinx.coroutines.af r17, com.waze.search.b.a r18, com.waze.main_screen.l.b.d r19, com.waze.places.a.b r20, com.waze.av.b.l r21, h.c.e r22) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.gw.g(kotlinx.coroutines.af, com.waze.search.b.a, com.waze.main_screen.l.b.d, com.waze.places.a.b, com.waze.av.b.l, h.c.e):java.lang.Object");
    }
}
