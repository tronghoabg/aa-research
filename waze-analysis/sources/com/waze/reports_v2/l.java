package com.waze.reports_v2;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.waze.NativeManager;
import com.waze.location.o;
import com.waze.navigate.eo;
import com.waze.planned_drive.ae;
import com.waze.realtime_report_feedback.ReportFeedbackServiceProvider;
import com.waze.reports.WazeReportNativeManager;
import com.waze.reports_v2.b.aq;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.ag;
import com.waze.reports_v2.c.an;
import com.waze.reports_v2.c.ao;
import com.waze.reports_v2.c.bk;
import com.waze.reports_v2.c.bp;
import com.waze.reports_v2.c.bs;
import com.waze.reports_v2.c.bw;
import com.waze.reports_v2.c.cn;
import com.waze.reports_v2.c.cp;
import com.waze.reports_v2.c.de;
import com.waze.reports_v2.c.dk;
import com.waze.reports_v2.c.dr;
import com.waze.reports_v2.c.el;
import com.waze.reports_v2.presentation.a.as;
import com.waze.reports_v2.presentation.a.q;
import com.waze.reports_v2.presentation.a.t;
import com.waze.reports_v2.presentation.dc;
import com.waze.search.h.bd;
import com.waze.search.h.bx;
import com.waze.search.h.bz;
import com.waze.shared_infra.q.r;
import com.waze.sound.fm;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.w.y;
import h.ab;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f34604a;

    public /* synthetic */ l(int i2) {
        this.f34604a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34604a) {
            case 0:
                int i2 = n.f34605a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ReportLaterStateHolder");
                x.e(eVarD, "create(...)");
                return new t(eVarD);
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i3 = n.f34605a;
                x.f(bVar, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i4 = ar.f48106a;
                return new e((com.waze.bl.c.c.c) bVar.a(new h.g.b.m(com.waze.bl.c.c.c.class), null, null), (ao) bVar.a(new h.g.b.m(cn.class), null, null));
            case 2:
                int i5 = n.f34605a;
                return d.b((org.a.d.k.b) obj, (org.a.d.h.a) obj2);
            case 3:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i6 = n.f34605a;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                return new com.waze.sound.m((bs) bVar2.a(new h.g.b.m(bs.class), null, null), (com.waze.shared_infra.i.b) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), (fm) bVar2.a(new h.g.b.m(fm.class), null, null), null, 24);
            case 4:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i8 = n.f34605a;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                com.waze.reports_v2.c.k kVar = (com.waze.reports_v2.c.k) bVar3.a(new h.g.b.m(com.waze.reports_v2.c.k.class), null, null);
                el elVar = (el) bVar3.a(new h.g.b.m(el.class), null, null);
                dr drVar = (dr) bVar3.a(new h.g.b.m(dr.class), null, null);
                Cdo cdo = (Cdo) bVar3.a(new h.g.b.m(Cdo.class), null, null);
                aq aqVar = (aq) bVar3.a(new h.g.b.m(aq.class), null, null);
                dc dcVar = (dc) bVar3.a(new h.g.b.m(dc.class), null, null);
                com.waze.reports_v2.c.dc dcVar2 = (com.waze.reports_v2.c.dc) bVar3.a(new h.g.b.m(com.waze.reports_v2.c.dc.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ReportStateHolder");
                x.e(eVarD2, "create(...)");
                return new as(kVar, elVar, drVar, cdo, eVarD2, aqVar, dcVar, dcVar2);
            case 5:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i10 = n.f34605a;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                bs bsVar = bs.f34281a;
                int i11 = ar.f48106a;
                return new cp(bsVar, (bw) bVar4.a(new h.g.b.m(bw.class), null, null), new com.waze.reports_v2.a.b.a((bw) bVar4.a(new h.g.b.m(bw.class), null, null), bsVar, (bk) bVar4.a(new h.g.b.m(bp.class), null, null)));
            case 6:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i12 = n.f34605a;
                x.f(bVar5, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                return new de((WazeReportNativeManager) bVar5.a(new h.g.b.m(WazeReportNativeManager.class), null, null));
            case 7:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i14 = n.f34605a;
                x.f(bVar6, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                Context contextH = k.a.k.h(bVar6);
                int i15 = ar.f48106a;
                return new q(contextH, (aq) bVar6.a(new h.g.b.m(aq.class), null, null), (fm) bVar6.a(new h.g.b.m(fm.class), null, null), new com.waze.map.opengl.j(), (com.waze.reports_v2.d.j) bVar6.a(new h.g.b.m(com.waze.reports_v2.d.j.class), null, null));
            case 8:
                int i16 = n.f34605a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.realtime_report_feedback.e eVar = ReportFeedbackServiceProvider.Companion;
                return com.waze.realtime_report_feedback.e.a();
            case 9:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i17 = n.f34605a;
                x.f(bVar7, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                return new ag((e) bVar7.a(new h.g.b.m(e.class), null, null), (bw) bVar7.a(new h.g.b.m(bw.class), null, null));
            case 10:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i19 = n.f34605a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                return new an((eo) bVar8.a(new h.g.b.m(eo.class), null, null), (com.waze.reports_v2.d.j) bVar8.a(new h.g.b.m(com.waze.reports_v2.d.j.class), null, null), (r) bVar8.a(new h.g.b.m(r.class), null, null), (com.waze.shared_infra.q.e) bVar8.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (ag) bVar8.a(new h.g.b.m(ag.class), null, null));
            case 11:
                int i21 = n.f34605a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new dr();
            case 12:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i22 = n.f34605a;
                x.f(bVar9, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i23 = ar.f48106a;
                return new com.waze.reports_v2.d.k((ax) bVar9.a(new h.g.b.m(ax.class), null, null), (com.waze.as.a) bVar9.a(new h.g.b.m(com.waze.as.a.class), null, null));
            case 13:
                int i24 = n.f34605a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new dk();
            case 14:
                com.waze.reports_v2.a.a.a.b bVar10 = (com.waze.reports_v2.a.a.a.b) obj2;
                x.f((SaverScope) obj, "$this$listSaver");
                x.f(bVar10, "state");
                return h.a.i.d(bVar10.a());
            case 15:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i25 = iIntValue & 3;
                int i26 = iIntValue & 1;
                int i27 = com.waze.search.a.f35439a;
                if (composer.shouldExecute(i25 != 2, i26)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1578122552, iIntValue, -1, "com.waze.search.ComposableSingletons$SearchFragmentKt.lambda$1578122552.<anonymous> (SearchFragment.kt:76)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.T.b(), composer, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer, 0).C(), composer, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 16:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                com.waze.search.k kVar2 = com.waze.search.k.f35975a;
                x.f(bVar11, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.speech.k kVar3 = new com.waze.speech.k();
                int i28 = ar.f48106a;
                return new com.waze.sound.f.f(kVar3, (com.waze.sound.f.d) bVar11.a(new h.g.b.m(com.waze.sound.f.d.class), null, null));
            case 17:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                org.a.d.h.a aVar = (org.a.d.h.a) obj2;
                com.waze.search.k kVar4 = com.waze.search.k.f35975a;
                x.f(bVar12, "$this$viewModel");
                x.f(aVar, "<destruct>");
                int i29 = ar.f48106a;
                return new bz((bx) bVar12.a(new h.g.b.m(bx.class), null, new ae((bd) aVar.c(new h.g.b.m(bd.class)), 13)));
            case 18:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                com.waze.search.k kVar5 = com.waze.search.k.f35975a;
                x.f(bVar13, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i30 = ar.f48106a;
                return new com.waze.j.b.e((com.waze.w.c) bVar13.a(new h.g.b.m(com.waze.w.c.class), null, null), new com.waze.beacons.g((NativeManager) bVar13.a(new h.g.b.m(NativeManager.class), null, null)), (com.waze.av.a.b) bVar13.a(new h.g.b.m(com.waze.av.a.b.class), null, null), (com.waze.coroutines.a) bVar13.a(new h.g.b.m(com.waze.coroutines.a.class), null, null));
            case 19:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                com.waze.search.k kVar6 = com.waze.search.k.f35975a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i31 = ar.f48106a;
                return new com.waze.search.g.b((com.waze.av.a.b) bVar14.a(new h.g.b.m(com.waze.av.a.b.class), null, null), (y) bVar14.a(new h.g.b.m(y.class), null, null));
            default:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                com.waze.search.k kVar7 = com.waze.search.k.f35975a;
                x.f(bVar15, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i32 = ar.f48106a;
                return new com.waze.search.c.m((o) bVar15.a(new h.g.b.m(o.class), null, null), new com.waze.perf.n());
        }
    }
}
