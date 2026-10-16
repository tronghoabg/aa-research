package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lz {
    public int A;
    public int B;
    public int C;
    public int D;
    public final bii E;
    public final bii F;
    private final nm a;
    private final nm b;
    ke r;
    public RecyclerView s;
    public mk t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public lz() {
        lx lxVar = new lx(this, 1);
        this.a = lxVar;
        lx lxVar2 = new lx(this, 0);
        this.b = lxVar2;
        this.E = new bii(lxVar);
        this.F = new bii(lxVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static ly aB(Context context, AttributeSet attributeSet, int i, int i2) {
        ly lyVar = new ly();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fv.a, i, i2);
        lyVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        lyVar.b = typedArrayObtainStyledAttributes.getInt(11, 1);
        lyVar.c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        lyVar.d = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        return lyVar;
    }

    public static int au(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int aw(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.aw(int, int, int, int, boolean):int");
    }

    public static final int bA(View view) {
        return view.getBottom() + ((ma) view.getLayoutParams()).d.bottom;
    }

    public static final int bB(View view) {
        return view.getLeft() - bk(view);
    }

    public static final int bC(View view) {
        return view.getRight() + bm(view);
    }

    public static final int bD(View view) {
        return view.getTop() - ((ma) view.getLayoutParams()).d.top;
    }

    public static final int bh(View view) {
        return ((ma) view.getLayoutParams()).d.bottom;
    }

    public static final int bi(View view) {
        Rect rect = ((ma) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bj(View view) {
        Rect rect = ((ma) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bk(View view) {
        return ((ma) view.getLayoutParams()).d.left;
    }

    public static final int bl(View view) {
        return ((ma) view.getLayoutParams()).fP();
    }

    public static final int bm(View view) {
        return ((ma) view.getLayoutParams()).d.right;
    }

    public static final int bn(View view) {
        return ((ma) view.getLayoutParams()).d.top;
    }

    public static final void bq(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((ma) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void br(View view, int i, int i2, int i3, int i4) {
        ma maVar = (ma) view.getLayoutParams();
        Rect rect = maVar.d;
        view.layout(i + rect.left + maVar.leftMargin, i2 + rect.top + maVar.topMargin, (i3 - rect.right) - maVar.rightMargin, (i4 - rect.bottom) - maVar.bottomMargin);
    }

    public void C(int i, int i2) {
        bv(i);
    }

    public int D(ml mlVar) {
        return 0;
    }

    public int E(ml mlVar) {
        return 0;
    }

    public int F(ml mlVar) {
        return 0;
    }

    public int G(ml mlVar) {
        throw null;
    }

    public int H(ml mlVar) {
        throw null;
    }

    public int I(ml mlVar) {
        throw null;
    }

    public Parcelable P() {
        return null;
    }

    public View U(int i) {
        int iAv = av();
        for (int i2 = 0; i2 < iAv; i2++) {
            View viewAD = aD(i2);
            mo moVarK = RecyclerView.k(viewAD);
            if (moVarK != null && moVarK.c() == i && !moVarK.A() && (this.s.N.g || !moVarK.v())) {
                return viewAD;
            }
        }
        return null;
    }

    public void W(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.v(str);
        }
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        me meVar = recyclerView.e;
        ml mlVar = recyclerView.N;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        lt ltVar = this.s.m;
        if (ltVar != null) {
            accessibilityEvent.setItemCount(ltVar.a());
        }
    }

    public final int aA() {
        RecyclerView recyclerView = this.s;
        int[] iArr = ebm.a;
        return recyclerView.getMinimumWidth();
    }

    public final View aC(View view) {
        View viewM;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewM = recyclerView.m(view)) == null || this.r.k(viewM)) {
            return null;
        }
        return viewM;
    }

    public final View aD(int i) {
        ke keVar = this.r;
        if (keVar != null) {
            return keVar.d(i);
        }
        return null;
    }

    public final View aE() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aF(View view, int i, boolean z) {
        int i2 = RecyclerView.ac;
        mo moVar = view == null ? null : ((ma) view.getLayoutParams()).c;
        if (z || moVar.v()) {
            this.s.ab.A(moVar);
        } else {
            this.s.ab.D(moVar);
        }
        ma maVar = (ma) view.getLayoutParams();
        if (moVar.B() || moVar.w()) {
            if (moVar.w()) {
                moVar.p();
            } else {
                moVar.i();
            }
            this.r.g(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.s;
            ke keVar = this.r;
            if (parent == recyclerView) {
                int iC = keVar.c(view);
                if (i == -1) {
                    i = this.r.a();
                }
                if (iC == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.n());
                }
                if (iC != i) {
                    lz lzVar = this.s.n;
                    View viewAD = lzVar.aD(iC);
                    if (viewAD == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + lzVar.s.toString());
                    }
                    lzVar.aI(iC);
                    ma maVar2 = (ma) viewAD.getLayoutParams();
                    mo moVar2 = ((ma) viewAD.getLayoutParams()).c;
                    if (moVar2.v()) {
                        lzVar.s.ab.A(moVar2);
                    } else {
                        lzVar.s.ab.D(moVar2);
                    }
                    lzVar.r.g(viewAD, i, maVar2, moVar2.v());
                }
            } else {
                keVar.f(view, i, false);
                maVar.e = true;
                mk mkVar = this.t;
                if (mkVar != null && mkVar.f && mkVar.e(view) == mkVar.f()) {
                    mkVar.g = view;
                }
            }
        }
        if (maVar.f) {
            moVar.a.invalidate();
            maVar.f = false;
        }
    }

    public final void aG(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.f(view));
        }
    }

    public final void aH(me meVar) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            View viewAD = aD(iAv);
            int i = RecyclerView.ac;
            mo moVar = viewAD == null ? null : ((ma) viewAD.getLayoutParams()).c;
            if (!moVar.A()) {
                if (!moVar.t() || moVar.v() || this.s.m.c) {
                    aI(iAv);
                    meVar.k(viewAD);
                    this.s.ab.D(moVar);
                } else {
                    aU(iAv);
                    meVar.j(moVar);
                }
            }
        }
    }

    public final void aI(int i) {
        aD(i);
        this.r.h(i);
    }

    public final void aJ(RecyclerView recyclerView) {
        this.v = true;
        aM(recyclerView);
    }

    public void aK(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aL(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aN(View view, edg edgVar) {
        mo moVarK = RecyclerView.k(view);
        if (moVarK == null || moVarK.v() || this.r.k(moVarK.a)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        fY(recyclerView.e, recyclerView.N, view, edgVar);
    }

    public final void aP() {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            } else {
                this.r.j(iAv);
            }
        }
    }

    public final void aQ(me meVar) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            View viewAD = aD(iAv);
            int i = RecyclerView.ac;
            if (!(viewAD == null ? null : ((ma) viewAD.getLayoutParams()).c).A()) {
                aT(iAv, meVar);
            }
        }
    }

    public final void aR(me meVar) {
        ArrayList arrayList = meVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((mo) arrayList.get(i)).a;
            int i2 = RecyclerView.ac;
            mo moVar = ((ma) view.getLayoutParams()).c;
            if (!moVar.A()) {
                moVar.n(false);
                if (moVar.x()) {
                    this.s.removeDetachedView(view, false);
                }
                lw lwVar = this.s.E;
                if (lwVar != null) {
                    lwVar.c(moVar);
                }
                moVar.n(true);
                meVar.f(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = meVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aS(View view, me meVar) {
        ke keVar = this.r;
        int i = keVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            keVar.c = 1;
            keVar.d = view;
            izj izjVar = keVar.e;
            int iX = izjVar.x(view);
            if (iX >= 0) {
                if (keVar.a.g(iX)) {
                    keVar.l(view);
                }
                izjVar.A(iX);
            }
            keVar.c = 0;
            keVar.d = null;
            meVar.i(view);
        } catch (Throwable th) {
            keVar.c = 0;
            keVar.d = null;
            throw th;
        }
    }

    public final void aT(int i, me meVar) {
        View viewAD = aD(i);
        aU(i);
        meVar.i(viewAD);
    }

    public final void aU(int i) {
        if (aD(i) != null) {
            this.r.j(i);
        }
    }

    public final void aV() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aW() {
        this.u = true;
    }

    public final void aX(RecyclerView recyclerView) {
        aY(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aY(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public final void aZ(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public void ad(int i) {
        throw null;
    }

    public boolean ag() {
        return false;
    }

    public boolean ah() {
        throw null;
    }

    public boolean ai() {
        throw null;
    }

    public boolean ak() {
        return false;
    }

    public boolean am() {
        return false;
    }

    public void as(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int av() {
        ke keVar = this.r;
        if (keVar != null) {
            return keVar.a();
        }
        return 0;
    }

    public final int ax() {
        RecyclerView recyclerView = this.s;
        lt ltVar = recyclerView != null ? recyclerView.m : null;
        if (ltVar != null) {
            return ltVar.a();
        }
        return 0;
    }

    public final int ay() {
        return this.s.getLayoutDirection();
    }

    public final int az() {
        RecyclerView recyclerView = this.s;
        int[] iArr = ebm.a;
        return recyclerView.getMinimumHeight();
    }

    public final void ba(int i, int i2) {
        int iAv = av();
        if (iAv == 0) {
            this.s.A(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAv; i7++) {
            View viewAD = aD(i7);
            Rect rect = this.s.k;
            RecyclerView.K(viewAD, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.k.set(i4, i5, i3, i6);
        fZ(this.s.k, i, i2);
    }

    public final void bb(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void bc(mk mkVar) {
        mk mkVar2 = this.t;
        if (mkVar2 != null && mkVar != mkVar2 && mkVar2.f) {
            mkVar2.i();
        }
        this.t = mkVar;
        RecyclerView recyclerView = this.s;
        recyclerView.K.d();
        if (mkVar.h) {
            Log.w("RecyclerView", "An instance of " + mkVar.getClass().getSimpleName() + " was started more than once. Each instance of" + mkVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        mkVar.c = recyclerView;
        mkVar.d = this;
        int i = mkVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        mkVar.c.N.a = i;
        mkVar.f = true;
        mkVar.e = true;
        mkVar.g = mkVar.c.n.U(mkVar.f());
        mkVar.c.K.b();
        mkVar.h = true;
    }

    public final boolean bd() {
        RecyclerView recyclerView = this.s;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean be() {
        mk mkVar = this.t;
        return mkVar != null && mkVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bf(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.C
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.D
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.ay()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Lb0
        L79:
            int r13 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r3 = r8.C
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.D
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r8 = r8.s
            android.graphics.Rect r8 = r8.k
            android.support.v7.widget.RecyclerView.K(r11, r8)
            int r11 = r8.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Lb0
            int r11 = r8.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Lb0
            int r11 = r8.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Lb0
            int r8 = r8.bottom
            int r8 = r8 - r2
            if (r8 <= r1) goto Lb0
        Laa:
            if (r10 != 0) goto Lb1
            if (r2 == 0) goto Lb0
            r10 = r0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r10, r2)
            goto Lba
        Lb7:
            r9.as(r10, r2, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.bf(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean bg(View view, int i, int i2, ma maVar) {
        return (!view.isLayoutRequested() && this.w && roc.ab(view.getWidth(), i, maVar.width) && roc.ab(view.getHeight(), i2, maVar.height)) ? false : true;
    }

    public final void bo(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((ma) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bp(View view) {
        return (this.E.H(view) && this.F.H(view)) ? false : true;
    }

    public final void bs(View view) {
        ma maVar = (ma) view.getLayoutParams();
        Rect rectF = this.s.f(view);
        int i = rectF.left + rectF.right;
        int i2 = rectF.top + rectF.bottom;
        int iAw = aw(this.C, this.A, getPaddingLeft() + getPaddingRight() + maVar.leftMargin + maVar.rightMargin + i, maVar.width, ag());
        int iAw2 = aw(this.D, this.B, getPaddingTop() + getPaddingBottom() + maVar.topMargin + maVar.bottomMargin + i2, maVar.height, ah());
        if (bg(view, iAw, iAw2, maVar)) {
            view.measure(iAw, iAw2);
        }
    }

    public boolean bu(ArrayList arrayList, int i) {
        return false;
    }

    public final void bw(int i, int i2) {
        this.s.A(i, i2);
    }

    public boolean bx(RecyclerView recyclerView, View view, View view2) {
        return be() || recyclerView.ao();
    }

    public final void by(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bz(RecyclerView recyclerView) {
        this.v = false;
        ar(recyclerView);
    }

    public int d(int i, me meVar, ml mlVar) {
        return 0;
    }

    public int e(int i, me meVar, ml mlVar) {
        throw null;
    }

    public abstract ma f();

    public int fS(me meVar, ml mlVar) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ag()) {
            return 1;
        }
        return this.s.m.a();
    }

    public int fT(me meVar, ml mlVar) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ah()) {
            return 1;
        }
        return this.s.m.a();
    }

    public ma fU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ma ? new ma((ma) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ma((ViewGroup.MarginLayoutParams) layoutParams) : new ma(layoutParams);
    }

    public View fV(int i, me meVar, ml mlVar) {
        return null;
    }

    public View fW(View view, int i, me meVar, ml mlVar) {
        return null;
    }

    public void fX(me meVar, ml mlVar, edg edgVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            edgVar.g(8192);
            edgVar.M(true);
            edgVar.m(67108864, true);
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            edgVar.g(4096);
            edgVar.M(true);
            edgVar.m(67108864, true);
        }
        edgVar.t(erb.z(fT(meVar, mlVar), fS(meVar, mlVar), 0));
    }

    public void fY(me meVar, ml mlVar, View view, edg edgVar) {
        edgVar.u(erb.y(ah() ? bl(view) : 0, 1, ag() ? bl(view) : 0, 1, false));
    }

    public void fZ(Rect rect, int i, int i2) {
        aZ(au(i, rect.width() + getPaddingLeft() + getPaddingRight(), aA()), au(i2, rect.height() + getPaddingTop() + getPaddingBottom(), az()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[PHI: r0
  0x008c: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:26:0x007f, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ga(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.ga(int, android.os.Bundle):boolean");
    }

    public boolean gb() {
        return false;
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = ebm.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = ebm.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public ma h(Context context, AttributeSet attributeSet) {
        return new ma(context, attributeSet);
    }

    public void p(me meVar, ml mlVar) {
        throw null;
    }

    public boolean u(ma maVar) {
        return maVar != null;
    }

    public void bt() {
    }

    public void gc() {
    }

    public void aM(RecyclerView recyclerView) {
    }

    public void aO(int i) {
    }

    public void ab(Parcelable parcelable) {
    }

    public void ar(RecyclerView recyclerView) {
    }

    public void bv(int i) {
    }

    public void q(ml mlVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void ao(int i, kx kxVar) {
    }

    public void y(int i, int i2) {
    }

    public void an(int i, int i2, ml mlVar, kx kxVar) {
    }
}
