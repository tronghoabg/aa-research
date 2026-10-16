package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivk implements defpackage.jbv {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.CAR.VIDEO");
    public final java.util.List a;
    public boolean b;
    private final defpackage.jfo d;
    private final defpackage.jfa e;
    private final defpackage.jfd f;
    private final defpackage.ilj g;
    private final defpackage.jfe h;
    private final android.content.Context i;
    private final defpackage.ivj j;
    private final defpackage.iwm k;
    private final android.os.Handler l;
    private final defpackage.jcw m;
    private final defpackage.isf n;
    private final boolean o;
    private final defpackage.imn p;
    private final defpackage.jgq q;
    private final defpackage.izq r;

    public ivk(defpackage.izq izqVar, defpackage.jfo jfoVar, defpackage.jfa jfaVar, defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, android.content.Context context, defpackage.ivj ivjVar, android.os.Handler handler, defpackage.jcw jcwVar, defpackage.isf isfVar, defpackage.imn imnVar, defpackage.jgq jgqVar) {
        defpackage.iwm iwmVar = (defpackage.iwm) new defpackage.wbw(c(jfaVar), null).b(defpackage.xlk.MEDIA_CODEC_VIDEO_H265, null);
        this.a = new java.util.ArrayList();
        this.r = izqVar;
        this.d = jfoVar;
        this.e = jfaVar;
        this.f = jfdVar;
        this.g = iljVar;
        this.h = jfeVar;
        this.i = context;
        this.j = ivjVar;
        this.k = iwmVar;
        this.l = handler;
        this.m = jcwVar;
        this.n = isfVar;
        this.o = c(jfaVar);
        this.p = imnVar;
        this.q = jgqVar;
    }

    private final java.lang.String b(java.lang.String str) {
        return this.g.b(str, null);
    }

    private static boolean c(defpackage.jfa jfaVar) {
        com.google.android.gms.car.CarInfo carInfoT = jfaVar.t();
        return new defpackage.jbx(carInfoT.e, carInfoT.f).E(6, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x029a  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:118:0x0313  */
    /* JADX WARN: Code duplicated, block: B:121:0x031c A[Catch: ikf -> 0x0326, TRY_LEAVE, TryCatch #1 {ikf -> 0x0326, blocks: (B:119:0x0314, B:121:0x031c), top: B:162:0x0314 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0323 A[LOOP:1: B:162:0x0314->B:124:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0341  */
    /* JADX WARN: Code duplicated, block: B:134:0x0343  */
    /* JADX WARN: Code duplicated, block: B:138:0x034a  */
    /* JADX WARN: Code duplicated, block: B:150:0x038f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0391  */
    /* JADX WARN: Code duplicated, block: B:152:0x0394  */
    /* JADX WARN: Code duplicated, block: B:154:0x039c  */
    /* JADX WARN: Code duplicated, block: B:173:0x033b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0, types: [ilm, ivb, java.lang.Object, jfd, jfe] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ivn, izd, java.lang.Object] */
    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        boolean z;
        boolean z2;
        int i;
        ?? ivnVar;
        defpackage.xkd xkdVar;
        boolean z3;
        defpackage.xkd xkdVar2;
        boolean z4;
        int iOrdinal;
        defpackage.zbd zbdVar;
        ?? r10;
        int iAZ;
        if ((xpaVar.b & 4) == 0) {
            return null;
        }
        defpackage.xlp xlpVar = xpaVar.e;
        if (xlpVar == null) {
            xlpVar = defpackage.xlp.a;
        }
        if (xlpVar.f.size() == 0) {
            return null;
        }
        defpackage.xlk xlkVar = defpackage.xlk.MEDIA_CODEC_VIDEO_H264_BP;
        defpackage.xlp xlpVar2 = xpaVar.e;
        if (xlpVar2 == null) {
            xlpVar2 = defpackage.xlp.a;
        }
        defpackage.xlp xlpVar3 = xlpVar2;
        defpackage.abpj<defpackage.xqe> abpjVar = xlpVar3.f;
        java.util.TreeSet treeSet = new java.util.TreeSet();
        try {
            for (defpackage.xqe xqeVar : abpjVar) {
                java.lang.String[][] strArr = defpackage.ivf.a;
                defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
                if (xqdVarB == null) {
                    xqdVarB = defpackage.xqd.VIDEO_800x480;
                }
                defpackage.ivf.d(xqdVarB);
                android.graphics.Rect rectB = defpackage.ivf.b(xqeVar);
                if (rectB.width() <= 0 || rectB.height() <= 0) {
                    throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.BAD_DISPLAY_RESOLUTION, "wrong disp resolution " + rectB.width() + "," + rectB.height());
                }
                int iA = defpackage.ivf.a(xqeVar);
                if (iA != 30 && iA != 60) {
                    throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.BAD_FPS, defpackage.a.bo(iA, "wrong FPS "));
                }
                if ((xqeVar.b & 16) == 0) {
                    throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_DENSITY, "density missing");
                }
                int i2 = xqeVar.g;
                if (i2 <= 0) {
                    throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.BAD_DENSITY, defpackage.a.bo(i2, "wrong density "));
                }
                defpackage.xlk xlkVarB = defpackage.xlk.b(xqeVar.k);
                if (xlkVarB == null) {
                    xlkVarB = defpackage.xlk.MEDIA_CODEC_AUDIO_PCM;
                }
                treeSet.add(xlkVarB);
            }
            if (defpackage.aczp.a.fF().v()) {
                com.google.android.gms.car.CarInfo carInfoT = this.e.t();
                if (new defpackage.jbx(carInfoT.e, carInfoT.f).E(5, 0) && treeSet.size() > 1) {
                    throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.MULTIPLE_VIDEO_CODEC_TYPES, defpackage.a.bW(treeSet, "Display has multiple video codec types: "));
                }
            }
        } catch (defpackage.ikf e) {
            this.f.ax(e.a, e.b, e.getMessage() == null ? "CarErrorException" : e.getMessage());
        }
        defpackage.xlk xlkVar2 = defpackage.xlk.MEDIA_CODEC_VIDEO_H265;
        if (treeSet.contains(xlkVar2) && xlkVar == defpackage.xlk.MEDIA_CODEC_VIDEO_H264_BP) {
            if (this.k.z() == null) {
                ((defpackage.yqj) ((defpackage.yqj) c.g()).ai((char) 1374)).u("The H.265 video codec requested by the HU is not supported by the phone.");
                android.content.Context context = this.i;
                fyq.h(context, defpackage.zaj.CAR_SERVICE_INIT_ERROR, 2, defpackage.zak.VIDEO_ENCODING_INIT_FAIL, context.getString(2132083304));
            } else {
                xlkVar = xlkVar2;
            }
        }
        defpackage.yqm yqmVar = c;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1372)).y("The videoCodecType to be used is: %s", xlkVar);
        int i3 = xlpVar3.g;
        int i4 = xlpVar3.h;
        defpackage.xkd xkdVarB = defpackage.xkd.b(i4);
        if (xkdVarB == null) {
            xkdVarB = defpackage.xkd.DISPLAY_TYPE_MAIN;
        }
        defpackage.izq izqVar = this.r;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = new com.google.android.gms.car.display.CarDisplayId(i3);
        defpackage.xkd xkdVarB2 = defpackage.xkd.b(i4);
        if (xkdVarB2 == null) {
            xkdVarB2 = defpackage.xkd.DISPLAY_TYPE_MAIN;
        }
        defpackage.xkd xkdVar3 = xkdVarB2;
        defpackage.xle xleVarB = defpackage.xle.b(xlpVar3.i);
        if (xleVarB == null) {
            xleVarB = defpackage.xle.KEYCODE_UNKNOWN;
        }
        defpackage.xle xleVar = xleVarB;
        ?? r15 = izqVar.a;
        defpackage.ilu iluVar = new defpackage.ilu(r15, 5);
        defpackage.ilu iluVar2 = new defpackage.ilu(r15, 6);
        int i5 = carDisplayId.b;
        int iA2 = (int) defpackage.acte.a.fF().a();
        defpackage.imi imiVar = (defpackage.imi) r15;
        defpackage.jfo jfoVar = imiVar.O;
        defpackage.ivc ivcVar = new defpackage.ivc(r15, jfoVar, r15, r15, r15, imiVar.E, iluVar, carDisplayId, xkdVar3, xleVar, new defpackage.iwj(i5, jfoVar, iA2), iluVar2);
        if (xkdVarB == defpackage.xkd.DISPLAY_TYPE_CLUSTER) {
            com.google.android.gms.car.CarInfo carInfoT2 = this.e.t();
            if (carInfoT2 != null) {
                if (defpackage.jfz.e(carInfoT2.a, carInfoT2.b, carInfoT2.c, defpackage.acvb.h())) {
                    android.content.Context context2 = this.i;
                    z = false;
                    java.lang.String string = context2.getSharedPreferences("default_app", 0).getString("component_1PROJECTED", null);
                    if (string != null) {
                        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(string);
                        if (componentNameUnflattenFromString != null) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1375)).y("Checking default nav app %s for cluster support", componentNameUnflattenFromString);
                            defpackage.absk abskVarF = defpackage.acvb.f();
                            java.lang.String packageName = componentNameUnflattenFromString.getPackageName();
                            defpackage.yqm yqmVar2 = defpackage.kmv.a;
                            int iAr = defpackage.a.ar(abskVarF.c);
                            if (iAr == 0) {
                                iAr = 1;
                            }
                            int i6 = iAr - 1;
                            switch (i6) {
                                case 1:
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    if (defpackage.kmv.f(context2, abskVarF.d, packageName)) {
                                    }
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    if (!defpackage.kmv.f(context2, abskVarF.d, packageName)) {
                                    }
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    break;
                                default:
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.kmv.a.g()).ai(3232)).D("Undefined filter mode %d and package %s", i6, packageName);
                                    break;
                            }
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1376)).y("Unable to parse default nav app %s, assuming incompatible", string);
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1377)).u("No default nav app, assuming incompatible");
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1373)).u("Blocking cluster display focus requests due to non-compatible nav app");
                    z2 = true;
                }
                if (defpackage.actb.a.fF().r() || xkdVarB != defpackage.xkd.DISPLAY_TYPE_MAIN || (iAZ = defpackage.sqs.aZ(xlpVar3.j)) == 0) {
                    i = 1;
                } else {
                    i = iAZ;
                }
                defpackage.jfa jfaVar = this.e;
                defpackage.jfd jfdVar = this.f;
                defpackage.ilj iljVar = this.g;
                defpackage.jfe jfeVar = this.h;
                android.content.Context context3 = this.i;
                defpackage.ivf ivfVar = new defpackage.ivf(context3, jfaVar.t());
                boolean z5 = this.o;
                xkdVar = xkdVarB;
                z3 = z;
                ivnVar = new defpackage.ivn(ivcVar, jfaVar, jfdVar, iljVar, jfeVar, context3, ivfVar, new defpackage.wbw(z5, null), this.j.a(xkdVarB, i3, z5), abpjVar, xlkVar, xkdVar, i3, this.l, this.d, this.m, z2, this.n, i, z5, this.p, this.q);
                if (!defpackage.xkd.DISPLAY_TYPE_MAIN.equals(xkdVar)) {
                    for (r10 = z3; r10 < ivnVar.i.size(); r10++) {
                        try {
                            if (!ivnVar.B(r10)) {
                            }
                        } catch (defpackage.ikf e2) {
                            this.f.ax(e2.a, e2.b, e2.getMessage() != null ? e2.getMessage() : "CarErrorException");
                        }
                    }
                    return null;
                }
                boolean z6 = this.b;
                xkdVar2 = defpackage.xkd.DISPLAY_TYPE_MAIN;
                if (xkdVar != xkdVar2) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                this.b = z6 | z4;
                if (xkdVar == xkdVar2 || defpackage.jfm.a(b("power_saving_mode")) == defpackage.jfm.OFF || ((xkdVar == defpackage.xkd.DISPLAY_TYPE_AUXILIARY && defpackage.jfj.a(b("auxiliary_display_mode")) != defpackage.jfj.OFF) || (xkdVar == defpackage.xkd.DISPLAY_TYPE_CLUSTER && defpackage.jfk.a(b("cluster_display_mode")) != defpackage.jfk.OFF))) {
                    this.a.add(android.util.Pair.create(ivcVar, ivnVar));
                    return ivnVar;
                }
                ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 1370)).y("Display %s blocked by power saving", xkdVar);
                iOrdinal = xkdVar.ordinal();
                if (iOrdinal == 1) {
                    zbdVar = defpackage.zbd.Ch;
                } else {
                    if (iOrdinal != 2) {
                        throw new java.lang.IllegalStateException("DisplayType is not mapped to the right uiAction");
                    }
                    zbdVar = defpackage.zbd.Ci;
                }
                this.d.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.DISPLAY_FACTORY_FILTERED_DISPLAY, zbdVar).l());
                return null;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1371)).u("No CarInfo, assuming car allows all nav apps");
            z = false;
            z2 = false;
            if (defpackage.actb.a.fF().r()) {
                i = 1;
            } else {
                i = 1;
            }
            defpackage.jfa jfaVar2 = this.e;
            defpackage.jfd jfdVar2 = this.f;
            defpackage.ilj iljVar2 = this.g;
            defpackage.jfe jfeVar2 = this.h;
            android.content.Context context4 = this.i;
            defpackage.ivf ivfVar2 = new defpackage.ivf(context4, jfaVar2.t());
            boolean z7 = this.o;
            xkdVar = xkdVarB;
            z3 = z;
            ivnVar = new defpackage.ivn(ivcVar, jfaVar2, jfdVar2, iljVar2, jfeVar2, context4, ivfVar2, new defpackage.wbw(z7, null), this.j.a(xkdVarB, i3, z7), abpjVar, xlkVar, xkdVar, i3, this.l, this.d, this.m, z2, this.n, i, z7, this.p, this.q);
            if (!defpackage.xkd.DISPLAY_TYPE_MAIN.equals(xkdVar)) {
                while (r10 < ivnVar.i.size()) {
                    if (!ivnVar.B(r10)) {
                    }
                }
                return null;
            }
            boolean z8 = this.b;
            xkdVar2 = defpackage.xkd.DISPLAY_TYPE_MAIN;
            if (xkdVar != xkdVar2) {
                z4 = true;
            } else {
                z4 = z3;
            }
            this.b = z8 | z4;
            if (xkdVar == xkdVar2) {
                ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 1370)).y("Display %s blocked by power saving", xkdVar);
                iOrdinal = xkdVar.ordinal();
                if (iOrdinal == 1) {
                    zbdVar = defpackage.zbd.Ch;
                } else {
                    if (iOrdinal != 2) {
                        throw new java.lang.IllegalStateException("DisplayType is not mapped to the right uiAction");
                    }
                    zbdVar = defpackage.zbd.Ci;
                }
                this.d.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.DISPLAY_FACTORY_FILTERED_DISPLAY, zbdVar).l());
                return null;
            }
            this.a.add(android.util.Pair.create(ivcVar, ivnVar));
            return ivnVar;
        }
        z = false;
        z2 = z;
        if (defpackage.actb.a.fF().r()) {
            i = 1;
        } else {
            i = 1;
        }
        defpackage.jfa jfaVar3 = this.e;
        defpackage.jfd jfdVar3 = this.f;
        defpackage.ilj iljVar3 = this.g;
        defpackage.jfe jfeVar3 = this.h;
        android.content.Context context5 = this.i;
        defpackage.ivf ivfVar3 = new defpackage.ivf(context5, jfaVar3.t());
        boolean z9 = this.o;
        xkdVar = xkdVarB;
        z3 = z;
        ivnVar = new defpackage.ivn(ivcVar, jfaVar3, jfdVar3, iljVar3, jfeVar3, context5, ivfVar3, new defpackage.wbw(z9, null), this.j.a(xkdVarB, i3, z9), abpjVar, xlkVar, xkdVar, i3, this.l, this.d, this.m, z2, this.n, i, z9, this.p, this.q);
        if (!defpackage.xkd.DISPLAY_TYPE_MAIN.equals(xkdVar)) {
            while (r10 < ivnVar.i.size()) {
                if (!ivnVar.B(r10)) {
                }
            }
            return null;
        }
        boolean z10 = this.b;
        xkdVar2 = defpackage.xkd.DISPLAY_TYPE_MAIN;
        if (xkdVar != xkdVar2) {
            z4 = true;
        } else {
            z4 = z3;
        }
        this.b = z10 | z4;
        if (xkdVar == xkdVar2) {
            ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 1370)).y("Display %s blocked by power saving", xkdVar);
            iOrdinal = xkdVar.ordinal();
            if (iOrdinal == 1) {
                zbdVar = defpackage.zbd.Ch;
            } else {
                if (iOrdinal != 2) {
                    throw new java.lang.IllegalStateException("DisplayType is not mapped to the right uiAction");
                }
                zbdVar = defpackage.zbd.Ci;
            }
            this.d.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.DISPLAY_FACTORY_FILTERED_DISPLAY, zbdVar).l());
            return null;
        }
        this.a.add(android.util.Pair.create(ivcVar, ivnVar));
        return ivnVar;
    }
}
