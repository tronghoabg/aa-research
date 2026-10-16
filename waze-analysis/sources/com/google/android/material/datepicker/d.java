package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f6448a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f6449b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f6450c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f6451d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6452e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.k.r f6453f;

    private d(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, com.google.android.material.k.r rVar, Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f6448a = rect;
        this.f6449b = colorStateList2;
        this.f6450c = colorStateList;
        this.f6451d = colorStateList3;
        this.f6452e = i2;
        this.f6453f = rVar;
    }

    static d c(Context context, int i2) throws Resources.NotFoundException {
        Preconditions.checkArgument(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, ar.f6429b);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListN = com.google.android.material.internal.t.n(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListN2 = com.google.android.material.internal.t.n(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListN3 = com.google.android.material.internal.t.n(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        com.google.android.material.k.r rVarI = com.google.android.material.k.r.l(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).i();
        typedArrayObtainStyledAttributes.recycle();
        return new d(colorStateListN, colorStateListN2, colorStateListN3, dimensionPixelSize, rVarI, rect);
    }

    final int a() {
        return this.f6448a.bottom;
    }

    final int b() {
        return this.f6448a.top;
    }

    final com.google.android.material.k.r d() {
        return this.f6453f;
    }

    final void e(TextView textView) {
        com.google.android.material.k.k kVar = new com.google.android.material.k.k();
        com.google.android.material.k.k kVar2 = new com.google.android.material.k.k();
        com.google.android.material.k.r rVar = this.f6453f;
        kVar.e(rVar);
        kVar2.e(rVar);
        kVar.v(this.f6450c);
        kVar.A(this.f6452e, this.f6451d);
        ColorStateList colorStateList = this.f6449b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), kVar, kVar2);
        Rect rect = this.f6448a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
