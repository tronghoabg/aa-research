package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tky extends defpackage.tkr {
    private final android.content.Context b;
    private final java.lang.Integer c;

    public tky(android.content.Context context, defpackage.tkv tkvVar, java.lang.Integer num) {
        super(tkvVar);
        this.b = context;
        this.c = num;
    }

    @Override // defpackage.tkv
    public final androidx.core.graphics.drawable.IconCompat b(java.lang.Object obj) {
        android.graphics.Bitmap bitmapE;
        androidx.core.graphics.drawable.IconCompat iconCompatB = this.a.b(obj);
        android.graphics.drawable.Drawable drawableE = iconCompatB.e(this.b);
        if (drawableE == null) {
            java.util.Objects.toString(obj);
            throw new java.lang.IllegalStateException("Could not load drawable for ".concat(java.lang.String.valueOf(obj)));
        }
        android.graphics.drawable.Drawable drawableE2 = e(drawableE);
        if (iconCompatB.b() == 2) {
            java.lang.Integer num = this.c;
            bitmapE = defpackage.dtp.d(drawableE2, num.intValue(), num.intValue());
        } else {
            bitmapE = defpackage.dtp.e(drawableE2, 0, 0, 7);
        }
        while (true) {
            java.lang.Integer num2 = this.c;
            if (bitmapE.getWidth() == num2.intValue()) {
                return androidx.core.graphics.drawable.IconCompat.k(bitmapE);
            }
            int iMax = java.lang.Math.max(bitmapE.getWidth() / 2, num2.intValue());
            bitmapE = android.graphics.Bitmap.createScaledBitmap(bitmapE, iMax, iMax, true);
            bitmapE.getClass();
        }
    }

    protected android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable) {
        return drawable;
    }
}
