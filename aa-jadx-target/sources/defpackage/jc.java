package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jc {
    public final int[] a = {2131230958, 2131230956, 2131230882};
    public final int[] b = {2131230906, 2131230941, 2131230913, 2131230908, 2131230909, 2131230912, 2131230911};
    public final int[] c = {2131230955, 2131230957, 2131230899, 2131230951, 2131230952, 2131230953, 2131230954};
    public final int[] d = {2131230931, 2131230897, 2131230930};
    public final int[] e = {2131230949, 2131230959};
    public final int[] f = {2131230885, 2131230891, 2131230886, 2131230892};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final android.content.res.ColorStateList b(android.content.Context context, int i) {
        int iB = defpackage.ne.b(context, 2130968942);
        return new android.content.res.ColorStateList(new int[][]{defpackage.ne.a, defpackage.ne.c, defpackage.ne.b, defpackage.ne.e}, new int[]{defpackage.ne.a(context, 2130968937), defpackage.dvk.d(iB, i), defpackage.dvk.d(iB, i), i});
    }

    public static final android.graphics.drawable.LayerDrawable c(defpackage.mu muVar, android.content.Context context, int i) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        android.graphics.drawable.Drawable drawableC = muVar.c(context, 2131230945);
        android.graphics.drawable.Drawable drawableC2 = muVar.c(context, 2131230946);
        if ((drawableC instanceof android.graphics.drawable.BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableC;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof android.graphics.drawable.BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableC2;
        } else {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void d(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = defpackage.jd.a;
        }
        drawableMutate.setColorFilter(defpackage.jd.b(i, mode));
    }
}
