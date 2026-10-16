package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    public static Map<UseCase, Rect> calculateViewPortRects(Rect rect, boolean z, Rational rational, int i2, int i3, int i4, Map<UseCase, StreamSpec> map) {
        boolean z2 = false;
        if (rect.width() > 0 && rect.height() > 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i2, rational), i3, z, i4, i2);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF correctStartOrEnd(boolean z, int i2, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        if (i2 != 0) {
            z2 = false;
        } else if (z) {
            i2 = 0;
            z2 = false;
        } else {
            z2 = true;
            i2 = 0;
        }
        if (i2 == 90) {
            z3 = z;
            i2 = 90;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return rectF2;
        }
        boolean z4 = i2 == 0 && z;
        boolean z5 = i2 == 270 && !z;
        if (z4 || z5) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z6 = i2 == 90 && !z;
        boolean z7 = i2 == 180 && z;
        if (z6 || z7) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z8 = i2 == 180 && !z;
        boolean z9 = i2 == 270 && z;
        if (z8 || z9) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i2);
    }

    private static RectF flipHorizontally(RectF rectF, float f2) {
        return new RectF(flipX(rectF.right, f2), rectF.top, flipX(rectF.left, f2), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f2) {
        return new RectF(rectF.left, flipY(rectF.bottom, f2), rectF.right, flipY(rectF.top, f2));
    }

    private static float flipX(float f2, float f3) {
        return (f3 + f3) - f2;
    }

    private static float flipY(float f2, float f3) {
        return (f3 + f3) - f2;
    }

    public static RectF getScaledRect(RectF rectF, Rational rational, int i2, boolean z, int i3, int i4) {
        if (i2 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i2 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i2 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i2);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z, i3), i4, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z, int i2) {
        return z ^ (i2 == 1);
    }
}
