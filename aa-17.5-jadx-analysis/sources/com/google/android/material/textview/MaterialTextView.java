package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.eee;
import defpackage.ka;
import defpackage.woy;
import defpackage.wub;
import defpackage.wxo;
import defpackage.wxp;

/* loaded from: classes.dex */
public class MaterialTextView extends ka {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(wxp.b(context, attributeSet, i, 0, new int[0]), attributeSet, i);
        int i2 = wxp.a;
        c(attributeSet, i, 0);
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int iF = -1;
        for (int i = 0; i < 2 && iF < 0; i++) {
            iF = wub.f(context, typedArray, iArr[i], -1);
        }
        return iF;
    }

    private final void b(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, wxo.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            eee.d(this, iA);
        }
    }

    private final void c(AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        Context context = getContext();
        if (woy.A(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = wxo.b;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int iA = a(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    @Override // defpackage.ka, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (woy.z(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(wxp.a(context, attributeSet, i, i2), attributeSet, i);
        c(attributeSet, i, i2);
    }
}
