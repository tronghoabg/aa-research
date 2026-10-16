package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aahk extends defpackage.aahx {
    public static final java.lang.String a = "aahk";
    private static final java.lang.ThreadLocal h;
    private static final java.lang.ThreadLocal i;
    public float[] b;
    public float[] c;
    public double d;

    static {
        double d = defpackage.aaiu.a;
        java.util.concurrent.ExecutorService executorService = defpackage.ztd.a;
        h = new defpackage.zsy(4);
        i = new defpackage.zsy(4);
    }

    public aahk(defpackage.aahx aahxVar) {
        super(aahxVar.e, aahxVar.f, aahxVar.g);
        synchronized (this) {
            this.b = null;
            this.c = null;
            this.d = 0.0d;
        }
    }

    public static float[] b(defpackage.aahx aahxVar, defpackage.aahv aahvVar, boolean z) {
        float[] fArr = (float[]) h.get();
        float[] fArr2 = (float[]) i.get();
        float f = true != z ? 1.0f : -1.0f;
        float[] fArr3 = new float[4];
        fArr[0] = aahxVar.f * f;
        fArr[1] = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED * f;
        fArr[2] = f * (-aahxVar.g);
        fArr[3] = 1.0f;
        defpackage.zlv.n(fArr, "originalRay");
        defpackage.zlv.n(fArr2, "outputRay");
        android.opengl.Matrix.multiplyMV(fArr2, 0, aahvVar.f, 0, fArr, 0);
        android.opengl.Matrix.multiplyMV(fArr3, 0, aahvVar.e, 0, fArr2, 0);
        return fArr3;
    }

    public final synchronized double a() {
        return this.d;
    }

    public final synchronized float[] c() {
        return this.c;
    }

    public final synchronized float[] d() {
        return this.b;
    }

    @Override // defpackage.aahx
    public final synchronized java.lang.String toString() {
        return java.lang.String.format("%s=>{%s,%s,%s}", super.toString(), java.lang.Double.valueOf(this.d), java.util.Arrays.toString(this.b), java.util.Arrays.toString(this.c));
    }
}
