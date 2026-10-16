package com.waze.navigate.location_preview;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.waze.fd;
import com.waze.ifs.ui.EditTextDialogActivity;
import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.kd;
import com.waze.lj;
import com.waze.lk;
import com.waze.map.ds;
import com.waze.navigate.cl;
import com.waze.navigate.eh;
import com.waze.navigate.gn;
import com.waze.search.v2.gb;
import com.waze.ui.m.dl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai implements s {

    /* renamed from: a, reason: collision with root package name */
    private final cl f31533a;

    /* renamed from: b, reason: collision with root package name */
    private final lk f31534b;

    /* renamed from: c, reason: collision with root package name */
    private final lj f31535c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.places.o f31536d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.mywaze.n f31537e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bf f31538f;

    /* renamed from: g, reason: collision with root package name */
    private final kd f31539g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.favorites.k f31540h;

    /* renamed from: i, reason: collision with root package name */
    private final o f31541i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.av.b.o f31542j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f31543k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.modules.navigation.bp f31544l;
    private final eh m;
    private final fd n;
    private final com.waze.search.bd o;
    private final com.waze.d.c p;
    private final com.waze.av.a.b q;
    private final com.waze.shared_infra.i.e r;
    private final com.waze.bs s;
    private final com.waze.favorites.q t;
    private final com.waze.ads.d.b u;
    private final p v;
    private final ds w;
    private final com.waze.ads.b.a x;

    public ai(cl clVar, lk lkVar, lj ljVar, com.waze.places.o oVar, com.waze.mywaze.n nVar, com.waze.bf bfVar, kd kdVar, com.waze.favorites.k kVar, o oVar2, com.waze.av.b.o oVar3, com.waze.shared_infra.o.a aVar, com.waze.modules.navigation.bp bpVar, eh ehVar, fd fdVar, com.waze.search.bd bdVar, com.waze.d.c cVar, com.waze.av.a.b bVar, com.waze.shared_infra.i.e eVar, com.waze.bs bsVar, com.waze.favorites.q qVar, com.waze.ads.d.b bVar2, p pVar, ds dsVar, com.waze.ads.b.a aVar2) {
        h.g.b.x.f(clVar, "eventsManager");
        h.g.b.x.f(lkVar, "venueImageManager");
        h.g.b.x.f(ljVar, "venueFlagManager");
        h.g.b.x.f(oVar, "placesManager");
        h.g.b.x.f(nVar, "myWazeInterface");
        h.g.b.x.f(bfVar, "dangerZoneManager");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(kVar, "favoritesManager");
        h.g.b.x.f(oVar2, "analytics");
        h.g.b.x.f(oVar3, "genericPlaceActions");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(bpVar, "navigationCoordinatorFactory");
        h.g.b.x.f(ehVar, "navigationStartPointRepository");
        h.g.b.x.f(fdVar, "mapPointActions");
        h.g.b.x.f(bdVar, "searchOperation");
        h.g.b.x.f(cVar, "analyticsWrapper");
        h.g.b.x.f(bVar, "genericPlaceRepository");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bsVar, "webBrowserManager");
        h.g.b.x.f(qVar, "favoritesStatsReporter");
        h.g.b.x.f(bVar2, "adTracking");
        h.g.b.x.f(pVar, "locationPreviewConfig");
        h.g.b.x.f(dsVar, "mapVenueSelectionRepo");
        h.g.b.x.f(aVar2, "modifyAtaUrlForDarkModeUseCase");
        this.f31533a = clVar;
        this.f31534b = lkVar;
        this.f31535c = ljVar;
        this.f31536d = oVar;
        this.f31537e = nVar;
        this.f31538f = bfVar;
        this.f31539g = kdVar;
        this.f31540h = kVar;
        this.f31541i = oVar2;
        this.f31542j = oVar3;
        this.f31543k = aVar;
        this.f31544l = bpVar;
        this.m = ehVar;
        this.n = fdVar;
        this.o = bdVar;
        this.p = cVar;
        this.q = bVar;
        this.r = eVar;
        this.s = bsVar;
        this.t = qVar;
        this.u = bVar2;
        this.v = pVar;
        this.w = dsVar;
        this.x = aVar2;
    }

    public static /* synthetic */ h.ab b(kotlinx.coroutines.b.bn bnVar, ai aiVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar) {
        Object objD;
        h.g.b.x.f(cVar, "actions");
        h.g.b.x.f(dVar, "cta");
        com.waze.z.a.c.a aVar = (com.waze.z.a.c.a) cVar;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, dl.y((dl) objD, null, null, null, false, 16711679)));
        if (h.g.b.x.n(aVar.a(), dVar)) {
            aiVar.f31535c.venueFlag(ayVar.E(), 3, null, null);
            bmVar.c(ca.f31711a);
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(ai aiVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, kotlinx.coroutines.b.bn bnVar, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar) {
        Object objD;
        h.g.b.x.f(cVar, "actions");
        h.g.b.x.f(dVar, "cta");
        if (h.g.b.x.n(((com.waze.z.a.c.a) cVar).a(), dVar)) {
            com.waze.av.b.n nVarA = aiVar.q.a(new com.waze.car_lib.login.b(ayVar, 1));
            if (nVarA != null) {
                aiVar.f31542j.c(nVarA);
            } else {
                aiVar.r.b("Unable to find venue with id " + ayVar.E() + " in order to remove from favorites");
            }
            l(aiVar, bmVar, -1, null, false, false, 28);
        } else {
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, dl.y((dl) objD, null, null, null, false, 16711679)));
        }
        return h.ab.f48028a;
    }

    static final h.ab d(ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, kotlinx.coroutines.b.bm bmVar) {
        aiVar.f31540h.d(new com.waze.av.b.r(aiVar, bnVar, ayVar, bmVar, 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ void e(final ai aiVar, kotlinx.coroutines.b.bn bnVar, ay ayVar, final kotlinx.coroutines.b.bm bmVar, IsHomeWorkSetResult isHomeWorkSetResult) {
        boolean z = isHomeWorkSetResult != null ? !isHomeWorkSetResult.getIsHomeSet() : false;
        boolean z2 = isHomeWorkSetResult != null ? !isHomeWorkSetResult.getIsWorkSet() : false;
        com.waze.favorites.q qVar = aiVar.t;
        qVar.b(z, z2);
        while (true) {
            Object objD = bnVar.d();
            IsHomeWorkSetResult isHomeWorkSetResult2 = isHomeWorkSetResult;
            if (bnVar.f(objD, dl.y((dl) objD, null, null, gb.e(ayVar.i(), qVar, isHomeWorkSetResult2, aiVar.f31540h, new h.g.a.a() { // from class: com.waze.navigate.location_preview.w
                @Override // h.g.a.a
                public final Object invoke() {
                    ai.l(this.f31765a, bmVar, 0, null, false, false, 30);
                    return h.ab.f48028a;
                }
            }, new gn(bnVar, 3)), false, 16711679))) {
                return;
            } else {
                isHomeWorkSetResult = isHomeWorkSetResult2;
            }
        }
    }

    static /* synthetic */ void l(ai aiVar, kotlinx.coroutines.b.bm bmVar, int i2, Intent intent, boolean z, boolean z2, int i3) {
        if ((i3 & 4) != 0) {
            intent = null;
        }
        if ((i3 & 8) != 0) {
            z = intent != null;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        boolean z3 = (i3 & 16) == 0;
        aiVar.p.a();
        bmVar.c(new bw(i2, intent, z, z2 | (!z3)));
    }

    static /* synthetic */ Object m(ai aiVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, com.waze.modules.navigation.at atVar, h.c.e eVar, int i2) {
        if ((i2 & 4) != 0) {
            atVar = com.waze.modules.navigation.at.f30323c;
        }
        return aiVar.r(ayVar, bmVar, atVar, false, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.waze.navigate.location_preview.ay r7, kotlinx.coroutines.b.bm r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.n(com.waze.navigate.location_preview.ay, kotlinx.coroutines.b.bm, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0118 -> B:12:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.waze.navigate.location_preview.ay r21, com.waze.ui.m.bd r22, kotlinx.coroutines.b.bn r23, kotlinx.coroutines.b.bm r24, h.c.e r25) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.o(com.waze.navigate.location_preview.ay, com.waze.ui.m.bd, kotlinx.coroutines.b.bn, kotlinx.coroutines.b.bm, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00f4 -> B:12:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlinx.coroutines.b.bn r17, com.waze.navigate.location_preview.ay r18, kotlinx.coroutines.b.bm r19, h.c.e r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.p(kotlinx.coroutines.b.bn, com.waze.navigate.location_preview.ay, kotlinx.coroutines.b.bm, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x015a -> B:12:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlinx.coroutines.b.bn r17, com.waze.navigate.location_preview.ay r18, kotlinx.coroutines.b.bm r19, h.c.e r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.q(kotlinx.coroutines.b.bn, com.waze.navigate.location_preview.ay, kotlinx.coroutines.b.bm, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r4.a(r1, r2) != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.waze.navigate.location_preview.ay r20, kotlinx.coroutines.b.bm r21, com.waze.modules.navigation.at r22, boolean r23, h.c.e r24) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.r(com.waze.navigate.location_preview.ay, kotlinx.coroutines.b.bm, com.waze.modules.navigation.at, boolean, h.c.e):java.lang.Object");
    }

    private final void s(ActivityResult activityResult, int i2, ay ayVar, kotlinx.coroutines.b.bm bmVar) {
        Intent data;
        String stringExtra;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (stringExtra = data.getStringExtra(EditTextDialogActivity.s)) == null) {
            return;
        }
        this.f31535c.venueFlag(ayVar.E(), i2, stringExtra, null);
        bmVar.c(ca.f31711a);
    }

    private static final void t(kotlinx.coroutines.b.bn bnVar) {
        Object objD;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, dl.y((dl) objD, null, null, null, false, 16760831)));
    }

    private static final com.waze.ui.m.w u(kotlinx.coroutines.b.bn bnVar) {
        com.waze.ui.m.y yVarH = ((dl) bnVar.d()).h();
        if (yVarH instanceof com.waze.ui.m.w) {
            return (com.waze.ui.m.w) yVarH;
        }
        return null;
    }

    private static final boolean v(ay ayVar, int i2) {
        if (i2 >= 0 && i2 < ayVar.H().size()) {
            return true;
        }
        com.waze.shared_infra.i.h.g("Location preview got event with index out of range!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.waze.bf r8, com.waze.kd r9, com.waze.navigate.AddressItem r10, h.g.a.a r11, h.c.e r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.waze.navigate.location_preview.ae
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.navigate.location_preview.ae r0 = (com.waze.navigate.location_preview.ae) r0
            int r1 = r0.f31507d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31507d = r1
            goto L18
        L13:
            com.waze.navigate.location_preview.ae r0 = new com.waze.navigate.location_preview.ae
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r7 = r6.f31505b
            h.c.a.a r12 = h.c.a.a.f48038a
            int r0 = r6.f31507d
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            java.lang.Object r8 = r6.f31504a
            r11 = r8
            h.g.a.a r11 = (h.g.a.a) r11
            e.b.c.b(r7)
            goto L54
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            e.b.c.b(r7)
            com.waze.shared_infra.h.c r3 = new com.waze.shared_infra.h.c
            int r7 = r10.getLatitudeInt()
            int r10 = r10.getLongitudeInt()
            r3.<init>(r7, r10)
            com.waze.navigate.ar r5 = com.waze.navigate.ar.f31001b
            r6.f31504a = r11
            r6.f31507d = r1
            r2 = 0
            r1 = r8
            r4 = r9
            java.lang.Object r7 = com.waze.navigate.ax.a(r1, r2, r3, r4, r5, r6)
            if (r7 == r12) goto L62
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5f
            r11.invoke()
        L5f:
            h.ab r7 = h.ab.f48028a
            return r7
        L62:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.w(com.waze.bf, com.waze.kd, com.waze.navigate.AddressItem, h.g.a.a, h.c.e):java.lang.Object");
    }

    private static final void x(kotlinx.coroutines.b.bn bnVar) {
        Object objD;
        com.waze.ui.m.w wVarU = u(bnVar);
        if (wVarU != null) {
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, dl.y((dl) objD, com.waze.ui.m.w.e(wVarU, null), null, null, false, 16776191)));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x06bc -> B:183:0x06c7). Please report as a decompilation issue!!! */
    @Override // com.waze.navigate.location_preview.s
    public final java.lang.Object a(com.waze.ui.m.cb r33, kotlinx.coroutines.b.bn r34, com.waze.navigate.location_preview.ay r35, kotlinx.coroutines.b.bm r36, h.c.e r37) {
        /*
            Method dump skipped, instructions count: 2984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.ai.a(com.waze.ui.m.cb, kotlinx.coroutines.b.bn, com.waze.navigate.location_preview.ay, kotlinx.coroutines.b.bm, h.c.e):java.lang.Object");
    }
}
