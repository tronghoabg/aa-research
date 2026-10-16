package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nbr extends android.graphics.drawable.TransitionDrawable {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.OneShotTransition");
    public boolean a;

    public nbr(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        super(new android.graphics.drawable.Drawable[]{drawable == null ? new android.graphics.drawable.ColorDrawable(0) : drawable, drawable2});
        setCrossFadeEnabled(true);
    }

    @Override // android.graphics.drawable.TransitionDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.Bitmap bitmap;
        canvas.getClass();
        for (int i = 0; i < 2; i++) {
            android.graphics.drawable.Drawable drawable = getDrawable(i);
            if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (bitmap = (bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable).getBitmap()) != null && bitmap.isRecycled() && this.a) {
                ((defpackage.yqj) b.h()).B("Bitmap for drawable index %d was recycled before transition finished. Alpha was %d (expected 0). Clearing the drawable.", i, bitmapDrawable.getAlpha());
                setDrawable(i, new android.graphics.drawable.ColorDrawable(0));
            }
        }
        super.draw(canvas);
        if (getDrawable(0).getAlpha() == 0) {
            setDrawable(0, new android.graphics.drawable.ColorDrawable(0));
        }
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void resetTransition() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void reverseTransition(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
