package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import defpackage.bx;
import defpackage.civ;
import defpackage.ebe;
import defpackage.ebf;
import defpackage.ebm;
import defpackage.elt;
import defpackage.fhy;
import defpackage.fhz;
import defpackage.fia;
import defpackage.fib;
import defpackage.fic;
import defpackage.fid;
import defpackage.fie;
import defpackage.fif;
import defpackage.mh;
import defpackage.oby;
import defpackage.w;
import defpackage.wjz;
import defpackage.wkd;
import defpackage.wwb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator h = new civ(6);
    private static final Interpolator i = new oby(1);
    private int A;
    private int B;
    private final boolean C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private final Runnable Q;
    private int R;
    public fhy b;
    public int c;
    public EdgeEffect d;
    public EdgeEffect e;
    public List f;
    public List g;
    private int j;
    private final ArrayList k;
    private final fib l;
    private final Rect m;
    private int n;
    private Scroller o;
    private boolean p;
    private fif q;
    private float r;
    private float s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final int w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context) {
        super(context);
        this.k = new ArrayList();
        this.l = new fib();
        this.m = new Rect();
        this.n = -1;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.w = 1;
        this.C = true;
        this.H = -1;
        this.N = true;
        this.Q = new elt(this, 10, null);
        this.R = 0;
        p(context);
    }

    private final boolean A(int i2) {
        if (this.k.size() == 0) {
            if (this.N) {
                return false;
            }
            this.O = false;
            r(0, BitmapDescriptorFactory.HUE_RED);
            if (this.O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        fib fibVarU = u();
        float fS = s();
        float f = BitmapDescriptorFactory.HUE_RED / fS;
        int i3 = fibVarU.b;
        float f2 = (i2 / fS) - fibVarU.e;
        float f3 = fibVarU.d + f;
        this.O = false;
        r(i3, f2 / f3);
        if (this.O) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean B(float f, float f2) {
        boolean z;
        float f3 = this.D - f;
        this.D = f;
        float width = f3 / getWidth();
        float height = f2 / getHeight();
        float fE = (ebf.fK(this.d) != BitmapDescriptorFactory.HUE_RED ? -ebf.e(this.d, -width, 1.0f - height) : ebf.fK(this.e) != BitmapDescriptorFactory.HUE_RED ? ebf.e(this.e, width, height) : 0.0f) * getWidth();
        float f4 = f3 - fE;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = fE != BitmapDescriptorFactory.HUE_RED;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float fS = s();
        float f5 = this.r * fS;
        float f6 = this.s * fS;
        ArrayList arrayList = this.k;
        fib fibVar = (fib) arrayList.get(0);
        fib fibVar2 = (fib) arrayList.get(arrayList.size() - 1);
        if (fibVar.b != 0) {
            f5 = fibVar.e * fS;
            z = false;
        } else {
            z = true;
        }
        if (fibVar2.b != this.b.e() - 1) {
            f6 = fibVar2.e * fS;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                ebf.e(this.d, (f5 - scrollX) / fS, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                ebf.e(this.e, (scrollX - f6) / fS, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else {
            z3 = z4;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z3;
    }

    private final boolean C() {
        this.H = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
        this.d.onRelease();
        this.e.onRelease();
        return (this.d.isFinished() && this.e.isFinished()) ? false : true;
    }

    private final void D() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int s() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect t(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.fib u() {
        /*
            r14 = this;
            int r0 = r14.s()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r14.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L16
            float r0 = (float) r0
            float r0 = r1 / r0
            goto L17
        L16:
            r0 = r1
        L17:
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r3
            r10 = r4
            r9 = r5
            r7 = r6
            r6 = r1
        L20:
            java.util.ArrayList r11 = r14.k
            int r12 = r11.size()
            if (r8 >= r12) goto L68
            java.lang.Object r12 = r11.get(r8)
            fib r12 = (defpackage.fib) r12
            if (r9 != 0) goto L43
            int r13 = r12.b
            int r10 = r10 + r5
            if (r13 == r10) goto L43
            fib r12 = r14.l
            float r1 = r1 + r6
            float r1 = r1 + r0
            r12.e = r1
            r12.b = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.d = r1
            int r8 = r8 + (-1)
        L43:
            r6 = r12
            float r1 = r6.e
            float r10 = r6.d
            float r10 = r10 + r1
            float r10 = r10 + r0
            if (r9 != 0) goto L50
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L68
        L50:
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 < 0) goto L67
            int r7 = r11.size()
            int r7 = r7 + r4
            if (r8 != r7) goto L5c
            goto L67
        L5c:
            int r10 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r7
            r7 = r6
            r6 = r9
            r9 = r3
            goto L20
        L67:
            return r6
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.u():fib");
    }

    private final void v(boolean z) {
        boolean z2 = this.R == 2;
        if (z2) {
            z(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.v = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            fib fibVar = (fib) arrayList.get(i2);
            if (fibVar.c) {
                fibVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            Runnable runnable = this.Q;
            if (!z) {
                runnable.run();
            } else {
                int[] iArr = ebm.a;
                postOnAnimation(runnable);
            }
        }
    }

    private final void w(int i2) {
        List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fie fieVar = (fie) this.f.get(i3);
                if (fieVar != null) {
                    fieVar.b(i2);
                }
            }
        }
    }

    private final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void y(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int i4;
        int iAbs;
        fib fibVarC = c(i2);
        int iS = fibVarC != null ? (int) (s() * Math.max(this.r, Math.min(fibVarC.e, this.s))) : 0;
        if (!z) {
            if (z2) {
                w(i2);
            }
            v(false);
            scrollTo(iS, 0);
            A(iS);
            return;
        }
        if (getChildCount() == 0) {
            z(false);
        } else {
            Scroller scroller = this.o;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.p;
                Scroller scroller2 = this.o;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.o.abortAnimation();
                z(false);
            }
            int i5 = scrollX;
            int scrollY = getScrollY();
            int i6 = iS - i5;
            int i7 = -scrollY;
            if (i6 != 0) {
                i4 = i6;
            } else if (i7 == 0) {
                v(false);
                f();
                k(0);
            } else {
                i4 = 0;
            }
            z(true);
            k(2);
            int iS2 = s();
            int i8 = iS2 / 2;
            float f = iS2;
            float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = Math.abs(i3);
            if (iAbs2 > 0) {
                float f2 = i8;
                iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
            } else {
                iAbs = (int) (((Math.abs(i4) / (f + BitmapDescriptorFactory.HUE_RED)) + 1.0f) * 100.0f);
            }
            int iMin = Math.min(iAbs, 600);
            this.p = false;
            this.o.startScroll(i5, scrollY, i4, i7, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            w(i2);
        }
    }

    private final void z(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    final fib a(int i2, int i3) {
        fib fibVar = new fib();
        fibVar.b = i2;
        fhy fhyVar = this.b;
        bx bxVar = (bx) fhyVar;
        if (bxVar.b == null) {
            bxVar.b = new w(bxVar.a);
        }
        long j = i2;
        Fragment fragmentF = bxVar.a.f(bx.a(getId(), j));
        if (fragmentF != null) {
            bxVar.b.o(fragmentF);
        } else {
            wkd wkdVar = (wkd) fhyVar;
            fragmentF = ((wjz) wkdVar.e.get(i2)).a(wkdVar.f, i2);
            fragmentF.getArguments().putInt("QuestionIndex", i2);
            bxVar.b.e(getId(), fragmentF, bx.a(getId(), j), 1);
        }
        if (fragmentF != bxVar.c) {
            fragmentF.setMenuVisibility(false);
            fragmentF.setUserVisibleHint(false);
        }
        fibVar.a = fragmentF;
        fibVar.d = 1.0f;
        if (i3 >= 0) {
            ArrayList arrayList = this.k;
            if (i3 < arrayList.size()) {
                arrayList.add(i3, fibVar);
                return fibVar;
            }
        }
        this.k.add(fibVar);
        return fibVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        fib fibVarB;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fibVarB = b(childAt)) != null && fibVarB.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        fib fibVarB;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fibVarB = b(childAt)) != null && fibVarB.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new fic();
        }
        fic ficVar = (fic) layoutParams;
        boolean z = ficVar.a | (view.getClass().getAnnotation(fia.class) != null);
        ficVar.a = z;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else {
            if (ficVar != null && z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ficVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    final fib b(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            fib fibVar = (fib) arrayList.get(i2);
            if (((Fragment) fibVar.a).getView() == view) {
                return fibVar;
            }
            i2++;
        }
    }

    final fib c(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i3 >= arrayList.size()) {
                return null;
            }
            fib fibVar = (fib) arrayList.get(i3);
            if (fibVar.b == i2) {
                return fibVar;
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int iS = s();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) iS) * this.r)) : i2 > 0 && scrollX < ((int) (((float) iS) * this.s));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof fic) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            v(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(fie fieVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(fieVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.l(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r5 = r5.l(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.o()
            goto L5b
        L41:
            r6 = 66
            boolean r5 = r5.l(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r5 = r5.n()
            goto L5b
        L53:
            r6 = 17
            boolean r5 = r5.l(r6)
            goto L5b
        L5a:
            r5 = r2
        L5b:
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        fib fibVarB;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fibVarB = b(childAt)) != null && fibVarB.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        fhy fhyVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (fhyVar = this.b) == null || fhyVar.e() <= 1)) {
            this.d.finish();
            this.e.finish();
            return;
        }
        if (this.d.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.r * width);
            this.d.setSize(height, width);
            zDraw = this.d.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.e.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.s + 1.0f)) * width2);
            this.e.setSize(height2, width2);
            zDraw |= this.e.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() throws Resources.NotFoundException {
        int iE = this.b.e();
        this.j = iE;
        int i2 = this.w;
        ArrayList arrayList = this.k;
        boolean z = arrayList.size() < (i2 + i2) + 1 && arrayList.size() < iE;
        int i3 = this.c;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = ((fib) arrayList.get(i4)).a;
        }
        Collections.sort(arrayList, h);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                fic ficVar = (fic) getChildAt(i5).getLayoutParams();
                if (!ficVar.a) {
                    ficVar.c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            j(i3, false, true, 0);
            requestLayout();
        }
    }

    public final void f() {
        g(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[PHI: r7 r10 r11
  0x00f0: PHI (r7v16 int) = (r7v15 int), (r7v4 int) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r10v32 float) = (r10v31 float), (r10v33 float) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r11v32 int) = (r11v1 int), (r11v33 int) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182 A[PHI: r4
  0x0182: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:97:0x0179, B:94:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fic();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new fic(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public final void h(fhy fhyVar) throws Resources.NotFoundException {
        ArrayList arrayList;
        fhy fhyVar2 = this.b;
        if (fhyVar2 != null) {
            fhyVar2.f();
            this.b.b(this);
            int i2 = 0;
            while (true) {
                arrayList = this.k;
                if (i2 >= arrayList.size()) {
                    break;
                }
                fib fibVar = (fib) arrayList.get(i2);
                fhy fhyVar3 = this.b;
                int i3 = fibVar.b;
                fhyVar3.c(fibVar.a);
                i2++;
            }
            this.b.d();
            arrayList.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((fic) getChildAt(i4).getLayoutParams()).a) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = fhyVar;
        this.j = 0;
        if (fhyVar != null) {
            if (this.q == null) {
                this.q = new fif(this);
            }
            this.b.f();
            this.v = false;
            boolean z = this.N;
            this.N = true;
            this.j = this.b.e();
            int i5 = this.n;
            if (i5 >= 0) {
                j(i5, false, true, 0);
                this.n = -1;
            } else if (z) {
                requestLayout();
            } else {
                f();
            }
        }
        List list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.g.size();
        for (int i6 = 0; i6 < size; i6++) {
            wwb wwbVar = (wwb) this.g.get(i6);
            TabLayout tabLayout = wwbVar.b;
            if (tabLayout.B == this) {
                tabLayout.l(fhyVar, wwbVar.a);
            }
        }
    }

    public final void i(int i2) throws Resources.NotFoundException {
        this.v = false;
        j(i2, !this.N, false, 0);
    }

    final void j(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        fhy fhyVar = this.b;
        if (fhyVar == null || fhyVar.e() <= 0) {
            z(false);
            return;
        }
        if (!z2 && this.c == i2 && this.k.size() != 0) {
            z(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.b.e()) {
            i2 = this.b.e() - 1;
        }
        int i4 = this.w;
        int i5 = this.c;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.k;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((fib) arrayList.get(i6)).c = true;
                i6++;
            }
        }
        boolean z3 = this.c != i2;
        if (!this.N) {
            g(i2);
            y(i2, z, i3, z3);
        } else {
            this.c = i2;
            if (z3) {
                w(i2);
            }
            requestLayout();
        }
    }

    public final void k(int i2) {
        if (this.R == i2) {
            return;
        }
        this.R = i2;
        List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fie fieVar = (fie) this.f.get(i3);
                if (fieVar != null) {
                    fieVar.a(i2);
                }
            }
        }
    }

    public final boolean l(int i2) throws Resources.NotFoundException {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean zN = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zN = n();
            } else if (i2 == 66 || i2 == 2) {
                zN = o();
            }
        } else if (i2 == 17) {
            Rect rect = this.m;
            zN = (viewFindFocus == null || t(rect, viewFindNextFocus).left < t(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : n();
        } else if (i2 == 66) {
            Rect rect2 = this.m;
            zN = (viewFindFocus == null || t(rect2, viewFindNextFocus).left > t(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : o();
        }
        if (zN) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zN;
    }

    protected final boolean m(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    final boolean n() throws Resources.NotFoundException {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        q(i2 - 1);
        return true;
    }

    final boolean o() throws Resources.NotFoundException {
        if (this.b == null || this.c >= r0.e() - 1) {
            return false;
        }
        q(this.c + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            C();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
            this.y = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.R == 2 && Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.M) {
                this.o.abortAnimation();
                this.v = false;
                f();
                this.x = true;
                D();
                k(1);
            } else if (ebf.fK(this.d) == BitmapDescriptorFactory.HUE_RED && ebf.fK(this.e) == BitmapDescriptorFactory.HUE_RED) {
                v(false);
                this.x = false;
            } else {
                this.x = true;
                k(1);
                if (ebf.fK(this.d) != BitmapDescriptorFactory.HUE_RED) {
                    ebf.e(this.d, BitmapDescriptorFactory.HUE_RED, 1.0f - (this.E / getHeight()));
                }
                if (ebf.fK(this.e) != BitmapDescriptorFactory.HUE_RED) {
                    ebf.e(this.e, BitmapDescriptorFactory.HUE_RED, this.E / getHeight());
                }
            }
        } else {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
            if (action == 2) {
                int i2 = this.H;
                if (i2 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.D;
                    float fAbs = Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.G);
                    if (f != BitmapDescriptorFactory.HUE_RED) {
                        float f2 = this.D;
                        if ((this.C || ((f2 >= this.A || f <= BitmapDescriptorFactory.HUE_RED) && (f2 <= getWidth() - this.A || f >= BitmapDescriptorFactory.HUE_RED))) && m(this, false, (int) f, (int) x2, (int) y2)) {
                            this.D = x2;
                            this.E = y2;
                            this.y = true;
                            return false;
                        }
                    }
                    float f3 = this.B;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.x = true;
                        D();
                        k(1);
                        float f4 = this.F;
                        this.D = f > BitmapDescriptorFactory.HUE_RED ? f4 + this.B : f4 - this.B;
                        this.E = y2;
                        z(true);
                    } else if (fAbs2 > f3) {
                        this.y = true;
                    }
                    if (this.x && B(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                x(motionEvent);
            }
        }
        VelocityTracker velocityTrackerObtain = this.I;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.I = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        fic ficVar;
        fic ficVar2;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (ficVar2 = (fic) childAt.getLayoutParams()) != null && ficVar2.a) {
                int i9 = ficVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                if (i10 != 3 && i10 != 5) {
                    z2 = z;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (ficVar2.width != -2) {
                    i5 = ficVar2.width != -1 ? ficVar2.width : paddingLeft;
                    i12 = 1073741824;
                } else {
                    i5 = paddingLeft;
                }
                if (ficVar2.height != -2) {
                    i6 = ficVar2.height != -1 ? ficVar2.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i4;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.t = true;
        f();
        this.t = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((ficVar = (fic) childAt2.getLayoutParams()) == null || !ficVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * ficVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        fib fibVarB;
        int i6 = i2 & 2;
        int childCount = getChildCount();
        if (i6 != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fibVarB = b(childAt)) != null && fibVarB.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        if (this.b != null) {
            Parcelable parcelable2 = savedState.b;
            ClassLoader classLoader = savedState.e;
            j(savedState.a, false, true, 0);
        } else {
            this.n = savedState.a;
            Parcelable parcelable3 = savedState.b;
            ClassLoader classLoader2 = savedState.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        if (this.b != null) {
            savedState.b = null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 > 0 && !this.k.isEmpty()) {
                if (!this.o.isFinished()) {
                    this.o.setFinalX(this.c * s());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            fib fibVarC = c(this.c);
            int iMin = (int) ((fibVarC != null ? Math.min(fibVarC.e, this.s) : BitmapDescriptorFactory.HUE_RED) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                v(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    final void p(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.o = new Scroller(context, i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = new EdgeEffect(context);
        this.e = new EdgeEffect(context);
        this.L = (int) (25.0f * f);
        this.M = (int) (f + f);
        this.z = (int) (f * 16.0f);
        ebm.o(this, new fid(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ebe.e(this, new fhz(this));
    }

    public final void q(int i2) throws Resources.NotFoundException {
        this.v = false;
        j(i2, true, false, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void r(int r13, float r14) {
        /*
            r12 = this;
            int r0 = r12.P
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            fic r9 = (defpackage.fic) r9
            boolean r10 = r9.a
            if (r10 == 0) goto L67
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            java.util.List r0 = r12.f
            if (r0 == 0) goto L84
            int r0 = r0.size()
        L72:
            if (r1 >= r0) goto L84
            java.util.List r3 = r12.f
            java.lang.Object r3 = r3.get(r1)
            fie r3 = (defpackage.fie) r3
            if (r3 == 0) goto L81
            r3.c(r13, r14)
        L81:
            int r1 = r1 + 1
            goto L72
        L84:
            r12.O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int, float):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new fic();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(6);
        int a;
        Parcelable b;
        ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new ArrayList();
        this.l = new fib();
        this.m = new Rect();
        this.n = -1;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.w = 1;
        this.C = true;
        this.H = -1;
        this.N = true;
        this.Q = new elt(this, 10, null);
        this.R = 0;
        p(context);
    }
}
