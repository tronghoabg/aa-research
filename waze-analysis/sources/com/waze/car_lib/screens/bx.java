package com.waze.car_lib.screens;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.bg.a.dk;
import com.waze.bg.a.dp;
import com.waze.bg.a.dq;
import com.waze.bg.a.dt;
import com.waze.bg.a.dz;
import com.waze.bg.a.ea;
import com.waze.bg.a.ed;
import com.waze.bg.a.ee;
import com.waze.bg.a.ej;
import com.waze.bg.e.a.id;
import com.waze.bg.e.a.ie;
import com.waze.bg.e.a.ii;
import com.waze.bg.e.a.ij;
import com.waze.bg.e.a.ik;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.f.gj;
import com.waze.car_lib.f.gk;
import com.waze.car_lib.r.dl;
import com.waze.gw.Gateway;
import com.waze.modules.c.dm;
import com.waze.modules.c.du;
import com.waze.modules.c.dv;
import com.waze.modules.c.eb;
import com.waze.navigate.eo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.a.brg;
import l.a.bri;
import l.a.yj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class bx {
    public /* synthetic */ bx(byte[] bArr) {
    }

    private static com.waze.o.ce a(com.waze.av.a.p pVar) {
        com.waze.o.cd cdVarNewBuilder = com.waze.o.ce.newBuilder();
        h.g.b.x.e(cdVarNewBuilder, "newBuilder(...)");
        String strC = pVar.c().c();
        if (strC != null) {
            cdVarNewBuilder.f(strC);
        }
        String strE = pVar.c().e();
        if (strE != null) {
            cdVarNewBuilder.d(strE);
        }
        String strA = pVar.b().a();
        if (strA != null) {
            cdVarNewBuilder.a(strA);
        }
        String strF = pVar.b().f();
        if (strF != null) {
            cdVarNewBuilder.e(strF);
        }
        String strC2 = pVar.b().c();
        if (strC2 != null) {
            cdVarNewBuilder.c(strC2);
        }
        cdVarNewBuilder.b(com.waze.sharedui.e.e.e(pVar.d()));
        com.waze.o.ce ceVarBuild = cdVarNewBuilder.build();
        h.g.b.x.e(ceVarBuild, "build(...)");
        return ceVarBuild;
    }

    public static void b(dl dlVar, gg ggVar, String str) {
        h.g.b.x.f(dlVar, "viewModel");
        h.g.b.x.f(ggVar, "coordinator");
        h.g.b.x.f(str, "alertId");
        if (Gateway.openAaModReportCategory(ggVar, str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1647127721) {
            if (iHashCode != 438155246) {
                if (iHashCode == 1093376090 && str.equals("Report_agent")) {
                    dlVar.q();
                    return;
                }
            } else if (str.equals("CONVERSATIONAL")) {
                dlVar.t(com.waze.car_lib.b.ax.f19004a);
                return;
            }
        } else if (str.equals("CONVERSATION_ONBOARDING")) {
            dlVar.o();
            return;
        }
        com.waze.reports_v2.b.ag agVarG = dlVar.g(com.waze.reports_v2.b.q.a(str));
        if (agVarG != null) {
            ggVar.c(agVarG);
            dlVar.p();
        }
    }

    static /* synthetic */ h.ab c() {
        com.waze.stats.ax axVarA = com.waze.stats.ax.f40550a.a();
        brg brgVarNewBuilder = bri.newBuilder();
        brgVarNewBuilder.p(yj.newBuilder().build());
        bri briVarBuild = brgVarNewBuilder.build();
        h.g.b.x.e(briVarBuild, "build(...)");
        com.waze.sharedui.utils.o.f(axVarA, briVarBuild);
        return h.ab.f48028a;
    }

    public static Action d(Context context, h.g.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(aVar, "onClick");
        int color = ContextCompat.getColor(context, R.color.experimental_foreground);
        int color2 = ContextCompat.getColor(context, R.color.experimental_background);
        Action.Builder builder = new Action.Builder();
        CarIcon.Builder builder2 = new CarIcon.Builder(IconCompat.createWithResource(context, R.drawable.companinio));
        builder2.setTint(CarColor.createCustom(color, color));
        builder.setIcon(builder2.build());
        builder.setBackgroundColor(CarColor.createCustom(color2, color2));
        builder.setOnClickListener(new com.waze.car_lib.p.db(aVar, 12));
        builder.setFlags(3);
        Action actionBuild = builder.build();
        h.g.b.x.e(actionBuild, "build(...)");
        return actionBuild;
    }

    public static /* synthetic */ com.waze.o.c e(com.waze.o.c.b.w wVar) {
        com.waze.o.g gVar;
        com.waze.o.c.b.m mVar;
        com.waze.o.a aVarNewBuilder = com.waze.o.c.newBuilder();
        h.g.b.x.f(aVarNewBuilder, "builder");
        if (wVar instanceof com.waze.o.c.b.r) {
            com.waze.o.cb cbVarNewBuilder = com.waze.o.cc.newBuilder();
            h.g.b.x.f(cbVarNewBuilder, "builder");
            cbVarNewBuilder.a(((com.waze.o.c.b.r) wVar).e());
            com.waze.o.cc ccVarBuild = cbVarNewBuilder.build();
            h.g.b.x.e(ccVarBuild, "build(...)");
            com.waze.o.cc ccVar = ccVarBuild;
            h.g.b.x.f(ccVar, "value");
            aVarNewBuilder.j(ccVar);
        } else {
            int i2 = 3;
            int i3 = 2;
            int i4 = 1;
            if (wVar instanceof com.waze.o.c.b.s) {
                com.waze.bm.a.a.f fVarB = com.waze.bi.i.b(((com.waze.o.c.b.s) wVar).a());
                com.waze.bm.a.a.d actionCase = fVarB.getActionCase();
                com.waze.o.c.b.l lVar = com.waze.o.c.b.l.f32804a;
                com.waze.modules.c.ct ctVar = com.waze.modules.c.ct.f30003a;
                com.waze.modules.c.j jVar = com.waze.modules.c.j.f30171a;
                int iOrdinal = actionCase.ordinal();
                if (iOrdinal == 0) {
                    com.waze.bm.a.a.aa reportMapIssueResponse = fVarB.getReportMapIssueResponse();
                    h.g.b.x.e(reportMapIssueResponse, "getReportMapIssueResponse(...)");
                    h.g.b.x.f(reportMapIssueResponse, "value");
                    aVarNewBuilder.f(reportMapIssueResponse);
                } else if (iOrdinal == 1) {
                    com.waze.bm.a.a.s reportAlertResponse = fVarB.getReportAlertResponse();
                    h.g.b.x.e(reportAlertResponse, "getReportAlertResponse(...)");
                    h.g.b.x.f(reportAlertResponse, "value");
                    aVarNewBuilder.d(reportAlertResponse);
                } else if (iOrdinal == 2) {
                    com.waze.bm.a.a.w reportClosureResponse = fVarB.getReportClosureResponse();
                    h.g.b.x.e(reportClosureResponse, "getReportClosureResponse(...)");
                    h.g.b.x.f(reportClosureResponse, "value");
                    aVarNewBuilder.e(reportClosureResponse);
                } else if (iOrdinal == 3) {
                    com.waze.bm.a.a.m getClosureCandidatesResponse = fVarB.getGetClosureCandidatesResponse();
                    h.g.b.x.e(getClosureCandidatesResponse, "getGetClosureCandidatesResponse(...)");
                    h.g.b.x.f(getClosureCandidatesResponse, "value");
                    aVarNewBuilder.c(getClosureCandidatesResponse);
                } else if (iOrdinal != 4) {
                    throw new h.i();
                }
            } else if (wVar instanceof com.waze.o.c.b.p) {
                com.waze.o.l lVarNewBuilder = com.waze.o.m.newBuilder();
                h.g.b.x.f(lVarNewBuilder, "builder");
                com.waze.o.c.b.p pVar = (com.waze.o.c.b.p) wVar;
                if (!h.g.b.x.n(pVar, com.waze.o.c.b.j.f32800a)) {
                    if (!(pVar instanceof com.waze.o.c.b.n)) {
                        throw new h.i();
                    }
                    com.waze.o.c.b.n nVar = (com.waze.o.c.b.n) wVar;
                    lVarNewBuilder.d(nVar.a());
                    com.waze.o.ce ceVarA = a(nVar.b());
                    h.g.b.x.f(ceVarA, "value");
                    lVarNewBuilder.c(ceVarA);
                    List listA = lVarNewBuilder.a();
                    h.g.b.x.e(listA, "getAltRoutesList(...)");
                    com.google.v.b.a aVar = new com.google.v.b.a(listA);
                    List listD = nVar.d();
                    int i5 = 10;
                    ArrayList arrayList = new ArrayList(h.a.i.q(listD, 10));
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        com.waze.o.c.b.k kVar = (com.waze.o.c.b.k) it.next();
                        com.waze.o.f fVarNewBuilder = com.waze.o.h.newBuilder();
                        h.g.b.x.f(fVarNewBuilder, "builder");
                        fVarNewBuilder.a(kVar.a());
                        com.waze.o.c.b.l lVarB = kVar.b();
                        com.waze.o.c.b.l lVar2 = com.waze.o.c.b.l.f32804a;
                        com.waze.modules.c.ct ctVar2 = com.waze.modules.c.ct.f30003a;
                        com.waze.modules.c.j jVar2 = com.waze.modules.c.j.f30171a;
                        int iOrdinal2 = lVarB.ordinal();
                        if (iOrdinal2 == 0) {
                            gVar = com.waze.o.g.COLOR_UNSPECIFIED;
                        } else if (iOrdinal2 == i4) {
                            gVar = com.waze.o.g.GREEN;
                        } else if (iOrdinal2 == i3) {
                            gVar = com.waze.o.g.BLUE;
                        } else {
                            if (iOrdinal2 != i2) {
                                throw new h.i();
                            }
                            gVar = com.waze.o.g.ORANGE;
                        }
                        h.g.b.x.f(gVar, "value");
                        fVarNewBuilder.b(gVar);
                        com.waze.o.c.b.m mVarC = kVar.c();
                        com.waze.car_lib.r.au auVarF = com.waze.car_lib.m.c.f(com.waze.o.ao.newBuilder());
                        auVarF.k(mVarC.b());
                        com.google.v.b.a aVarC = auVarF.c();
                        List listD2 = mVarC.d();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = listD2.iterator();
                        while (it2.hasNext()) {
                            i.c.a.a.c cVarP = p((eb) it2.next());
                            if (cVarP != null) {
                                arrayList2.add(cVarP);
                            }
                        }
                        auVarF.h(aVarC, arrayList2);
                        com.google.v.b.a aVarD = auVarF.d();
                        List listE = mVarC.e();
                        ArrayList arrayList3 = new ArrayList(h.a.i.q(listE, i5));
                        Iterator it3 = listE.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(o((com.waze.modules.c.ct) it3.next()));
                        }
                        auVarF.i(aVarD, arrayList3);
                        com.waze.o.c.b.o oVarA = mVarC.a();
                        if (oVarA != null) {
                            com.waze.car_lib.r.av avVarE = com.waze.car_lib.m.c.e(com.waze.o.bi.newBuilder());
                            mVar = mVarC;
                            avVarE.c(oVarA.a());
                            avVarE.b(oVarA.b());
                            avVarE.d(oVarA.c());
                            auVarF.l(avVarE.a());
                        } else {
                            mVar = mVarC;
                        }
                        List listC = mVar.c();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : listC) {
                            com.waze.modules.c.h hVar = (com.waze.modules.c.h) obj;
                            Iterator it4 = it;
                            if (hVar.b() == com.waze.modules.c.j.f30175e || hVar.b() == com.waze.modules.c.j.f30174d) {
                                arrayList4.add(obj);
                            } else {
                                arrayList5.add(obj);
                            }
                            it = it4;
                        }
                        Iterator it5 = it;
                        h.k kVar2 = new h.k(arrayList4, arrayList5);
                        List list = (List) kVar2.a();
                        List list2 = (List) kVar2.b();
                        com.google.v.b.a aVarB = auVarF.b();
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            ie ieVarM = m((com.waze.modules.c.h) it6.next());
                            if (ieVarM != null) {
                                arrayList6.add(ieVarM);
                            }
                        }
                        auVarF.g(aVarB, arrayList6);
                        com.google.v.b.a aVarE = auVarF.e();
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            ik ikVarN = n((com.waze.modules.c.h) it7.next());
                            if (ikVarN != null) {
                                arrayList7.add(ikVarN);
                            }
                        }
                        auVarF.j(aVarE, arrayList7);
                        com.waze.o.ao aoVarF = auVarF.f();
                        h.g.b.x.f(aoVarF, "value");
                        fVarNewBuilder.c(aoVarF);
                        com.waze.o.h hVarBuild = fVarNewBuilder.build();
                        h.g.b.x.e(hVarBuild, "build(...)");
                        arrayList.add(hVarBuild);
                        it = it5;
                        i2 = 3;
                        i3 = 2;
                        i4 = 1;
                        i5 = 10;
                    }
                    ArrayList arrayList8 = arrayList;
                    h.g.b.x.f(aVar, "<this>");
                    h.g.b.x.f(arrayList8, "values");
                    lVarNewBuilder.b(arrayList8);
                }
                com.waze.o.m mVarBuild = lVarNewBuilder.build();
                h.g.b.x.e(mVarBuild, "build(...)");
                com.waze.o.m mVar2 = mVarBuild;
                h.g.b.x.f(mVar2, "value");
                aVarNewBuilder.a(mVar2);
            } else if (wVar instanceof com.waze.o.c.b.t) {
                com.waze.o.at atVarNewBuilder = com.waze.o.au.newBuilder();
                h.g.b.x.f(atVarNewBuilder, "builder");
                atVarNewBuilder.a(((com.waze.o.c.b.t) wVar).e());
                com.waze.o.au auVarBuild = atVarNewBuilder.build();
                h.g.b.x.e(auVarBuild, "build(...)");
                com.waze.o.au auVar = auVarBuild;
                h.g.b.x.f(auVar, "value");
                aVarNewBuilder.g(auVar);
            } else if (wVar instanceof com.waze.o.c.b.u) {
                com.waze.o.bb bbVarNewBuilder = com.waze.o.bc.newBuilder();
                h.g.b.x.f(bbVarNewBuilder, "builder");
                bbVarNewBuilder.a(((com.waze.o.c.b.u) wVar).e());
                com.waze.o.bc bcVarBuild = bbVarNewBuilder.build();
                h.g.b.x.e(bcVarBuild, "build(...)");
                com.waze.o.bc bcVar = bcVarBuild;
                h.g.b.x.f(bcVar, "value");
                aVarNewBuilder.h(bcVar);
            } else if (wVar instanceof com.waze.o.c.b.v) {
                com.waze.o.bf bfVarNewBuilder = com.waze.o.bg.newBuilder();
                h.g.b.x.f(bfVarNewBuilder, "builder");
                bfVarNewBuilder.a();
                com.waze.o.bg bgVarBuild = bfVarNewBuilder.build();
                h.g.b.x.e(bgVarBuild, "build(...)");
                com.waze.o.bg bgVar = bgVarBuild;
                h.g.b.x.f(bgVar, "value");
                aVarNewBuilder.i(bgVar);
            } else {
                if (!(wVar instanceof com.waze.o.c.b.q)) {
                    throw new h.i();
                }
                com.waze.o.r rVarNewBuilder = com.waze.o.s.newBuilder();
                h.g.b.x.f(rVarNewBuilder, "builder");
                rVarNewBuilder.a();
                com.waze.o.s sVarBuild = rVarNewBuilder.build();
                h.g.b.x.e(sVarBuild, "build(...)");
                com.waze.o.s sVar = sVarBuild;
                h.g.b.x.f(sVar, "value");
                aVarNewBuilder.b(sVar);
            }
        }
        com.waze.o.c cVarBuild = aVarNewBuilder.build();
        h.g.b.x.e(cVarBuild, "build(...)");
        return cVarBuild;
    }

    public static /* synthetic */ com.waze.o.al f(eo eoVar, com.waze.navigate.cj cjVar) {
        com.waze.o.ao aoVarF;
        com.waze.av.a.p pVarE;
        com.waze.o.ce ceVarA;
        com.waze.o.ak akVarNewBuilder = com.waze.o.al.newBuilder();
        h.g.b.x.f(akVarNewBuilder, "builder");
        com.waze.av.b.n nVar = (com.waze.av.b.n) eoVar.ad().d();
        if (nVar != null && (pVarE = nVar.e()) != null && (ceVarA = a(pVarE)) != null) {
            h.g.b.x.f(ceVarA, "value");
            akVarNewBuilder.a(ceVarA);
        }
        com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) eoVar.ak().d();
        if (cVar != null) {
            com.waze.o.cd cdVarNewBuilder = com.waze.o.ce.newBuilder();
            h.g.b.x.f(cdVarNewBuilder, "builder");
            i.b.s sVarE = com.waze.sharedui.e.e.e(cVar);
            h.g.b.x.f(sVarE, "value");
            cdVarNewBuilder.b(sVarE);
            com.waze.o.ce ceVarBuild = cdVarNewBuilder.build();
            h.g.b.x.e(ceVarBuild, "build(...)");
            com.waze.o.ce ceVar = ceVarBuild;
            h.g.b.x.f(ceVar, "value");
            akVarNewBuilder.c(ceVar);
        }
        eb ebVar = (eb) eoVar.Z().d();
        com.waze.navigate.ci ciVar = (com.waze.navigate.ci) cjVar.P().d();
        com.waze.o.an anVarNewBuilder = com.waze.o.ao.newBuilder();
        h.g.b.x.e(anVarNewBuilder, "newBuilder(...)");
        if (ebVar != null) {
            if (ebVar instanceof dv) {
                com.waze.modules.c.ar arVarA = ((dv) ebVar).a();
                com.waze.car_lib.r.au auVarF = com.waze.car_lib.m.c.f(com.waze.o.ao.newBuilder());
                String strK = arVarA.k();
                if (strK != null) {
                    auVarF.k(strK);
                }
                com.google.v.b.a aVarC = auVarF.c();
                List listQ = arVarA.q();
                ArrayList arrayList = new ArrayList();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    i.c.a.a.c cVarP = p((eb) it.next());
                    if (cVarP != null) {
                        arrayList.add(cVarP);
                    }
                }
                auVarF.h(aVarC, arrayList);
                com.google.v.b.a aVarD = auVarF.d();
                Set setT = arVarA.t();
                ArrayList arrayList2 = new ArrayList(h.a.i.q(setT, 10));
                Iterator it2 = setT.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(o((com.waze.modules.c.ct) it2.next()));
                }
                auVarF.i(aVarD, arrayList2);
                dm dmVarH = arVarA.h();
                if (dmVarH != null) {
                    com.waze.car_lib.r.av avVarE = com.waze.car_lib.m.c.e(com.waze.o.bi.newBuilder());
                    Double dC = dmVarH.c();
                    if (dC != null) {
                        avVarE.c(dC.doubleValue());
                    }
                    String strI = dmVarH.i();
                    if (strI != null) {
                        avVarE.b(strI);
                    }
                    String strJ = dmVarH.j();
                    if (strJ != null) {
                        avVarE.d(strJ);
                    }
                    auVarF.l(avVarE.a());
                }
                List listN = arVarA.n();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : listN) {
                    com.waze.modules.c.h hVar = (com.waze.modules.c.h) obj;
                    if (hVar.b() == com.waze.modules.c.j.f30175e || hVar.b() == com.waze.modules.c.j.f30174d) {
                        arrayList3.add(obj);
                    } else {
                        arrayList4.add(obj);
                    }
                }
                h.k kVar = new h.k(arrayList3, arrayList4);
                List list = (List) kVar.a();
                List list2 = (List) kVar.b();
                com.google.v.b.a aVarB = auVarF.b();
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    ie ieVarM = m((com.waze.modules.c.h) it3.next());
                    if (ieVarM != null) {
                        arrayList5.add(ieVarM);
                    }
                }
                auVarF.g(aVarB, arrayList5);
                com.google.v.b.a aVarE = auVarF.e();
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    ik ikVarN = n((com.waze.modules.c.h) it4.next());
                    if (ikVarN != null) {
                        arrayList6.add(ikVarN);
                    }
                }
                auVarF.j(aVarE, arrayList6);
                aoVarF = auVarF.f();
            } else {
                if (!(ebVar instanceof du)) {
                    throw new h.i();
                }
                com.waze.modules.c.ag agVarA = ((du) ebVar).a();
                com.waze.car_lib.r.au auVarF2 = com.waze.car_lib.m.c.f(com.waze.o.ao.newBuilder());
                long jA = 0;
                while (agVarA.b().iterator().hasNext()) {
                    jA += ((com.waze.modules.c.cs) r11.next()).a();
                }
                auVarF2.m(jA);
                aoVarF = auVarF2.f();
            }
            if (aoVarF != null) {
                anVarNewBuilder.mergeFrom((com.waze.o.an) aoVarF);
            }
        }
        if (ciVar != null) {
            com.waze.car_lib.r.au auVarF3 = com.waze.car_lib.m.c.f(com.waze.o.ao.newBuilder());
            if (ciVar.c() != null) {
                auVarF3.m(r2.b());
            }
            if (ciVar.b() != null) {
                auVarF3.n(r12.a() * 60);
            }
            com.waze.o.ao aoVarF2 = auVarF3.f();
            if (aoVarF2 != null) {
                anVarNewBuilder.mergeFrom((com.waze.o.an) aoVarF2);
            }
        }
        com.waze.o.ao aoVarBuild = anVarNewBuilder.build();
        h.g.b.x.e(aoVarBuild, "build(...)");
        com.waze.o.ao aoVar = aoVarBuild;
        h.g.b.x.f(aoVar, "value");
        akVarNewBuilder.b(aoVar);
        com.waze.o.al alVarBuild = akVarNewBuilder.build();
        h.g.b.x.e(alVarBuild, "build(...)");
        return alVarBuild;
    }

    public static /* synthetic */ Object g(Object obj, com.waze.aw.a aVar) {
        return h.m.e(obj) ? l((com.waze.o.aa) obj, aVar) : obj;
    }

    public static /* synthetic */ Object h(Object obj, com.waze.aw.a aVar) {
        if (!h.m.e(obj)) {
            return obj;
        }
        com.waze.o.ay ayVar = (com.waze.o.ay) obj;
        String chatId = ayVar.getChatId();
        h.g.b.x.e(chatId, "getChatId(...)");
        com.waze.o.aa response = ayVar.getResponse();
        h.g.b.x.e(response, "getResponse(...)");
        return new com.waze.t.a.a(chatId, l(response, aVar));
    }

    public static /* synthetic */ List i(com.waze.av.b.aa aaVar) {
        List<com.waze.av.b.h> listC = aaVar.c();
        ArrayList arrayList = new ArrayList(h.a.i.q(listC, 10));
        for (com.waze.av.b.h hVar : listC) {
            com.waze.o.ag agVarNewBuilder = com.waze.o.ai.newBuilder();
            h.g.b.x.f(agVarNewBuilder, "builder");
            com.waze.o.ce ceVarA = a(aaVar.a());
            h.g.b.x.f(ceVarA, "value");
            agVarNewBuilder.a(ceVarA);
            if (hVar instanceof com.waze.av.b.e) {
                com.waze.o.ad.k(com.waze.o.ah.HOME, agVarNewBuilder);
            } else if (hVar instanceof com.waze.av.b.g) {
                com.waze.o.ad.k(com.waze.o.ah.WORK, agVarNewBuilder);
            } else {
                if (!(hVar instanceof com.waze.av.b.f)) {
                    throw new h.i();
                }
                String strD = ((com.waze.av.b.f) hVar).d();
                h.g.b.x.f(strD, "value");
                agVarNewBuilder.c(strD);
                com.waze.o.ad.k(com.waze.o.ah.OTHER, agVarNewBuilder);
            }
            com.waze.o.ai aiVarBuild = agVarNewBuilder.build();
            h.g.b.x.e(aiVarBuild, "build(...)");
            arrayList.add(aiVarBuild);
        }
        return arrayList;
    }

    public static void k(com.waze.o.ad adVar, gg ggVar) {
        h.g.b.x.f(adVar, "uiState");
        h.g.b.x.f(ggVar, "coordinatorController");
        if (adVar instanceof com.waze.car_lib.r.df) {
            com.waze.car_lib.r.df dfVar = (com.waze.car_lib.r.df) adVar;
            if (dfVar.a() == null) {
                if (dfVar.f() instanceof com.waze.car_lib.b.bm) {
                    ggVar.H(gj.f19616a);
                }
            } else if (dfVar.a().b()) {
                if (dfVar.a().c()) {
                    ggVar.H(gj.f19616a);
                } else {
                    ggVar.H(gk.f19617a);
                }
            }
        }
    }

    private static com.waze.t.a.u l(com.waze.o.aa aaVar, com.waze.aw.a aVar) {
        com.waze.av.b.i iVar;
        com.waze.o.c.b.g gVar;
        com.waze.sound.bp bpVar;
        com.waze.o.y actionCase = aaVar.getActionCase();
        com.waze.o.c.b.l lVar = com.waze.o.c.b.l.f32804a;
        com.waze.modules.c.ct ctVar = com.waze.modules.c.ct.f30003a;
        com.waze.modules.c.j jVar = com.waze.modules.c.j.f30171a;
        switch (actionCase.ordinal()) {
            case 0:
                byte[] bArrX = aaVar.getPlaySound().getAudioChunk().x();
                h.g.b.x.e(bArrX, "toByteArray(...)");
                return new com.waze.t.a.t(com.waze.shared_infra.g.e.j(bArrX));
            case 1:
                String chatText = aaVar.getDisplayText().getChatText();
                h.g.b.x.e(chatText, "getChatText(...)");
                return new com.waze.t.a.p(chatText);
            case 2:
                return com.waze.t.a.r.f40640a;
            case 3:
                com.waze.o.ca updateFavorite = aaVar.getUpdateFavorite();
                h.g.b.x.e(updateFavorite, "getUpdateFavorite(...)");
                int iOrdinal = updateFavorite.getUpdateTypeCase().ordinal();
                if (iOrdinal == 0) {
                    com.waze.o.ah favoriteType = updateFavorite.getAddFavorite().getFavorite().getFavoriteType();
                    h.g.b.x.e(favoriteType, "getFavoriteType(...)");
                    int iOrdinal2 = favoriteType.ordinal();
                    if (iOrdinal2 == 0) {
                        throw new IllegalArgumentException("Unsupported favorite type");
                    }
                    if (iOrdinal2 == 1) {
                        iVar = com.waze.av.b.i.f15956b;
                    } else if (iOrdinal2 == 2) {
                        iVar = com.waze.av.b.i.f15957c;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw new h.i();
                        }
                        iVar = com.waze.av.b.i.f15958d;
                    }
                    String name = updateFavorite.getAddFavorite().getFavorite().getName();
                    h.g.b.x.e(name, "getName(...)");
                    String venueId = updateFavorite.getAddFavorite().getFavorite().getAddress().getVenueId();
                    h.g.b.x.e(venueId, "getVenueId(...)");
                    gVar = new com.waze.o.c.b.g(iVar, name, venueId);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new h.i();
                        }
                        throw new IllegalArgumentException("Unsupported update favorite type");
                    }
                    String venueId2 = updateFavorite.getDeleteFavorite().getVenueId();
                    h.g.b.x.e(venueId2, "getVenueId(...)");
                    gVar = new com.waze.o.c.b.h(venueId2);
                }
                return new com.waze.t.a.s(gVar);
            case 4:
                com.waze.o.k calculateRoute = aaVar.getCalculateRoute();
                h.g.b.x.e(calculateRoute, "getCalculateRoute(...)");
                String venueId3 = calculateRoute.getDestination().getVenueId();
                h.g.b.x.e(venueId3, "getVenueId(...)");
                List<i.c.a.a.o> routingOptionsList = calculateRoute.getRoutingOptionsList();
                h.g.b.x.e(routingOptionsList, "getRoutingOptionsList(...)");
                List<i.c.a.a.o> list = routingOptionsList;
                ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
                for (i.c.a.a.o oVar : list) {
                    arrayList.add(new com.waze.modules.c.cx(oVar.getKey().name(), oVar.getValue()));
                }
                return new com.waze.t.a.s(new com.waze.o.c.b.a(venueId3, arrayList, calculateRoute.getShowOverview()));
            case 5:
                com.waze.o.aq searchResults = aaVar.getSearchResults();
                h.g.b.x.e(searchResults, "getSearchResults(...)");
                List<i.b.n.ab> searchResultsList = searchResults.getSearchResultsList();
                h.g.b.x.e(searchResultsList, "getSearchResultsList(...)");
                List<i.b.n.ab> list2 = searchResultsList;
                ArrayList arrayList2 = new ArrayList(h.a.i.q(list2, 10));
                for (i.b.n.ab abVar : list2) {
                    h.g.b.x.c(abVar);
                    arrayList2.add(com.waze.search.a.j.e(abVar, aVar));
                }
                return new com.waze.t.a.q(new com.waze.o.c.b.x(arrayList2));
            case 6:
                com.waze.o.ba startNavigation = aaVar.getStartNavigation();
                h.g.b.x.e(startNavigation, "getStartNavigation(...)");
                return new com.waze.t.a.s(new com.waze.o.c.b.e(startNavigation.getStartDriving().getRouteId(), startNavigation.getStartDriving().getAltId()));
            case 7:
                com.waze.o.q changeVoiceGuidanceMode = aaVar.getChangeVoiceGuidanceMode();
                h.g.b.x.e(changeVoiceGuidanceMode, "getChangeVoiceGuidanceMode(...)");
                com.waze.o.p mode = changeVoiceGuidanceMode.getMode();
                h.g.b.x.e(mode, "getMode(...)");
                int iOrdinal3 = mode.ordinal();
                if (iOrdinal3 == 0) {
                    throw new IllegalArgumentException("Unsupported guidance mode");
                }
                if (iOrdinal3 == 1) {
                    bpVar = com.waze.sound.bp.f39554a;
                } else if (iOrdinal3 == 2) {
                    bpVar = com.waze.sound.bp.f39558e;
                } else if (iOrdinal3 == 3) {
                    bpVar = com.waze.sound.bp.f39557d;
                } else if (iOrdinal3 != 4) {
                    if (iOrdinal3 != 5) {
                        throw new h.i();
                    }
                    bpVar = com.waze.sound.bp.f39554a;
                } else {
                    bpVar = com.waze.sound.bp.f39555b;
                }
                return new com.waze.t.a.s(new com.waze.o.c.b.b(bpVar));
            case 8:
                com.waze.bm.a.a.y reportMapIssue = aaVar.getReportMapIssue();
                h.g.b.x.e(reportMapIssue, "getReportMapIssue(...)");
                return new com.waze.t.a.s(new com.waze.o.c.b.c(com.waze.bi.i.g(reportMapIssue)));
            case 9:
                com.waze.bm.a.a.q reportAlert = aaVar.getReportAlert();
                h.g.b.x.e(reportAlert, "getReportAlert(...)");
                return new com.waze.t.a.s(new com.waze.o.c.b.c(com.waze.bi.i.e(reportAlert)));
            case 10:
                return new com.waze.t.a.s(com.waze.o.c.b.d.f32792a);
            case 11:
                return new com.waze.t.a.s(com.waze.o.c.b.f.f32795a);
            case 12:
                return new com.waze.t.a.s(new com.waze.o.c.b.c(com.waze.bl.c.b.b.f17005a));
            case 13:
                com.waze.bm.a.a.u reportClosure = aaVar.getReportClosure();
                h.g.b.x.e(reportClosure, "getReportClosure(...)");
                return new com.waze.t.a.s(new com.waze.o.c.b.c(com.waze.bi.i.f(reportClosure)));
            case 14:
                throw new IllegalArgumentException("Unsupported action or action not set in ChatResponse");
            default:
                throw new h.i();
        }
    }

    private static ie m(com.waze.modules.c.h hVar) {
        i.b.s sVarE;
        id idVarNewBuilder = ie.newBuilder();
        h.g.b.x.e(idVarNewBuilder, "newBuilder(...)");
        Long lJ = hVar.j();
        if (lJ == null) {
            return null;
        }
        idVarNewBuilder.b(lJ.longValue());
        com.waze.shared_infra.h.c cVarC = hVar.c();
        if (cVarC == null || (sVarE = com.waze.sharedui.e.e.e(cVarC)) == null) {
            return null;
        }
        idVarNewBuilder.c(sVarE);
        Double dG = hVar.g();
        if (dG != null) {
            idVarNewBuilder.d(dG.doubleValue());
        }
        dk dkVarNewBuilder = ej.newBuilder();
        h.g.b.x.e(dkVarNewBuilder, "newBuilder(...)");
        com.waze.modules.c.j jVarB = hVar.b();
        if (jVarB != null) {
            com.waze.o.c.b.l lVar = com.waze.o.c.b.l.f32804a;
            com.waze.modules.c.ct ctVar = com.waze.modules.c.ct.f30003a;
            int iOrdinal = jVarB.ordinal();
            if (iOrdinal == 1) {
                dz dzVarNewBuilder = ea.newBuilder();
                h.g.b.x.e(dzVarNewBuilder, "newBuilder(...)");
                dzVarNewBuilder.a(com.waze.bg.a.bw.POLICE_DEFAULT);
                dkVarNewBuilder.c(dzVarNewBuilder.build());
            } else if (iOrdinal == 2) {
                dp dpVarNewBuilder = dq.newBuilder();
                h.g.b.x.e(dpVarNewBuilder, "newBuilder(...)");
                dpVarNewBuilder.a(com.waze.bg.a.br.CRASH_DEFAULT);
                dkVarNewBuilder.a(dpVarNewBuilder.build());
            } else if (iOrdinal == 3) {
                ed edVarNewBuilder = ee.newBuilder();
                h.g.b.x.e(edVarNewBuilder, "newBuilder(...)");
                edVarNewBuilder.a(com.waze.bg.a.by.TRAFFIC_DEFAULT);
                dkVarNewBuilder.d(edVarNewBuilder.build());
            } else if (iOrdinal == 5) {
                dt dtVarNewBuilder = com.waze.bg.a.du.newBuilder();
                h.g.b.x.e(dtVarNewBuilder, "newBuilder(...)");
                dtVarNewBuilder.a(com.waze.bg.a.bt.HAZARD_DEFAULT);
                dkVarNewBuilder.b(dtVarNewBuilder.build());
            }
        }
        idVarNewBuilder.a(dkVarNewBuilder.build());
        return idVarNewBuilder.build();
    }

    private static ik n(com.waze.modules.c.h hVar) {
        Long lK = hVar.k();
        if (lK == null || hVar.l().isEmpty()) {
            return null;
        }
        ii iiVarNewBuilder = ik.newBuilder();
        h.g.b.x.e(iiVarNewBuilder, "newBuilder(...)");
        iiVarNewBuilder.a(lK.longValue());
        Integer numI = hVar.i();
        if (numI != null) {
            int iIntValue = numI.intValue();
            iiVarNewBuilder.d(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? ij.SEVERITY_UNSPECIFIED : ij.LIGHT : ij.STAND_STILL : ij.HEAVY : ij.MODERATE);
        }
        Double dG = hVar.g();
        if (dG != null) {
            iiVarNewBuilder.c(dG.doubleValue());
        }
        Double dF = hVar.f();
        if (dF != null) {
            iiVarNewBuilder.b(dF.doubleValue());
        }
        return iiVarNewBuilder.build();
    }

    private static i.c.a.a.d o(com.waze.modules.c.ct ctVar) {
        com.waze.o.c.b.l lVar = com.waze.o.c.b.l.f32804a;
        com.waze.modules.c.ct ctVar2 = com.waze.modules.c.ct.f30003a;
        com.waze.modules.c.j jVar = com.waze.modules.c.j.f30171a;
        int iOrdinal = ctVar.ordinal();
        if (iOrdinal == 0) {
            return i.c.a.a.d.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return i.c.a.a.d.BEST;
        }
        if (iOrdinal == 2) {
            return i.c.a.a.d.NATURAL;
        }
        if (iOrdinal == 3) {
            return i.c.a.a.d.FREQUENT;
        }
        if (iOrdinal == 4) {
            return i.c.a.a.d.CURRENT;
        }
        throw new h.i();
    }

    private static i.c.a.a.c p(eb ebVar) {
        if (h.g.b.x.n(ebVar, com.waze.modules.c.ay.f29898a)) {
            return i.c.a.a.c.BLOCKED;
        }
        if (ebVar instanceof com.waze.modules.c.by) {
            return i.c.a.a.c.TOLL;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.be.f29905a)) {
            return i.c.a.a.c.FERRY;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.cb.f29936a)) {
            return i.c.a.a.c.UNPAVED;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bc.f29903a)) {
            return i.c.a.a.c.DANGEROUS_TURN;
        }
        if (ebVar instanceof com.waze.modules.c.bk) {
            return i.c.a.a.c.RESTRICTED_ZONE;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bb.f29902a)) {
            return i.c.a.a.c.DANGER_ZONE;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bn.f29915a)) {
            return i.c.a.a.c.SCHOOL_ZONE;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.az.f29899a)) {
            return i.c.a.a.c.INTERNATIONAL;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.ax.f29897a)) {
            return i.c.a.a.c.BEACONS;
        }
        if (ebVar instanceof com.waze.modules.c.bf) {
            return i.c.a.a.c.HOV;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.ba.f29901a)) {
            return i.c.a.a.c.BYPASSES_RESTRICTED;
        }
        if (ebVar instanceof com.waze.modules.c.bh) {
            return i.c.a.a.c.ENCOURAGEMENT;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bo.f29916a)) {
            return i.c.a.a.c.STEPPED_ON_IT;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bd.f29904a)) {
            return i.c.a.a.c.ETA_FROM_ML;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bj.f29911a)) {
            return i.c.a.a.c.INVALID_FOR_PRIVATE_VEHICLE;
        }
        if (ebVar instanceof com.waze.modules.c.bg) {
            return i.c.a.a.c.RESTRICTED_BY_LICENSE_PLATE;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bz.f29933a)) {
            return i.c.a.a.c.TOLL_FOR_AVOIDERS;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.ca.f29935a)) {
            return i.c.a.a.c.UNNATURAL;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bi.f29910a)) {
            return i.c.a.a.c.PRIMARY_FOR_AVOIDERS;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bm.f29914a)) {
            return i.c.a.a.c.SAFETY_INCIDENTS_ON_ROUTE;
        }
        if (h.g.b.x.n(ebVar, com.waze.modules.c.bl.f29913a)) {
            return i.c.a.a.c.SAFETY_INCIDENTS_FREE;
        }
        throw new h.i();
    }

    public boolean j() {
        throw null;
    }

    private bx() {
        throw null;
    }
}
