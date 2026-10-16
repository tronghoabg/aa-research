package defpackage;

import androidx.car.app.model.Shape;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hbv {
    public static final void a(hbw hbwVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(273971314);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.C(hbwVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gfs gfsVarB = gey.b(hbwVar.a);
            cfv cfvVar = cfy.e;
            float f = gjk.c.k;
            fzc.h(gfsVarB, asl.I(ca.bf(ggh.a(cfvVar, bcr.b(f), gux.c(buxVarC).Q(), 0L, null, null, null, false, false, buxVarC, 6, 252), true, null), gjk.e.k, f), 0, 0, gux.c(buxVarC).T(), czz.av(buxVarC).l, 0L, null, 0, 3, null, null, null, false, false, buxVarC, 0, 0, 64972);
            buxVarC = buxVarC;
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(hbwVar, cfyVar, i, 18, null);
        }
    }

    public static final void b(gez gezVar, gez gezVar2, int i, cfm cfmVar, cfy cfyVar, boolean z, bux buxVar, int i2) {
        int i3;
        bux buxVar2;
        long jT;
        int i4;
        boolean z2;
        boolean z3;
        bvv bvvVar;
        bux buxVar3;
        gez gezVar3 = gezVar2;
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(-1226884677);
        if (i5 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(gezVar) : buxVarC.E(gezVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? buxVarC.C(gezVar3) : buxVarC.E(gezVar3)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.A(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.C(cfmVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            ctp ctpVarA = atp.a(atd.c, cfmVar, buxVarC, ((((i3 >> 12) & 14) | ((i3 >> 3) & 896)) >> 3) & 112);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            long jU = -3673528477941760L;
            if (gezVar == null) {
                buxVarC.v(294143029);
                bvvVar2.Y(false);
                i4 = i3;
                z2 = false;
                z3 = true;
                buxVar3 = buxVarC;
                bvvVar = bvvVar2;
            } else {
                int i6 = ((i3 >> 6) & 14) | 24960;
                buxVarC.v(294143030);
                deu deuVar = gezVar.a;
                deuVar.getClass();
                dfw dfwVar = czz.av(buxVarC).l;
                dfw dfwVarV = z ? dfw.v(dfwVar, 0L, 0L, null, null, null, null, 0L, new cku(-72057594037927936L, (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), 4.0f), 0, 0, 0L, null, null, 16769023) : dfwVar;
                if (z) {
                    buxVarC.v(2085433425);
                    bvvVar2.Y(false);
                    jT = -3673528477941760L;
                } else {
                    buxVarC.v(2085489380);
                    jT = gux.c(buxVarC).T();
                    bvvVar2.Y(false);
                }
                i4 = i3;
                z2 = false;
                z3 = true;
                bvvVar = bvvVar2;
                brp.c(deuVar, awd.r(cfy.e), jT, 0L, null, 0L, null, new dkt(i), 0L, 2, false, 1, 0, gezVar.b, null, dfwVarV, buxVarC, 48, i6, 175096);
                buxVar3 = buxVarC;
                bvvVar.Y(false);
            }
            if (gezVar3 == null) {
                buxVar3.v(294852526);
                bvvVar.Y(z2);
                buxVar2 = buxVar3;
            } else {
                int i7 = ((i4 >> 6) & 14) | 24960;
                buxVar3.v(294852527);
                deu deuVar2 = gezVar3.a;
                deuVar2.getClass();
                dfw dfwVarV2 = czz.av(buxVar3).l;
                if (z) {
                    dfwVarV2 = dfw.v(dfwVarV2, 0L, 0L, null, null, null, null, 0L, new cku(-72057594037927936L, (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), 4.0f), 0, 0, 0L, null, null, 16769023);
                }
                dfw dfwVar2 = dfwVarV2;
                if (z) {
                    buxVar3.v(-345011654);
                } else {
                    buxVar3.v(-344955637);
                    jU = gux.c(buxVar3).U();
                }
                bvvVar.Y(z2);
                gezVar3 = gezVar2;
                buxVar2 = buxVar3;
                brp.c(deuVar2, asl.J(awd.r(cfy.e), BitmapDescriptorFactory.HUE_RED, gjk.a.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), jU, 0L, null, 0L, null, new dkt(i), 0L, 2, false, 1, 0, gezVar3.b, null, dfwVar2, buxVar2, 0, i7, 175096);
                bvvVar.Y(z2);
                z3 = true;
            }
            bvvVar.Y(z3);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvu(gezVar, gezVar3, i, cfmVar, cfyVar, z, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hbt r38, final float r39, defpackage.cfy r40, int r41, float r42, defpackage.dlj r43, defpackage.cjv r44, defpackage.dlj r45, float r46, float r47, defpackage.dkt r48, boolean r49, defpackage.bux r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbv.c(hbt, float, cfy, int, float, dlj, cjv, dlj, float, float, dkt, boolean, bux, int, int, int):void");
    }

    public static final bcm d(hke hkeVar, bux buxVar) {
        if (affa.f(hkeVar, hkc.a)) {
            buxVar.v(1029861045);
            bcm bcmVar = gux.f(buxVar).a.a;
            ((bvv) buxVar).Y(false);
            return bcmVar;
        }
        if (affa.f(hkeVar, hjy.a)) {
            buxVar.v(1029863387);
            bcm bcmVar2 = gux.f(buxVar).a.b;
            ((bvv) buxVar).Y(false);
            return bcmVar2;
        }
        if (affa.f(hkeVar, hkd.a)) {
            buxVar.v(1029865750);
            bcm bcmVar3 = gux.f(buxVar).a.c;
            ((bvv) buxVar).Y(false);
            return bcmVar3;
        }
        if (affa.f(hkeVar, hkb.a)) {
            buxVar.v(1029867991);
            bcm bcmVar4 = gux.f(buxVar).a.d;
            ((bvv) buxVar).Y(false);
            return bcmVar4;
        }
        if (affa.f(hkeVar, hka.a)) {
            buxVar.v(1029870230);
            bcm bcmVar5 = gux.f(buxVar).a.e;
            ((bvv) buxVar).Y(false);
            return bcmVar5;
        }
        if (affa.f(hkeVar, hjx.a)) {
            buxVar.v(1029872603);
            bcm bcmVar6 = gux.f(buxVar).a.f;
            ((bvv) buxVar).Y(false);
            return bcmVar6;
        }
        if (!affa.f(hkeVar, hjz.a)) {
            buxVar.v(1029859129);
            ((bvv) buxVar).Y(false);
            throw new aezs();
        }
        buxVar.v(1029874933);
        bcm bcmVar7 = gux.f(buxVar).a.g;
        ((bvv) buxVar).Y(false);
        return bcmVar7;
    }

    public static final gzw e(Shape shape) {
        switch (shape.getShapeType()) {
            case 1:
                return hkc.a;
            case 2:
                return hjy.a;
            case 3:
                return hkd.a;
            case 4:
                return hkb.a;
            case 5:
                return hka.a;
            case 6:
                return hjx.a;
            case 7:
                return hjz.a;
            default:
                return hkc.a;
        }
    }
}
