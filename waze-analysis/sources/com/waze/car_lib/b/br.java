package com.waze.car_lib.b;

import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.dn;
import com.waze.reports_v2.c.dr;
import com.waze.reports_v2.c.ds;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.n f19050a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.k f19051b;

    /* renamed from: c, reason: collision with root package name */
    private final ds f19052c;

    /* renamed from: d, reason: collision with root package name */
    private final Cdo f19053d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.an.d.b f19054e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19055f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f19056g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.sharedui.e.c f19057h;

    /* renamed from: i, reason: collision with root package name */
    private int f19058i;

    public br(com.waze.reports_v2.c.n nVar, com.waze.reports_v2.c.k kVar, ds dsVar, Cdo cdo, com.waze.an.d.b bVar, com.waze.shared_infra.o.a aVar, dr drVar, h.c.j jVar) {
        h.g.b.x.f(nVar, "categoriesUseCase");
        h.g.b.x.f(kVar, "sendReportUseCase");
        h.g.b.x.f(dsVar, "reportPositionSaver");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(bVar, "notificationInsightsService");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(drVar, "reportingFeedbackConfig");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f19050a = nVar;
        this.f19051b = kVar;
        this.f19052c = dsVar;
        this.f19053d = cdo;
        this.f19054e = bVar;
        this.f19055f = aVar;
        this.f19056g = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.Q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f19053d.F(dn.f34439i);
        h(R.string.AAOS_UGC_REPORTS_REPORTED_ERROR_ALERT_TITLE, R.drawable.icon_report_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        if (qVar == null) {
            Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
            switch (atVar.ordinal()) {
                case 0:
                    qVar = com.waze.reports_v2.b.q.f34111a;
                    break;
                case 1:
                    qVar = com.waze.reports_v2.b.q.f34111a;
                    break;
                case 2:
                    qVar = com.waze.reports_v2.b.q.f34112b;
                    break;
                case 3:
                    qVar = com.waze.reports_v2.b.q.f34112b;
                    break;
                case 4:
                    qVar = com.waze.reports_v2.b.q.f34112b;
                    break;
                case 5:
                    qVar = com.waze.reports_v2.b.q.f34112b;
                    break;
                case 6:
                    qVar = com.waze.reports_v2.b.q.f34113c;
                    break;
                case 7:
                    qVar = com.waze.reports_v2.b.q.f34113c;
                    break;
                case 8:
                    qVar = com.waze.reports_v2.b.q.f34113c;
                    break;
                case 9:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 10:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 11:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 12:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 13:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 14:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 15:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 16:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 17:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 18:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 19:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 20:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 21:
                    qVar = com.waze.reports_v2.b.q.f34116f;
                    break;
                case 22:
                    qVar = com.waze.reports_v2.b.q.f34116f;
                    break;
                case 23:
                    qVar = com.waze.reports_v2.b.q.f34116f;
                    break;
                case 24:
                    qVar = com.waze.reports_v2.b.q.f34116f;
                    break;
                case 25:
                    qVar = com.waze.reports_v2.b.q.f34115e;
                    break;
                case 26:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 27:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 28:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 29:
                    qVar = com.waze.reports_v2.b.q.f34114d;
                    break;
                case 30:
                    qVar = com.waze.reports_v2.b.q.f34113c;
                    break;
                case 31:
                    qVar = com.waze.reports_v2.b.q.f34113c;
                    break;
                case 32:
                    qVar = com.waze.reports_v2.b.q.f34111a;
                    break;
                case 33:
                    qVar = com.waze.reports_v2.b.q.f34111a;
                    break;
                case 34:
                    qVar = com.waze.reports_v2.b.q.f34119i;
                    break;
                case 35:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 36:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 37:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 38:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 39:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 40:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 41:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 42:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 43:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 44:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 45:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 46:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 47:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 48:
                    qVar = com.waze.reports_v2.b.q.f34117g;
                    break;
                case 49:
                    qVar = com.waze.reports_v2.b.q.f34120j;
                    break;
                case 50:
                    qVar = com.waze.reports_v2.b.q.f34121k;
                    break;
                case 51:
                    qVar = com.waze.reports_v2.b.q.f34121k;
                    break;
                case 52:
                    qVar = com.waze.reports_v2.b.q.f34121k;
                    break;
                default:
                    throw new h.i();
            }
        }
        this.f19053d.B(qVar, atVar);
        h(R.string.AAOS_UGC_REPORTS_REPORTED_ALERT_TITLE, R.drawable.car_lib_icon_outline_checkmark_with_bg_36px);
    }

    private final void h(int i2, int i3) {
        int i4 = this.f19058i;
        this.f19058i = i4 + 1;
        com.waze.an.a.u uVar = new com.waze.an.a.u(String.valueOf(i4), com.waze.an.a.ae.f14546b);
        String strC = this.f19055f.c(i2, new Object[0]);
        Integer numValueOf = Integer.valueOf(i3);
        h.o.c cVar = h.o.a.f48264a;
        com.waze.an.c.q.b(this.f19054e, uVar, new com.waze.an.a.k(strC, null, numValueOf, new com.waze.an.a.j(h.o.c.j(5000L, h.o.d.f48272c), new l(12), null), h.a.i.h()), null, null, 28);
    }

    public final Object a(h.c.e eVar) {
        return this.f19050a.a(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.car_lib.b.bp
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.b.bp r0 = (com.waze.car_lib.b.bp) r0
            int r1 = r0.f19043c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19043c = r1
            goto L18
        L13:
            com.waze.car_lib.b.bp r0 = new com.waze.car_lib.b.bp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19041a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f19043c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.car_lib.b.br r0 = r0.f19044d
            r1 = r0
            com.waze.car_lib.b.br r1 = (com.waze.car_lib.b.br) r1
            e.b.c.b(r5)
            goto L44
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r5)
            com.waze.reports_v2.c.ds r5 = r4.f19052c
            r0.f19044d = r4
            r0.f19043c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L51
            r0 = r4
        L44:
            com.waze.sharedui.e.c r5 = (com.waze.sharedui.e.c) r5
            r0.f19057h = r5
            com.waze.reports_v2.c.do r4 = r4.f19053d
            r5 = 0
            r4.A(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.b.br.b(h.c.e):java.lang.Object");
    }

    public final void e(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.i iVar) {
        com.waze.reports_v2.b.at atVar2;
        com.waze.reports_v2.c.e eVarC;
        Long lI;
        h.g.b.x.f(qVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(atVar, "subtype");
        com.waze.sharedui.e.c cVar = this.f19057h;
        if (cVar == null || (lI = cVar.i()) == null) {
            atVar2 = atVar;
            eVarC = null;
        } else {
            atVar2 = atVar;
            eVarC = this.f19051b.c(atVar2, cVar, com.waze.settings.h.c.h(lI.longValue()), com.waze.rtalerts.y.f35166a, iVar);
        }
        if (!dr.a(qVar)) {
            g(qVar, atVar2);
            return;
        }
        com.waze.reports_v2.c.f fVarA = eVarC != null ? eVarC.a() : null;
        if (fVarA != null) {
            int iOrdinal = fVarA.ordinal();
            if (iOrdinal == 0) {
                kotlinx.coroutines.aj.z(this.f19056g, null, null, new bq(eVarC, this, qVar, atVar2, null), 3);
                return;
            } else if (iOrdinal != 1 && iOrdinal != 2) {
                throw new h.i();
            }
        }
        f();
    }
}
