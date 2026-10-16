package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.wynauto.wyn.R;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a2.k f26899a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.k f26900b;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A6.h.L(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, I7.a.k);
        a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListW = Ba.c.w(context, typedArrayObtainStyledAttributes, 6);
        this.f26899a = a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f26900b = a2.k.e(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(colorStateListW.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
