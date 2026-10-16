package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class een {
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public View k;
    private int[] m;
    private int[] n;
    private int[] o;
    private int p;
    private VelocityTracker q;
    private final float r;
    private final OverScroller s;
    private final eem t;
    private boolean u;
    private final ViewGroup v;
    private int l = -1;
    private final Runnable w = new ne(this, 12);

    public een(Context context, ViewGroup viewGroup, eem eemVar) {
        if (eemVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.v = viewGroup;
        this.t = eemVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.i = i;
        this.h = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = new OverScroller(context, new eel(0));
    }

    public static een b(ViewGroup viewGroup, eem eemVar) {
        return new een(viewGroup.getContext(), viewGroup, eemVar);
    }

    public static een m(ViewGroup viewGroup, eem eemVar) {
        een eenVarB = b(viewGroup, eemVar);
        eenVarB.b = eenVarB.b;
        return eenVarB;
    }

    private final int n(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth() / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            float f = width;
            iAbs = Math.round(Math.abs((f + (fSin * f)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private final void o(int i) {
        float[] fArr = this.c;
        if (fArr == null || !g(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.d[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.m[i] = 0;
        this.n[i] = 0;
        this.o[i] = 0;
        this.p = (~(1 << i)) & this.p;
    }

    private final void p(float f, float f2) {
        this.u = true;
        this.t.e(this.k, f, f2);
        this.u = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void q() {
        float f = this.r;
        this.q.computeCurrentVelocity(1000, f);
        p(y(this.q.getXVelocity(this.l), this.g, f), y(this.q.getYVelocity(this.l), this.g, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [eem] */
    private final void r(float f, float f2, int i) {
        boolean zU = u(f, f2, i, 1);
        boolean z = zU;
        if (u(f2, f, i, 4)) {
            z = (zU ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (u(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (u(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.n;
            iArr[i] = iArr[i] | r0;
            this.t.b(r0, i);
        }
    }

    private final void s(float f, float f2, int i) {
        float[] fArr = this.c;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.d;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.m;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.n;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.o;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.c = fArr2;
            this.d = fArr3;
            this.e = fArr4;
            this.f = fArr5;
            this.m = iArr;
            this.n = iArr2;
            this.o = iArr3;
            fArr = fArr2;
        }
        this.e[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.d;
        this.f[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.m;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.h ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.h) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.h) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.h) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.p |= 1 << i;
    }

    private final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }

    private final boolean u(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.m[i] & i2) == i2 && (this.j & i2) != 0 && (this.o[i] & i2) != i2 && (this.n[i] & i2) != i2) {
            float f3 = this.b;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f) {
                    this.t.j();
                }
                if ((this.n[i] & i2) == 0 && fAbs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean v(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        eem eemVar = this.t;
        boolean z = eemVar.a(view) > 0;
        boolean z2 = eemVar.i() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        int i = this.b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean w(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int left = this.k.getLeft();
        int top = this.k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.s.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.k;
        int i8 = (int) this.g;
        int i9 = (int) this.r;
        int iZ = z(i3, i8, i9);
        int iZ2 = z(i4, (int) this.g, i9);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iZ);
        int iAbs4 = Math.abs(iZ2);
        int i10 = iAbs3 + iAbs4;
        int i11 = iAbs + iAbs2;
        if (iZ != 0) {
            f = iAbs3 / i10;
        } else {
            f = iAbs / i11;
        }
        if (iZ2 != 0) {
            f2 = i10;
            f3 = iAbs4;
        } else {
            f2 = i11;
            f3 = iAbs2;
        }
        float f4 = f3 / f2;
        eem eemVar = this.t;
        this.s.startScroll(left, top, i7, i6, (int) ((n(i7, iZ, eemVar.a(view)) * f) + (n(i6, iZ2, eemVar.i()) * f4)));
        f(2);
        return true;
    }

    private final boolean x(int i) {
        return g(i);
    }

    private static final float y(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        return fAbs < f2 ? BitmapDescriptorFactory.HUE_RED : fAbs > f3 ? f > BitmapDescriptorFactory.HUE_RED ? f3 : -f3 : f;
    }

    private static final int z(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final View a(int i, int i2) {
        ViewGroup viewGroup = this.v;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.l = -1;
        float[] fArr = this.c;
        if (fArr != null) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.d, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.e, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.m, 0);
            Arrays.fill(this.n, 0);
            Arrays.fill(this.o, 0);
            this.p = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    public final void d(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException(a.bm(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")"));
        }
        this.k = view;
        this.l = i;
        this.t.c(view, i);
        f(1);
    }

    public final void e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        VelocityTracker velocityTrackerObtain = this.q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewA = a((int) x, (int) y);
            s(x, y, pointerId);
            k(viewA, pointerId);
            if ((this.m[pointerId] & this.j) != 0) {
                this.t.k();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                q();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.a == 1) {
                int i2 = this.l;
                if (!x(i2) || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                    return;
                }
                float x2 = motionEvent.getX(iFindPointerIndex);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.e;
                int i3 = this.l;
                float f = x2 - fArr[i3];
                float f2 = y2 - this.f[i3];
                int i4 = (int) f;
                int left = this.k.getLeft() + i4;
                int i5 = (int) f2;
                int top = this.k.getTop() + i5;
                int left2 = this.k.getLeft();
                int top2 = this.k.getTop();
                if (i4 != 0) {
                    left = this.t.g(this.k, left);
                    int[] iArr = ebm.a;
                    this.k.offsetLeftAndRight(left - left2);
                }
                if (i5 != 0) {
                    top = this.t.h(this.k, top);
                    int[] iArr2 = ebm.a;
                    this.k.offsetTopAndBottom(top - top2);
                }
                if (i4 != 0 || i5 != 0) {
                    this.t.l(this.k, left, top);
                }
            } else {
                int pointerCount = motionEvent.getPointerCount();
                while (i < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i);
                    if (x(pointerId2)) {
                        float x3 = motionEvent.getX(i);
                        float y3 = motionEvent.getY(i);
                        float f3 = x3 - this.c[pointerId2];
                        float f4 = y3 - this.d[pointerId2];
                        r(f3, f4, pointerId2);
                        if (this.a == 1) {
                            break;
                        }
                        View viewA2 = a((int) x3, (int) y3);
                        if (v(viewA2, f3, f4) && k(viewA2, pointerId2)) {
                            break;
                        }
                    }
                    i++;
                }
            }
            t(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                p(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            c();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.l) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount2) {
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.l) {
                        View viewA3 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view = this.k;
                        if (viewA3 == view && k(view, pointerId4)) {
                            if (this.l == -1) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                q();
            }
            o(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x4 = motionEvent.getX(actionIndex);
        int i6 = (int) x4;
        float y4 = motionEvent.getY(actionIndex);
        int i7 = (int) y4;
        s(x4, y4, pointerId5);
        if (this.a == 0) {
            k(a(i6, i7), pointerId5);
            if ((this.m[pointerId5] & this.j) != 0) {
                this.t.k();
                return;
            }
            return;
        }
        View view2 = this.k;
        if (view2 != null && i6 >= view2.getLeft() && i6 < view2.getRight() && i7 >= view2.getTop() && i7 < view2.getBottom()) {
            k(this.k, pointerId5);
        }
    }

    public final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.t.d(i);
            if (this.a == 0) {
                this.k = null;
            }
        }
    }

    public final boolean g(int i) {
        return (this.p & (1 << i)) != 0;
    }

    public final boolean h(int i, int i2) {
        if (this.u) {
            return w(i, i2, (int) this.q.getXVelocity(this.l), (int) this.q.getYVelocity(this.l));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.een.i(android.view.MotionEvent):boolean");
    }

    public final boolean j(View view, int i, int i2) {
        this.k = view;
        this.l = -1;
        boolean zW = w(i, i2, 0, 0);
        if (zW || this.a != 0 || this.k == null) {
            return zW;
        }
        this.k = null;
        return false;
    }

    final boolean k(View view, int i) {
        if (view == this.k && this.l == i) {
            return true;
        }
        if (view == null || !this.t.f(view, i)) {
            return false;
        }
        this.l = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            OverScroller overScroller = this.s;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.k.getLeft();
            int top = currY - this.k.getTop();
            if (left != 0) {
                View view = this.k;
                int[] iArr = ebm.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.k;
                int[] iArr2 = ebm.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.t.l(this.k, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            } else if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }
}
