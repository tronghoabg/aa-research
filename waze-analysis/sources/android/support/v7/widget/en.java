package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class en {

    /* renamed from: a, reason: collision with root package name */
    private final go f1410a;

    /* renamed from: b, reason: collision with root package name */
    private final go f1411b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1412c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1413d;

    /* renamed from: e, reason: collision with root package name */
    private int f1414e;

    /* renamed from: f, reason: collision with root package name */
    private int f1415f;

    /* renamed from: g, reason: collision with root package name */
    private int f1416g;

    /* renamed from: h, reason: collision with root package name */
    private int f1417h;
    br r;
    RecyclerView s;
    final gp t;
    final gp u;
    fa v;
    boolean w;
    boolean x;
    int y;
    boolean z;

    public en() {
        ek ekVar = new ek(this, 1);
        this.f1410a = ekVar;
        ek ekVar2 = new ek(this, 0);
        this.f1411b = ekVar2;
        this.t = new gp(ekVar);
        this.u = new gp(ekVar2);
        this.w = false;
        this.x = false;
        this.f1412c = true;
        this.f1413d = true;
    }

    public static em aG(Context context, AttributeSet attributeSet, int i2, int i3) {
        em emVar = new em();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.c.a.f639a, i2, i3);
        emVar.f1406a = typedArrayObtainStyledAttributes.getInt(0, 1);
        emVar.f1407b = typedArrayObtainStyledAttributes.getInt(11, 1);
        emVar.f1408c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        emVar.f1409d = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        return emVar;
    }

    public static int ar(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int at(int r3, int r4, int r5, int r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.en.at(int, int, int, int, boolean):int");
    }

    public static final int bo(View view) {
        return view.getBottom() + ((eo) view.getLayoutParams()).f1419d.bottom;
    }

    public static final int bp(View view) {
        return view.getLeft() - ((eo) view.getLayoutParams()).f1419d.left;
    }

    public static final int bq(View view) {
        Rect rect = ((eo) view.getLayoutParams()).f1419d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int br(View view) {
        Rect rect = ((eo) view.getLayoutParams()).f1419d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bs(View view) {
        return view.getRight() + ((eo) view.getLayoutParams()).f1419d.right;
    }

    public static final int bt(View view) {
        return view.getTop() - ((eo) view.getLayoutParams()).f1419d.top;
    }

    public static final int bu(View view) {
        return ((eo) view.getLayoutParams()).a();
    }

    public static final void bw(View view, int i2, int i3, int i4, int i5) {
        eo eoVar = (eo) view.getLayoutParams();
        Rect rect = eoVar.f1419d;
        view.layout(i2 + rect.left + eoVar.leftMargin, i3 + rect.top + eoVar.topMargin, (i4 - rect.right) - eoVar.rightMargin, (i5 - rect.bottom) - eoVar.bottomMargin);
    }

    private final void c(View view, int i2, boolean z) {
        fe feVarP = RecyclerView.p(view);
        if (z || feVarP.isRemoved()) {
            this.s.f941h.c(feVarP);
        } else {
            this.s.f941h.h(feVarP);
        }
        eo eoVar = (eo) view.getLayoutParams();
        if (feVarP.wasReturnedFromScrap() || feVarP.isScrap()) {
            if (feVarP.isScrap()) {
                feVarP.unScrap();
            } else {
                feVarP.clearReturnedFromScrapFlag();
            }
            this.r.g(view, i2, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.s;
            br brVar = this.r;
            if (parent == recyclerView) {
                int iC = brVar.c(view);
                if (i2 == -1) {
                    i2 = this.r.a();
                }
                if (iC == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.t());
                }
                if (iC != i2) {
                    en enVar = this.s.n;
                    View viewAI = enVar.aI(iC);
                    if (viewAI == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + enVar.s.toString());
                    }
                    enVar.aQ(iC);
                    eo eoVar2 = (eo) viewAI.getLayoutParams();
                    fe feVarP2 = RecyclerView.p(viewAI);
                    if (feVarP2.isRemoved()) {
                        enVar.s.f941h.c(feVarP2);
                    } else {
                        enVar.s.f941h.h(feVarP2);
                    }
                    enVar.r.g(viewAI, i2, eoVar2, feVarP2.isRemoved());
                }
            } else {
                brVar.f(view, i2, false);
                eoVar.f1420e = true;
                fa faVar = this.v;
                if (faVar != null && faVar.l()) {
                    faVar.g(view);
                }
            }
        }
        if (eoVar.f1421f) {
            feVarP.itemView.invalidate();
            eoVar.f1421f = false;
        }
    }

    private static boolean d(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public int E(fb fbVar) {
        throw null;
    }

    public int F(fb fbVar) {
        throw null;
    }

    public int G(fb fbVar) {
        throw null;
    }

    public int H(fb fbVar) {
        throw null;
    }

    public int I(fb fbVar) {
        throw null;
    }

    public int J(fb fbVar) {
        throw null;
    }

    public Parcelable Q() {
        throw null;
    }

    public View S(int i2) {
        int iAs = as();
        for (int i3 = 0; i3 < iAs; i3++) {
            View viewAI = aI(i3);
            fe feVarP = RecyclerView.p(viewAI);
            if (feVarP != null && feVarP.getLayoutPosition() == i2 && !feVarP.shouldIgnore() && (this.s.E.f1463g || !feVarP.isRemoved())) {
                return viewAI;
            }
        }
        return null;
    }

    public void T(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.D(str);
        }
    }

    public void V(int i2, int i3, fb fbVar, el elVar) {
        throw null;
    }

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        et etVar = recyclerView.f937d;
        fb fbVar = recyclerView.E;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        eb ebVar = this.s.m;
        if (ebVar != null) {
            accessibilityEvent.setItemCount(ebVar.getItemCount());
        }
    }

    public void Z(Parcelable parcelable) {
        throw null;
    }

    public int a(et etVar, fb fbVar) {
        eb ebVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (ebVar = recyclerView.m) == null || !ae()) {
            return 1;
        }
        return ebVar.getItemCount();
    }

    public final int aA() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int aB() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aC() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aD() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final int aE() {
        return this.f1416g;
    }

    public final int aF() {
        return this.f1414e;
    }

    public final View aH(View view) {
        View viewS;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewS = recyclerView.s(view)) == null || this.r.m(viewS)) {
            return null;
        }
        return viewS;
    }

    public final View aI(int i2) {
        br brVar = this.r;
        if (brVar != null) {
            return brVar.d(i2);
        }
        return null;
    }

    public final View aJ() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.m(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aK(View view) {
        aL(view, -1);
    }

    public final void aL(View view, int i2) {
        c(view, i2, true);
    }

    public final void aM(View view) {
        aN(view, -1);
    }

    public final void aN(View view, int i2) {
        c(view, i2, false);
    }

    public final void aO(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.i(view));
        }
    }

    public final void aP(et etVar) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            View viewAI = aI(iAs);
            fe feVarP = RecyclerView.p(viewAI);
            if (!feVarP.shouldIgnore()) {
                if (!feVarP.isInvalid() || feVarP.isRemoved() || this.s.m.hasStableIds()) {
                    aQ(iAs);
                    etVar.n(viewAI);
                    this.s.f941h.h(feVarP);
                } else {
                    aZ(iAs);
                    etVar.m(feVarP);
                }
            }
        }
    }

    public final void aQ(int i2) {
        aI(i2);
        this.r.h(i2);
    }

    public void aR(int i2) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.f940g.a();
            for (int i3 = 0; i3 < iA; i3++) {
                recyclerView.f940g.d(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void aS(int i2) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.f940g.a();
            for (int i3 = 0; i3 < iA; i3++) {
                recyclerView.f940g.d(i3).offsetTopAndBottom(i2);
            }
        }
    }

    final void aT(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        fe feVarP = RecyclerView.p(view);
        if (feVarP == null || feVarP.isRemoved() || this.r.m(feVarP.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        p(recyclerView.f937d, recyclerView.E, view, accessibilityNodeInfoCompat);
    }

    public final void aV(et etVar) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            if (!RecyclerView.p(aI(iAs)).shouldIgnore()) {
                aY(iAs, etVar);
            }
        }
    }

    final void aW(et etVar) {
        ArrayList arrayList = etVar.f1429a;
        int size = arrayList.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view = ((fe) arrayList.get(i2)).itemView;
            fe feVarP = RecyclerView.p(view);
            if (!feVarP.shouldIgnore()) {
                feVarP.setIsRecyclable(false);
                if (feVarP.isTmpDetached()) {
                    this.s.removeDetachedView(view, false);
                }
                eh ehVar = this.s.y;
                if (ehVar != null) {
                    ehVar.i(feVarP);
                }
                feVarP.setIsRecyclable(true);
                etVar.i(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = etVar.f1430b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aX(View view, et etVar) {
        this.r.j(view);
        etVar.l(view);
    }

    public final void aY(int i2, et etVar) {
        View viewAI = aI(i2);
        aZ(i2);
        etVar.l(viewAI);
    }

    public final void aZ(int i2) {
        if (aI(i2) != null) {
            this.r.k(i2);
        }
    }

    public void aa(int i2) {
        throw null;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        throw null;
    }

    public boolean ag() {
        throw null;
    }

    public boolean ai() {
        throw null;
    }

    boolean ak() {
        return false;
    }

    public void aq(RecyclerView recyclerView, int i2) {
        throw null;
    }

    public final int as() {
        br brVar = this.r;
        if (brVar != null) {
            return brVar.a();
        }
        return 0;
    }

    public final int au() {
        return this.f1417h;
    }

    public final int av() {
        return this.f1415f;
    }

    public final int aw() {
        RecyclerView recyclerView = this.s;
        eb ebVar = recyclerView != null ? recyclerView.m : null;
        if (ebVar != null) {
            return ebVar.getItemCount();
        }
        return 0;
    }

    public final int ax() {
        return this.s.getLayoutDirection();
    }

    public final int ay() {
        return ViewCompat.getMinimumHeight(this.s);
    }

    public final int az() {
        return ViewCompat.getMinimumWidth(this.s);
    }

    public int b(et etVar, fb fbVar) {
        eb ebVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (ebVar = recyclerView.m) == null || !af()) {
            return 1;
        }
        return ebVar.getItemCount();
    }

    public final void bA(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    final void bB(RecyclerView recyclerView) {
        this.x = false;
        ao(recyclerView);
    }

    public final void ba() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void bb() {
        this.w = true;
    }

    final void bc(RecyclerView recyclerView) {
        bd(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    final void bd(int i2, int i3) {
        this.f1416g = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f1414e = mode;
        if (mode == 0 && !RecyclerView.f934a) {
            this.f1416g = 0;
        }
        this.f1417h = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f1415f = mode2;
        if (mode2 != 0 || RecyclerView.f934a) {
            return;
        }
        this.f1417h = 0;
    }

    public final void be(int i2, int i3) {
        this.s.setMeasuredDimension(i2, i3);
    }

    final void bf(int i2, int i3) {
        int iAs = as();
        if (iAs == 0) {
            this.s.I(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < iAs; i8++) {
            View viewAI = aI(i8);
            Rect rect = this.s.f944k;
            RecyclerView.S(viewAI, rect);
            if (rect.left < i5) {
                i5 = rect.left;
            }
            if (rect.right > i4) {
                i4 = rect.right;
            }
            if (rect.top < i6) {
                i6 = rect.top;
            }
            if (rect.bottom > i7) {
                i7 = rect.bottom;
            }
        }
        this.s.f944k.set(i5, i6, i4, i7);
        s(this.s.f944k, i2, i3);
    }

    final void bg(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.f1416g = 0;
            this.f1417h = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.f940g;
            this.f1416g = recyclerView.getWidth();
            this.f1417h = recyclerView.getHeight();
        }
        this.f1414e = 1073741824;
        this.f1415f = 1073741824;
    }

    public final void bh(fa faVar) {
        fa faVar2 = this.v;
        if (faVar2 != null && faVar != faVar2 && faVar2.l()) {
            faVar2.j();
        }
        this.v = faVar;
        faVar.i(this.s, this);
    }

    public final boolean bi() {
        return this.f1413d;
    }

    public final boolean bj() {
        fa faVar = this.v;
        return faVar != null && faVar.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bk(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.aB()
            int r1 = r8.aD()
            int r2 = r8.f1416g
            int r3 = r8.aC()
            int r2 = r2 - r3
            int r3 = r8.f1417h
            int r4 = r8.aA()
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
            int r6 = r8.ax()
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
            goto Laf
        L79:
            int r13 = r8.aB()
            int r1 = r8.aD()
            int r3 = r8.f1416g
            int r4 = r8.aC()
            int r3 = r3 - r4
            int r4 = r8.f1417h
            int r5 = r8.aA()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r8 = r8.s
            android.graphics.Rect r8 = r8.f944k
            android.support.v7.widget.RecyclerView.S(r11, r8)
            int r11 = r8.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r8.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r8.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r8 = r8.bottom
            int r8 = r8 - r2
            if (r8 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.aD(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.en.bk(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    final boolean bl(View view, int i2, int i3, eo eoVar) {
        return (!view.isLayoutRequested() && this.f1412c && d(view.getWidth(), i2, eoVar.width) && d(view.getHeight(), i3, eoVar.height)) ? false : true;
    }

    final boolean bm(View view, int i2, int i3, eo eoVar) {
        return (this.f1412c && d(view.getMeasuredWidth(), i2, eoVar.width) && d(view.getMeasuredHeight(), i3, eoVar.height)) ? false : true;
    }

    final void bn() {
        this.x = true;
    }

    public final void bv(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((eo) view.getLayoutParams()).f1419d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.f945l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void bx(View view) {
        eo eoVar = (eo) view.getLayoutParams();
        Rect rectI = this.s.i(view);
        int i2 = rectI.left + rectI.right;
        int i3 = rectI.top + rectI.bottom;
        int iAt = at(this.f1416g, this.f1414e, aB() + aC() + eoVar.leftMargin + eoVar.rightMargin + i2, eoVar.width, ae());
        int iAt2 = at(this.f1417h, this.f1415f, aD() + aA() + eoVar.topMargin + eoVar.bottomMargin + i3, eoVar.height, af());
        if (bl(view, iAt, iAt2, eoVar)) {
            view.measure(iAt, iAt2);
        }
    }

    public final void bz(int i2, int i3) {
        this.s.I(i2, i3);
    }

    public int e(int i2, et etVar, fb fbVar) {
        throw null;
    }

    public int f(int i2, et etVar, fb fbVar) {
        throw null;
    }

    public abstract eo g();

    public eo h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eo ? new eo((eo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new eo((ViewGroup.MarginLayoutParams) layoutParams) : new eo(layoutParams);
    }

    public eo i(Context context, AttributeSet attributeSet) {
        return new eo(context, attributeSet);
    }

    public View k(View view, int i2, et etVar, fb fbVar) {
        throw null;
    }

    public void o(et etVar, fb fbVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
            accessibilityNodeInfoCompat.setScrollable(true);
            accessibilityNodeInfoCompat.setGranularScrollingSupported(true);
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
            accessibilityNodeInfoCompat.setScrollable(true);
            accessibilityNodeInfoCompat.setGranularScrollingSupported(true);
        }
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(b(etVar, fbVar), a(etVar, fbVar), false, 0));
    }

    public void p(et etVar, fb fbVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(af() ? bu(view) : 0, 1, ae() ? bu(view) : 0, 1, false, false));
    }

    public void q(et etVar, fb fbVar) {
        throw null;
    }

    public void s(Rect rect, int i2, int i3) {
        be(ar(i2, rect.width() + aB() + aC(), az()), ar(i3, rect.height() + aD() + aA(), ay()));
    }

    public boolean w(eo eoVar) {
        return eoVar != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[PHI: r0
  0x008c: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:26:0x007f, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean x(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.en.x(int, android.os.Bundle):boolean");
    }

    public boolean y() {
        throw null;
    }

    public void A() {
    }

    public void by() {
    }

    public void aU(int i2) {
    }

    public void ao(RecyclerView recyclerView) {
    }

    public void r(fb fbVar) {
    }

    public void B(int i2, int i3) {
    }

    public void C(int i2, int i3) {
    }

    public void D(int i2, int i3) {
    }

    public void W(int i2, el elVar) {
    }

    public void z(int i2, int i3) {
    }
}
