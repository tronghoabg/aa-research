package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jib extends jht {
    private final jhv a;
    private final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jib(int i, float f) {
        super(225L, f);
        jhz jhzVar = e;
        int i2 = -jht.i(i, 240);
        this.a = jhzVar;
        this.l = i2;
        Matrix.setIdentityM(this.k.a, 0);
    }

    @Override // defpackage.jht
    protected final jhu b(boolean z, long j) {
        if (j > 75) {
            float fA = this.a.a(j, 75.0f, this.h);
            Matrix.translateM(this.k.a, 0, g, 0, (fA * BitmapDescriptorFactory.HUE_RED) + BitmapDescriptorFactory.HUE_RED, (this.l * fA) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return this.k;
    }
}
