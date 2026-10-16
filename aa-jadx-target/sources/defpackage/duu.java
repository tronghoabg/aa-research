package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class duu {
    public static final dws[] a(java.util.List list) {
        return (dws[]) list.get(0);
    }

    public static final defpackage.eqp b(defpackage.afdo afdoVar, long j, defpackage.affg affgVar) {
        afdoVar.getClass();
        return new defpackage.epk(afdoVar, j, affgVar);
    }

    public static float d(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = java.lang.Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }
}
