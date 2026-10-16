package androidx.transition;

import android.graphics.Matrix;
import android.widget.ImageView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ImageViewUtils {
    private static boolean sTryHiddenAnimateTransform = true;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static void animateTransform(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    private ImageViewUtils() {
    }

    static void animateTransform(ImageView imageView, Matrix matrix) {
        Api29Impl.animateTransform(imageView, matrix);
    }

    private static void hiddenAnimateTransform(ImageView imageView, Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                Api29Impl.animateTransform(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }
}
