package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wlv extends eem {
    final /* synthetic */ BottomSheetBehavior a;

    public wlv(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.eem
    public final void d(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.x) {
                bottomSheetBehavior.V(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // defpackage.eem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r5.a
            r3 = 6
            r4 = 3
            if (r1 >= 0) goto L1d
            boolean r7 = r2.a
            if (r7 == 0) goto L10
        Ld:
            r3 = r4
            goto Ld6
        L10:
            int r7 = r6.getTop()
            android.os.SystemClock.uptimeMillis()
            int r8 = r2.r
            if (r7 <= r8) goto Ld
            goto Ld6
        L1d:
            boolean r1 = r2.v
            if (r1 == 0) goto L6d
            boolean r1 = r2.ab(r6, r8)
            if (r1 == 0) goto L6d
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 5
            if (r7 >= 0) goto L3b
            int r7 = r2.b
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L4a
        L3b:
            int r7 = r6.getTop()
            int r8 = r2.B
            int r1 = r2.J()
            int r8 = r8 + r1
            int r8 = r8 / 2
            if (r7 <= r8) goto L4d
        L4a:
            r3 = r0
            goto Ld6
        L4d:
            boolean r7 = r2.a
            if (r7 == 0) goto L52
            goto Ld
        L52:
            int r7 = r6.getTop()
            int r8 = r2.J()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r2.r
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld6
            goto Ld
        L6d:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L9a
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L7f
            goto L9a
        L7f:
            boolean r7 = r2.a
            if (r7 == 0) goto L84
            goto Lb5
        L84:
            int r7 = r6.getTop()
            int r8 = r2.r
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.t
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb5
            goto Ld6
        L9a:
            int r7 = r6.getTop()
            boolean r8 = r2.a
            if (r8 == 0) goto Lb7
            int r8 = r2.q
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.t
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb5
            goto Ld
        Lb5:
            r3 = r1
            goto Ld6
        Lb7:
            int r8 = r2.r
            if (r7 >= r8) goto Lc7
            int r8 = r2.t
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld6
            goto Ld
        Lc7:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.t
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lb5
        Ld6:
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r5.a
            r7 = 1
            r5.X(r6, r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlv.e(android.view.View, float, float):void");
    }

    @Override // defpackage.eem
    public final boolean f(View view, int i) {
        View viewL;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.y;
        if (i2 == 1 || bottomSheetBehavior.I) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.G == i) {
            if (bottomSheetBehavior.c) {
                WeakReference weakReference = bottomSheetBehavior.H;
                viewL = weakReference != null ? (View) weakReference.get() : null;
            } else {
                viewL = bottomSheetBehavior.L();
            }
            if (viewL != null && viewL.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.C;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.eem
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.eem
    public final int h(View view, int i) {
        return dlz.j(i, this.a.J(), i());
    }

    @Override // defpackage.eem
    public final int i() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.Z() ? bottomSheetBehavior.B : bottomSheetBehavior.t;
    }

    @Override // defpackage.eem
    public final void l(View view, int i, int i2) {
        this.a.P(i2);
    }
}
