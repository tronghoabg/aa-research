package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class vwz {
    public int a;
    public xxh b = xvy.a;
    public byte c;
    public int d;
    private float e;

    public final vxa a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            vxa vxaVar = new vxa(i, this.a, this.e, this.b);
            float f = vxaVar.a;
            woy.aa(f > BitmapDescriptorFactory.HUE_RED && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return vxaVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.e = f;
        this.c = (byte) (this.c | 2);
    }
}
