package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iap implements defpackage.hva {
    @Override // defpackage.hva
    public final defpackage.hxg b(android.content.Context context, defpackage.hxg hxgVar, int i, int i2) {
        if (!defpackage.igg.j(i, i2)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        defpackage.hxn hxnVar = defpackage.hsc.b(context).a;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hxgVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        android.graphics.Bitmap bitmapC = c(hxnVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? hxgVar : defpackage.ibw.g(bitmapC, hxnVar);
    }

    protected abstract android.graphics.Bitmap c(defpackage.hxn hxnVar, android.graphics.Bitmap bitmap, int i, int i2);
}
