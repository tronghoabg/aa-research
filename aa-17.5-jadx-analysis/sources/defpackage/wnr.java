package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class wnr {
    public final wnq a;
    final wnq b;
    final wnq c;
    final wnq d;
    final wnq e;
    final wnq f;
    final wnq g;
    public final Paint h;

    public wnr(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(woy.B(context, woa.class.getCanonicalName()), won.a);
        this.a = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListH = wub.h(context, typedArrayObtainStyledAttributes, 7);
        this.d = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = wnq.c(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListH.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
