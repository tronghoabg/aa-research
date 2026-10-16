package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
final class fei {
    public final Matrix a = new Matrix();
    public final float[] b;
    public float c;
    public float d;
    private final View e;

    public fei(View view, float[] fArr) {
        this.e = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.b = fArr2;
        this.c = fArr2[2];
        this.d = fArr2[5];
        a();
    }

    public final void a() {
        float f = this.c;
        float[] fArr = this.b;
        fArr[2] = f;
        fArr[5] = this.d;
        Matrix matrix = this.a;
        matrix.setValues(fArr);
        fgu.b(this.e, matrix);
    }
}
