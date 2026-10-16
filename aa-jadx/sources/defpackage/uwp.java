package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uwp {
    protected volatile defpackage.uwv C;
    protected volatile float[] D = new float[4];

    public uwp(int i, int i2) {
        this.C = new defpackage.uwv(0, 0);
        this.C = new defpackage.uwv(i, i2);
        h(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final int f() {
        return this.C.b;
    }

    public final int g() {
        return this.C.a;
    }

    public final void h(float f, float f2, float f3, float f4) {
        this.D = new float[]{f, f2, f3, f4};
    }
}
