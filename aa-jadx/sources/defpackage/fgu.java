package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fgu implements android.animation.TypeEvaluator {
    final float[] a = new float[9];
    final float[] b = new float[9];
    final android.graphics.Matrix c = new android.graphics.Matrix();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        float[] fArr = this.a;
        ((android.graphics.Matrix) obj).getValues(fArr);
        float[] fArr2 = this.b;
        ((android.graphics.Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = f3 + ((f2 - f3) * f);
        }
        android.graphics.Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
