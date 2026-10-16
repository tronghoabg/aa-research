package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ffi {
    private static boolean a = true;

    static void a(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            b(imageView, matrix);
            return;
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void b(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (a) {
            try {
                imageView.animateTransform(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
