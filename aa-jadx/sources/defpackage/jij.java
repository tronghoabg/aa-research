package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jij extends defpackage.jia {
    private final int a;
    private final int l;

    static {
        defpackage.yqm.c("CAR.WIN.ANIM");
    }

    public jij(defpackage.jhx jhxVar, float f) {
        super(150L, f);
        this.a = jhxVar.d;
        this.l = (jhxVar.a + jhxVar.e) / 2;
    }

    @Override // defpackage.jia
    protected final defpackage.jib b(boolean z, long j) {
        defpackage.jim jimVar = b;
        float f = j;
        float fA = jimVar.a(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 75.0f);
        float fA2 = jimVar.a(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 150.0f);
        defpackage.jib jibVar = this.k;
        float[] fArr = jibVar.a;
        float f2 = ((1.0f - fA) * 0.100000024f) + 0.9f;
        android.opengl.Matrix.scaleM(fArr, 0, g, 0, f2, 1.0f, 1.0f);
        android.opengl.Matrix.translateM(fArr, 0, (1.0f - f2) * this.l, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        android.opengl.Matrix.translateM(fArr, 0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fA2 * this.a, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        return jibVar;
    }
}
