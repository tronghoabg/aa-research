package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class aagt {
    public static final String a = "aagt";
    public static final aagt b = new aagt(null, null, null, null);
    public final byte[][] c;
    public final aagv[] d;
    public final byte[][] e;
    public final aagu[] f;

    public aagt(byte[][] bArr, aagv[] aagvVarArr, byte[][] bArr2, aagu[] aaguVarArr) {
        this.c = bArr;
        this.d = aagvVarArr;
        this.e = bArr2;
        this.f = aaguVarArr;
    }

    public static int a(float f, float f2, byte[][] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int iD = d(((f2 + 180.0f) / 360.0f) * length, length);
        int length2 = bArr[iD].length;
        return bArr[iD][d(((90.0f - f) / 180.0f) * length2, length2)] & 255;
    }

    private static int d(float f, int i) {
        int i2 = (int) f;
        while (i2 < 0) {
            i2 += i;
        }
        return i2 % i;
    }

    private static String e(int[] iArr) {
        if (iArr == null) {
            return "<null[]>";
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(iArr.length);
        sb.append("[");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(i);
            sb.append(":");
            sb.append(iArr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static String f(Object[] objArr) {
        if (objArr == null) {
            return "<null[]>";
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(objArr.length);
        sb.append("[");
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(i);
            sb.append(":");
            sb.append(objArr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static int[] g(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int iMax = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            for (byte b2 : bArr[i]) {
                iMax = Math.max(iMax, b2 & 255);
            }
            i++;
        }
        int[] iArr = new int[iMax + 1];
        for (byte[] bArr2 : bArr) {
            for (byte b3 : bArr2) {
                int i2 = b3 & 255;
                iArr[i2] = iArr[i2] + 1;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return this.e != null;
    }

    public final float c(aags aagsVar, float f, float f2) {
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("getDepthAlongRay(%s,%s,%s,%s)", aagsVar, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(200.0f)));
        }
        zkt.n(aagsVar, "world");
        zkt.l(f, "rayTiltDeg cannot be NaN");
        zkt.l(f2, "rayBearingDeg cannot be NaN");
        byte[][] bArr = this.c;
        if (bArr != null) {
            float f3 = aagsVar.b;
            float f4 = f2 - f3;
            float radians = (float) Math.toRadians(f2);
            float radians2 = (float) Math.toRadians(f3);
            float radians3 = (float) Math.toRadians(aagsVar.c);
            float radians4 = (float) Math.toRadians(aagsVar.d);
            float radians5 = (float) Math.toRadians(f);
            float fCos = (float) Math.cos(radians - radians3);
            int iA = a(f, f4, bArr);
            aagv aagvVar = iA == 0 ? null : this.d[iA];
            if (aagvVar != null) {
                float f5 = radians5 - (radians4 * fCos);
                double d = radians - radians2;
                float fSin = (float) Math.sin(d);
                float fCos2 = (float) Math.cos(d);
                double d2 = f5;
                float fSin2 = (float) Math.sin(d2);
                float fCos3 = (float) Math.cos(d2);
                Float fA = aagvVar.a(fSin * fCos3, fCos2 * fCos3, fSin2);
                if (fA != null) {
                    return fA.floatValue();
                }
            }
        }
        return 200.0f;
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("planeIndexPixelMap", e(g(this.c)));
        zsaVarA.b("planes", f(this.d));
        zsaVarA.b("panoIndexPixelMap", e(g(this.e)));
        zsaVarA.b("panos", f(this.f));
        return zsaVarA.toString();
    }
}
