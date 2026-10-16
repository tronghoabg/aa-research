package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import defpackage.hif;
import defpackage.kdx;
import defpackage.yph;

/* loaded from: classes2.dex */
public class RowContainerViewActionListImpl extends kdx {
    private static final yph a = yph.c("CarApp.H.Tem");
    private static final int[] b = {R.attr.templateFocusStateInactive};
    private boolean c;
    private final Drawable d;
    private final int e;
    private final int f;
    private final int g;
    private ViewGroup h;
    private ViewGroup i;
    private hif j;
    private int k;

    public RowContainerViewActionListImpl(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.k = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRowBackgroundMiddle, R.attr.templateRowBackgroundTop, R.attr.templateRowBackgroundBottom, R.attr.templateRowBackgroundTopBottom, R.attr.templateRowBackgroundSimple, R.attr.templateRowBackgroundType, R.attr.templateRowBackgroundSectionalBottomMargin, R.attr.templateRowHorizontalPadding, R.attr.templateRowHorizontalHalfPadding, R.attr.templateRowListToLargeImageRatio, R.attr.templateRowListLargeImageContainerMaxWidth, R.attr.templateRowListAndImagePadding, R.attr.templateRowListStyle});
        this.d = typedArrayObtainStyledAttributes.getDrawable(4);
        this.e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
        typedArrayObtainStyledAttributes.recycle();
        context.obtainStyledAttributes(resourceId, new int[]{R.attr.listMaxWidth, R.attr.listWidthFraction}).recycle();
    }

    private final RowView b() {
        View childAt = this.h.getChildAt(0);
        if (childAt instanceof RowView) {
            return (RowView) childAt;
        }
        return null;
    }

    private final void g(boolean z) {
        if ((this.k & 4) != 0) {
            setSelected(z);
        }
    }

    @Override // defpackage.kdx
    public final hif a() {
        return this.j;
    }

    @Override // defpackage.kdx
    public final void c(boolean z, boolean z2) {
        if ((this.k & 4) != 0) {
            g(z);
        }
        RowView rowViewB = b();
        if (rowViewB != null) {
            rowViewB.e(z, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    @Override // defpackage.kdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.geu r6, java.util.List r7, int r8, defpackage.hie r9) {
        /*
            r5 = this;
            java.lang.Object r7 = r7.get(r8)
            hif r7 = (defpackage.hif) r7
            r7.getClass()
            r5.j = r7
            him r8 = r7.a
            int r9 = r8.f
            r5.k = r9
            r9 = 0
            r5.setOnClickListener(r9)
            r5.setOnFocusChangeListener(r9)
            r0 = 0
            r5.setSelected(r0)
            r1 = 1
            r5.c(r0, r1)
            android.view.ViewGroup r2 = r5.h
            int r2 = r2.getChildCount()
            if (r2 <= 0) goto L2f
            android.view.ViewGroup r2 = r5.h
            android.view.View r2 = r2.getChildAt(r0)
            goto L30
        L2f:
            r2 = r9
        L30:
            if (r2 == 0) goto L3c
            boolean r3 = r2 instanceof com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView
            if (r3 != 0) goto L3c
            android.view.ViewGroup r3 = r5.h
            r3.removeView(r2)
            r2 = r9
        L3c:
            if (r2 != 0) goto L54
            android.content.Context r2 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131623964(0x7f0e001c, float:1.8875094E38)
            android.view.ViewGroup r4 = r5.h
            android.view.View r2 = r2.inflate(r3, r4, r0)
            android.view.ViewGroup r3 = r5.h
            r3.addView(r2)
        L54:
            ghy r3 = r8.g
            com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView r2 = (com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView) r2
            afbe r4 = defpackage.afbe.a
            int r3 = r3.f
            r2.a(r6, r4, r3)
            r6 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r6)
            android.view.ViewGroup r6 = r5.i
            r6.setPadding(r0, r0, r0, r0)
            r5.setClickable(r0)
            boolean r6 = r5.c
            if (r6 == r1) goto L75
            r5.c = r1
            r5.refreshDrawableState()
        L75:
            boolean r6 = r7.b()
            r6 = r6 ^ r1
            r5.setFocusable(r6)
            int r6 = r5.e
            r7 = 2
            if (r6 == 0) goto L9d
            if (r6 == r1) goto L97
            if (r6 == r7) goto L9d
            yph r1 = com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewActionListImpl.a
            yop r1 = r1.h()
            java.lang.String r2 = "Background type unknown: %d"
            r3 = 2951(0xb87, float:4.135E-42)
            defpackage.a.bO(r1, r2, r6, r3)
            r5.setBackground(r9)
            goto La0
        L97:
            android.graphics.drawable.Drawable r9 = r5.d
            r5.setBackground(r9)
            goto La0
        L9d:
            r5.setBackground(r9)
        La0:
            if (r6 == r7) goto La3
            goto Lbe
        La3:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            ma r6 = (defpackage.ma) r6
            r6.getClass()
            int r7 = r6.bottomMargin
            if (r7 != 0) goto Lb6
            int r7 = r6.getMarginEnd()
            if (r7 == 0) goto Lbe
        Lb6:
            r6.bottomMargin = r0
            r6.setMarginEnd(r0)
            r5.setLayoutParams(r6)
        Lbe:
            boolean r6 = r8.h
            if (r6 == 0) goto Lc5
            int r6 = r5.g
            goto Lc7
        Lc5:
            int r6 = r5.f
        Lc7:
            android.view.ViewGroup r7 = r5.i
            int r8 = r7.getPaddingTop()
            android.view.ViewGroup r5 = r5.i
            int r5 = r5.getPaddingBottom()
            r7.setPadding(r6, r8, r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewActionListImpl.d(geu, java.util.List, int, hie):void");
    }

    @Override // defpackage.kdx
    public final void e() {
        RowView rowViewB = b();
        if (rowViewB != null) {
            g(rowViewB.k());
        }
    }

    @Override // defpackage.kdx
    public final boolean f() {
        return this.h.getGlobalVisibleRect(new Rect());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        if (!this.c) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, b);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (ViewGroup) findViewById(R.id.container);
        this.i = (ViewGroup) findViewById(R.id.content);
    }

    public RowContainerViewActionListImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.markerAppearance);
    }

    public RowContainerViewActionListImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RowContainerViewActionListImpl(Context context) {
        this(context, null);
    }
}
