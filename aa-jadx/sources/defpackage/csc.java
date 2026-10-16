package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class csc {
    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.cjj e(defpackage.ctc ctcVar) {
        defpackage.ctc ctcVarQ = ctcVar.q();
        if (ctcVarQ != null) {
            return ctcVarQ.o(ctcVar, true);
        }
        long j = ((defpackage.cux) ctcVar).c;
        return new defpackage.cjj(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final defpackage.cjj f(defpackage.ctc ctcVar, boolean z) {
        float f;
        float f2;
        defpackage.ctc ctcVarG = g(ctcVar);
        long jH = ctcVarG.h() >> 32;
        long jH2 = ctcVarG.h() & 4294967295L;
        defpackage.cjj cjjVarO = ctcVarG.o(ctcVar, z);
        float f3 = (int) jH;
        float f4 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = cjjVarO.b;
            if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            if (f > f3) {
                f = f3;
            }
        } else {
            f = cjjVarO.b;
        }
        float f5 = (int) jH2;
        if (z) {
            f2 = cjjVarO.c;
            if (f2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                f2 = 0.0f;
            }
            if (f2 > f5) {
                f2 = f5;
            }
        } else {
            f2 = cjjVarO.c;
        }
        if (z) {
            float f6 = cjjVarO.d;
            if (f6 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                f6 = 0.0f;
            }
            if (f6 <= f3) {
                f3 = f6;
            }
        } else {
            f3 = cjjVarO.d;
        }
        if (z) {
            float f7 = cjjVarO.e;
            if (f7 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                f4 = f7;
            }
            if (f4 <= f5) {
                f5 = f4;
            }
        } else {
            f5 = cjjVarO.e;
        }
        if (f == f3 || f2 == f5) {
            return defpackage.cjj.a;
        }
        long jL = ctcVarG.l((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
        float f8 = f5;
        long jL2 = ctcVarG.l((((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32));
        long jL3 = ctcVarG.l((((long) java.lang.Float.floatToRawIntBits(f8)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32));
        long jL4 = ctcVarG.l((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & 4294967295L));
        int i = (int) (jL2 >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jL >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jL4 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jL3 >> 32));
        float fMin = java.lang.Math.min(fIntBitsToFloat, java.lang.Math.min(fIntBitsToFloat2, java.lang.Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = java.lang.Math.max(fIntBitsToFloat, java.lang.Math.max(fIntBitsToFloat2, java.lang.Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (jL & 4294967295L));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (jL2 & 4294967295L));
        float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (jL4 & 4294967295L));
        float fIntBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (jL3 & 4294967295L));
        return new defpackage.cjj(fMin, java.lang.Math.min(fIntBitsToFloat5, java.lang.Math.min(fIntBitsToFloat6, java.lang.Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, java.lang.Math.max(fIntBitsToFloat5, java.lang.Math.max(fIntBitsToFloat6, java.lang.Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final defpackage.ctc g(defpackage.ctc ctcVar) {
        defpackage.ctc ctcVar2;
        defpackage.cyl cylVar;
        defpackage.ctc ctcVarQ = ctcVar.q();
        while (true) {
            defpackage.ctc ctcVar3 = ctcVarQ;
            ctcVar2 = ctcVar;
            ctcVar = ctcVar3;
            if (ctcVar == null) {
                break;
            }
            ctcVarQ = ctcVar.q();
        }
        defpackage.cyl cylVar2 = ctcVar2 instanceof defpackage.cyl ? (defpackage.cyl) ctcVar2 : null;
        if (cylVar2 == null) {
            return ctcVar2;
        }
        do {
            cylVar = cylVar2;
            cylVar2 = cylVar2.x;
        } while (cylVar2 != null);
        return cylVar;
    }

    public static final defpackage.cgf h(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cry(affcVar));
    }

    public static final float i(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final defpackage.fbu j(android.content.Context context, java.lang.String str, defpackage.fbt fbtVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new defpackage.fbu(context, str, fbtVar, z, z2);
    }

    public static final void k(defpackage.fch fchVar, java.lang.String str) {
        defpackage.fbr fbrVarA = fchVar.a(str);
        try {
            fbrVarA.k();
            defpackage.afga.m(fbrVarA, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.afga.m(fbrVarA, th);
                throw th2;
            }
        }
    }

    public static final void l(int i, java.lang.String str) {
        throw new android.database.SQLException(defpackage.a.bo(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final java.util.ArrayList m(java.util.Collection collection) {
        return collection instanceof java.util.ArrayList ? (java.util.ArrayList) collection : new java.util.ArrayList(collection);
    }
}
