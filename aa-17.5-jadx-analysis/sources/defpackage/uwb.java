package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uwb {
    private static final String[] h = {"pos"};
    public final uud a;
    public final uue b;
    public final int c;
    public final int d;
    public final float[] e = new float[16];
    public final too f = new too();
    public final float[] g = new float[8];

    public uwb(uud uudVar) {
        this.a = uudVar;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
        uue uueVarQ = uudVar.Q();
        this.b = uueVarQ;
        uudVar.g(uueVarQ);
        uudVar.F(fArr, 8);
        int iA = uudVar.a("precision highp float;\nuniform mat4 matrix;\nattribute vec4 pos;\nvoid main() {\n  gl_Position = matrix * pos;\n}\n", "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n", h);
        this.c = iA;
        this.d = uud.L(iA, "matrix");
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i % 2 == 0 ? 8 : 0;
        if (i2 % 2 == 0) {
            i4 |= 16;
        }
        return i4 | ((i3 % 8) << 5);
    }
}
