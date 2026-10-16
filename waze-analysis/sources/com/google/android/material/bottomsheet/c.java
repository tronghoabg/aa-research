package com.google.android.material.bottomsheet;

import com.google.android.material.internal.r;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f6284a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6285b;

    c(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f6284a = z;
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6285b = bottomSheetBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    @Override // com.google.android.material.internal.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r10, androidx.core.view.WindowInsetsCompat r11, com.google.android.material.internal.s r12) {
        /*
            r9 = this;
            r0 = 519(0x207, float:7.27E-43)
            androidx.core.graphics.Insets r0 = r11.getInsets(r0)
            r1 = 32
            androidx.core.graphics.Insets r1 = r11.getInsets(r1)
            int r2 = r0.top
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r9.f6285b
            com.google.android.material.bottomsheet.BottomSheetBehavior.n(r3, r2)
            boolean r2 = com.google.android.material.internal.t.b(r10)
            int r4 = r10.getPaddingBottom()
            int r5 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r3)
            if (r7 == 0) goto L37
            int r11 = r11.getSystemWindowInsetBottom()
            com.google.android.material.bottomsheet.BottomSheetBehavior.m(r3, r11)
            int r11 = r12.f6625d
            int r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.b(r3)
            int r4 = r4 + r11
        L37:
            boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.G(r3)
            if (r11 == 0) goto L47
            if (r2 == 0) goto L42
            int r11 = r12.f6624c
            goto L44
        L42:
            int r11 = r12.f6622a
        L44:
            int r5 = r0.left
            int r5 = r5 + r11
        L47:
            boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.H(r3)
            if (r11 == 0) goto L58
            if (r2 == 0) goto L52
            int r11 = r12.f6622a
            goto L54
        L52:
            int r11 = r12.f6624c
        L54:
            int r12 = r0.right
            int r6 = r11 + r12
        L58:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            boolean r12 = com.google.android.material.bottomsheet.BottomSheetBehavior.B(r3)
            r2 = 1
            r7 = 0
            if (r12 == 0) goto L6f
            int r12 = r11.leftMargin
            int r8 = r0.left
            if (r12 == r8) goto L6f
            r11.leftMargin = r8
            r7 = r2
        L6f:
            boolean r12 = com.google.android.material.bottomsheet.BottomSheetBehavior.C(r3)
            if (r12 == 0) goto L7e
            int r12 = r11.rightMargin
            int r8 = r0.right
            if (r12 == r8) goto L7e
            r11.rightMargin = r8
            goto L7f
        L7e:
            r2 = r7
        L7f:
            boolean r12 = com.google.android.material.bottomsheet.BottomSheetBehavior.D(r3)
            if (r12 == 0) goto L8e
            int r12 = r11.topMargin
            int r0 = r0.top
            if (r12 == r0) goto L8e
            r11.topMargin = r0
            goto L90
        L8e:
            if (r2 == 0) goto L93
        L90:
            r10.setLayoutParams(r11)
        L93:
            int r11 = r10.getPaddingTop()
            r10.setPadding(r5, r11, r6, r4)
            boolean r9 = r9.f6284a
            if (r9 == 0) goto La3
            int r10 = r1.bottom
            com.google.android.material.bottomsheet.BottomSheetBehavior.l(r3, r10)
        La3:
            boolean r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r3)
            if (r10 != 0) goto Lad
            if (r9 == 0) goto Lac
            goto Lad
        Lac:
            return
        Lad:
            com.google.android.material.bottomsheet.BottomSheetBehavior.N(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.c.a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.s):void");
    }
}
