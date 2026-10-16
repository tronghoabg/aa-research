package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public abstract class iag implements huq {
    @Override // defpackage.huq
    public final hwx b(Context context, hwx hwxVar, int i, int i2) {
        if (!ify.j(i, i2)) {
            throw new IllegalArgumentException(a.bB(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        hxe hxeVar = hrt.b(context).a;
        Bitmap bitmap = (Bitmap) hwxVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(hxeVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? hwxVar : ibn.g(bitmapC, hxeVar);
    }

    protected abstract Bitmap c(hxe hxeVar, Bitmap bitmap, int i, int i2);
}
