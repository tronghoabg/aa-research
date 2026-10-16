package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jii extends defpackage.jia {
    private final defpackage.jic a;
    private final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jii(int i, float f) {
        super(225L, f);
        defpackage.jig jigVar = e;
        int i2 = -defpackage.jia.i(i, 240);
        this.a = jigVar;
        this.l = i2;
        android.opengl.Matrix.setIdentityM(this.k.a, 0);
    }

    @Override // defpackage.jia
    protected final defpackage.jib b(boolean z, long j) {
        if (j > 75) {
            float fA = this.a.a(j, 75.0f, this.h);
            android.opengl.Matrix.translateM(this.k.a, 0, g, 0, (fA * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (this.l * fA) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        return this.k;
    }
}
