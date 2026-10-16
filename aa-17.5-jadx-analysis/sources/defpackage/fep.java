package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
final class fep implements TypeEvaluator {
    private final float[] a;

    public fep(float[] fArr) {
        this.a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        int i = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i >= 9) {
                return fArr3;
            }
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
            i++;
        }
    }
}
