package com.waze.reports_v2.b;

import com.waze.bg.a.bn;
import com.waze.bg.a.bo;
import com.waze.bg.a.br;
import com.waze.bg.a.bt;
import com.waze.bg.a.bw;
import com.waze.bg.a.by;
import com.waze.bg.a.ca;
import com.waze.bg.a.cf;
import com.waze.bg.a.cg;
import com.waze.bg.a.ch;
import com.waze.bg.a.ci;
import com.waze.bg.a.cj;
import com.waze.bg.a.co;
import com.waze.bg.a.cp;
import com.waze.bg.a.cq;
import com.waze.bg.a.cr;
import com.waze.bg.a.cw;
import com.waze.bg.a.cx;
import com.waze.bg.a.cy;
import com.waze.bg.a.cz;
import com.waze.bg.a.dc;
import com.waze.bg.a.dd;
import com.waze.bg.a.de;
import com.waze.jni.protos.location.ProviderPosition;
import com.waze.jni.protos.rtalerts.ReportLocationProto;
import com.waze.location.LocationNativeManager;
import com.waze.reports_v2.c.dl;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {
    public static final ag a(List list, q qVar, boolean z) {
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(qVar, "group");
        if (list.isEmpty() && z) {
            return null;
        }
        return new ag(qVar, list);
    }

    public static final ag b(List list, q qVar, boolean z, at atVar) {
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(qVar, "group");
        h.g.b.x.f(atVar, "otherSideType");
        if (list.isEmpty()) {
            return null;
        }
        return z ? new ag(qVar, h.a.i.ag(list, atVar)) : new ag(qVar, list);
    }

    public static final /* synthetic */ com.waze.sharedui.e.c e(ReportLocationProto reportLocationProto) {
        if (!reportLocationProto.hasPosition()) {
            return null;
        }
        LocationNativeManager locationNativeManager = LocationNativeManager.INSTANCE;
        ProviderPosition position = reportLocationProto.getPosition();
        h.g.b.x.e(position, "getPosition(...)");
        com.waze.sharedui.e.c wazeLocation = locationNativeManager.toWazeLocation(position);
        if (wazeLocation.f().g()) {
            return null;
        }
        return (!reportLocationProto.hasFromNodeDbId() || !reportLocationProto.hasToNodeDbId() || reportLocationProto.getFromNodeDbId() == -1 || reportLocationProto.getToNodeDbId() == -1) ? wazeLocation : com.waze.sharedui.e.c.j(wazeLocation, new com.waze.sharedui.e.a(wazeLocation.f(), wazeLocation.c(), new com.waze.sharedui.e.b(reportLocationProto.getFromNodeDbId(), reportLocationProto.getToNodeDbId()), null));
    }

    public static final /* synthetic */ com.waze.reports_v2.d.g f(dl dlVar) {
        return dlVar == dl.f34424d ? com.waze.reports_v2.d.g.f34582a : com.waze.reports_v2.d.g.f34586e;
    }

    private static final de g(bn bnVar) {
        cj cjVarNewBuilder = de.newBuilder();
        cf cfVarNewBuilder = cg.newBuilder();
        cfVarNewBuilder.a(bnVar);
        cjVarNewBuilder.a(cfVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de h(bo boVar) {
        cj cjVarNewBuilder = de.newBuilder();
        ch chVarNewBuilder = ci.newBuilder();
        chVarNewBuilder.a(boVar);
        cjVarNewBuilder.b(chVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de i(br brVar) {
        cj cjVarNewBuilder = de.newBuilder();
        co coVarNewBuilder = cp.newBuilder();
        coVarNewBuilder.a(brVar);
        cjVarNewBuilder.d(coVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de j(bt btVar) {
        cj cjVarNewBuilder = de.newBuilder();
        cq cqVarNewBuilder = cr.newBuilder();
        cqVarNewBuilder.a(btVar);
        cjVarNewBuilder.e(cqVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de k(bw bwVar) {
        cj cjVarNewBuilder = de.newBuilder();
        cw cwVarNewBuilder = cx.newBuilder();
        cwVarNewBuilder.a(bwVar);
        cjVarNewBuilder.g(cwVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de l(by byVar) {
        cj cjVarNewBuilder = de.newBuilder();
        cy cyVarNewBuilder = cz.newBuilder();
        cyVarNewBuilder.a(byVar);
        cjVarNewBuilder.h(cyVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    private static final de m(ca caVar) {
        cj cjVarNewBuilder = de.newBuilder();
        dc dcVarNewBuilder = dd.newBuilder();
        dcVarNewBuilder.a(caVar);
        cjVarNewBuilder.i(dcVarNewBuilder.build());
        de deVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(deVarBuild, "build(...)");
        return deVarBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i.b.l.cd n(com.waze.reports_v2.b.a r6, com.waze.reports_v2.b.i r7) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.b.n.n(com.waze.reports_v2.b.a, com.waze.reports_v2.b.i):i.b.l.cd");
    }
}
