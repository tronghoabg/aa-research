package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fep {
    public final android.graphics.Matrix a = new android.graphics.Matrix();
    public final float[] b;
    public float c;
    public float d;
    private final android.view.View e;

    public fep(android.view.View view, float[] fArr) {
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
        android.graphics.Matrix matrix = this.a;
        matrix.setValues(fArr);
        defpackage.fha.b(this.e, matrix);
    }
}
