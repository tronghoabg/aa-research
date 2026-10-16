package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jhw extends jht {
    private final int a;
    private final int l;
    private final int m;

    static {
        yph.c("CAR.WIN.ANIM");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jhw(jhq jhqVar, int i, float f) {
        long[] jArr = {250, 250, 250};
        long j = jArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            long j2 = jArr[i2];
            if (j2 > j) {
                j = j2;
            }
        }
        super(j, f);
        this.a = jht.i(i, 16);
        this.l = (jhqVar.a + jhqVar.e) / 2;
        this.m = (jhqVar.b + jhqVar.f) / 2;
    }

    @Override // defpackage.jht
    protected final jhu b(boolean z, long j) {
        float f = j;
        float fA = b.a(f, BitmapDescriptorFactory.HUE_RED, 250.0f);
        float fA2 = e.a(f, BitmapDescriptorFactory.HUE_RED, 250.0f);
        float fA3 = d.a(f, 100.0f, 250.0f);
        jhu jhuVar = this.k;
        float[] fArr = jhuVar.a;
        float f2 = ((1.0f - fA) * 0.07999998f) + 0.92f;
        Matrix.scaleM(fArr, 0, g, 0, f2, f2, 1.0f);
        float f3 = 1.0f - f2;
        Matrix.translateM(fArr, 0, this.l * f3, f3 * this.m, BitmapDescriptorFactory.HUE_RED);
        Matrix.translateM(fArr, 0, BitmapDescriptorFactory.HUE_RED, (-fA2) * this.a, BitmapDescriptorFactory.HUE_RED);
        jhuVar.b = 1.0f - fA3;
        return jhuVar;
    }
}
