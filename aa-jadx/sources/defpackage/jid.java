package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jid extends defpackage.jia {
    private final int a;
    private final int l;
    private final int m;

    static {
        defpackage.yqm.c("CAR.WIN.ANIM");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jid(defpackage.jhx jhxVar, int i, float f) {
        long[] jArr = {250, 250, 250};
        long j = jArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            long j2 = jArr[i2];
            if (j2 > j) {
                j = j2;
            }
        }
        super(j, f);
        this.a = defpackage.jia.i(i, 16);
        this.l = (jhxVar.a + jhxVar.e) / 2;
        this.m = (jhxVar.b + jhxVar.f) / 2;
    }

    @Override // defpackage.jia
    protected final defpackage.jib b(boolean z, long j) {
        float f = j;
        float fA = b.a(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 250.0f);
        float fA2 = e.a(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 250.0f);
        float fA3 = d.a(f, 100.0f, 250.0f);
        defpackage.jib jibVar = this.k;
        float[] fArr = jibVar.a;
        float f2 = ((1.0f - fA) * 0.07999998f) + 0.92f;
        android.opengl.Matrix.scaleM(fArr, 0, g, 0, f2, f2, 1.0f);
        float f3 = 1.0f - f2;
        android.opengl.Matrix.translateM(fArr, 0, this.l * f3, f3 * this.m, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        android.opengl.Matrix.translateM(fArr, 0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (-fA2) * this.a, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        jibVar.b = 1.0f - fA3;
        return jibVar;
    }
}
