package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class fff extends ffe {
    private final Path a;
    private final Matrix b;

    public fff(Context context, AttributeSet attributeSet) {
        Path path = new Path();
        this.a = path;
        Matrix matrix = new Matrix();
        this.b = matrix;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.j);
        try {
            String strQ = dlz.q(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strQ == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            Path pathB = dtd.b(strQ);
            PathMeasure pathMeasure = new PathMeasure(pathB, false);
            float[] fArr = new float[2];
            pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
            float f = fArr[0];
            float f2 = fArr[1];
            pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr, null);
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 == f && f4 == f2) {
                throw new IllegalArgumentException("pattern must not end at the starting point");
            }
            matrix.setTranslate(-f3, -f4);
            float f5 = f - f3;
            float f6 = f2 - f4;
            float fB = 1.0f / b(f5, f6);
            matrix.postScale(fB, fB);
            matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
            pathB.transform(matrix, path);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static float b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // defpackage.ffe
    public final Path a(float f, float f2, float f3, float f4) {
        Matrix matrix = this.b;
        float f5 = f4 - f2;
        float f6 = f3 - f;
        double d = f6;
        float fB = b(f6, f5);
        double dAtan2 = Math.atan2(f5, d);
        matrix.setScale(fB, fB);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.a.transform(matrix, path);
        return path;
    }
}
