package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dah extends defpackage.dzw implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final defpackage.zm a;
    public final defpackage.ngb A;
    public defpackage.bil B;
    private final defpackage.dad F;
    private final defpackage.zf G;
    private final aiyk H;
    private defpackage.zo I;
    private final defpackage.affc J;
    public final defpackage.czz b;
    public int d;
    public int e;
    public edn f;
    public edn g;
    public boolean h;
    public final defpackage.abb i;
    public final defpackage.abb j;
    public int k;
    public java.lang.Integer l;
    public boolean m;
    public defpackage.dae n;
    public final java.lang.String o;
    public final java.lang.String p;
    public boolean q;
    public final java.lang.Runnable r;
    public final java.util.List s;
    public final defpackage.zo t;
    public final defpackage.zo u;
    public final defpackage.zq v;
    public final defpackage.zj w;
    public final defpackage.zj x;
    public final defpackage.zo y;
    public final defpackage.zj z;
    public int c = Integer.MIN_VALUE;
    private final defpackage.affc D = new defpackage.chq(this, 16);
    private final long E = 100;

    static {
        int[] iArr = {2131427352, 2131427353, 2131427364, 2131427375, 2131427378, 2131427379, 2131427380, 2131427381, 2131427382, 2131427383, 2131427354, 2131427355, 2131427356, 2131427357, 2131427358, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427365, 2131427366, 2131427367, 2131427368, 2131427369, 2131427370, 2131427371, 2131427372, 2131427373, 2131427374, 2131427376, 2131427377};
        defpackage.zm zmVar = defpackage.zn.a;
        defpackage.zm zmVar2 = new defpackage.zm(32);
        int i = zmVar2.b;
        if (i < 0) {
            defpackage.ca.aa("");
        }
        zmVar2.c(zmVar2.b + 32);
        int[] iArr2 = zmVar2.a;
        int i2 = zmVar2.b;
        if (i != i2) {
            iArr2.getClass();
            iArr2.getClass();
            java.lang.System.arraycopy(iArr2, i, iArr2, i + 32, i2 - i);
        }
        defpackage.afga.cm(iArr, iArr2, i, 0, 12);
        zmVar2.b += 32;
        a = zmVar2;
    }

    public dah(defpackage.czz czzVar) {
        this.b = czzVar;
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.F = new defpackage.dad(this);
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.t = new defpackage.zo(6);
        this.u = new defpackage.zo(6);
        this.i = new defpackage.abb(null);
        this.j = new defpackage.abb(null);
        this.k = -1;
        this.G = new defpackage.zf(0);
        this.H = defpackage.afqt.q(1, 0, 6);
        this.m = true;
        defpackage.zo zoVar = defpackage.zp.a;
        zoVar.getClass();
        this.I = zoVar;
        this.v = new defpackage.zq(6);
        this.w = new defpackage.zj(6);
        this.x = new defpackage.zj(6);
        this.o = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.p = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A = new defpackage.ngb((char[]) null);
        this.y = new defpackage.zo(6);
        defpackage.dec decVarX = czzVar.W.x();
        zoVar.getClass();
        this.B = new defpackage.bil(decVarX, zoVar);
        int i = defpackage.zk.a;
        this.z = new defpackage.zj(6);
        czzVar.addOnAttachStateChangeListener(this);
        this.r = new java.lang.Runnable() { // from class: dac
            /* JADX WARN: Code duplicated, block: B:101:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:104:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:107:0x02df  */
            /* JADX WARN: Code duplicated, block: B:108:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:111:0x02ea  */
            /* JADX WARN: Code duplicated, block: B:114:0x02f9 A[LOOP:4: B:110:0x02e8->B:114:0x02f9, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:119:0x0309  */
            /* JADX WARN: Code duplicated, block: B:122:0x031d A[LOOP:5: B:117:0x0305->B:122:0x031d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:129:0x034a  */
            /* JADX WARN: Code duplicated, block: B:134:0x0353  */
            /* JADX WARN: Code duplicated, block: B:139:0x037c  */
            /* JADX WARN: Code duplicated, block: B:142:0x039d  */
            /* JADX WARN: Code duplicated, block: B:144:0x03af  */
            /* JADX WARN: Code duplicated, block: B:145:0x03b1  */
            /* JADX WARN: Code duplicated, block: B:150:0x03c1  */
            /* JADX WARN: Code duplicated, block: B:151:0x03db  */
            /* JADX WARN: Code duplicated, block: B:153:0x03fe  */
            /* JADX WARN: Code duplicated, block: B:155:0x0412  */
            /* JADX WARN: Code duplicated, block: B:162:0x0466  */
            /* JADX WARN: Code duplicated, block: B:210:0x0543 A[PHI: r11
  0x0543: PHI (r11v25 char) = (r11v23 char), (r11v23 char), (r11v23 char), (r11v27 char), (r11v27 char), (r11v28 char), (r11v28 char) binds: [B:196:0x0514, B:198:0x0518, B:204:0x052c, B:191:0x050a, B:193:0x0510, B:182:0x04ec, B:184:0x04f2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:212:0x0547  */
            /* JADX WARN: Code duplicated, block: B:235:0x0634  */
            /* JADX WARN: Code duplicated, block: B:352:0x0304 A[EDGE_INSN: B:352:0x0304->B:116:0x0304 BREAK  A[LOOP:4: B:110:0x02e8->B:114:0x02f9], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:353:0x0300 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:354:0x0320 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:355:0x0322 A[EDGE_INSN: B:355:0x0322->B:124:0x0322 BREAK  A[LOOP:5: B:117:0x0305->B:122:0x031d], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:48:0x0125 A[PHI: r40
  0x0125: PHI (r40v18 java.util.ArrayList) = (r9v29 java.util.ArrayList), (r40v19 java.util.ArrayList) binds: [B:45:0x0115, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:50:0x012d  */
            /* JADX WARN: Code duplicated, block: B:52:0x013c  */
            /* JADX WARN: Code duplicated, block: B:54:0x014d  */
            /* JADX WARN: Code duplicated, block: B:56:0x0159  */
            /* JADX WARN: Code duplicated, block: B:57:0x016f  */
            /* JADX WARN: Code duplicated, block: B:59:0x0179  */
            /* JADX WARN: Code duplicated, block: B:60:0x018f  */
            /* JADX WARN: Code duplicated, block: B:62:0x0197  */
            /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
            /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
            /* JADX WARN: Code duplicated, block: B:70:0x01da  */
            /* JADX WARN: Code duplicated, block: B:72:0x01e4  */
            /* JADX WARN: Code duplicated, block: B:77:0x01f9  */
            /* JADX WARN: Code duplicated, block: B:79:0x0219  */
            /* JADX WARN: Code duplicated, block: B:80:0x0228  */
            /* JADX WARN: Code duplicated, block: B:83:0x0239  */
            /* JADX WARN: Code duplicated, block: B:84:0x0248  */
            /* JADX WARN: Code duplicated, block: B:86:0x024b  */
            /* JADX WARN: Code duplicated, block: B:88:0x0250  */
            /* JADX WARN: Code duplicated, block: B:90:0x025c  */
            /* JADX WARN: Code duplicated, block: B:92:0x027c  */
            /* JADX WARN: Code duplicated, block: B:94:0x028a  */
            /* JADX WARN: Code duplicated, block: B:95:0x029c  */
            /* JADX WARN: Code duplicated, block: B:97:0x02ab  */
            /* JADX WARN: Code duplicated, block: B:99:0x02b3  */
            /* JADX WARN: Code restructure failed: missing block: B:184:0x04f2, code lost:
            
                if (defpackage.afga.f(r8, r5) != false) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x0510, code lost:
            
                if (r5.isEmpty() != false) goto L201;
             */
            /* JADX WARN: Not found block with instruction: 0x0338: MOVE (r3v59 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:825) */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 2221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dac.run():void");
            }
        };
        this.s = new java.util.ArrayList();
        this.J = new defpackage.chq(this, 17);
    }

    public static final boolean E(defpackage.ddx ddxVar, float f) {
        if (f >= 0.0f || ((java.lang.Number) ddxVar.a.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((java.lang.Number) ddxVar.a.invoke()).floatValue() < ((java.lang.Number) ddxVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean F(defpackage.ddx ddxVar) {
        defpackage.afer aferVar = ddxVar.a;
        if (((java.lang.Number) aferVar.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((java.lang.Number) aferVar.invoke()).floatValue();
        ((java.lang.Number) ddxVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean G(defpackage.ddx ddxVar) {
        defpackage.afer aferVar = ddxVar.a;
        if (((java.lang.Number) aferVar.invoke()).floatValue() < ((java.lang.Number) ddxVar.b.invoke()).floatValue()) {
            return true;
        }
        ((java.lang.Number) aferVar.invoke()).floatValue();
        return false;
    }

    public static final java.lang.CharSequence K(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (java.lang.Character.isHighSurrogate(charSequence.charAt(99999)) && java.lang.Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        charSequenceSubSequence.getClass();
        return charSequenceSubSequence;
    }

    public static final java.lang.String L(defpackage.dec decVar) {
        defpackage.dfb dfbVar;
        if (decVar == null) {
            return null;
        }
        defpackage.ddz ddzVar = decVar.b;
        defpackage.dej dejVar = defpackage.def.a;
        if (ddzVar.f(dejVar)) {
            return defpackage.dmh.c((java.util.List) ddzVar.c(dejVar), ",", null, null, null, 62);
        }
        defpackage.dej dejVar2 = defpackage.def.H;
        if (ddzVar.f(dejVar2)) {
            dfbVar = (defpackage.dfb) ddzVar.g(dejVar2);
            if (dfbVar == null) {
                return null;
            }
        } else {
            java.util.List list = (java.util.List) ddzVar.g(defpackage.def.D);
            if (list == null || (dfbVar = (defpackage.dfb) defpackage.afga.aB(list)) == null) {
                return null;
            }
        }
        return dfbVar.b;
    }

    private final android.graphics.Rect Q(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L;
        defpackage.czz czzVar = this.b;
        long jL = czzVar.l(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jL2 = czzVar.l((((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jL2 >> 32);
        int i2 = (int) (jL >> 32);
        int i3 = (int) (jL2 & 4294967295L);
        int i4 = (int) (jL & 4294967295L);
        return new android.graphics.Rect((int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i))), (int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i4), java.lang.Float.intBitsToFloat(i3))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i4), java.lang.Float.intBitsToFloat(i3))));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[LOOP:0: B:5:0x0016->B:37:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[EDGE_INSN: B:50:0x0078->B:38:0x0078 BREAK  A[LOOP:0: B:5:0x0016->B:37:0x0075], SYNTHETIC] */
    private final defpackage.cjj R(defpackage.dec decVar, android.graphics.Rect rect, defpackage.cld cldVar) {
        defpackage.cge cgeVarM;
        defpackage.dag dagVar = new defpackage.dag(cldVar);
        defpackage.cxl cxlVar = decVar.a;
        defpackage.cyg cygVar = cxlVar.v;
        java.lang.Object obj = null;
        if ((cygVar.a() & 8) != 0) {
            loop0: for (defpackage.cge cgeVar = cygVar.f; cgeVar != null; cgeVar = cgeVar.u) {
                if ((cgeVar.r & 8) == 0) {
                    if ((cgeVar.s & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    defpackage.cge cgeVarO = cgeVar;
                    defpackage.bzc bzcVar = null;
                    while (cgeVarO != null) {
                        if (cgeVarO instanceof defpackage.czc) {
                            ((defpackage.czc) cgeVarO).g(dagVar);
                            if (dagVar.a) {
                                obj = cgeVarO;
                                break loop0;
                            }
                        } else if ((cgeVarO.r & 8) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                            int i = 0;
                            for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                if ((cgeVar2.r & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cgeVarO = cgeVar2;
                                    } else {
                                        if (bzcVar == null) {
                                            bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                        }
                                        if (cgeVarO != null) {
                                            bzcVar.n(cgeVarO);
                                        }
                                        bzcVar.n(cgeVar2);
                                        cgeVarO = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cgeVarO = defpackage.cjv.o(bzcVar);
                    }
                    if ((cgeVar.s & 8) != 0) {
                        break;
                    }
                }
            }
        }
        defpackage.czc czcVar = (defpackage.czc) obj;
        if (czcVar == null || (cgeVarM = czcVar.M()) == null || !cgeVarM.A) {
            return defpackage.csc.f(cxlVar.q(), false);
        }
        defpackage.ctc ctcVarP = defpackage.cjv.p(czcVar);
        defpackage.cjj cjjVarO = defpackage.csc.g(ctcVarP).o(ctcVarP, false);
        android.graphics.Rect rectQ = Q(cjjVarO.b, cjjVarO.c, cjjVarO.d, cjjVarO.e);
        float f = rectQ.left - rect.left;
        float f2 = rectQ.top - rect.top;
        return new defpackage.cjj(f, f2, rectQ.width() + f, rectQ.height() + f2);
    }

    private final defpackage.cku S(defpackage.cld cldVar, long j, defpackage.dlz dlzVar) {
        return cldVar.a(j, dlzVar, this.b.r());
    }

    private final boolean T() {
        defpackage.dbi dbiVarP = this.b.P();
        return dbiVarP.b && ((android.view.accessibility.AccessibilityManager) dbiVarP.t.a).isEnabled();
    }

    private static final android.graphics.Rect U(defpackage.cjj cjjVar, float f, float f2) {
        float f3 = cjjVar.e + f2;
        float f4 = cjjVar.d + f;
        return new android.graphics.Rect((int) (cjjVar.b + f), (int) (cjjVar.c + f2), (int) f4, (int) f3);
    }

    private static final float[] V(defpackage.cku ckuVar) {
        if (!(ckuVar instanceof defpackage.ckt)) {
            return null;
        }
        defpackage.cjk cjkVar = ((defpackage.ckt) ckuVar).a;
        long j = cjkVar.e;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cjkVar.f;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cjkVar.g;
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cjkVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j4))};
    }

    private static final android.graphics.Rect W(defpackage.cku ckuVar, float f, float f2) {
        if ((ckuVar instanceof defpackage.cks) || (ckuVar instanceof defpackage.ckt)) {
            return U(ckuVar.a(), f, f2);
        }
        return null;
    }

    private static final android.graphics.Region X(defpackage.cku ckuVar, float f, float f2) {
        if (!(ckuVar instanceof defpackage.ckr)) {
            return null;
        }
        defpackage.ckr ckrVar = (defpackage.ckr) ckuVar;
        android.graphics.Region region = new android.graphics.Region(U(ckrVar.a().e(f, f2), 0.0f, 0.0f));
        android.graphics.Region region2 = new android.graphics.Region();
        android.graphics.Path path = ckrVar.a.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static final float j(float f, float f2) {
        if (java.lang.Math.signum(f) == java.lang.Math.signum(f2)) {
            return java.lang.Math.abs(f) < java.lang.Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public final boolean A(int i) {
        return this.d == i;
    }

    public final boolean B() {
        if (!T()) {
            return false;
        }
        defpackage.dbi dbiVarP = this.b.P();
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = dbiVarP.d;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = ((android.view.accessibility.AccessibilityManager) dbiVarP.t.a).getEnabledAccessibilityServiceList(-1);
            dbiVarP.d = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean C() {
        java.lang.Object obj = this.b.P().t.a;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return axd$.ExternalSyntheticApiModelOutline0.m((android.view.accessibility.AccessibilityManager) obj);
        }
        return true;
    }

    public final boolean D() {
        return T() && this.b.P().c;
    }

    public final boolean H(defpackage.dec decVar, int i, int i2, boolean z) {
        java.lang.String strL;
        defpackage.ddz ddzVar = decVar.b;
        defpackage.dej dejVar = defpackage.ddy.j;
        if (ddzVar.f(dejVar) && defpackage.daw.e(decVar)) {
            return ((java.lang.Boolean) ((defpackage.affh) ((defpackage.ddn) ddzVar.c(dejVar)).b).invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.k) || (strL = L(decVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strL.length()) {
            i = -1;
        }
        this.k = i;
        boolean z2 = strL.length() > 0;
        int i3 = decVar.c;
        J(p(m(i3), z2 ? java.lang.Integer.valueOf(this.k) : null, z2 ? java.lang.Integer.valueOf(this.k) : null, z2 ? java.lang.Integer.valueOf(strL.length()) : null, strL));
        x(i3);
        return true;
    }

    public final void I(int i, int i2, java.lang.Integer num, java.util.List list) {
        if (i == Integer.MIN_VALUE || !B()) {
            return;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(defpackage.dmh.c(list, ",", null, null, null, 62));
        }
        J(accessibilityEventO);
    }

    public final void J(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (B()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.h = true;
            }
            try {
                ((java.lang.Boolean) this.D.invoke(accessibilityEvent)).booleanValue();
            } finally {
                this.h = false;
            }
        }
    }

    public final android.graphics.Rect M(defpackage.hio hioVar) {
        defpackage.dlx dlxVar = (defpackage.dlx) hioVar.c;
        int i = dlxVar.e;
        return Q(dlxVar.b, dlxVar.c, dlxVar.d, i);
    }

    public final void N(defpackage.hio hioVar, edn ednVar, boolean z, int i) {
        defpackage.dmm dmmVar;
        java.lang.Object obj = hioVar.b;
        defpackage.czz czzVar = this.b;
        defpackage.dau dauVarO = czzVar.O();
        if (dauVarO != null) {
            dmmVar = (defpackage.dmm) dauVarO.b.get(((defpackage.dec) obj).a);
        } else {
            dmmVar = null;
        }
        if (dmmVar != null) {
            ednVar.a.addChild(dmmVar);
        } else {
            defpackage.dec decVar = (defpackage.dec) obj;
            boolean zF = defpackage.afga.f(decVar.g().g(defpackage.def.o), java.lang.Boolean.TRUE);
            if (z || !zF) {
                ednVar.i(czzVar, decVar.c);
            }
        }
        this.z.c(((defpackage.dec) obj).c, i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[LOOP:1: B:15:0x0052->B:29:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[EDGE_INSN: B:45:0x0094->B:30:0x0094 BREAK  A[LOOP:1: B:15:0x0052->B:29:0x0091], SYNTHETIC] */
    public final void O(defpackage.dec decVar, defpackage.bil bilVar) {
        int[] iArr = defpackage.zr.a;
        defpackage.zq zqVar = new defpackage.zq(6);
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            defpackage.dec decVar2 = (defpackage.dec) listK.get(i);
            defpackage.zo zoVarQ = q();
            int i2 = decVar2.c;
            if (zoVarQ.b(i2)) {
                if (!((defpackage.zq) bilVar.b).a(i2)) {
                    u(decVar.a);
                    return;
                }
                zqVar.d(i2);
            }
        }
        defpackage.zq zqVar2 = (defpackage.zq) bilVar.b;
        int[] iArr2 = zqVar2.b;
        long[] jArr = zqVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 == 8) {
                                break;
                            } else {
                                break;
                            }
                        } else if ((j & 255) < 128 && !zqVar.a(iArr2[(i3 << 3) + i5])) {
                            u(decVar.a);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                    if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        java.util.List listK2 = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        int size2 = listK2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            defpackage.dec decVar3 = (defpackage.dec) listK2.get(i7);
            defpackage.zo zoVar = this.y;
            int i8 = decVar3.c;
            defpackage.bil bilVar2 = (defpackage.bil) zoVar.a(i8);
            if (bilVar2 != null && q().b(i8)) {
                O(decVar3, bilVar2);
            }
        }
    }

    @Override // defpackage.dzw
    public final defpackage.edq a(android.view.View view) {
        return this.F;
    }

    public final int k(defpackage.dec decVar) {
        defpackage.ddz ddzVar = decVar.b;
        if (!ddzVar.f(defpackage.def.a)) {
            defpackage.dej dejVar = defpackage.def.I;
            if (ddzVar.f(dejVar)) {
                return (int) (((defpackage.dgc) ddzVar.c(dejVar)).b & 4294967295L);
            }
        }
        return this.k;
    }

    public final int l(defpackage.dec decVar) {
        defpackage.ddz ddzVar = decVar.b;
        if (!ddzVar.f(defpackage.def.a)) {
            defpackage.dej dejVar = defpackage.def.I;
            if (ddzVar.f(dejVar)) {
                return (int) (((defpackage.dgc) ddzVar.c(dejVar)).b >> 32);
            }
        }
        return this.k;
    }

    public final int m(int i) {
        if (i == this.b.W.x().c) {
            return -1;
        }
        return i;
    }

    public final android.os.Handler n() {
        return this.b.getHandler();
    }

    public final android.view.accessibility.AccessibilityEvent o(int i, int i2) {
        defpackage.hio hioVar;
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        defpackage.czz czzVar = this.b;
        accessibilityEventObtain.setPackageName(czzVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(czzVar, i);
        if (B() && (hioVar = (defpackage.hio) q().a(i)) != null) {
            defpackage.ddz ddzVar = ((defpackage.dec) hioVar.b).b;
            accessibilityEventObtain.setPassword(ddzVar.f(defpackage.def.O));
            boolean zF = defpackage.afga.f(ddzVar.g(defpackage.def.o), java.lang.Boolean.TRUE);
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                axd$.ExternalSyntheticApiModelOutline0.m(accessibilityEventObtain, zF);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handlerN = n();
        if (handlerN != null) {
            handlerN.removeCallbacks(this.r);
        }
    }

    public final android.view.accessibility.AccessibilityEvent p(int i, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.CharSequence charSequence) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final defpackage.zo q() {
        if (this.m) {
            this.m = false;
            defpackage.czz czzVar = this.b;
            this.I = defpackage.ded.c(czzVar.W, new defpackage.cmr(12));
            if (B()) {
                defpackage.zo zoVar = this.I;
                defpackage.zj zjVar = this.w;
                defpackage.zj zjVar2 = this.x;
                android.content.res.Resources resources = czzVar.getContext().getResources();
                zjVar.b();
                zjVar2.b();
                defpackage.hio hioVar = (defpackage.hio) zoVar.a(-1);
                byte[] bArr = null;
                java.lang.Object obj = hioVar != null ? hioVar.b : null;
                obj.getClass();
                defpackage.chs chsVar = new defpackage.chs(zoVar, 17);
                defpackage.bpn bpnVar = new defpackage.bpn(resources, zoVar, 4, bArr);
                java.util.List listSingletonList = java.util.Collections.singletonList(obj);
                listSingletonList.getClass();
                java.util.List listA = defpackage.del.a((defpackage.dec) obj, chsVar, bpnVar, listSingletonList);
                int size = listA.size() - 1;
                if (size > 0) {
                    int i = 1;
                    while (true) {
                        int i2 = ((defpackage.dec) listA.get(i - 1)).c;
                        int i3 = ((defpackage.dec) listA.get(i)).c;
                        zjVar.c(i2, i3);
                        zjVar2.c(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.I;
    }

    public final edn r() {
        if (T()) {
            return null;
        }
        return edn.b();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00b4 A[EDGE_INSN: B:117:0x00b4->B:49:0x00b4 BREAK  A[LOOP:2: B:44:0x00a4->B:47:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b A[Catch: all -> 0x01ad, PHI: r2 r5 r14
  0x005b: PHI (r2v2 aixy) = (r2v3 aixy), (r2v4 aixy) binds: [B:23:0x0057, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r5v1 zq) = (r5v2 zq), (r5v3 zq) binds: [B:23:0x0057, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r14v5 java.lang.Object) = (r14v16 java.lang.Object), (r14v1 java.lang.Object) binds: [B:23:0x0057, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x01ad, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005b, B:27:0x0063, B:88:0x0172, B:91:0x017c, B:92:0x0183, B:97:0x01a4, B:18:0x003a, B:21:0x0041, B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:105:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #1 {all -> 0x01ad, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005b, B:27:0x0063, B:88:0x0172, B:91:0x017c, B:92:0x0183, B:97:0x01a4, B:18:0x003a, B:21:0x0041, B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:105:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae A[Catch: all -> 0x01a3, LOOP:2: B:44:0x00a4->B:47:0x00ae, LOOP_END, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0126 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0148 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:103:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01a0 -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(defpackage.afdk r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dah.s(afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0335  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:165:0x0400  */
    /* JADX WARN: Code duplicated, block: B:167:0x0403  */
    /* JADX WARN: Code duplicated, block: B:169:0x0409  */
    /* JADX WARN: Code duplicated, block: B:170:0x0419  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    public final void t(int i, edn ednVar, java.lang.String str, android.os.Bundle bundle) {
        java.lang.Object obj;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        defpackage.ckg ckgVar;
        defpackage.ckd ckdVar;
        java.lang.Integer numValueOf3;
        long j;
        defpackage.dfb dfbVar;
        java.lang.Object obj2;
        defpackage.dft dftVar;
        android.graphics.RectF[] rectFArr;
        defpackage.hio hioVar = (defpackage.hio) q().a(i);
        if (hioVar == null || (obj = hioVar.b) == null) {
            return;
        }
        java.lang.String str2 = this.o;
        defpackage.dec decVar = (defpackage.dec) obj;
        java.lang.String strL = L(decVar);
        if (defpackage.afga.f(str, str2)) {
            int iD = this.w.d(i);
            if (iD != -1) {
                ednVar.a().putInt(str, iD);
                return;
            }
            return;
        }
        if (defpackage.afga.f(str, this.p)) {
            int iD2 = this.x.d(i);
            if (iD2 != -1) {
                ednVar.a().putInt(str, iD2);
                return;
            }
            return;
        }
        defpackage.ddz ddzVar = decVar.b;
        int i2 = 0;
        if (ddzVar.f(defpackage.ddy.a) && bundle != null && defpackage.afga.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strL != null ? strL.length() : Integer.MAX_VALUE)) {
                    defpackage.dga dgaVarD = defpackage.dbc.d(ddzVar);
                    if (dgaVarD == null) {
                        rectFArr = null;
                    } else {
                        defpackage.cyl cylVarP = decVar.a.p();
                        if (true != cylVarP.t()) {
                            cylVarP = null;
                        }
                        if (cylVarP != null) {
                            long j2 = cylVarP.j(0L);
                            defpackage.cjj cjjVarB = decVar.b();
                            android.graphics.RectF[] rectFArr2 = new android.graphics.RectF[i4];
                            while (i2 < i4) {
                                int i5 = i3 + i2;
                                if (i5 < dgaVarD.a.a.a()) {
                                    defpackage.cjj cjjVarF = dgaVarD.l(i5).f(j2);
                                    defpackage.cjj cjjVarD = cjjVarF.i(cjjVarB) ? cjjVarF.d(cjjVarB) : null;
                                    if (cjjVarD != null) {
                                        defpackage.czz czzVar = this.b;
                                        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(cjjVarD.b);
                                        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(cjjVarD.c);
                                        float f = cjjVarD.d;
                                        long jL = czzVar.l((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32));
                                        long jL2 = czzVar.l((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cjjVarD.e)) & 4294967295L));
                                        int i6 = (int) (jL2 >> 32);
                                        int i7 = (int) (jL >> 32);
                                        int i8 = (int) (jL2 & 4294967295L);
                                        int i9 = (int) (jL & 4294967295L);
                                        rectFArr2[i2] = new android.graphics.RectF(java.lang.Math.min(java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i6)), java.lang.Math.min(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i8)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i6)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i8)));
                                    }
                                }
                                i2++;
                                i4 = i4;
                                i3 = i3;
                                cjjVarB = cjjVarB;
                                j2 = j2;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr != null) {
                        ednVar.a().putParcelableArray(str, rectFArr);
                        return;
                    }
                    return;
                }
            }
            android.util.Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        defpackage.dej dejVar = defpackage.def.B;
        if (ddzVar.f(dejVar) && bundle != null && defpackage.afga.f(str, "androidx.compose.ui.semantics.testTag")) {
            java.lang.String str3 = (java.lang.String) ddzVar.g(dejVar);
            if (str3 != null) {
                ednVar.a().putCharSequence(str, str3);
                return;
            }
            return;
        }
        if (defpackage.afga.f(str, "androidx.compose.ui.semantics.id")) {
            ednVar.a().putInt(str, decVar.c);
            return;
        }
        if (defpackage.afga.f(str, "androidx.compose.ui.semantics.shapeType")) {
            defpackage.cld cldVar = (defpackage.cld) ddzVar.g(defpackage.def.U);
            if (cldVar != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                ednVar.k(rect);
                defpackage.cjj cjjVarR = R(decVar, rect, cldVar);
                defpackage.cku ckuVarS = S(cldVar, cjjVarR.b(), decVar.a.s);
                if (ckuVarS instanceof defpackage.cks) {
                    ednVar.a().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    ednVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", W(ckuVarS, cjjVarR.b, cjjVarR.c));
                    return;
                } else if (ckuVarS instanceof defpackage.ckt) {
                    ednVar.a().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    ednVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", W(ckuVarS, cjjVarR.b, cjjVarR.c));
                    ednVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", V(ckuVarS));
                    return;
                } else {
                    if (!(ckuVarS instanceof defpackage.ckr)) {
                        throw new defpackage.afas();
                    }
                    ednVar.a().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    ednVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", X(ckuVarS, cjjVarR.b, cjjVarR.c));
                    return;
                }
            }
            return;
        }
        if (defpackage.afga.f(str, "androidx.compose.ui.semantics.shapeRect")) {
            defpackage.cld cldVar2 = (defpackage.cld) ddzVar.g(defpackage.def.U);
            if (cldVar2 != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                ednVar.k(rect2);
                defpackage.cjj cjjVarR2 = R(decVar, rect2, cldVar2);
                android.graphics.Rect rectW = W(S(cldVar2, cjjVarR2.b(), decVar.a.s), cjjVarR2.b, cjjVarR2.c);
                if (rectW != null) {
                    ednVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", rectW);
                    return;
                }
                return;
            }
            return;
        }
        if (defpackage.afga.f(str, "androidx.compose.ui.semantics.shapeCorners")) {
            defpackage.cld cldVar3 = (defpackage.cld) ddzVar.g(defpackage.def.U);
            if (cldVar3 != null) {
                android.graphics.Rect rect3 = new android.graphics.Rect();
                ednVar.k(rect3);
                float[] fArrV = V(S(cldVar3, R(decVar, rect3, cldVar3).b(), decVar.a.s));
                if (fArrV != null) {
                    ednVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrV);
                    return;
                }
                return;
            }
            return;
        }
        if (defpackage.afga.f(str, "androidx.compose.ui.semantics.shapeRegion")) {
            defpackage.cld cldVar4 = (defpackage.cld) ddzVar.g(defpackage.def.U);
            if (cldVar4 != null) {
                android.graphics.Rect rect4 = new android.graphics.Rect();
                ednVar.k(rect4);
                defpackage.cjj cjjVarR3 = R(decVar, rect4, cldVar4);
                android.graphics.Region regionX = X(S(cldVar4, cjjVarR3.b(), decVar.a.s), cjjVarR3.b, cjjVarR3.c);
                if (regionX != null) {
                    ednVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionX);
                    return;
                }
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 37 || !defpackage.afga.f(str, "android.view.accessibility.extra.DATA_RENDERING_INFO_KEY")) {
            return;
        }
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ednVar.a;
        defpackage.cyu cyuVar = decVar.a.k;
        if (true != (cyuVar instanceof defpackage.czz)) {
            cyuVar = null;
        }
        if (cyuVar != null) {
            android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder builder = new android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder();
            defpackage.dga dgaVarD2 = defpackage.dbc.d(ddzVar);
            if (dgaVarD2 != null) {
                long jF = dgaVarD2.a.b.f();
                if (jF != 16) {
                    float[] fArr = defpackage.clr.a;
                    numValueOf = java.lang.Integer.valueOf((int) (defpackage.ckd.e(jF, defpackage.clr.e) >>> 32));
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                dac$.ExternalSyntheticApiModelOutline0.m(builder, numValueOf.intValue());
            }
            java.util.List list = (java.util.List) ddzVar.g(defpackage.def.D);
            if (list == null || (dfbVar = (defpackage.dfb) defpackage.afga.aB(list)) == null) {
                numValueOf2 = null;
            } else {
                java.util.List listG = dfbVar.g(dfbVar.a());
                java.util.ArrayList arrayList = new java.util.ArrayList(listG.size());
                int size = listG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    defpackage.dgb dgbVarA = ((defpackage.dfg) ((defpackage.dfa) listG.get(i10)).a).a();
                    defpackage.ckd ckdVar2 = (dgbVarA == null || (dftVar = dgbVarA.a) == null) ? null : new defpackage.ckd(dftVar.b());
                    if (ckdVar2 != null) {
                        arrayList.add(ckdVar2);
                    }
                }
                int size2 = arrayList.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i2);
                    if (((defpackage.ckd) obj2).a != 16) {
                        break;
                    } else {
                        i2++;
                    }
                }
                defpackage.ckd ckdVar3 = (defpackage.ckd) obj2;
                if (ckdVar3 != null) {
                    float[] fArr2 = defpackage.clr.a;
                    numValueOf2 = java.lang.Integer.valueOf((int) (defpackage.ckd.e(ckdVar3.a, defpackage.clr.e) >>> 32));
                } else {
                    numValueOf2 = null;
                }
            }
            if (numValueOf2 != null) {
                dac$.ExternalSyntheticApiModelOutline0.m$1(builder, numValueOf2.intValue());
            }
            defpackage.dga dgaVarD3 = defpackage.dbc.d(ddzVar);
            if (dgaVarD3 != null) {
                long jE = dgaVarD3.a.b.e();
                if (jE != 16) {
                    float[] fArr3 = defpackage.clr.a;
                    numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.ckd.e(jE, defpackage.clr.e) >>> 32));
                } else {
                    ckgVar = (defpackage.ckg) ddzVar.g(defpackage.def.T);
                    if (ckgVar != null) {
                        ckdVar = new defpackage.ckd(ckgVar.a());
                    } else {
                        ckdVar = null;
                    }
                    if (ckdVar != null) {
                        j = ckdVar.a;
                        if (j != 16) {
                            float[] fArr4 = defpackage.clr.a;
                            numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
                        } else {
                            numValueOf3 = null;
                        }
                    } else {
                        numValueOf3 = null;
                    }
                }
            } else {
                ckgVar = (defpackage.ckg) ddzVar.g(defpackage.def.T);
                if (ckgVar != null) {
                    ckdVar = new defpackage.ckd(ckgVar.a());
                } else {
                    ckdVar = null;
                }
                if (ckdVar != null) {
                    j = ckdVar.a;
                    if (j != 16) {
                        float[] fArr5 = defpackage.clr.a;
                        numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
                    } else {
                        numValueOf3 = null;
                    }
                } else {
                    numValueOf3 = null;
                }
            }
            if (numValueOf3 != null) {
                dac$.ExternalSyntheticApiModelOutline0.m$2(builder, numValueOf3.intValue());
            }
            dac$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, dac$.ExternalSyntheticApiModelOutline0.m(builder));
        }
    }

    public final void u(defpackage.cxl cxlVar) {
        if (this.G.add(cxlVar)) {
            this.H.j(defpackage.afbk.a);
        }
    }

    public final void v(dcg dcgVar) {
        if (dcgVar.w()) {
            defpackage.czz czzVar = this.b;
            ((defpackage.cez) czzVar.w.a).b(dcgVar, this.J, new defpackage.bso(dcgVar, this, 8));
        }
    }

    public final void w(int i, int i2, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(m(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        J(accessibilityEventO);
    }

    public final void x(int i) {
        defpackage.dae daeVar = this.n;
        if (daeVar != null) {
            defpackage.dec decVar = daeVar.a;
            int i2 = decVar.c;
            if (i != i2) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - daeVar.f <= 1000) {
                android.view.accessibility.AccessibilityEvent accessibilityEventO = o(m(i2), 131072);
                accessibilityEventO.setFromIndex(daeVar.d);
                accessibilityEventO.setToIndex(daeVar.e);
                accessibilityEventO.setAction(daeVar.b);
                accessibilityEventO.setMovementGranularity(daeVar.c);
                accessibilityEventO.getText().add(L(decVar));
                J(accessibilityEventO);
            }
        }
        this.n = null;
    }

    public final void y(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        I(i, 128, null, null);
        I(i2, 256, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    public final boolean z(boolean z, int i, long j) {
        int i2;
        int i3;
        int i4;
        defpackage.ddx ddxVar;
        int i5 = 0;
        if (!defpackage.afga.f(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            return false;
        }
        defpackage.zo zoVarQ = q();
        if (j != 9205357640488583168L && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            defpackage.dej dejVar = z ? defpackage.def.x : defpackage.def.w;
            java.lang.Object[] objArr = zoVarQ.c;
            long[] jArr = zoVarQ.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                long j2 = jArr[i6];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i6 - length;
                    int i8 = i5;
                    while (true) {
                        i3 = 8 - ((~i7) >>> 31);
                        if (i8 >= i3) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            defpackage.hio hioVar = (defpackage.hio) objArr[(i6 << 3) + i8];
                            i4 = i5;
                            if (defpackage.dlv.g((defpackage.dlx) hioVar.c).g(j) && (ddxVar = (defpackage.ddx) ((defpackage.dec) hioVar.b).b.g(dejVar)) != null) {
                                if (i < 0) {
                                    if (((java.lang.Number) ddxVar.a.invoke()).floatValue() > 0.0f) {
                                        z2 = true;
                                    }
                                } else if (((java.lang.Number) ddxVar.a.invoke()).floatValue() < ((java.lang.Number) ddxVar.b.invoke()).floatValue()) {
                                    z2 = true;
                                }
                            }
                        } else {
                            i4 = i5;
                        }
                        j2 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    i2 = i5;
                    if (i3 != 8) {
                        return z2;
                    }
                } else {
                    i2 = i5;
                }
                if (i6 == length) {
                    return z2;
                }
                i6++;
                i5 = i2;
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
