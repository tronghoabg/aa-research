package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class dme extends ViewGroup implements eah, bur, cyn, eaj {
    public static final afec a = new cmj(16);
    private final eai A;
    public final View b;
    public final cym c;
    public afdr d;
    public boolean e;
    public afdr f;
    public cfy g;
    public final afec h;
    public dlg i;
    public final afec j;
    public eqa k;
    public fbg l;
    public final int[] m;
    public long n;
    public ecy o;
    public afec p;
    public final afdr q;
    public final afec r;
    public int s;
    public int t;
    public boolean u;
    public final cxb v;
    public final tp w;
    private final int x;
    private final afdr y;
    private final int[] z;

    public dme(Context context, bvb bvbVar, int i, tp tpVar, View view, cym cymVar) {
        super(context);
        this.x = i;
        this.w = tpVar;
        this.b = view;
        this.c = cymVar;
        aan aanVar = dco.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, bvbVar);
        setSaveFromParentEnabled(false);
        addView(view);
        dma dmaVar = new dma(this);
        int[] iArr = ebm.a;
        lds.V(this, dmaVar);
        ebe.e(this, this);
        this.d = new blz(15);
        this.f = new blz(16);
        cfv cfvVar = cfy.e;
        this.g = cfvVar;
        this.i = new dlh(1.0f, 1.0f);
        int i2 = 2;
        this.m = new int[2];
        this.n = 0L;
        int i3 = 6;
        this.q = new cxm(this, i3);
        int i4 = 7;
        this.y = new cxm(this, i4);
        this.z = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.A = new eai();
        int i5 = 3;
        cxb cxbVar = new cxb(false, i5, null);
        cxbVar.l = this;
        cfy cfyVarA = dds.a(ti.f(cfvVar, dmg.a, tpVar), true, new cmj(17));
        cra craVar = new cra();
        craVar.a = new chk(this, 10);
        mij mijVar = new mij(1, null);
        mij mijVar2 = craVar.d;
        if (mijVar2 != null) {
            mijVar2.a = null;
        }
        craVar.d = mijVar;
        mij mijVar3 = craVar.d;
        if (mijVar3 != null) {
            mijVar3.a = craVar;
        }
        this.r = mijVar;
        cfy cfyVarA2 = tt.f(bxc.p(cfyVarA.a(craVar), new cib(this, cxbVar, this, i2)), new bpi(this, cxbVar, i3)).a(new dmk(new ddz(this, i2)));
        cxbVar.i = i;
        cxbVar.ae(this.g.a(cfyVarA2));
        this.h = new bpi(cxbVar, cfyVarA2, i4);
        cxbVar.ab(this.i);
        this.j = new ddz(cxbVar, i5);
        cxbVar.z = new bpi(this, cxbVar, 8);
        cxbVar.A = new ddz(this, 4);
        cxbVar.ad(new dmb(this, cxbVar));
        this.v = cxbVar;
    }

    public static final dve m(dve dveVar, int i, int i2, int i3, int i4) {
        int i5 = dveVar.b - i;
        int i6 = dveVar.c - i2;
        int i7 = dveVar.d - i3;
        int i8 = dveVar.e - i4;
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
        return dve.e(i5, i6, i7, i8);
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(afpt.g(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        this.o = new ecy(ecyVar);
        return k(ecyVar);
    }

    @Override // defpackage.bur
    public final void b() {
        removeAllViewsInLayout();
    }

    @Override // defpackage.bur
    public final void c() {
        this.f.invoke();
    }

    @Override // defpackage.eag
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            tp tpVar = this.w;
            float fA = dmg.a(i);
            float fA2 = dmg.a(i2);
            long jB = tpVar.b((Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32), 1 != i3 ? 1 : 2);
            iArr[0] = -afgi.k(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = -afgi.k(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // defpackage.eag
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            tp tpVar = this.w;
            float fA = dmg.a(i);
            float fA2 = dmg.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = dmg.a(i3);
            float fA4 = dmg.a(i4);
            tpVar.a((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(fA3) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L), 1 == i5 ? 2 : 1);
        }
    }

    @Override // defpackage.eah
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            tp tpVar = this.w;
            float fA = dmg.a(i);
            float fA2 = dmg.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = dmg.a(i3);
            float fA4 = dmg.a(i4);
            long jA = tpVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fA4) & 4294967295L) | (Float.floatToRawIntBits(fA3) << 32), 1 != i5 ? 1 : 2);
            iArr[0] = -afgi.k(Float.intBitsToFloat((int) (jA >> 32)));
            iArr[1] = -afgi.k(Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    @Override // defpackage.eag
    public final void g(View view, View view2, int i, int i2) {
        this.A.b(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.z;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.viewinterop.AndroidViewHolder";
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.A.a();
    }

    @Override // defpackage.eag
    public final void h(View view, int i) {
        this.A.c(i);
    }

    @Override // defpackage.bur
    public final void i() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        l();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final cyp j() {
        if (!isAttachedToWindow()) {
            crt.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.p();
    }

    public final ecy k(ecy ecyVar) {
        dve dveVarF = ecyVar.f(-1);
        dve dveVar = dve.a;
        if (!dveVarF.equals(dveVar) || !ecyVar.g(-9).equals(dveVar) || ecyVar.k() != null) {
            cyc cycVarP = this.v.p();
            if (cycVarP.t()) {
                long jS = dlf.s(cycVarP.j(0L));
                int iA = dlo.a(jS);
                if (iA < 0) {
                    iA = 0;
                }
                int iB = dlo.b(jS);
                if (iB < 0) {
                    iB = 0;
                }
                long jH = crt.j(cycVarP).h();
                long j = jH >> 32;
                long j2 = jH & 4294967295L;
                long j3 = cycVarP.c;
                long jS2 = dlf.s(cycVarP.j((4294967295L & Float.floatToRawIntBits((int) (j3 & 4294967295L))) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32)));
                int iA2 = ((int) j) - dlo.a(jS2);
                if (iA2 < 0) {
                    iA2 = 0;
                }
                int iB2 = ((int) j2) - dlo.b(jS2);
                int i = iB2 >= 0 ? iB2 : 0;
                if (iA != 0 || iB != 0 || iA2 != 0 || i != 0) {
                    return ecyVar.o(iA, iB, iA2, i);
                }
            }
        }
        return ecyVar;
    }

    public final void l() {
        if (this.u) {
            this.b.postOnAnimation(new lh(this.y, 14, null));
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
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDetachedFromWindow() {
        /*
            r23 = this;
            r0 = r23
            super.onDetachedFromWindow()
            cyp r1 = r0.j()
            java.lang.Object r1 = r1.a
            r2 = r1
            ces r2 = (defpackage.ces) r2
            java.lang.Object r2 = r2.e
            monitor-enter(r2)
            ces r1 = (defpackage.ces) r1     // Catch: java.lang.Throwable -> Lae
            byw r1 = r1.d     // Catch: java.lang.Throwable -> Lae
            int r3 = r1.b     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            r6 = 0
        L19:
            if (r5 >= r3) goto L9f
            java.lang.Object[] r7 = r1.a     // Catch: java.lang.Throwable -> Lae
            r7 = r7[r5]     // Catch: java.lang.Throwable -> Lae
            cer r7 = (defpackage.cer) r7     // Catch: java.lang.Throwable -> Lae
            aan r8 = r7.d()     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r8 = r8.i(r0)     // Catch: java.lang.Throwable -> Lae
            aae r8 = (defpackage.aae) r8     // Catch: java.lang.Throwable -> Lae
            if (r8 != 0) goto L30
        L2d:
            r16 = r5
            goto L88
        L30:
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> Lae
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> Lae
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> Lae
            int r11 = r8.length     // Catch: java.lang.Throwable -> Lae
            int r11 = r11 + (-2)
            if (r11 < 0) goto L2d
            r12 = 0
        L3c:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> Lae
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> Lae
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L81
            int r4 = r12 - r11
            r5 = 0
        L54:
            int r15 = ~r4     // Catch: java.lang.Throwable -> Lae
            int r15 = r15 >>> 31
            r18 = r4
            r4 = 8
            int r15 = 8 - r15
            if (r5 >= r15) goto L7f
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r13 & r19
            r21 = 128(0x80, double:6.3E-322)
            int r15 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r15 >= 0) goto L76
            int r15 = r12 << 3
            int r15 = r15 + r5
            r19 = r4
            r4 = r9[r15]     // Catch: java.lang.Throwable -> Lae
            r15 = r10[r15]     // Catch: java.lang.Throwable -> Lae
            r7.b(r0, r4)     // Catch: java.lang.Throwable -> Lae
            goto L78
        L76:
            r19 = r4
        L78:
            long r13 = r13 >> r19
            int r5 = r5 + 1
            r4 = r18
            goto L54
        L7f:
            if (r15 != r4) goto L88
        L81:
            if (r12 == r11) goto L88
            int r12 = r12 + 1
            r5 = r16
            goto L3c
        L88:
            boolean r4 = r7.c()     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto L91
            int r6 = r6 + 1
            goto L9b
        L91:
            if (r6 <= 0) goto L9b
            java.lang.Object[] r4 = r1.a     // Catch: java.lang.Throwable -> Lae
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r7     // Catch: java.lang.Throwable -> Lae
        L9b:
            int r5 = r16 + 1
            goto L19
        L9f:
            java.lang.Object[] r0 = r1.a     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 - r6
            r0.getClass()     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            java.util.Arrays.fill(r0, r4, r3, r5)     // Catch: java.lang.Throwable -> Lae
            r1.b = r4     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r2)
            return
        Lae:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
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
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float f3 = -f;
        float f4 = -f2;
        ahnc.d(this.w.f(), null, 0, new dmc(z, this, roc.aA(f3, f4), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float f3 = -f;
        float f4 = -f2;
        ahnc.d(this.w.f(), null, 0, new dmd(this, roc.aA(f3, f4), (afck) null, 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        afec afecVar = this.p;
        if (afecVar == null) {
            return true;
        }
        afecVar.invoke(rect != null ? ckf.f(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        afec afecVar = this.r;
        if (afecVar != null) {
            afecVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.eag
    public final boolean t(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.cyn
    public final boolean w() {
        return isAttachedToWindow();
    }
}
