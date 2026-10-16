package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jic extends jht {
    private final int a;
    private final int l;

    static {
        yph.c("CAR.WIN.ANIM");
    }

    public jic(jhq jhqVar, float f) {
        super(Math.max(150L, 75L), f);
        this.a = jhqVar.d;
        this.l = (jhqVar.a + jhqVar.e) / 2;
    }

    @Override // defpackage.jht
    protected final jhu b(boolean z, long j) {
        jif jifVar = b;
        float f = j;
        float fA = jifVar.a(f, BitmapDescriptorFactory.HUE_RED, 75.0f);
        float fA2 = jifVar.a(f, BitmapDescriptorFactory.HUE_RED, 150.0f);
        jhu jhuVar = this.k;
        float[] fArr = jhuVar.a;
        float f2 = ((1.0f - fA) * 0.100000024f) + 0.9f;
        Matrix.scaleM(fArr, 0, g, 0, f2, 1.0f, 1.0f);
        Matrix.translateM(fArr, 0, (1.0f - f2) * this.l, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Matrix.translateM(fArr, 0, BitmapDescriptorFactory.HUE_RED, fA2 * this.a, BitmapDescriptorFactory.HUE_RED);
        return jhuVar;
    }
}
