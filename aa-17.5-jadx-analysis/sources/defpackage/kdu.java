package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;

/* loaded from: classes2.dex */
public final class kdu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int a;
    final /* synthetic */ MaterialRowView b;

    public kdu(MaterialRowView materialRowView, int i) {
        this.a = i;
        this.b = materialRowView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            r8 = this;
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView r0 = r8.b
            android.widget.LinearLayout r1 = r0.t
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnPreDrawListener(r8)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.v
            r2 = 2131429348(0x7f0b07e4, float:1.8480366E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView r1 = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) r1
            int r1 = r1.getLineCount()
            r2 = 16
            r3 = 1
            if (r1 <= r3) goto L20
            goto L3e
        L20:
            r4 = 0
            r5 = r4
        L22:
            android.widget.LinearLayout r6 = r0.t
            int r6 = r6.getChildCount()
            if (r5 >= r6) goto La8
            android.widget.LinearLayout r6 = r0.t
            android.view.View r6 = r6.getChildAt(r5)
            boolean r7 = r6 instanceof com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView
            if (r7 == 0) goto La4
            com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView r6 = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) r6
            int r6 = r6.getLineCount()
            int r1 = r1 + r6
            if (r1 > r3) goto L3e
            goto La4
        L3e:
            int r8 = r8.a
            r1 = 48
            r0.d(r1)
            com.google.android.material.imageview.ShapeableImageView r4 = r0.y
            boolean r4 = com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.l(r4)
            if (r4 == 0) goto L8c
            r4 = 8
            if (r8 != r4) goto L7f
            androidx.constraintlayout.widget.ConstraintLayout r8 = r0.v
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r5 = r0.c
            geu r6 = r0.L
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r3, r5, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            com.google.android.material.imageview.ShapeableImageView r7 = r0.y
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            float r8 = r8 / r6
            float r8 = r8 - r5
            int r8 = (int) r8
            r7.topMargin = r8
            com.google.android.material.imageview.ShapeableImageView r8 = r0.y
            r8.setLayoutParams(r7)
            r8 = r4
        L7f:
            android.widget.LinearLayout r4 = r0.x
            r0.i(r4)
            r4 = 2
            if (r8 != r4) goto L88
            goto L89
        L88:
            r2 = r1
        L89:
            r0.j(r2)
        L8c:
            r0.h(r3)
            android.widget.FrameLayout r8 = r0.A
            r0.i(r8)
            android.widget.FrameLayout r8 = r0.u
            r0.i(r8)
            android.widget.LinearLayout r8 = r0.C
            r0.i(r8)
            android.widget.FrameLayout r8 = r0.E
            r0.i(r8)
            goto Ld9
        La4:
            int r5 = r5 + 1
            goto L22
        La8:
            r0.d(r2)
            com.google.android.material.imageview.ShapeableImageView r8 = r0.y
            boolean r8 = com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.l(r8)
            if (r8 == 0) goto Lbd
            android.widget.LinearLayout r8 = r0.x
            int r1 = r0.i
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.o(r8, r1, r2)
            r0.j(r2)
        Lbd:
            r0.h(r4)
            android.widget.FrameLayout r8 = r0.A
            int r1 = r0.i
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.o(r8, r1, r2)
            android.widget.FrameLayout r8 = r0.u
            int r1 = r0.h
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.o(r8, r1, r2)
            android.widget.LinearLayout r8 = r0.C
            r4 = -2
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.o(r8, r4, r2)
            android.widget.FrameLayout r8 = r0.E
            com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.o(r8, r1, r2)
        Ld9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdu.onPreDraw():boolean");
    }
}
