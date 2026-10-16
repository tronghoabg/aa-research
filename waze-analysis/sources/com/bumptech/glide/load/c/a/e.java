package com.bumptech.glide.load.c.a;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e implements com.bumptech.glide.load.w {
    @Override // com.bumptech.glide.load.w
    public final com.bumptech.glide.load.a.aw b(Context context, com.bumptech.glide.load.a.aw awVar, int i2, int i3) {
        if (!com.bumptech.glide.g.r.o(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.a.a.c cVarH = com.bumptech.glide.c.b(context).h();
        Bitmap bitmap = (Bitmap) awVar.c();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(cVarH, bitmap, i2, i3);
        return bitmap.equals(bitmapC) ? awVar : ak.g(bitmapC, cVarH);
    }

    protected abstract Bitmap c(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3);
}
