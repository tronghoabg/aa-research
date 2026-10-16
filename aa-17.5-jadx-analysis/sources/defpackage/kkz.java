package defpackage;

import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarPropertySetError;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class kkz {
    public static final /* synthetic */ int a = 0;
    private static final aezr b = woy.dG(new kbh(3));

    public static final Number a(bym bymVar) {
        return (Number) bymVar.a();
    }

    public static final String b(kjz kjzVar) {
        klq klqVar = kjzVar.a;
        int i = klqVar.a;
        String strBp = a.Y(i, 354419978) ? "Automatic On" : a.Y(i, 354419977) ? "Driver & Passenger Temperature Synced" : a.Y(i, 356517121) ? "Fan Direction" : a.Y(i, 356517120) ? "Fan Speed" : a.Y(i, 356517131) ? "Seat Temperature" : a.Y(i, 358614275) ? "Temperature" : a.Y(i, 289410874) ? "ETC Status" : a.Y(i, 289408270) ? "Display Units" : a.Y(i, 354419973) ? "AC on" : a.Y(i, 354419974) ? "MAX AC" : a.Y(i, 320865540) ? "Defroster" : a.Y(i, 354419975) ? "Max Defrost" : a.Y(i, 354419984) ? "HVAC Power" : a.Y(i, 354419986) ? "Auto recirc" : a.Y(i, 354419976) ? "Recirc" : a.Y(i, 356517139) ? "Seat ventilation" : a.Y(i, 339739916) ? "Side mirror heat" : a.Y(i, 289408269) ? "Steering wheel heat" : a.bp(i, "Car property id: ");
        kll kllVar = klqVar.b;
        String string = "Global";
        if (kllVar instanceof kln) {
            boolean zJ = nsr.c().b().J();
            int i2 = zJ ? 4 : 1;
            int i3 = true != zJ ? 4 : 1;
            int i4 = ((kln) kllVar).a;
            if (jup.d(i4, i2) && !jup.d(i4, i3)) {
                string = "Driver";
            } else if (!jup.d(i4, i2) && jup.d(i4, i3)) {
                string = "Passenger";
            } else if (jup.e(i4, 7) && !jup.e(i4, 112) && !jup.e(i4, 1792)) {
                string = "Front";
            } else if (!jup.e(i4, 7)) {
                string = "Rear";
            }
        } else if (kllVar instanceof klp) {
            int i5 = ((klp) kllVar).a;
            string = a.Y(i5, 1) ? "Front Windshield" : a.Y(i5, 2) ? "Rear Windshield" : "Window ".concat(klp.c(i5));
        } else if (!affa.f(kllVar, kls.a)) {
            string = kllVar.toString();
        }
        return a.bJ(string, strBp, " - ");
    }

    public static final void c(tiw tiwVar, CarAction carAction, bux buxVar, int i) {
        int i2;
        tiw tiwVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-468299476);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            String strB = jun.b(carAction);
            boolean zE = buxVarC.E(carAction);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new kjy(carAction, 3);
                bvvVar.ad(objS);
            }
            tiwVar2 = tiwVar;
            std.f(tiwVar2, strB, szp.A((afdr) objS), false, null, buxVarC, i2 & 14, 58);
        } else {
            tiwVar2 = tiwVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar2, carAction, i, 15);
        }
    }

    public static final void d(tiw tiwVar, kjk kjkVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1461665602);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjkVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            CarAction carAction = kjkVar.b;
            if (carAction != null) {
                buxVarC.v(-2101352571);
                c(tiwVar, carAction, buxVarC, i2 & 14);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-2101292028);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar, kjkVar, i, 14);
        }
    }

    public static final void e(tiw tiwVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        tiw tiwVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-678107640);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            tiwVar2 = tiwVar;
            buxVarC.s();
        } else if (kjzVar != null) {
            buxVarC.v(2021560035);
            tiwVar2 = tiwVar;
            std.f(tiwVar2, "Associated property: ".concat(b(kjzVar)), null, false, null, buxVarC, i2 & 14, 62);
            ((bvv) buxVarC).Y(false);
        } else {
            tiwVar2 = tiwVar;
            buxVarC.v(2021612890);
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar2, kjzVar, i, 16);
        }
    }

    public static final void f(tjq tjqVar, kla klaVar, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(201438741);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(klaVar) : buxVarC.E(klaVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            tjqVar2 = tjqVar;
            std.m(tjqVar2, "No requested car controls.", new hfg(7), null, bxc.i(818065957, true, new jjb(klaVar, 9), buxVarC), buxVarC, (i2 & 14) | 196656, 10);
        } else {
            tjqVar2 = tjqVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tjqVar2, klaVar, i, 4);
        }
    }

    public static final void g(tjq tjqVar, kla klaVar, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1927928424);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(klaVar) : buxVarC.E(klaVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            tjqVar2 = tjqVar;
            std.m(tjqVar2, "Car Controls are not available.", new hfg(8), null, bxc.i(-127825288, true, new fun(klaVar, bxc.f(klaVar.a(), afbe.a, buxVarC), 15), buxVarC), buxVarC, (i2 & 14) | 196656, 10);
        } else {
            tjqVar2 = tjqVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tjqVar2, klaVar, i, 9);
        }
    }

    public static final void h(tiw tiwVar, kjl kjlVar, bux buxVar, int i) {
        int i2;
        tiw tiwVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-784081435);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjlVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            List list = ((kjk) kjlVar).d;
            if (list.isEmpty()) {
                tiwVar2 = tiwVar;
                buxVarC.v(1757287293);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1757200803);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = new kki(3);
                    bvvVar.ad(objS);
                }
                String strConcat = "metadata: ".concat(woy.cu(list, ", ", null, null, (afec) objS, 30));
                tiwVar2 = tiwVar;
                std.f(tiwVar2, strConcat, null, false, null, buxVarC, i2 & 14, 62);
                bvvVar.Y(false);
            }
        } else {
            tiwVar2 = tiwVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar2, kjlVar, i, 18);
        }
    }

    public static final void i(tjq tjqVar, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(168695612);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            tjqVar2 = tjqVar;
            std.m(tjqVar2, null, new hfg(9), null, klb.b, buxVarC, (i2 & 14) | 196608, 11);
        } else {
            tjqVar2 = tjqVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(tjqVar2, i, 2);
        }
    }

    public static final void j(tjq tjqVar, String str, List list, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        bxf bxfVarJ;
        afeg kmgVar;
        list.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(897529051);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i5 = i2 & 14;
            if (list.isEmpty()) {
                buxVarC.v(2116658946);
                std.m(tjqVar, "No car properties found.", new kkw(str, i4), null, klb.d, buxVarC, i5 | 196656, 10);
                ((bvv) buxVarC).Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    kmgVar = new gtu(tjqVar, str, list, i, 20);
                    bxfVarJ.c = kmgVar;
                }
                return;
            }
            buxVarC.v(2116756007);
            ((bvv) buxVarC).Y(false);
            std.p(tjqVar, new kkw(str, 5), null, bxc.i(-429388634, true, new kkw(list, 6), buxVarC), buxVarC, i5 | 3072);
            buxVar2 = buxVarC;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            kmgVar = new kmg(tjqVar, str, list, i, 1);
            bxfVarJ.c = kmgVar;
        }
    }

    public static final void k(tiw tiwVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2118162269);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            kka kkaVar = kjzVar.b;
            if (kkaVar instanceof kjh) {
                kjzVar.getClass();
                s(tiwVar, kjzVar, buxVarC, i2 & 14);
            } else if (kkaVar instanceof kjt) {
                kjzVar.getClass();
                n(tiwVar, kjzVar, klc.b, buxVarC, (i2 & 14) | 384);
            } else if (kkaVar instanceof kju) {
                kjzVar.getClass();
                l(tiwVar, kjzVar, buxVarC, i2 & 14);
            } else if (kkaVar instanceof kjx) {
                kjzVar.getClass();
                n(tiwVar, kjzVar, klc.a, buxVarC, (i2 & 14) | 384);
            } else {
                if (!(kkaVar instanceof kkj) && !(kkaVar instanceof kjv) && !(kkaVar instanceof kjs) && !(kkaVar instanceof kjw) && !(kkaVar instanceof kkr)) {
                    throw new aezs();
                }
                kjzVar.getClass();
                r(tiwVar, kjzVar, buxVarC, i2 & 14);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar, kjzVar, i, 19);
        }
    }

    public static final void l(tiw tiwVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2091894573);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            p(tiwVar, kjzVar, bxc.i(1585642831, true, new dxm(kjzVar, 6), buxVarC), buxVarC, (i2 & 112) | (i2 & 14) | 384);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar, kjzVar, i, 12);
        }
    }

    public static final void m(tjq tjqVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        kjz kjzVar2;
        bux buxVar2;
        bxf bxfVarJ;
        kkt kktVar;
        List list;
        Object gazVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-673895743);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            bym bymVarE = bxc.e(jul.f(kjzVar), buxVarC);
            int i5 = 5;
            if (roc.ao(bymVarE) == null) {
                buxVarC.v(-1350789345);
                std.n(tjqVar, new jjb(kjzVar, 11), buxVarC, i4);
                ((bvv) buxVarC).Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    kktVar = new kkt(tjqVar, kjzVar, i, 5);
                    bxfVarJ.c = kktVar;
                }
                return;
            }
            buxVarC.v(-1350664415);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS);
            }
            aitx aitxVar = (aitx) objS;
            qn qnVar = (qn) buxVarC.f(tii.c);
            int i6 = kjzVar.a.a;
            List listJ = afrg.j(a.Y(i6, 356517121) ? woy.cm(new afha(1, 7)) : a.Y(i6, 289408270) ? woy.dk(new Integer[]{48, 49}) : woy.cm(new afha(jul.d(kjzVar), jul.c(kjzVar))));
            boolean zE = buxVarC.E(aitxVar) | buxVarC.E(kjzVar) | buxVarC.E(listJ) | buxVarC.E(qnVar);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == obj) {
                list = listJ;
                gazVar = new gaz(aitxVar, kjzVar, list, qnVar, 10);
                kjzVar2 = kjzVar;
                bvvVar.ad(gazVar);
            } else {
                list = listJ;
                gazVar = objS2;
                kjzVar2 = kjzVar;
            }
            buxVar2 = buxVarC;
            std.o(tjqVar, (afec) gazVar, new jjb(kjzVar2, 12), null, bxc.i(853861699, true, new hhb(list, kjzVar2, bymVarE, i5), buxVarC), buxVar2, i4 | 1572864);
        } else {
            kjzVar2 = kjzVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            kktVar = new kkt(tjqVar, kjzVar2, i, 7);
            bxfVarJ.c = kktVar;
        }
    }

    public static final void n(tiw tiwVar, kjz kjzVar, kld kldVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1796065239);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(kldVar) : buxVarC.E(kldVar)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            p(tiwVar, kjzVar, bxc.i(524537722, true, new kvm(kjzVar, kldVar, i4), buxVarC), buxVarC, (i2 & 112) | (i2 & 14) | 384);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu((Object) tiwVar, (Object) kjzVar, (Object) kldVar, i, 16, (byte[]) null);
        }
    }

    public static final void o(tjq tjqVar, kjz kjzVar, kld kldVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        bxf bxfVarJ;
        gtu gtuVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-305589643);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(kldVar) : buxVarC.E(kldVar)) ? 128 : 256;
        }
        int i5 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i6 = i2 & 14;
            bym bymVarE = bxc.e(jul.f(kjzVar), buxVarC);
            if (roc.ao(bymVarE) == null) {
                buxVarC.v(1509814347);
                std.n(tjqVar, new kkw(kjzVar, i5), buxVarC, i6);
                ((bvv) buxVarC).Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    gtuVar = new gtu((Object) tjqVar, (Object) kjzVar, (Object) kldVar, i, 18, (byte[]) null);
                    bxfVarJ.c = gtuVar;
                }
                return;
            }
            buxVarC.v(1509939277);
            ((bvv) buxVarC).Y(false);
            buxVar2 = buxVarC;
            std.m(tjqVar, null, new kkw(kjzVar, i4), null, bxc.i(390554725, true, new fum(kldVar, kjzVar, bymVarE, (qn) buxVarC.f(tii.c), 6), buxVarC), buxVar2, 196608 | i6, 11);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            gtuVar = new gtu((Object) tjqVar, (Object) kjzVar, (Object) kldVar, i, 19, (byte[]) null);
            bxfVarJ.c = gtuVar;
        }
    }

    public static final void p(tiw tiwVar, kjz kjzVar, afei afeiVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1026644372);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afeiVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 14;
            kkf kkfVarAo = roc.ao(bxc.e(jul.f(kjzVar), buxVarC));
            if (kkfVarAo == null) {
                buxVarC.v(1237244944);
                std.h(tiwVar, "Loading...", null, false, false, null, buxVarC, i4 | 1572912, 94);
                ((bvv) buxVarC).Y(false);
            } else if (kkfVarAo instanceof kkc) {
                buxVarC.v(1237247304);
                afeiVar.invoke(tiwVar, ((kkc) kkfVarAo).a, buxVarC, Integer.valueOf(i2 & 910));
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1237248643);
                Objects.toString(kkfVarAo);
                std.h(tiwVar, "Current status: ".concat(kkfVarAo.toString()), null, false, false, null, buxVarC, i4 | 1572864, 94);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(tiwVar, kjzVar, afeiVar, i, 17, (short[]) null);
        }
    }

    public static final void q(tiw tiwVar, kjl kjlVar, bux buxVar, int i) {
        int i2;
        tiw tiwVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(81253260);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjlVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int iA = kjlVar.a();
            String strBp = iA != 0 ? iA != 1 ? iA != 2 ? iA != 3 ? a.bp(iA, "Unknown Side Affinity ") : "Passenger aligned" : "Driver aligned" : "Unaligned" : "Unknown";
            tiwVar2 = tiwVar;
            std.f(tiwVar2, "Side Affinity: ".concat(strBp), null, false, null, buxVarC, i2 & 14, 62);
        } else {
            tiwVar2 = tiwVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar2, kjlVar, i, 3);
        }
    }

    public static final void r(tiw tiwVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-684339620);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            p(tiwVar, kjzVar, klb.g, buxVarC, (i2 & 112) | (i2 & 14) | 384);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar, kjzVar, i, 8);
        }
    }

    public static final void s(tiw tiwVar, kjz kjzVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-804448774);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(kjzVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            p(tiwVar, kjzVar, bxc.i(-1725821373, true, new dxm(kjzVar, 5), buxVarC), buxVarC, (i2 & 112) | (i2 & 14) | 384);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kkt(tiwVar, kjzVar, i, 6);
        }
    }

    public static final void t(Object obj, qn qnVar, kjz kjzVar) {
        Throwable thA = aezw.a(obj);
        if (thA != null) {
            ((ype) ((yph) b.a()).h()).M("Unable to set value of %s: %s", kjzVar, thA.getMessage());
            CarPropertySetError carPropertySetError = ((kkb) thA).a;
            adzp.b(qnVar, "Unable to set property " + kjzVar.a + " due to error code " + carPropertySetError.a).a();
        }
    }

    public static final void u(tjq tjqVar, kla klaVar, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        bux buxVar2;
        bxf bxfVarJ;
        kkt kktVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2103075460);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C("Car action controls") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(klaVar) : buxVarC.E(klaVar)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 14;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = eqy.b(klaVar.a(), new kki(2));
                bvvVar.ad(objS);
            }
            bym bymVarF = bxc.f((eqj) objS, afbe.a, buxVarC);
            if (roc.ag(bymVarF).isEmpty()) {
                buxVarC.v(-2032743896);
                std.m(tjqVar, "No car actions found.", new jjb(14, (int[]) null), null, klb.f, buxVarC, i4 | 196656, 10);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    kktVar = new kkt(tjqVar, klaVar, i, 10);
                    bxfVarJ.c = kktVar;
                }
                return;
            }
            tjqVar2 = tjqVar;
            buxVarC.v(-2032592058);
            bvvVar.Y(false);
            std.p(tjqVar2, new jjb(15, (int[]) null), null, bxc.i(587702727, true, new jjb(bymVarF, 16), buxVarC), buxVarC, i4 | 3072);
            buxVar2 = buxVarC;
        } else {
            tjqVar2 = tjqVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            kktVar = new kkt(tjqVar2, klaVar, i, 11);
            bxfVarJ.c = kktVar;
        }
    }

    public static final void v(tjq tjqVar, List list, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        list.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(89033242);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C("Supported actions") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 14;
            if (list.isEmpty()) {
                buxVarC.v(-1900372406);
                std.m(tjqVar, "No car actions found.", new jjb(6), null, klb.e, buxVarC, i4 | 196656, 10);
                ((bvv) buxVarC).Y(false);
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new kkt(tjqVar, list, i, 0);
                    return;
                }
                return;
            }
            tjqVar2 = tjqVar;
            buxVarC.v(-1900220568);
            ((bvv) buxVarC).Y(false);
            std.m(tjqVar2, null, new jjb(7), null, bxc.i(-1945191414, true, new jjb(list, 8), buxVarC), buxVarC, i4 | 196608, 11);
        } else {
            tjqVar2 = tjqVar;
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new kkt(tjqVar2, list, i, 2);
        }
    }

    public static final void w(tjq tjqVar, List list, bux buxVar, int i) {
        int i2;
        tjq tjqVar2;
        bux buxVar2;
        bxf bxfVarJ;
        kkt kktVar;
        list.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-707052820);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tjqVar) : buxVarC.E(tjqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C("Car property controls") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i5 = i2 & 14;
            if (list.isEmpty()) {
                buxVarC.v(-1290781942);
                std.m(tjqVar, "No car property controls found.", new jjb(13, (char[]) null), null, klb.c, buxVarC, i5 | 196656, 10);
                ((bvv) buxVarC).Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    kktVar = new kkt(tjqVar, list, i, 13);
                    bxfVarJ.c = kktVar;
                }
                return;
            }
            tjqVar2 = tjqVar;
            buxVarC.v(-1290678154);
            ((bvv) buxVarC).Y(false);
            std.p(tjqVar2, new kkw(i4), null, bxc.i(1278286017, true, new kkw(list, 3), buxVarC), buxVarC, i5 | 3072);
            buxVar2 = buxVarC;
        } else {
            tjqVar2 = tjqVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            kktVar = new kkt(tjqVar2, list, i, 17);
            bxfVarJ.c = kktVar;
        }
    }

    public static final void x(tiw tiwVar, urg urgVar, String str, List list, bux buxVar) {
        boolean z = !list.isEmpty();
        boolean zE = buxVar.E(urgVar) | buxVar.E(list);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new ah(urgVar, str, list, 14);
            buxVar.x(objG);
        }
        afdr afdrVar = (afdr) objG;
        afdrVar.getClass();
        std.h(tiwVar, str, new tjc(afdrVar), false, z, null, buxVar, 48, 90);
    }
}
