package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class few implements android.animation.TypeEvaluator {
    private final float[] a;

    public few(float[] fArr) {
        this.a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
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
