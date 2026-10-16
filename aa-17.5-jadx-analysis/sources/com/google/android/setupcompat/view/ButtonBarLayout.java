package com.google.android.setupcompat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.android.setupcompat.template.FooterActionButton;
import defpackage.oct;
import defpackage.xql;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final oct d = new oct("ButtonBarLayout", (byte[]) null);
    private boolean a;
    private int b;
    private int c;

    public ButtonBarLayout(Context context) {
        super(context);
        this.a = false;
    }

    private final void a(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (z) {
                childAt.setTag(R.id.suc_customization_original_weight, Float.valueOf(layoutParams.weight));
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                layoutParams.leftMargin = 0;
            } else {
                Float f = (Float) childAt.getTag(R.id.suc_customization_original_weight);
                if (f != null) {
                    layoutParams.weight = f.floatValue();
                    z2 = z2;
                } else {
                    z2 = true;
                }
                b(childAt);
            }
            childAt.setLayoutParams(layoutParams);
            i++;
            z2 = z2;
        }
        setOrientation(z ? 1 : 0);
        if (!z2) {
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                } else {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        } else {
            Log.w("SetupLibrary", ((String) d.a).concat("Reorder the FooterActionButtons in the container"));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Collections.nCopies(3, null));
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = getChildAt(i2);
                b(childAt2);
                if (childAt2 instanceof FooterActionButton) {
                    arrayList.set(0, childAt2);
                } else {
                    arrayList.set(1, childAt2);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View view = (View) arrayList.get(i3);
                if (view != null) {
                    bringChildToFront(view);
                }
            }
        }
        if (!z) {
            if (xql.b(getContext())) {
                return;
            }
            setPadding(this.b, getPaddingTop(), this.c, getPaddingBottom());
            return;
        }
        if (getContext().getResources().getBoolean(R.bool.sucTwoPaneLayoutStyle) && xql.b(getContext())) {
            setHorizontalGravity(8388613);
        } else {
            setHorizontalGravity(17);
        }
        if (xql.b(getContext())) {
            return;
        }
        this.b = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.c = paddingRight;
        int iMax = Math.max(this.b, paddingRight);
        setPadding(iMax, getPaddingTop(), iMax, getPaddingBottom());
    }

    private static final void b(View view) {
        if (view instanceof FooterActionButton) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            boolean r0 = defpackage.xql.c(r0)
            if (r0 == 0) goto Le
            super.onMeasure(r8, r9)
            return
        Le:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            r1 = 0
            r7.a(r1)
            int r2 = android.view.View.MeasureSpec.getMode(r8)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1
            if (r2 != r3) goto L25
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r3 = r4
            goto L27
        L25:
            r2 = r8
            r3 = r1
        L27:
            super.onMeasure(r2, r9)
            if (r0 <= 0) goto L35
            int r2 = r7.getMeasuredWidth()
            if (r2 > r0) goto L33
            goto L35
        L33:
            r0 = r4
            goto L36
        L35:
            r0 = r1
        L36:
            android.content.Context r2 = r7.getContext()
            boolean r2 = defpackage.xql.c(r2)
            if (r2 != 0) goto L5c
            r7.getContext()
            int r2 = r7.getChildCount()
        L47:
            if (r1 >= r2) goto L56
            android.view.View r5 = r7.getChildAt(r1)
            boolean r6 = r5 instanceof com.google.android.setupcompat.template.FooterActionButton
            if (r6 == 0) goto L53
            com.google.android.setupcompat.template.FooterActionButton r5 = (com.google.android.setupcompat.template.FooterActionButton) r5
        L53:
            int r1 = r1 + 1
            goto L47
        L56:
            if (r0 == 0) goto L5c
            r7.a(r4)
            goto L5f
        L5c:
            if (r3 != 0) goto L5f
            return
        L5f:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupcompat.view.ButtonBarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() == i) {
            return;
        }
        super.setVisibility(i);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }
}
