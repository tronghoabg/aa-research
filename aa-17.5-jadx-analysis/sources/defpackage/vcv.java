package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class vcv {
    public final RectF a = new RectF();
    protected final Matrix b = new Matrix();
    public final Path c = new Path();
    public final Path d = new Path();
    public float e;
    public float f;
    public Paint.Cap g;

    public final void d() {
        this.c.reset();
        this.d.reset();
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = Paint.Cap.ROUND;
    }

    public final void e(float f, float f2, float f3) {
        Matrix matrix = this.b;
        matrix.reset();
        matrix.preScale(f3, f3);
        matrix.preTranslate(f, f2);
        this.c.transform(matrix);
        this.d.transform(matrix);
        this.e *= f3;
        this.f *= f3;
    }
}
