package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class wkz<V extends View> extends wlc<V> {
    private Runnable a;
    OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public wkz() {
        this.d = -1;
        this.f = -1;
    }

    public int J(View view) {
        throw null;
    }

    public int K(View view) {
        throw null;
    }

    public int L() {
        throw null;
    }

    public int M(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void O(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean Q(View view) {
        throw null;
    }

    public final int T(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return M(coordinatorLayout, view, L() - i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L3f
            boolean r0 = r6.c
            if (r0 == 0) goto L3f
            int r0 = r6.d
            if (r0 != r3) goto L25
            goto L8d
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r3) goto L8d
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.e
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f
            if (r1 <= r5) goto L3f
            r6.e = r0
            return r2
        L3f:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L86
            r6.d = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.Q(r8)
            if (r3 == 0) goto L5f
            boolean r7 = r7.k(r8, r0, r1)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r4
        L60:
            r6.c = r7
            if (r7 == 0) goto L86
            r6.e = r1
            int r7 = r9.getPointerId(r4)
            r6.d = r7
            android.view.VelocityTracker r7 = r6.g
            if (r7 != 0) goto L76
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.g = r7
        L76:
            android.widget.OverScroller r7 = r6.b
            if (r7 == 0) goto L86
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L86
            android.widget.OverScroller r6 = r6.b
            r6.abortAnimation()
            return r2
        L86:
            android.view.VelocityTracker r6 = r6.g
            if (r6 == 0) goto L8d
            r6.addMovement(r9)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkz.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0 A[ADDED_TO_REGION] */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkz.i(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public wkz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
