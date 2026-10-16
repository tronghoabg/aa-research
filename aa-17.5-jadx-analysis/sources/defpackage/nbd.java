package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* loaded from: classes2.dex */
final class nbd extends TransitionDrawable {
    private static final yph b = yph.c("GH.OneShotTransition");
    public boolean a;

    public nbd(Drawable drawable, Drawable drawable2) {
        super(new Drawable[]{drawable == null ? new ColorDrawable(0) : drawable, drawable2});
        setCrossFadeEnabled(true);
    }

    @Override // android.graphics.drawable.TransitionDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        canvas.getClass();
        for (int i = 0; i < 2; i++) {
            Drawable drawable = getDrawable(i);
            if ((drawable instanceof BitmapDrawable) && (bitmap = (bitmapDrawable = (BitmapDrawable) drawable).getBitmap()) != null && bitmap.isRecycled() && this.a) {
                ((ype) b.h()).B("Bitmap for drawable index %d was recycled before transition finished. Alpha was %d (expected 0). Clearing the drawable.", i, bitmapDrawable.getAlpha());
                setDrawable(i, new ColorDrawable(0));
            }
        }
        super.draw(canvas);
        if (getDrawable(0).getAlpha() == 0) {
            setDrawable(0, new ColorDrawable(0));
        }
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void resetTransition() {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void reverseTransition(int i) {
        throw new UnsupportedOperationException();
    }
}
