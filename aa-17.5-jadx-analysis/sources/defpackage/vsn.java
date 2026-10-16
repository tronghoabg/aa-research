package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class vsn {
    public float a;
    public aezk b;
    public byte c;
    public int d;
    private int e;
    private final xxh f = xvy.a;

    public final vso a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            vso vsoVar = new vso(i, this.a, this.e, this.b, this.f);
            float f = vsoVar.a;
            woy.O(f > BitmapDescriptorFactory.HUE_RED && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return vsoVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 2);
    }
}
