package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.oxe;
import defpackage.oxl;
import defpackage.rsb;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FocusClusterLayout extends FrameLayout {
    private int a;

    public FocusClusterLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, oxl.b, i, i2);
        try {
            oxe oxeVarB = oxe.b(typedArrayObtainStyledAttributes.getInteger(0, 0), oxe.NONE);
            int integer = typedArrayObtainStyledAttributes.getInteger(1, 0);
            if (integer != 0 && integer != 1) {
                throw new IllegalArgumentException("Could not resolve requestFocusDescendantFocusability");
            }
            this.a = integer;
            typedArrayObtainStyledAttributes.recycle();
            rsb.b(this);
            rsb.c(this, new rsb(oxe.a(oxeVarB)));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (this.a == 1) {
            if (i == 33 || i == 130 || i == 17) {
                arrayList.add(this);
            } else if (i == 66) {
                i = 66;
                arrayList.add(this);
            }
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.a != 1) {
            return super.requestFocus(i, rect);
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(262144);
        boolean zRequestFocus = super.requestFocus(i, rect);
        setDescendantFocusability(descendantFocusability);
        return zRequestFocus;
    }

    public FocusClusterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public FocusClusterLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public FocusClusterLayout(Context context) {
        this(context, null, 0, 0);
    }
}
