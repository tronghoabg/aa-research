package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivn implements defpackage.ivi, defpackage.ivu {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VIDEO");
    public final defpackage.jbx A;
    public final boolean B;
    public final defpackage.ivv C;
    public final defpackage.wbw D;
    private final defpackage.ivf E;
    private final defpackage.ivg F;
    private final defpackage.isf G;
    private final defpackage.xpw H;
    private final defpackage.jfd I;
    private final defpackage.jgq J;
    private final int K;
    public final defpackage.ivm b;
    public volatile defpackage.ive c;
    public final defpackage.ivd d;
    public final defpackage.jev e;
    public defpackage.jeu f;
    public volatile defpackage.iwy g;
    public volatile defpackage.ivo h;
    public final defpackage.ygw i;
    public int j;
    public final defpackage.imn k;
    public defpackage.xpq l;
    public final defpackage.xlk m;
    public final defpackage.xkd n;
    public final int o;
    public final defpackage.ilj p;
    public final defpackage.jfe q;
    public final android.content.Context r;
    public final java.util.concurrent.atomic.AtomicBoolean s;
    public int t;
    public boolean u;
    public android.view.Surface v;
    public final java.util.concurrent.Semaphore w;
    public final boolean x;
    public final defpackage.jcw y;
    public final defpackage.jfo z;

    /* JADX WARN: Multi-variable type inference failed */
    public ivn(defpackage.ivd ivdVar, defpackage.jfa jfaVar, defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, android.content.Context context, defpackage.ivf ivfVar, defpackage.wbw wbwVar, defpackage.jev jevVar, java.util.List list, defpackage.xlk xlkVar, defpackage.xkd xkdVar, int i, android.os.Handler handler, defpackage.jfo jfoVar, defpackage.jcw jcwVar, boolean z, defpackage.isf isfVar, int i2, boolean z2, defpackage.imn imnVar, defpackage.jgq jgqVar) {
        defpackage.ivh ivhVar = new defpackage.ivh(xlkVar, jfeVar, jfaVar, iljVar);
        defpackage.jbx jbxVar = new defpackage.jbx(jfaVar.t().e, jfaVar.t().f);
        this.j = -1;
        this.s = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.t = 2;
        this.w = new java.util.concurrent.Semaphore(0);
        defpackage.ysr.aY(!list.isEmpty(), "Video configurations must not be empty");
        this.d = ivdVar;
        this.I = jfdVar;
        this.p = iljVar;
        this.q = jfeVar;
        this.r = context;
        this.D = wbwVar;
        this.e = jevVar;
        defpackage.ygw ygwVarO = defpackage.ygw.o(list);
        this.i = ygwVarO;
        this.m = xlkVar;
        this.b = new defpackage.ivm(this, handler.getLooper());
        this.n = xkdVar;
        this.o = i;
        this.E = ivfVar;
        this.K = i2;
        defpackage.xpq xpqVar = ((defpackage.xqe) ygwVarO.get(0)).l;
        defpackage.xpw xpwVarB = defpackage.xpw.b((xpqVar == null ? defpackage.xpq.b : xpqVar).g);
        this.H = xpwVarB == null ? defpackage.xpw.UI_THEME_AUTOMATIC : xpwVarB;
        this.F = ivhVar;
        this.z = jfoVar;
        this.y = jcwVar;
        this.A = jbxVar;
        this.B = z;
        this.G = isfVar;
        this.x = z2;
        this.k = imnVar;
        this.J = jgqVar;
        defpackage.ivv ivvVar = new defpackage.ivv(this);
        this.C = ivvVar;
        ivvVar.start();
    }

    /* JADX WARN: Code duplicated, block: B:200:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b A[PHI: r19 r20
  0x011b: PHI (r19v4 int) = (r19v0 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int) binds: [B:74:0x0113, B:210:0x011b, B:57:0x00da, B:59:0x00e2, B:49:0x00bf, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r20v5 float) = (r20v0 float), (r20v6 float), (r20v6 float), (r20v6 float), (r20v7 float), (r20v7 float) binds: [B:74:0x0113, B:210:0x011b, B:57:0x00da, B:59:0x00e2, B:49:0x00bf, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x011e A[PHI: r19
  0x011e: PHI (r19v1 int) = (r19v0 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int), (r19v5 int) binds: [B:73:0x0111, B:62:0x00eb, B:209:0x011e, B:53:0x00ca, B:55:0x00d2, B:59:0x00e2, B:28:0x0078, B:31:0x0082, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void A() {
        int i;
        float f;
        float f2;
        android.util.Size size;
        int i2;
        double d;
        float fMin;
        int iRound;
        int iRound2;
        android.graphics.Rect rectA;
        android.graphics.Rect rectA2;
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures;
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig;
        com.google.android.gms.car.display.CarDisplayCornerRadii carDisplayCornerRadii;
        float fMin2;
        float f3;
        int iMax;
        java.lang.String str;
        defpackage.ysr.bk(this.j >= 0, "Attempted to update DisplayParams before config received.");
        defpackage.xqe xqeVar = (defpackage.xqe) this.i.get(this.j);
        int i3 = this.j;
        defpackage.xpq xpqVar = this.l;
        defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
        if (xqdVarB == null) {
            xqdVarB = defpackage.xqd.VIDEO_800x480;
        }
        android.util.Size sizeD = defpackage.ivf.d(xqdVarB);
        android.graphics.Rect rectC = defpackage.ivf.c(xqeVar, xpqVar);
        int iWidth = rectC.width();
        int iHeight = rectC.height();
        int i4 = xqeVar.b;
        int i5 = (i4 & 32) != 0 ? xqeVar.h : 4;
        defpackage.ivf ivfVar = this.E;
        com.google.android.gms.car.CarInfo carInfo = ivfVar.c;
        int i6 = carInfo.e;
        if (i6 >= 6) {
            i5 = 0;
        }
        int i7 = carInfo.f;
        if (i6 > 1 || ((i6 == 1 && i7 >= 2) || (str = carInfo.a) == null)) {
            i = 1;
            if ((i4 & 128) != 0) {
                f = xqeVar.i * 1.0E-4f;
                f2 = f;
            } else {
                f2 = 1.0f;
            }
        } else {
            java.lang.String str2 = carInfo.b;
            int iHashCode = str.hashCode();
            i = 1;
            f = 1.15f;
            if (iHashCode == -1710362933) {
                if (str.equals("MITSUBISHI MOTORS")) {
                    java.lang.String[][] strArr = defpackage.ivf.a;
                    int i8 = 0;
                    while (true) {
                        if (i8 < 26) {
                            java.lang.String[] strArr2 = strArr[i8];
                            if (strArr2[0].equals(str2) && strArr2[1].equals(carInfo.c)) {
                                f2 = f;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                f2 = 1.0f;
            } else if (iHashCode != -1288957975) {
                if (iHashCode == 1097799450 && str.equals("Pioneer")) {
                    java.lang.String str3 = carInfo.c;
                    boolean z = "2015".equals(str3) && ("AV Receiver".equals(str2) || "Car Navigation".equals(str2));
                    boolean z2 = "2016".equals(str3) && ("AV Receiver".equals(str2) || "Car Navigation - High".equals(str2));
                    f = 1.1515f;
                    if (z || z2) {
                        f2 = f;
                    }
                }
                f2 = 1.0f;
            } else if (str.equals("KENWOOD Top Menu") && "2015".equals(carInfo.c) && ("DDX9902S".equals(str2) || "DDX9702S".equals(str2))) {
                f2 = f;
            } else {
                f2 = 1.0f;
            }
        }
        android.content.Context context = ivfVar.b;
        defpackage.yhx yhxVar = defpackage.ivs.a;
        if (f2 == 1.0f || defpackage.acve.a.fF().a() || defpackage.acwv.o()) {
            size = sizeD;
            i2 = i5;
            d = 1.0d;
            fMin = f2;
        } else {
            android.graphics.Point point = new android.graphics.Point();
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            displayManager.getClass();
            displayManager.getDisplay(0).getSize(point);
            d = 1.0d;
            if (f2 != 1.0d) {
                float fE = (float) defpackage.acwv.e();
                ((defpackage.yqj) defpackage.ivs.c.l().ai(1413)).z("Scaling factors: %f %f", f2, fE);
                if (1.0f / fE > f2 || f2 > fE) {
                    fMin = f2;
                } else {
                    fMin = 1.0f;
                }
            } else {
                fMin = f2;
            }
            double d2 = fMin;
            if (d2 != 1.0d) {
                if (iWidth >= iHeight) {
                    if (d2 < 1.0d) {
                        f3 = iHeight;
                        iMax = java.lang.Math.min(point.x, point.y);
                    } else {
                        f3 = iWidth;
                        iMax = java.lang.Math.max(point.x, point.y);
                    }
                    fMin2 = iMax;
                } else if (d2 < 1.0d) {
                    fMin2 = java.lang.Math.max(point.x, point.y);
                    f3 = iHeight;
                } else {
                    fMin2 = java.lang.Math.min(point.x, point.y);
                    f3 = iWidth;
                }
                float f4 = fMin2 / f3;
                float fD = (float) defpackage.acwv.d();
                size = sizeD;
                i2 = i5;
                ((defpackage.yqj) defpackage.ivs.c.l().ai(1412)).R("Scaling factors: %f %f %f", java.lang.Float.valueOf(fMin), java.lang.Float.valueOf(f4), java.lang.Float.valueOf(fD));
                fMin = fMin < 1.0f ? 1.0f / java.lang.Math.min(1.0f / fMin, java.lang.Math.min(fD, f4)) : java.lang.Math.min(fMin, java.lang.Math.min(fD, f4));
            } else {
                size = sizeD;
                i2 = i5;
            }
        }
        double d3 = fMin;
        if (d3 < d) {
            iRound2 = java.lang.Math.round(iHeight / fMin);
            iRound = iWidth;
        } else {
            iRound = d3 > d ? java.lang.Math.round(iWidth * fMin) : iWidth;
            iRound2 = iHeight;
        }
        android.util.Size size2 = new android.util.Size(iRound, iRound2);
        if (xpqVar == null) {
            rectA = new android.graphics.Rect();
        } else {
            xky xkyVar = xpqVar.f;
            if (xkyVar == null) {
                xkyVar = xky.a;
            }
            rectA = defpackage.ivs.a(xkyVar, fMin);
        }
        if (xpqVar == null) {
            rectA2 = new android.graphics.Rect();
        } else {
            xky xkyVar2 = xpqVar.e;
            if (xkyVar2 == null) {
                xkyVar2 = xky.a;
            }
            rectA2 = defpackage.ivs.a(xkyVar2, fMin);
        }
        defpackage.ygw ygwVarC = (xpqVar == null || !defpackage.actb.a.fF().d()) ? defpackage.ymx.a : defpackage.ivs.c(xpqVar.j, fMin);
        defpackage.xpq xpqVar2 = (defpackage.xpq) new defpackage.nub(xpqVar).i(defpackage.xpq.b);
        defpackage.ygw ygwVar = ygwVarC;
        defpackage.jbx jbxVar = new defpackage.jbx(carInfo.e, carInfo.f);
        int i9 = 3;
        if (jbxVar.E(4, 3)) {
            defpackage.yhx yhxVar2 = (defpackage.yhx) j$.util.Collection.-EL.stream(xpqVar2.i).map(new defpackage.ilz(6)).collect(defpackage.yds.b);
            defpackage.yhx yhxVarN = defpackage.yhx.n(new defpackage.abph(xpqVar2.h, defpackage.xpq.a));
            if (yhxVar2.contains(defpackage.xid.ACTION_RESIZE_TO_SMALLER)) {
                i9 = 2;
            } else if (!yhxVar2.contains(defpackage.xid.ACTION_RESIZE_TO_LARGER)) {
                i9 = yhxVarN.contains(defpackage.xpr.UI_ELEMENT_NATIVE_UI_AFFORDANCE) ? 0 : i;
            }
            carDisplayUiFeatures = new com.google.android.gms.car.display.CarDisplayUiFeatures(i9, j$.util.Collection.-EL.stream(yhxVarN).mapToInt(new defpackage.ivp()).reduce(0, new defpackage.ivq()));
        } else {
            int i10 = (defpackage.ivs.d(carInfo, defpackage.ivs.a.d()) || (jbxVar.C(new defpackage.jbx(4, 2)) && defpackage.ivs.d(carInfo, defpackage.ivs.b.d()))) ? i : 0;
            boolean z3 = carInfo.g;
            ?? r12 = z3;
            if (carInfo.o) {
                r12 = (z3 ? 1 : 0) | 2;
            }
            int i11 = r12;
            if (carInfo.n) {
                i11 = (r12 == true ? 1 : 0) | 4;
            }
            carDisplayUiFeatures = new com.google.android.gms.car.display.CarDisplayUiFeatures(i10, i11);
        }
        if (!defpackage.actb.a.fF().d() || xpqVar == null || (xpqVar.c & 16) == 0) {
            rectA2 = rectA2;
            carDisplayUiFeatures = carDisplayUiFeatures;
            carDisplayBlendedUiConfig = null;
        } else {
            xin xinVar = xpqVar.k;
            if (xinVar == null) {
                xinVar = xin.a;
            }
            if (xinVar == null) {
                rectA2 = rectA2;
                carDisplayUiFeatures = carDisplayUiFeatures;
                carDisplayBlendedUiConfig = null;
            } else {
                if ((xinVar.b & 1) != 0) {
                    xjx xjxVar = xinVar.c;
                    if (xjxVar == null) {
                        xjxVar = xjx.a;
                    }
                    carDisplayCornerRadii = new com.google.android.gms.car.display.CarDisplayCornerRadii((xjxVar.b & 1) != 0 ? java.lang.Integer.valueOf(xjxVar.c) : null, (xjxVar.b & 2) != 0 ? java.lang.Integer.valueOf(xjxVar.d) : null, (xjxVar.b & 4) != 0 ? java.lang.Integer.valueOf(xjxVar.e) : null, (xjxVar.b & 8) != 0 ? java.lang.Integer.valueOf(xjxVar.f) : null);
                } else {
                    carDisplayCornerRadii = null;
                }
                carDisplayBlendedUiConfig = new com.google.android.gms.car.display.CarDisplayBlendedUiConfig(carDisplayCornerRadii, (defpackage.ygw) j$.util.Collection.-EL.stream(xinVar.d).flatMap(new ivr(fMin, i)).collect(defpackage.yds.a));
            }
        }
        defpackage.iuq iuqVar = new defpackage.iuq();
        iuqVar.a = i3;
        iuqVar.m |= 1;
        iuqVar.c(size.getWidth());
        iuqVar.b(size.getHeight());
        iuqVar.b = defpackage.ivf.a(xqeVar);
        iuqVar.m |= 8;
        iuqVar.g(iWidth);
        iuqVar.d(iHeight);
        iuqVar.e(rectC.left);
        iuqVar.f(rectC.top);
        iuqVar.c = xqeVar.g;
        int i12 = iuqVar.m;
        iuqVar.d = f2;
        iuqVar.e = i2;
        iuqVar.f = fMin;
        iuqVar.g = size2;
        iuqVar.h = rectA;
        iuqVar.i = rectA2;
        iuqVar.m = i12 | 32512;
        if (ygwVar == null) {
            throw new java.lang.NullPointerException("Null cutouts");
        }
        iuqVar.j = ygwVar;
        iuqVar.k = carDisplayUiFeatures;
        iuqVar.l = carDisplayBlendedUiConfig;
        iuqVar.m = 261888 | i12;
        this.c = iuqVar.a();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(1408)).y("Accessory display sink available: %s", this.c);
        if ((xqeVar.b & 256) != 0) {
            ((defpackage.yqj) yqmVar.l().ai(1409)).w("Real density %d", xqeVar.j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B(int i) throws defpackage.ikf {
        long j;
        int i2;
        defpackage.xqd xqdVarB;
        if (i >= 0) {
            defpackage.ygw ygwVar = this.i;
            if (i < ygwVar.size()) {
                defpackage.xqe xqeVar = (defpackage.xqe) ygwVar.get(i);
                defpackage.xqd xqdVarB2 = defpackage.xqd.b(xqeVar.c);
                if (xqdVarB2 == null) {
                    xqdVarB2 = defpackage.xqd.VIDEO_800x480;
                }
                defpackage.xqd xqdVar = xqdVarB2;
                int iS = defpackage.wva.s(xqeVar.d);
                int i3 = 60;
                boolean z = true;
                if (iS != 0 && iS != 1) {
                    i3 = 30;
                }
                int i4 = i3;
                defpackage.ivg ivgVar = this.F;
                android.util.Size sizeD = defpackage.ivf.d(xqdVar);
                defpackage.ivh ivhVar = (defpackage.ivh) ivgVar;
                defpackage.xlk xlkVar = ivhVar.d;
                if (xlkVar == defpackage.xlk.MEDIA_CODEC_VIDEO_H265 || ((sizeD.getWidth() <= 1920 && sizeD.getHeight() <= 1080) || (sizeD.getWidth() <= 1080 && sizeD.getHeight() <= 1920))) {
                    defpackage.iwx iwxVarZ = new defpackage.wbw(true, null).b(xlkVar, null).z();
                    if (iwxVarZ != null) {
                        if (!defpackage.aczp.a.fF().u() || (sizeD.getWidth() <= iwxVarZ.d && sizeD.getHeight() <= iwxVarZ.e)) {
                            i2 = iwxVarZ.a;
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.ivh.a.d()).ai(1363)).B("codec %d codec fps %s", iwxVarZ.a, iwxVarZ.b);
                            j = ((long) i2) * ((long) iwxVarZ.b);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.ivh.a.f()).ai(1364)).R("Required size %s exceeds encoder max orientation dimensions (%dx%d)", sizeD, java.lang.Integer.valueOf(iwxVarZ.d), java.lang.Integer.valueOf(iwxVarZ.e));
                        }
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ivh.a.f()).ai(1367)).K("VideoCodecResolutionType %s (%d) cannot be supported by the encoder.", xqdVar, xqdVar.j);
                    } else {
                        j = 11520000;
                        i2 = 384000;
                    }
                    int width = sizeD.getWidth() * sizeD.getHeight();
                    long j2 = i4;
                    if (i2 >= width && j >= j2 * ((long) width)) {
                        int i5 = ivhVar.e.i();
                        if (i5 != 4 && i5 != 0 && i5 != 3) {
                            java.lang.String string = ivhVar.g.c.getString("car_video_resolution", "none");
                            defpackage.yqm yqmVar = defpackage.ivh.a;
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1362)).y("Video resolution car setting: %s", string);
                            defpackage.yhx yhxVar = (defpackage.yhx) defpackage.ivh.c.get(string);
                            if (yhxVar == null ? !(!defpackage.kjl.h(ivhVar.f.t(), defpackage.ivh.b) || xqdVar == defpackage.xqd.VIDEO_800x480) : !yhxVar.contains(xqdVar)) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1366)).K("VideoCodecResolutionType %s (%d) is not allowed due to developer settings.", xqdVar, xqdVar.j);
                            } else if (i5 == 2) {
                                int i6 = ((defpackage.imi) ivhVar.f).u.r.n;
                                switch (xqdVar.ordinal()) {
                                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                        if (i6 > 0 && i6 <= 2500) {
                                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1365)).K("VideoCodecResolutionType %s (%d) is not allowed due wireless frequency.", xqdVar, xqdVar.j);
                                            break;
                                        }
                                    case defpackage.abnt.b /* 0 */:
                                    case 1:
                                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(1381);
                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                                        xqdVarB = defpackage.xqd.b(xqeVar.c);
                                        if (xqdVarB == null) {
                                            xqdVarB = defpackage.xqd.VIDEO_800x480;
                                        }
                                        yqjVar.S("Checking video config at index %d codec:%s fps:%d. isAllowed: %b", numValueOf, xqdVarB, java.lang.Integer.valueOf(i4), java.lang.Boolean.valueOf(z));
                                        return z;
                                    default:
                                        throw new java.lang.RuntimeException(null, null);
                                }
                            }
                        }
                        defpackage.yqj yqjVar2 = (defpackage.yqj) a.l().ai(1381);
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
                        xqdVarB = defpackage.xqd.b(xqeVar.c);
                        if (xqdVarB == null) {
                            xqdVarB = defpackage.xqd.VIDEO_800x480;
                        }
                        yqjVar2.S("Checking video config at index %d codec:%s fps:%d. isAllowed: %b", numValueOf2, xqdVarB, java.lang.Integer.valueOf(i4), java.lang.Boolean.valueOf(z));
                        return z;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ivh.a.f()).ai(1367)).K("VideoCodecResolutionType %s (%d) cannot be supported by the encoder.", xqdVar, xqdVar.j);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ivh.a.h()).ai(1368)).S("VideoCodecResolutionType %s (%d) is not allowed for the codec type %s (%d).", xqdVar, java.lang.Integer.valueOf(xqdVar.j), xlkVar, java.lang.Integer.valueOf(xlkVar.h));
                }
                z = false;
                defpackage.yqj yqjVar3 = (defpackage.yqj) a.l().ai(1381);
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i);
                xqdVarB = defpackage.xqd.b(xqeVar.c);
                if (xqdVarB == null) {
                    xqdVarB = defpackage.xqd.VIDEO_800x480;
                }
                yqjVar3.S("Checking video config at index %d codec:%s fps:%d. isAllowed: %b", numValueOf3, xqdVarB, java.lang.Integer.valueOf(i4), java.lang.Boolean.valueOf(z));
                return z;
            }
        }
        throw new defpackage.ikf(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.BAD_CODEC_RESOLUTION, defpackage.a.bo(i, "car sent wrong configuration index "));
    }

    @Override // defpackage.ivi
    public final defpackage.ive a() {
        return this.c;
    }

    @Override // defpackage.izd
    public final /* bridge */ /* synthetic */ defpackage.jbq b(defpackage.jbu jbuVar) {
        defpackage.jgq jgqVar = this.J;
        jgqVar.getClass();
        defpackage.xys xysVar = new defpackage.xys(new defpackage.ire(jgqVar, 7));
        defpackage.jaz jazVar = new defpackage.jaz();
        defpackage.jev jevVar = this.e;
        return new defpackage.jeu(this, jbuVar, jevVar, jazVar, this.n, this.m, new defpackage.jdt(jevVar), this.G, xysVar, this.x);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.ivi
    public final defpackage.jeu e() {
        return this.f;
    }

    @Override // defpackage.ivi
    public final defpackage.xlk f() {
        return this.m;
    }

    @Override // defpackage.ivi
    public final defpackage.xpw g() {
        return this.H;
    }

    @Override // defpackage.ivi
    public final defpackage.ygw h() {
        return this.i;
    }

    @Override // defpackage.ivi
    public final void i() {
        ((defpackage.yqj) a.l().ai((char) 1393)).u("Enabling projection");
        defpackage.ivm ivmVar = this.b;
        ivmVar.sendMessage(ivmVar.obtainMessage(3));
    }

    @Override // defpackage.ivi
    public final void j(defpackage.ivo ivoVar) {
        this.h = ivoVar;
    }

    @Override // defpackage.ivi
    public final void k() {
        defpackage.jeu jeuVar = this.f;
        if (jeuVar != null) {
            jeuVar.H();
        }
    }

    @Override // defpackage.ivi
    public final synchronized void l(defpackage.xid xidVar) {
        defpackage.xpq xpqVar = this.l;
        if (xpqVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1404)).u("uiConfig is null");
            return;
        }
        if (!((defpackage.yhx) j$.util.Collection.-EL.stream(xpqVar.i).map(new defpackage.ikc(11)).collect(defpackage.yds.b)).contains(xidVar)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1403)).y("Ignoring outdated request to send ActionTakenNotification with actionType: %s", xidVar.name());
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 1402)).y("Sending ActionTakenNotification with actionType: %s", xidVar.name());
        defpackage.jeu jeuVar = this.f;
        jeuVar.getClass();
        defpackage.jeu.a.l().ai(1964).y("sendActionTakenNotification(actionType=%s)", xidVar.name());
        defpackage.abor aborVarN = xic.a.n();
        aborVarN.t();
        xic xicVar = aborVarN.b;
        xicVar.c = xidVar.d;
        xicVar.b |= 1;
        jeuVar.k(32780, aborVarN.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        printWriter.println(this.c);
        printWriter.print("Video encoder: ");
        if (this.g != null) {
            printWriter.println(this.g);
        }
        defpackage.xpq xpqVar = this.l;
        if (xpqVar != null) {
            printWriter.print("UiConfig: ");
            printWriter.println(xpqVar);
        } else {
            printWriter.println("No UiConfig");
        }
        printWriter.println("Video Configs");
        defpackage.ygw ygwVar = this.i;
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.xqe xqeVar = (defpackage.xqe) ygwVar.get(i);
            if (xqeVar != null) {
                java.lang.String[][] strArr = defpackage.ivf.a;
                defpackage.xqd xqdVarB = defpackage.xqd.b(xqeVar.c);
                if (xqdVarB == null) {
                    xqdVarB = defpackage.xqd.VIDEO_800x480;
                }
                android.util.Size sizeD = defpackage.ivf.d(xqdVarB);
                int width = sizeD.getWidth();
                int height = sizeD.getHeight();
                int iA = defpackage.ivf.a(xqeVar);
                android.graphics.Rect rectB = defpackage.ivf.b(xqeVar);
                int iWidth = rectB.width();
                int iHeight = rectB.height();
                int iQ = defpackage.ebm.q((xqeVar.b & 16) != 0 ? java.lang.Integer.valueOf(xqeVar.g) : null);
                printWriter.println("codecW:" + width + " codecH:" + height + " dispW:" + iWidth + " dispH:" + iHeight + " bounds: " + rectB.toString() + " dpi:" + iQ + " fps:" + iA + " pixelAspectRatio: " + ((xqeVar.b & 128) != 0 ? xqeVar.i : 1.0f));
                boolean z = this.u;
                int i2 = this.t;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("disp enabled:");
                sb.append(z);
                sb.append(" disp state:");
                sb.append(i2);
                printWriter.println(sb.toString());
            } else {
                printWriter.println("null config");
            }
        }
        if (defpackage.a.N()) {
            j$.util.Collection.-EL.stream(((defpackage.jcv) this.y).c).forEach(new defpackage.ikd(printWriter, 11));
        }
        this.e.a(printWriter);
    }

    @Override // defpackage.ivi
    public final void n(boolean z) {
        xjy xjyVar = z ? xjy.b : xjy.c;
        ((defpackage.yqj) a.l().ai((char) 1405)).y("Sending critical ui notification with mode %s", xjyVar);
        defpackage.jeu jeuVar = this.f;
        jeuVar.getClass();
        defpackage.abor aborVarN = xjz.a.n();
        aborVarN.t();
        xjz xjzVar = aborVarN.b;
        xjzVar.c = xjyVar.d;
        xjzVar.b |= 1;
        jeuVar.k(32789, aborVarN.q());
    }

    @Override // defpackage.ivi
    public final void o(java.util.List list) {
        defpackage.jeu jeuVar = this.f;
        jeuVar.getClass();
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.gjt(this, 6)).map(new defpackage.ikc(10));
        int i = defpackage.ygw.d;
        java.util.List list2 = (java.util.List) map.collect(defpackage.yds.a);
        defpackage.jeu.a.f().ai(1965).y("sendIntegratedOverlayParametersNotification(overlayParametersOptions=%s)", list2);
        defpackage.abor aborVarN = xla.a.n();
        aborVarN.t();
        xla xlaVar = aborVarN.b;
        defpackage.abpj abpjVar = xlaVar.b;
        if (!abpjVar.c()) {
            xlaVar.b = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(list2, xlaVar.b);
        jeuVar.k(32781, aborVarN.q());
    }

    @Override // defpackage.ivi
    public final void p(xpy xpyVar) {
        defpackage.jeu jeuVar = this.f;
        jeuVar.getClass();
        defpackage.jeu.a.l().ai(1966).y("sendUiConfigRequest(request=%s)", xpyVar);
        jeuVar.k(32785, xpyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.izd
    public final void q() {
        int i = 0;
        this.s.set(false);
        defpackage.ivv ivvVar = this.C;
        synchronized (ivvVar.b) {
            ivvVar.c.add(defpackage.ivt.d);
        }
        try {
            ivvVar.join(3500L);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ivv.a.h()).p(e)).ai((char) 1417)).u("Interrupted while waiting for video focus handler to stop.");
        }
        if (ivvVar.isAlive()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ivv.a.h()).ai((char) 1416)).u("Video focus handler still alive!");
            this.I.aH(defpackage.jfc.c);
        }
        if (!defpackage.a.N()) {
            return;
        }
        defpackage.jfo jfoVar = this.z;
        defpackage.jcw jcwVar = this.y;
        defpackage.abor aborVarN = defpackage.yxz.a.n();
        while (true) {
            defpackage.jcv jcvVar = (defpackage.jcv) jcwVar;
            defpackage.ygw ygwVar = jcvVar.c;
            if (i >= ((defpackage.ymx) ygwVar).c) {
                int i2 = jcvVar.f.d;
                aborVarN.t();
                defpackage.yxz yxzVar = (defpackage.yxz) aborVarN.b;
                yxzVar.b |= 1;
                yxzVar.d = i2;
                defpackage.yxz yxzVar2 = (defpackage.yxz) aborVarN.q();
                defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                aborVarN2.t();
                defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                yxzVar2.getClass();
                yygVar.ah = yxzVar2;
                yygVar.d |= 128;
                ((defpackage.jfp) jfoVar).m(aborVarN2, defpackage.yyh.BUFFER_POOL_EVENT, defpackage.ymx.a);
                return;
            }
            defpackage.yxy yxyVarA = ((defpackage.jcs) ygwVar.get(i)).a();
            aborVarN.t();
            defpackage.yxz yxzVar3 = (defpackage.yxz) aborVarN.b;
            yxyVarA.getClass();
            defpackage.abpj abpjVar = yxzVar3.c;
            if (!abpjVar.c()) {
                yxzVar3.c = defpackage.abox.I(abpjVar);
            }
            yxzVar3.c.add(yxyVarA);
            i++;
        }
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.f = (defpackage.jeu) jbqVar;
    }

    @Override // defpackage.ivi
    public final void s(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.e.x(scheduledExecutorService);
    }

    @Override // defpackage.ivi
    public final void t() {
        this.e.r();
    }

    @Override // defpackage.ivi
    public final void u(int i) {
        ((defpackage.yqj) a.l().ai((char) 1410)).w("updateFrameRate: %d", i);
        if (this.g != null) {
            defpackage.iwy iwyVar = this.g;
            iwyVar.s();
            if (iwyVar.o == i) {
                ((defpackage.yqj) defpackage.iwy.a.l().ai(1488)).K("%s codec already has the frame rate: %d", iwyVar.q(), i);
                return;
            }
            iwyVar.o = i;
            int iX = iwyVar.x();
            ((defpackage.yqj) defpackage.iwy.a.l().ai(1487)).T("Due to frame rate change, updating %s codec with bitrate: %d based on width: %d, height: %d, fps: %d", iwyVar.q(), java.lang.Integer.valueOf(iX), java.lang.Integer.valueOf(iwyVar.r), java.lang.Integer.valueOf(iwyVar.s), java.lang.Integer.valueOf(iwyVar.o));
            iwyVar.A(iX);
        }
    }

    @Override // defpackage.ivi
    public final void v(int i) {
        defpackage.imn imnVar = this.k;
        imnVar.e(i);
        if (this.s.get()) {
            defpackage.ivm ivmVar = this.b;
            ivmVar.sendMessage(ivmVar.obtainMessage(11, imnVar.d()));
        }
    }

    @Override // defpackage.ivi
    public final int w() {
        return this.K;
    }

    @Override // defpackage.ivu
    public final void x(boolean z, boolean z2) {
        ((defpackage.yqj) a.l().ai((char) 1392)).u("doHandleVideoFocusLoss");
        if (z) {
            defpackage.ivm ivmVar = this.b;
            ivmVar.sendMessage(ivmVar.obtainMessage(2, z2 ? 1 : 0, 0));
            try {
                if (!this.w.tryAcquire(15000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    this.I.ax(defpackage.zaj.TIMEOUT, defpackage.zak.DISPLAY_REMOVAL_TIMEOUT, "handling display removal timed-out");
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (this.g != null) {
            this.g.t();
            if (this.g.f) {
                this.I.aH(defpackage.jfc.d);
            }
            this.g = null;
        }
        defpackage.jeu jeuVar = this.f;
        jeuVar.getClass();
        jeuVar.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0.equals(r4) == false) goto L19;
     */
    @Override // defpackage.jet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void y(xpx r14) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivn.y(xpx):void");
    }

    @Override // defpackage.jet
    public final void z(boolean z) {
        this.s.set(false);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1399)).y("Video focus lost. transient=%b", java.lang.Boolean.valueOf(z));
        defpackage.ivt ivtVar = z ? defpackage.ivt.c : defpackage.ivt.b;
        defpackage.ivv ivvVar = this.C;
        synchronized (ivvVar.b) {
            ivvVar.c.add(ivtVar);
        }
    }
}
