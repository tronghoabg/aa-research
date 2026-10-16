package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgx implements android.view.View.OnAttachStateChangeListener, defpackage.epl {
    public static final /* synthetic */ int h = 0;
    public final defpackage.czz a;
    public boolean c;
    public final java.lang.Runnable d;
    public final defpackage.zo e;
    public defpackage.bil g;
    private final defpackage.afer i;
    private defpackage.zo l;
    private long m;
    private defpackage.bil n;
    private final java.util.List j = new java.util.ArrayList();
    public int f = 1;
    public boolean b = true;
    private final aiyk k = defpackage.afqt.q(1, 0, 6);

    public cgx(defpackage.czz czzVar, defpackage.afer aferVar) {
        this.a = czzVar;
        this.i = aferVar;
        new android.os.Handler(android.os.Looper.getMainLooper());
        defpackage.zo zoVar = defpackage.zp.a;
        zoVar.getClass();
        this.l = zoVar;
        this.e = new defpackage.zo(6);
        defpackage.dec decVarX = czzVar.W.x();
        zoVar.getClass();
        this.g = new defpackage.bil(decVarX, zoVar);
        this.d = new java.lang.Runnable() { // from class: cgv
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                long j;
                long j2;
                long j3;
                long j4;
                defpackage.zo zoVar2;
                int[] iArr;
                long[] jArr;
                defpackage.zo zoVar3;
                int[] iArr2;
                long j5;
                int i;
                int i2;
                long[] jArr2;
                long j6;
                char c2;
                long j7;
                defpackage.cgx cgxVar = this.a;
                if (cgxVar.n()) {
                    defpackage.czz czzVar2 = cgxVar.a;
                    if (czzVar2.isAttachedToWindow()) {
                        czzVar2.v(true);
                        defpackage.zo zoVar4 = cgxVar.e;
                        int[] iArr3 = zoVar4.b;
                        long[] jArr3 = zoVar4.a;
                        int length = jArr3.length - 2;
                        char c3 = 7;
                        long j8 = -9187201950435737472L;
                        int i3 = 8;
                        if (length >= 0) {
                            int i4 = 0;
                            j2 = 128;
                            while (true) {
                                long j9 = jArr3[i4];
                                j3 = 255;
                                if ((((~j9) << c3) & j9 & j8) != j8) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((j9 & 255) < 128) {
                                            c2 = c3;
                                            int i7 = iArr3[(i4 << 3) + i6];
                                            j7 = j8;
                                            if (!cgxVar.h().b(i7)) {
                                                cgxVar.j(i7);
                                                cgxVar.k();
                                            }
                                        } else {
                                            c2 = c3;
                                            j7 = j8;
                                        }
                                        j9 >>= 8;
                                        i6++;
                                        c3 = c2;
                                        j8 = j7;
                                    }
                                    c = c3;
                                    j = j8;
                                    if (i5 != 8) {
                                        break;
                                    }
                                } else {
                                    c = c3;
                                    j = j8;
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                                c3 = c;
                                j8 = j;
                            }
                        } else {
                            c = 7;
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        cgxVar.o(czzVar2.W.x(), cgxVar.g);
                        defpackage.zo zoVarH = cgxVar.h();
                        int[] iArr4 = zoVarH.b;
                        long[] jArr4 = zoVarH.a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j10 = jArr4[i8];
                                if ((((~j10) << c) & j10 & j) != j) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((j10 & j3) < j2) {
                                            int i11 = iArr4[(i8 << 3) + i10];
                                            defpackage.bil bilVar = (defpackage.bil) cgxVar.e.a(i11);
                                            defpackage.hio hioVar = (defpackage.hio) zoVarH.a(i11);
                                            java.lang.Object obj = hioVar != null ? hioVar.b : null;
                                            if (obj == null) {
                                                defpackage.csc.a("no value for specified key");
                                                throw new defpackage.afap();
                                            }
                                            if (bilVar != null) {
                                                zoVar3 = zoVarH;
                                                iArr2 = iArr4;
                                                j10 = j10;
                                                j5 = j2;
                                                defpackage.ddz ddzVar = ((defpackage.dec) obj).b;
                                                defpackage.aau aauVar = ddzVar.c;
                                                java.lang.Object[] objArr = aauVar.b;
                                                long[] jArr5 = aauVar.a;
                                                int length3 = jArr5.length - 2;
                                                if (length3 >= 0) {
                                                    int i12 = 0;
                                                    while (true) {
                                                        long j11 = jArr5[i12];
                                                        long[] jArr6 = jArr5;
                                                        java.lang.Object[] objArr2 = objArr;
                                                        if ((((~j11) << c) & j11 & j) != j) {
                                                            int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                                            int i14 = 0;
                                                            while (i14 < i13) {
                                                                if ((j11 & j3) < j5) {
                                                                    i2 = i14;
                                                                    defpackage.dej dejVar = (defpackage.dej) objArr2[(i12 << 3) + i14];
                                                                    jArr2 = jArr4;
                                                                    defpackage.dej dejVar2 = defpackage.def.D;
                                                                    if (defpackage.afga.f(dejVar, dejVar2)) {
                                                                        java.util.List list = (java.util.List) ((defpackage.ddz) bilVar.a).g(dejVar2);
                                                                        defpackage.dfb dfbVar = list != null ? (defpackage.dfb) defpackage.afga.aB(list) : null;
                                                                        java.util.List list2 = (java.util.List) ddzVar.g(dejVar2);
                                                                        defpackage.dfb dfbVar2 = list2 != null ? (defpackage.dfb) defpackage.afga.aB(list2) : null;
                                                                        if (!defpackage.afga.f(dfbVar, dfbVar2)) {
                                                                            cgxVar.l(((defpackage.dec) obj).c, java.lang.String.valueOf(dfbVar2));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i2 = i14;
                                                                    jArr2 = jArr4;
                                                                }
                                                                j11 >>= 8;
                                                                i14 = i2 + 1;
                                                                jArr4 = jArr2;
                                                            }
                                                            jArr4 = jArr4;
                                                            if (i13 != 8) {
                                                                i = 8;
                                                                break;
                                                            }
                                                        } else {
                                                            jArr4 = jArr4;
                                                        }
                                                        if (i12 != length3) {
                                                            i12++;
                                                            objArr = objArr2;
                                                            jArr5 = jArr6;
                                                            jArr4 = jArr4;
                                                        }
                                                    }
                                                } else {
                                                    jArr4 = jArr4;
                                                }
                                                i = 8;
                                                break;
                                                break;
                                            } else {
                                                defpackage.ddz ddzVar2 = ((defpackage.dec) obj).b;
                                                defpackage.aau aauVar2 = ddzVar2.c;
                                                j5 = j2;
                                                java.lang.Object[] objArr3 = aauVar2.b;
                                                long[] jArr7 = aauVar2.a;
                                                int length4 = jArr7.length - 2;
                                                zoVar3 = zoVarH;
                                                iArr2 = iArr4;
                                                if (length4 >= 0) {
                                                    int i15 = i3;
                                                    int i16 = 0;
                                                    while (true) {
                                                        long j12 = jArr7[i16];
                                                        j10 = j10;
                                                        if ((((~j12) << c) & j12 & j) != j) {
                                                            int i17 = 8 - ((~(i16 - length4)) >>> 31);
                                                            for (int i18 = 0; i18 < i17; i18++) {
                                                                if ((j12 & j3) < j5) {
                                                                    j6 = j12;
                                                                    defpackage.dej dejVar3 = (defpackage.dej) objArr3[(i16 << 3) + i18];
                                                                    defpackage.dej dejVar4 = defpackage.def.D;
                                                                    if (defpackage.afga.f(dejVar3, dejVar4)) {
                                                                        java.util.List list3 = (java.util.List) ddzVar2.g(dejVar4);
                                                                        cgxVar.l(((defpackage.dec) obj).c, java.lang.String.valueOf(list3 != null ? (defpackage.dfb) defpackage.afga.aB(list3) : null));
                                                                    }
                                                                } else {
                                                                    j6 = j12;
                                                                }
                                                                j12 = j6 >> i15;
                                                            }
                                                            i = i15;
                                                            if (i17 != i) {
                                                                jArr4 = jArr4;
                                                            }
                                                        }
                                                        if (i16 == length4) {
                                                            jArr4 = jArr4;
                                                            i = 8;
                                                            break;
                                                        } else {
                                                            i16++;
                                                            j10 = j10;
                                                            i15 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            j10 >>= i;
                                            i10++;
                                            i3 = i;
                                            j2 = j5;
                                            zoVarH = zoVar3;
                                            iArr4 = iArr2;
                                            jArr4 = jArr4;
                                        } else {
                                            zoVar3 = zoVarH;
                                            iArr2 = iArr4;
                                            j5 = j2;
                                        }
                                        i = i3;
                                        j10 >>= i;
                                        i10++;
                                        i3 = i;
                                        j2 = j5;
                                        zoVarH = zoVar3;
                                        iArr4 = iArr2;
                                        jArr4 = jArr4;
                                    }
                                    zoVar2 = zoVarH;
                                    iArr = iArr4;
                                    jArr = jArr4;
                                    j4 = j2;
                                    if (i9 != i3) {
                                        break;
                                    }
                                } else {
                                    zoVar2 = zoVarH;
                                    iArr = iArr4;
                                    jArr = jArr4;
                                    j4 = j2;
                                }
                                if (i8 == length2) {
                                    break;
                                }
                                i8++;
                                j2 = j4;
                                zoVarH = zoVar2;
                                iArr4 = iArr;
                                jArr4 = jArr;
                                i3 = 8;
                            }
                        } else {
                            j4 = j2;
                        }
                        defpackage.zo zoVar5 = cgxVar.e;
                        zoVar5.f();
                        defpackage.zo zoVarH2 = cgxVar.h();
                        int[] iArr5 = zoVarH2.b;
                        java.lang.Object[] objArr4 = zoVarH2.c;
                        long[] jArr8 = zoVarH2.a;
                        int length5 = jArr8.length - 2;
                        if (length5 >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j13 = jArr8[i19];
                                if ((((~j13) << c) & j13 & j) != j) {
                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                    for (int i21 = 0; i21 < i20; i21++) {
                                        if ((j13 & j3) < j4) {
                                            int i22 = (i19 << 3) + i21;
                                            zoVar5.g(iArr5[i22], new defpackage.bil((defpackage.dec) ((defpackage.hio) objArr4[i22]).b, cgxVar.h()));
                                        }
                                        j13 >>= 8;
                                    }
                                    if (i20 != 8) {
                                        break;
                                    }
                                }
                                if (i19 == length5) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        cgxVar.g = new defpackage.bil(cgxVar.a.W.x(), cgxVar.h());
                    }
                    cgxVar.c = false;
                }
            }
        };
    }

    private final void p(defpackage.dec decVar, defpackage.affg affgVar) {
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = listK.get(i2);
            if (h().b(((defpackage.dec) obj).c)) {
                affgVar.invoke(java.lang.Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void q() {
        defpackage.bil bilVar = this.n;
        if (bilVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
            java.util.List list = this.j;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cgy cgyVar = (cgy) list.get(i);
                if (cgyVar.b - 1 != 0) {
                    android.view.autofill.AutofillId autofillIdK = bilVar.k(cgyVar.a);
                    if (autofillIdK != null && android.os.Build.VERSION.SDK_INT >= 29) {
                        alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(bilVar.a), autofillIdK);
                    }
                } else {
                    defpackage.sr srVar = cgyVar.c;
                    if (srVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
                        alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(bilVar.a), (android.view.ViewStructure) srVar.a);
                    }
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(bilVar.a), a$.ExternalSyntheticApiModelOutline1.m(new defpackage.kwv(a$.ExternalSyntheticApiModelOutline1.m((android.view.View) bilVar.b)).a), new long[]{Long.MIN_VALUE});
            }
            list.clear();
        }
    }

    private final void r(defpackage.dec decVar) {
        if (n()) {
            j(decVar.c);
            java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
            int size = listK.size();
            for (int i = 0; i < size; i++) {
                r((defpackage.dec) listK.get(i));
            }
        }
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        this.n = (defpackage.bil) this.i.invoke();
        m(-1, this.a.W.x());
        q();
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        r(this.a.W.x());
        q();
        this.n = null;
    }

    public final android.os.Handler g() {
        return this.a.getHandler();
    }

    public final defpackage.zo h() {
        if (this.b) {
            this.b = false;
            defpackage.czz czzVar = this.a;
            this.l = defpackage.ded.c(czzVar.W, new defpackage.bmo(18));
            this.m = java.lang.System.currentTimeMillis();
        }
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r2
  0x0043: PHI (r2v3 aixy) = (r2v1 aixy), (r2v2 aixy), (r2v5 aixy) binds: [B:16:0x003a, B:29:0x007c, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[PHI: r2 r8
  0x004d: PHI (r2v2 aixy) = (r2v3 aixy), (r2v4 aixy) binds: [B:18:0x004b, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r8v3 java.lang.Object) = (r8v9 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004b, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cgw
            if (r0 == 0) goto L13
            r0 = r8
            cgw r0 = (defpackage.cgw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgw r0 = new cgw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            aixy r2 = r0.d
            defpackage.afga.cz(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            aixy r2 = r0.d
            defpackage.afga.cz(r8)
            goto L4d
        L3a:
            defpackage.afga.cz(r8)
            aiyk r8 = r7.k
            aixy r2 = r8.A()
        L43:
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L82
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r2.b()
            boolean r8 = r7.n()
            if (r8 == 0) goto L61
            r7.q()
        L61:
            android.os.Handler r8 = r7.g()
            boolean r5 = r7.c
            if (r5 != 0) goto L72
            if (r8 == 0) goto L72
            r7.c = r4
            java.lang.Runnable r5 = r7.d
            r8.post(r5)
        L72:
            r0.d = r2
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = aipw.c(r5, r0)
            if (r8 != r1) goto L43
            goto L82
        L7f:
            afbk r7 = defpackage.afbk.a
            return r7
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgx.i(afdk):java.lang.Object");
    }

    public final void j(int i) {
        this.j.add(new cgy(i, this.m, 2, (defpackage.sr) null));
    }

    public final void k() {
        this.k.j(defpackage.afbk.a);
    }

    public final void l(int i, java.lang.String str) {
        defpackage.bil bilVar;
        if (android.os.Build.VERSION.SDK_INT >= 29 && (bilVar = this.n) != null) {
            android.view.autofill.AutofillId autofillIdK = bilVar.k(i);
            if (autofillIdK == null) {
                defpackage.csc.a("Invalid content capture ID");
                throw new defpackage.afap();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(bilVar.a), autofillIdK, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:73:0x017f  */
    public final void m(int i, defpackage.dec decVar) {
        defpackage.ddn ddnVar;
        java.lang.Object objK;
        defpackage.cjj cjjVarA;
        defpackage.sr srVar;
        java.lang.String strE;
        if (n()) {
            defpackage.ddz ddzVar = decVar.b;
            java.lang.Boolean bool = (java.lang.Boolean) ddzVar.g(defpackage.def.F);
            if (this.f == 1 && defpackage.afga.f(bool, java.lang.Boolean.TRUE)) {
                defpackage.ddn ddnVar2 = (defpackage.ddn) ddzVar.g(defpackage.ddy.m);
                if (ddnVar2 != null) {
                }
            } else if (this.f == 2 && defpackage.afga.f(bool, java.lang.Boolean.FALSE) && (ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.m)) != null) {
            }
            int i2 = decVar.c;
            defpackage.bil bilVar = this.n;
            if (bilVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
                defpackage.kwv kwvVar = new defpackage.kwv(a$.ExternalSyntheticApiModelOutline1.m(this.a));
                defpackage.dec decVarI = decVar.i();
                if (decVarI != null) {
                    objK = bilVar.k(decVarI.c);
                    if (objK == null) {
                        srVar = null;
                    }
                } else {
                    objK = kwvVar.a;
                }
                defpackage.sr srVar2 = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.sr(alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(bilVar.a), a$.ExternalSyntheticApiModelOutline1.m(objK), i2), (byte[]) null) : null;
                if (srVar2 == null || ddzVar.f(defpackage.def.O)) {
                    srVar = null;
                } else {
                    android.view.ViewStructure viewStructure = (android.view.ViewStructure) srVar2.a;
                    android.os.Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.m);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                    }
                    java.lang.String str = (java.lang.String) ddzVar.g(defpackage.def.B);
                    if (str != null) {
                        viewStructure.setId(i2, null, null, str);
                    }
                    java.lang.Boolean bool2 = (java.lang.Boolean) ddzVar.g(defpackage.def.n);
                    if (bool2 != null) {
                        bool2.booleanValue();
                        srVar2.o("android.widget.ViewGroup");
                    }
                    java.util.List list = (java.util.List) ddzVar.g(defpackage.def.D);
                    if (list != null) {
                        srVar2.o("android.widget.TextView");
                        srVar2.p(defpackage.dmh.c(list, "\n", null, null, null, 62));
                    }
                    defpackage.dfb dfbVar = (defpackage.dfb) ddzVar.g(defpackage.def.H);
                    if (dfbVar != null) {
                        srVar2.o("android.widget.EditText");
                        srVar2.p(dfbVar);
                    }
                    java.util.List list2 = (java.util.List) ddzVar.g(defpackage.def.a);
                    if (list2 != null) {
                        viewStructure.setContentDescription(defpackage.dmh.c(list2, "\n", null, null, null, 62));
                    }
                    defpackage.ddw ddwVar = (defpackage.ddw) ddzVar.g(defpackage.def.A);
                    if (ddwVar != null && (strE = defpackage.dbc.e(ddwVar.a)) != null) {
                        srVar2.o(strE);
                    }
                    defpackage.dga dgaVarD = defpackage.dbc.d(ddzVar);
                    if (dgaVarD != null) {
                        defpackage.dfz dfzVar = dgaVarD.a;
                        long jG = dfzVar.b.g() & 4294967295L;
                        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
                        defpackage.dlo dloVar = dfzVar.g;
                        viewStructure.setTextStyle(java.lang.Float.intBitsToFloat((int) jG) * dloVar.a() * dloVar.b(), 0, 0, 0);
                    }
                    defpackage.cyl cylVarF = decVar.f();
                    if (cylVarF == null) {
                        cjjVarA = defpackage.cjj.a;
                    } else {
                        defpackage.cyl cylVar = true == cylVarF.t() ? cylVarF : null;
                        if (cylVar != null) {
                            cjjVarA = decVar.a(cylVar);
                        } else {
                            cjjVarA = defpackage.cjj.a;
                        }
                    }
                    float f = cjjVarA.d;
                    float f2 = cjjVarA.b;
                    float f3 = cjjVarA.e;
                    float f4 = cjjVarA.c;
                    viewStructure.setDimens((int) f2, (int) f4, 0, 0, (int) (f - f2), (int) (f3 - f4));
                    srVar = srVar2;
                }
            } else {
                srVar = null;
            }
            if (srVar != null) {
                this.j.add(new cgy(i2, this.m, 1, srVar));
            }
            p(decVar, new defpackage.bmc(this, 8));
        }
    }

    public final boolean n() {
        return this.n != null;
    }

    public final void o(defpackage.dec decVar, defpackage.bil bilVar) {
        p(decVar, new defpackage.bmg(bilVar, this, 8, null));
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            defpackage.dec decVar2 = (defpackage.dec) listK.get(i);
            defpackage.zo zoVarH = h();
            int i2 = decVar2.c;
            if (zoVarH.b(i2)) {
                defpackage.zo zoVar = this.e;
                if (zoVar.b(i2)) {
                    java.lang.Object objA = zoVar.a(i2);
                    if (objA == null) {
                        defpackage.csc.a("node not present in pruned tree before this change");
                        throw new defpackage.afap();
                    }
                    o(decVar2, (defpackage.bil) objA);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handlerG = g();
        if (handlerG != null) {
            handlerG.removeCallbacks(this.d);
        }
        this.n = null;
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
