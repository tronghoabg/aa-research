package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cjx extends cjw {
    private float[] a;

    public cjx(float[] fArr) {
        super(new ColorMatrixColorFilter(fArr));
        this.a = fArr;
    }

    private final float[] a() {
        float[] fArr = this.a;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.b;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.a = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjx) && Arrays.equals(a(), ((cjx) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.a;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        float[] fArr = this.a;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ")";
        }
        return a.bq(str, "ColorMatrixColorFilter(colorMatrix=", ")");
    }
}
