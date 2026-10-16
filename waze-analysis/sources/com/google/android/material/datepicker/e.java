package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    final d f6454a;

    /* renamed from: b, reason: collision with root package name */
    final d f6455b;

    /* renamed from: c, reason: collision with root package name */
    final d f6456c;

    /* renamed from: d, reason: collision with root package name */
    final d f6457d;

    /* renamed from: e, reason: collision with root package name */
    final d f6458e;

    /* renamed from: f, reason: collision with root package name */
    final d f6459f;

    /* renamed from: g, reason: collision with root package name */
    final d f6460g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f6461h;

    e(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.internal.t.f(context, R.attr.materialCalendarStyle, z.class.getCanonicalName()), ar.f6428a);
        this.f6454a = d.c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f6460g = d.c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f6455b = d.c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f6456c = d.c(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListN = com.google.android.material.internal.t.n(context, typedArrayObtainStyledAttributes, 7);
        this.f6457d = d.c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f6458e = d.c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f6459f = d.c(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f6461h = paint;
        paint.setColor(colorStateListN.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
