package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class duu {
    public static final defpackage.dws[] a(java.util.List list) {
        return (defpackage.dws[]) list.get(0);
    }

    public static final defpackage.eqp b(defpackage.afdo afdoVar, long j, defpackage.affg affgVar) {
        afdoVar.getClass();
        return new defpackage.epk(afdoVar, j, affgVar);
    }

    public static float d(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        int iMin = java.lang.Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }
}
