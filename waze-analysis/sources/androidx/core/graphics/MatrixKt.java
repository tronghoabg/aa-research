package androidx.core.graphics;

import android.graphics.Matrix;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MatrixKt {
    public static final Matrix rotationMatrix(float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f2, f3, f4);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        return rotationMatrix(f2, f3, f4);
    }

    public static final Matrix scaleMatrix(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        return scaleMatrix(f2, f3);
    }

    public static final Matrix times(Matrix matrix, Matrix matrix2) {
        x.f(matrix, "<this>");
        x.f(matrix2, CmcdData.OBJECT_TYPE_MANIFEST);
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    public static final Matrix translationMatrix(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f2, f3);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return translationMatrix(f2, f3);
    }

    public static final float[] values(Matrix matrix) {
        x.f(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
