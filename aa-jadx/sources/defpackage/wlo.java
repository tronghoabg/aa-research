package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wlo implements android.animation.TypeEvaluator {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final android.graphics.Matrix c = new android.graphics.Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        float[] fArr = this.a;
        matrix.getValues(fArr);
        float[] fArr2 = this.b;
        matrix2.getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = f3 + ((f2 - f3) * f);
        }
        android.graphics.Matrix matrix3 = this.c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
