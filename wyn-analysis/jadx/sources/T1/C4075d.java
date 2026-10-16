package t1;

import a.AbstractC1304a;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.F;
import com.unity3d.services.UnityAdsConstants;
import g5.RunnableC2707d;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.S;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4075d {

    /* renamed from: v, reason: collision with root package name */
    public static final F f45603v = new F(1);

    /* renamed from: a, reason: collision with root package name */
    public int f45604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45605b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f45607d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f45608e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f45609f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f45610g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f45611h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f45612i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f45613j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f45614l;

    /* renamed from: m, reason: collision with root package name */
    public final float f45615m;

    /* renamed from: n, reason: collision with root package name */
    public final float f45616n;

    /* renamed from: o, reason: collision with root package name */
    public final int f45617o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f45618p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1304a f45619q;

    /* renamed from: r, reason: collision with root package name */
    public View f45620r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45621s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f45622t;

    /* renamed from: c, reason: collision with root package name */
    public int f45606c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC2707d f45623u = new RunnableC2707d(this, 24);

    public C4075d(Context context, CoordinatorLayout coordinatorLayout, AbstractC1304a abstractC1304a) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC1304a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f45622t = coordinatorLayout;
        this.f45619q = abstractC1304a;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f45617o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f45605b = viewConfiguration.getScaledTouchSlop();
        this.f45615m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f45616n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f45618p = new OverScroller(context, f45603v);
    }

    public final void a() {
        this.f45606c = -1;
        float[] fArr = this.f45607d;
        if (fArr != null) {
            Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f45608e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f45609f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f45610g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f45611h, 0);
            Arrays.fill(this.f45612i, 0);
            Arrays.fill(this.f45613j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f45614l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f45614l = null;
        }
    }

    public final void b(int i5, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f45622t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f45620r = view;
        this.f45606c = i5;
        this.f45619q.C(i5, view);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            a.a r1 = r3.f45619q
            int r4 = r1.x(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.y()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f45605b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f45605b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f45605b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4075d.c(android.view.View, float, float):boolean");
    }

    public final void d(int i5) {
        float[] fArr = this.f45607d;
        if (fArr != null) {
            int i10 = this.k;
            int i11 = 1 << i5;
            if ((i10 & i11) != 0) {
                fArr[i5] = 0.0f;
                this.f45608e[i5] = 0.0f;
                this.f45609f[i5] = 0.0f;
                this.f45610g[i5] = 0.0f;
                this.f45611h[i5] = 0;
                this.f45612i[i5] = 0;
                this.f45613j[i5] = 0;
                this.k = (~i11) & i10;
            }
        }
    }

    public final int e(int i5, int i10, int i11) {
        if (i5 == 0) {
            return 0;
        }
        float width = this.f45622t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i5) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f45604a == 2) {
            OverScroller overScroller = this.f45618p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f45620r.getLeft();
            int top = currY - this.f45620r.getTop();
            if (left != 0) {
                View view = this.f45620r;
                WeakHashMap weakHashMap = S.f38779a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f45620r;
                WeakHashMap weakHashMap2 = S.f38779a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f45619q.E(this.f45620r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f45622t.post(this.f45623u);
            }
        }
        return this.f45604a == 2;
    }

    public final View g(int i5, int i10) {
        CoordinatorLayout coordinatorLayout = this.f45622t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f45619q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i5, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f45620r.getLeft();
        int top = this.f45620r.getTop();
        int i13 = i5 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f45618p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f45620r;
        int i15 = (int) this.f45616n;
        int i16 = (int) this.f45615m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i15) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i17 = iAbs5 + iAbs6;
        int i18 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f10 = iAbs5;
            f11 = i17;
        } else {
            f10 = iAbs3;
            f11 = i18;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = iAbs6;
            f13 = i17;
        } else {
            f12 = iAbs4;
            f13 = i18;
        }
        float f15 = f12 / f13;
        AbstractC1304a abstractC1304a = this.f45619q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, abstractC1304a.y()) * f15) + (e(i13, i11, abstractC1304a.x(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i5) {
        if ((this.k & (1 << i5)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i5 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f45614l == null) {
            this.f45614l = VelocityTracker.obtain();
        }
        this.f45614l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x5, (int) y10);
            l(pointerId, x5, y10);
            q(pointerId, viewG);
            int i11 = this.f45611h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f45604a == 1) {
                k();
            }
            a();
            return;
        }
        AbstractC1304a abstractC1304a = this.f45619q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f45604a == 1) {
                    this.f45621s = true;
                    abstractC1304a.F(this.f45620r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.f45621s = false;
                    if (this.f45604a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(pointerId2, x10, y11);
                if (this.f45604a == 0) {
                    q(pointerId2, g((int) x10, (int) y11));
                    int i12 = this.f45611h[pointerId2];
                    return;
                }
                int i13 = (int) x10;
                int i14 = (int) y11;
                View view = this.f45620r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    q(pointerId2, this.f45620r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f45604a == 1 && pointerId3 == this.f45606c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i5 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f45606c) {
                        View viewG2 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view2 = this.f45620r;
                        if (viewG2 == view2 && q(pointerId4, view2)) {
                            i5 = this.f45606c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i5 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f45604a == 1) {
            if (i(this.f45606c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f45606c);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f45609f;
                int i15 = this.f45606c;
                int i16 = (int) (x11 - fArr[i15]);
                int i17 = (int) (y12 - this.f45610g[i15]);
                int left = this.f45620r.getLeft() + i16;
                int top = this.f45620r.getTop() + i17;
                int left2 = this.f45620r.getLeft();
                int top2 = this.f45620r.getTop();
                if (i16 != 0) {
                    left = abstractC1304a.l(left, this.f45620r);
                    WeakHashMap weakHashMap = S.f38779a;
                    this.f45620r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = abstractC1304a.m(top, this.f45620r);
                    WeakHashMap weakHashMap2 = S.f38779a;
                    this.f45620r.offsetTopAndBottom(top - top2);
                }
                if (i16 != 0 || i17 != 0) {
                    abstractC1304a.E(this.f45620r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i10 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if (i(pointerId5)) {
                float x12 = motionEvent.getX(i10);
                float y13 = motionEvent.getY(i10);
                float f10 = x12 - this.f45607d[pointerId5];
                float f11 = y13 - this.f45608e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i18 = this.f45611h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i19 = this.f45611h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i20 = this.f45611h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i21 = this.f45611h[pointerId5];
                if (this.f45604a != 1) {
                    View viewG3 = g((int) x12, (int) y13);
                    if (c(viewG3, f10, f11) && q(pointerId5, viewG3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i10++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f45614l;
        float f10 = this.f45615m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f45614l.getXVelocity(this.f45606c);
        float f11 = this.f45616n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f10 : -f10;
        }
        float yVelocity = this.f45614l.getYVelocity(this.f45606c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = -f10;
        }
        this.f45621s = true;
        this.f45619q.F(this.f45620r, xVelocity, f10);
        this.f45621s = false;
        if (this.f45604a == 1) {
            n(0);
        }
    }

    public final void l(int i5, float f10, float f11) {
        float[] fArr = this.f45607d;
        if (fArr == null || fArr.length <= i5) {
            int i10 = i5 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f45608e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f45609f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f45610g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f45611h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f45612i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f45613j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f45607d = fArr2;
            this.f45608e = fArr3;
            this.f45609f = fArr4;
            this.f45610g = fArr5;
            this.f45611h = iArr;
            this.f45612i = iArr2;
            this.f45613j = iArr3;
        }
        float[] fArr9 = this.f45607d;
        this.f45609f[i5] = f10;
        fArr9[i5] = f10;
        float[] fArr10 = this.f45608e;
        this.f45610g[i5] = f11;
        fArr10[i5] = f11;
        int[] iArr7 = this.f45611h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f45622t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f45617o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < coordinatorLayout.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i5] = i14;
        this.k = (1 << i5) | this.k;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (i(pointerId)) {
                float x5 = motionEvent.getX(i5);
                float y10 = motionEvent.getY(i5);
                this.f45609f[pointerId] = x5;
                this.f45610g[pointerId] = y10;
            }
        }
    }

    public final void n(int i5) {
        this.f45622t.removeCallbacks(this.f45623u);
        if (this.f45604a != i5) {
            this.f45604a = i5;
            this.f45619q.D(i5);
            if (this.f45604a == 0) {
                this.f45620r = null;
            }
        }
    }

    public final boolean o(int i5, int i10) {
        if (this.f45621s) {
            return h(i5, i10, (int) this.f45614l.getXVelocity(this.f45606c), (int) this.f45614l.getYVelocity(this.f45606c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C4075d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(int i5, View view) {
        if (view == this.f45620r && this.f45606c == i5) {
            return true;
        }
        if (view == null || !this.f45619q.N(i5, view)) {
            return false;
        }
        this.f45606c = i5;
        b(i5, view);
        return true;
    }
}
