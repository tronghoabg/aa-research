package defpackage;

/* loaded from: classes2.dex */
public final class gpm {
    private static final yob a = yob.c("com/android/car/libraries/apphost/media/MediaPlaybackKt");

    public static final void a(float f, float f2, gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-898310514);
        if (i3 == 0) {
            i2 = (true != buxVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 >> 6;
            float f3 = gpp.a;
            gpo gpoVar = dlj.a(f, gpp.g) >= 0 ? gpo.b : dlj.a(f, gpp.f) >= 0 ? gpo.a : gpo.c;
            gpn gpnVar = gpoVar == gpo.c ? dlj.a(f2, gpp.a) < 0 ? gpn.a : dlj.a(f2, gpp.b) < 0 ? gpn.b : dlj.a(f2, gpp.c) < 0 ? gpn.c : dlj.a(f2, gpp.e) < 0 ? gpn.d : gpn.e : dlj.a(f2, gpp.a) < 0 ? gpn.a : dlj.a(f2, gpp.b) < 0 ? gpn.b : dlj.a(f2, gpp.d) < 0 ? gpn.f : dlj.a(f2, gpp.e) < 0 ? gpn.d : gpn.e;
            int i5 = i4 & 14;
            gpo gpoVar2 = gpoVar;
            ((ynz) a.e().o(ypi.a, "CarApp.H.MediaPB").ai(64)).S("contentWidth=%s, contentHeight=%s. Using media playback layout with media width=%s and media height=%s", new dlj(f), new dlj(f2), gpoVar2, gpnVar);
            int iOrdinal = gpoVar2.ordinal();
            if (iOrdinal == 0) {
                buxVarC.v(374800387);
                int iOrdinal2 = gpnVar.ordinal();
                if (iOrdinal2 == 0) {
                    buxVarC.v(12091842);
                    gkd.f(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal2 == 1) {
                    buxVarC.v(12095074);
                    gkd.f(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal2 == 3) {
                    buxVarC.v(12101369);
                    gkq.g(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal2 != 5) {
                    buxVarC.v(12103285);
                    gkq.f(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(12098523);
                    gkd.m(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            } else if (iOrdinal != 2) {
                buxVarC.v(375288885);
                int iOrdinal3 = gpnVar.ordinal();
                if (iOrdinal3 == 0) {
                    buxVarC.v(12107586);
                    gkd.f(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal3 == 1) {
                    buxVarC.v(12110818);
                    gkd.f(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal3 == 3) {
                    buxVarC.v(12117561);
                    gkq.g(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal3 != 5) {
                    buxVarC.v(12119477);
                    gkq.f(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(12114591);
                    gkd.l(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(374386475);
                int iOrdinal4 = gpnVar.ordinal();
                if (iOrdinal4 == 0) {
                    buxVarC.v(12078590);
                    gkd.e(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal4 == 1) {
                    buxVarC.v(12081694);
                    gkd.e(gqcVar, gpnVar, cfyVar, buxVarC, i5 | ((i2 >> 3) & 896));
                    ((bvv) buxVarC).Y(false);
                } else if (iOrdinal4 != 2) {
                    buxVarC.v(12086709);
                    gkq.f(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(12084855);
                    gkd.k(gqcVar, cfyVar, buxVarC, i4 & 126);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mul(f, f2, gqcVar, cfyVar, i, 1);
        }
    }

    public static final void b(cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1446513045);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            atk.c(cfyVar.a(new aix(gux.c(buxVarC).Q(), ckq.a)), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfyVar, i, 9);
        }
    }

    public static final void c(gqc gqcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1746885957);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqcVar) : buxVarC.E(gqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = 6;
            if (((ggk) buxVarC.f(ggo.a)).m()) {
                buxVarC.v(639320178);
                hjo hjoVar = (hjo) buxVarC.f(hjp.a);
                a(hjoVar.c, hjoVar.d, gqcVar, cfyVar, buxVarC, (i2 << 6) & 8064);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(639550911);
                ca.at(null, null, bxc.i(-75455359, true, new fun(gqcVar, cfyVar, i4), buxVarC), buxVarC, 3072, 7);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gox(gqcVar, cfyVar, i, 4);
        }
    }
}
