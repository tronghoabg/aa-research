package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dmm extends android.view.ViewGroup implements defpackage.eao, defpackage.buy, defpackage.cyv, defpackage.eap {
    public static final defpackage.affc a = new defpackage.cmr(16);
    private final defpackage.euf A;
    public final android.view.View b;
    public final defpackage.cyu c;
    public defpackage.afer d;
    public boolean e;
    public defpackage.afer f;
    public defpackage.cgf g;
    public final defpackage.affc h;
    public defpackage.dlo i;
    public final defpackage.affc j;
    public defpackage.eqg k;
    public defpackage.fbm l;
    public final int[] m;
    public long n;
    public defpackage.edf o;
    public defpackage.affc p;
    public final defpackage.afer q;
    public final defpackage.affc r;
    public int s;
    public int t;
    public boolean u;
    public final defpackage.cxl v;
    public final defpackage.tu w;
    private final int x;
    private final defpackage.afer y;
    private final int[] z;

    public dmm(android.content.Context context, defpackage.bvi bviVar, int i, defpackage.tu tuVar, android.view.View view, defpackage.cyu cyuVar) {
        super(context);
        this.x = i;
        this.w = tuVar;
        this.b = view;
        this.c = cyuVar;
        defpackage.aau aauVar = defpackage.dcw.a;
        setTag(2131427502, bviVar);
        setSaveFromParentEnabled(false);
        addView(view);
        dmi dmiVar = new dmi(this);
        int[] iArr = defpackage.ebt.a;
        defpackage.kwv.G(this, dmiVar);
        defpackage.ebl.e(this, this);
        this.d = new defpackage.bmd(15);
        this.f = new defpackage.bmd(16);
        defpackage.cgc cgcVar = defpackage.cgf.e;
        this.g = cgcVar;
        this.i = new defpackage.dlp(1.0f, 1.0f);
        int i2 = 2;
        this.m = new int[2];
        this.n = 0L;
        int i3 = 8;
        this.q = new defpackage.cwg(this, i3);
        this.y = new defpackage.cwg(this, 9);
        this.z = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.A = new defpackage.euf(null);
        int i4 = 3;
        defpackage.cxl cxlVar = new defpackage.cxl(false, i4, null);
        cxlVar.l = this;
        defpackage.cgf cgfVarA = defpackage.dea.a(defpackage.tn.f(cgcVar, dmo.a, tuVar), true, new defpackage.cmr(17));
        defpackage.crj crjVar = new defpackage.crj();
        crjVar.a = new defpackage.chs(this, 10);
        defpackage.mio mioVar = new defpackage.mio(1, null);
        defpackage.mio mioVar2 = crjVar.d;
        if (mioVar2 != null) {
            mioVar2.a = null;
        }
        crjVar.d = mioVar;
        defpackage.mio mioVar3 = crjVar.d;
        if (mioVar3 != null) {
            mioVar3.a = crjVar;
        }
        this.r = mioVar;
        defpackage.cgf cgfVarA2 = defpackage.ty.e(defpackage.dai.aj(cgfVarA.a(crjVar), new defpackage.cij(this, cxlVar, this, i2)), new defpackage.bpn(this, cxlVar, 6)).a(new dms(new defpackage.deh(this, i2)));
        cxlVar.i = i;
        cxlVar.ae(this.g.a(cgfVarA2));
        this.h = new defpackage.bpn(cxlVar, cgfVarA2, 7);
        cxlVar.ab(this.i);
        this.j = new defpackage.deh(cxlVar, i4);
        cxlVar.z = new defpackage.bpn(this, cxlVar, i3);
        cxlVar.A = new defpackage.deh(this, 4);
        cxlVar.ad(new dmj(this, cxlVar));
        this.v = cxlVar;
    }

    public static final defpackage.dvl m(defpackage.dvl dvlVar, int i, int i2, int i3, int i4) {
        int i5 = dvlVar.b - i;
        int i6 = dvlVar.c - i2;
        int i7 = dvlVar.d - i3;
        int i8 = dvlVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return defpackage.dvl.e(i5, i6, i7, i8);
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return android.view.View.MeasureSpec.makeMeasureSpec(defpackage.afqt.g(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return android.view.View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
            return 0;
        }
        if (i3 != -1 || i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        this.o = new defpackage.edf(edfVar);
        return k(edfVar);
    }

    @Override // defpackage.buy
    public final void b() {
        removeAllViewsInLayout();
    }

    @Override // defpackage.buy
    public final void c() {
        this.f.invoke();
    }

    @Override // defpackage.ean
    public final void d(android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            defpackage.tu tuVar = this.w;
            float fA = dmo.a(i);
            long jB = tuVar.b((((long) java.lang.Float.floatToRawIntBits(dmo.a(i2))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fA) << 32), 1 != i3 ? 1 : 2);
            iArr[0] = -defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = -defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // defpackage.ean
    public final void e(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            defpackage.tu tuVar = this.w;
            float fA = dmo.a(i);
            float fA2 = dmo.a(i2);
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
            tuVar.a((java.lang.Float.floatToRawIntBits(fA2) & 4294967295L) | (jFloatToRawIntBits << 32), (((long) java.lang.Float.floatToRawIntBits(dmo.a(i3))) << 32) | (((long) java.lang.Float.floatToRawIntBits(dmo.a(i4))) & 4294967295L), 1 == i5 ? 2 : 1);
        }
    }

    @Override // defpackage.eao
    public final void f(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            defpackage.tu tuVar = this.w;
            float fA = dmo.a(i);
            float fA2 = dmo.a(i2);
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
            float fA3 = dmo.a(i3);
            long jA = tuVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(dmo.a(i4))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fA3) << 32), 1 != i5 ? 1 : 2);
            iArr[0] = -defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jA >> 32)));
            iArr[1] = -defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    @Override // defpackage.ean
    public final void g(android.view.View view, android.view.View view2, int i, int i2) {
        this.A.c(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.z;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.viewinterop.AndroidViewHolder";
    }

    @Override // android.view.View
    public final android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.A.b();
    }

    @Override // defpackage.ean
    public final void h(android.view.View view, int i) {
        this.A.d(i);
    }

    @Override // defpackage.buy
    public final void i() {
        android.view.View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        l();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final defpackage.cyx j() {
        if (!isAttachedToWindow()) {
            defpackage.csc.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.p();
    }

    public final defpackage.edf k(defpackage.edf edfVar) {
        defpackage.dvl dvlVarF = edfVar.f(-1);
        defpackage.dvl dvlVar = defpackage.dvl.a;
        if (!dvlVarF.equals(dvlVar) || !edfVar.g(-9).equals(dvlVar) || edfVar.k() != null) {
            defpackage.cyl cylVarP = this.v.p();
            if (cylVarP.t()) {
                long jD = defpackage.dlv.d(cylVarP.j(0L));
                int iA = defpackage.dlw.a(jD);
                if (iA < 0) {
                    iA = 0;
                }
                int iB = defpackage.dlw.b(jD);
                if (iB < 0) {
                    iB = 0;
                }
                long jH = defpackage.csc.g(cylVarP).h();
                long j = jH >> 32;
                long j2 = jH & 4294967295L;
                long j3 = cylVarP.c;
                long jD2 = defpackage.dlv.d(cylVarP.j((4294967295L & ((long) java.lang.Float.floatToRawIntBits((int) (j3 & 4294967295L)))) | (((long) java.lang.Float.floatToRawIntBits((int) (j3 >> 32))) << 32)));
                int iA2 = ((int) j) - defpackage.dlw.a(jD2);
                if (iA2 < 0) {
                    iA2 = 0;
                }
                int iB2 = ((int) j2) - defpackage.dlw.b(jD2);
                int i = iB2 >= 0 ? iB2 : 0;
                if (iA != 0 || iB != 0 || iA2 != 0 || i != 0) {
                    return edfVar.o(iA, iB, iA2, i);
                }
            }
        }
        return edfVar;
    }

    public final void l() {
        if (this.u) {
            this.b.postOnAnimation(new defpackage.ku(this.y, 18, null));
        } else {
            this.v.G();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        l();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x00ae, LOOP:1: B:12:0x003c->B:24:0x0083, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x001b, B:25:0x0088, B:27:0x008e, B:30:0x009b, B:29:0x0093, B:9:0x0030, B:12:0x003c, B:14:0x0051, B:15:0x0054, B:17:0x005f, B:19:0x0069, B:21:0x0078, B:24:0x0083, B:31:0x009f), top: B:37:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[EDGE_INSN: B:44:0x0088->B:25:0x0088 BREAK  A[LOOP:1: B:12:0x003c->B:24:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        java.lang.Object obj = j().a;
        synchronized (((defpackage.cez) obj).e) {
            defpackage.bzc bzcVar = ((defpackage.cez) obj).d;
            int i3 = bzcVar.b;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                defpackage.cey ceyVar = (defpackage.cey) bzcVar.a[i4];
                defpackage.aal aalVar = (defpackage.aal) ceyVar.d().i(this);
                if (aalVar == null) {
                    i = i4;
                } else {
                    java.lang.Object[] objArr = aalVar.b;
                    int[] iArr = aalVar.c;
                    long[] jArr = aalVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            i = i4;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i6 != length) {
                                    break;
                                    break;
                                } else {
                                    i6++;
                                    i4 = i;
                                }
                            } else {
                                int i7 = i6 - length;
                                int i8 = 0;
                                while (true) {
                                    int i9 = i7;
                                    i2 = 8 - ((~i7) >>> 31);
                                    if (i8 >= i2) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i10 = (i6 << 3) + i8;
                                        java.lang.Object obj2 = objArr[i10];
                                        int i11 = iArr[i10];
                                        ceyVar.b(this, obj2);
                                    }
                                    j >>= 8;
                                    i8++;
                                    i7 = i9;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                                if (i6 != length) {
                                    break;
                                }
                                i6++;
                                i4 = i;
                            }
                        }
                    } else {
                        i = i4;
                    }
                }
                if (!ceyVar.c()) {
                    i5++;
                } else if (i5 > 0) {
                    java.lang.Object[] objArr2 = bzcVar.a;
                    objArr2[i - i5] = objArr2[i];
                }
                i4 = i + 1;
            }
            java.lang.Object[] objArr3 = bzcVar.a;
            int i12 = i3 - i5;
            objArr3.getClass();
            java.util.Arrays.fill(objArr3, i12, i3, (java.lang.Object) null);
            bzcVar.b = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        android.view.View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.s = i;
        this.t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float f3 = -f;
        float f4 = -f2;
        ahoc.d(this.w.f(), (defpackage.afdo) null, 0, new dmk(z, this, defpackage.tna.aK(f3, f4), (defpackage.afdk) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float f3 = -f;
        float f4 = -f2;
        ahoc.d(this.w.f(), (defpackage.afdo) null, 0, new dml(this, defpackage.tna.aK(f3, f4), (defpackage.afdk) null, 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        defpackage.affc affcVar = this.p;
        if (affcVar == null) {
            return true;
        }
        affcVar.invoke(rect != null ? defpackage.ckn.d(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        defpackage.affc affcVar = this.r;
        if (affcVar != null) {
            affcVar.invoke(java.lang.Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.ean
    public final boolean t(android.view.View view, android.view.View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.cyv
    public final boolean w() {
        return isAttachedToWindow();
    }
}
