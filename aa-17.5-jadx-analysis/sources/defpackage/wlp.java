package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes3.dex */
public final class wlp extends eem {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public wlp(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.eem
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.eem
    public final void c(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.a;
            swipeDismissBehavior.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.b = false;
        }
    }

    @Override // defpackage.eem
    public final void d(int i) {
        ykd ykdVar = this.a.f;
        if (ykdVar != null) {
            if (i != 0) {
                wvw.a().e(((BaseTransientBottomBar) ykdVar.a).s);
            } else {
                wvw.a().f(((BaseTransientBottomBar) ykdVar.a).s);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    @Override // defpackage.eem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.c = r9
            r9 = 0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            int r1 = r7.getWidth()
            r2 = 1
            if (r0 == 0) goto L2f
            int r3 = r7.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r6.a
            int r4 = r4.c
            r5 = 2
            if (r4 != r5) goto L19
            goto L48
        L19:
            if (r4 != 0) goto L25
            if (r3 != r2) goto L22
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L48
            goto L5c
        L22:
            if (r0 <= 0) goto L5c
            goto L48
        L25:
            if (r3 != r2) goto L2a
            if (r0 <= 0) goto L5c
            goto L48
        L2a:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L48
        L2f:
            int r0 = r7.getLeft()
            int r3 = r6.b
            int r0 = r0 - r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r3) goto L5c
        L48:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L57
            int r8 = r7.getLeft()
            int r9 = r6.b
            if (r8 >= r9) goto L55
            goto L57
        L55:
            int r9 = r9 + r1
            goto L5f
        L57:
            int r8 = r6.b
            int r9 = r8 - r1
            goto L5f
        L5c:
            int r9 = r6.b
            r2 = 0
        L5f:
            com.google.android.material.behavior.SwipeDismissBehavior r6 = r6.a
            een r8 = r6.a
            int r0 = r7.getTop()
            boolean r8 = r8.h(r9, r0)
            if (r8 == 0) goto L76
            wlr r8 = new wlr
            r8.<init>(r6, r7, r2)
            r7.postOnAnimation(r8)
            return
        L76:
            if (r2 == 0) goto L7f
            ykd r6 = r6.f
            if (r6 == 0) goto L7f
            r6.g(r7)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlp.e(android.view.View, float, float):void");
    }

    @Override // defpackage.eem
    public final boolean f(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.J(view);
    }

    @Override // defpackage.eem
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            width = this.b;
            if (layoutDirection == 1) {
                width -= view.getWidth();
                width2 = this.b;
            } else {
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            width = this.b;
            if (layoutDirection == 1) {
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width -= view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = this.b + view.getWidth();
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.eem
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.eem
    public final void l(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        float f = width * swipeDismissBehavior.d;
        float width2 = view.getWidth() * swipeDismissBehavior.e;
        float fAbs = Math.abs(i - this.b);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            view.setAlpha(SwipeDismissBehavior.K(1.0f - ((fAbs - f) / (width2 - f))));
        }
    }
}
