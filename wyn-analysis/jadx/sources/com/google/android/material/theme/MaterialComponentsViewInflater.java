package com.google.android.material.theme;

import A6.h;
import Q7.c;
import W7.k;
import Y7.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;
import com.wynauto.wyn.R;
import f8.t;
import g8.C2714a;
import j.z;
import q.C3824m;
import q.Y;

/* loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends z {
    @Override // j.z
    public final C3824m a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // j.z
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // j.z
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // j.z
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        a aVar = new a(h8.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = aVar.getContext();
        TypedArray typedArrayF = k.f(context2, attributeSet, I7.a.f5411n, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayF.hasValue(0)) {
            aVar.setButtonTintList(Ba.c.w(context2, typedArrayF, 0));
        }
        aVar.f16712f = typedArrayF.getBoolean(1, false);
        typedArrayF.recycle();
        return aVar;
    }

    @Override // j.z
    public final Y e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C2714a c2714a = new C2714a(h8.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c2714a.getContext();
        if (h.K(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = I7.a.f5414q;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iG = C2714a.g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, I7.a.f5413p);
                    int iG2 = C2714a.g(c2714a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        c2714a.setLineHeight(iG2);
                    }
                }
            }
        }
        return c2714a;
    }
}
