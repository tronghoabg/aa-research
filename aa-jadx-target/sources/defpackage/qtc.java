package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtc {
    public volatile defpackage.rvu a;
    public volatile defpackage.rxi b;
    public int[] c;
    public boolean d;

    public final boolean a() {
        try {
            defpackage.rvu rvuVar = this.a;
            if (rvuVar != null) {
                return rvuVar.a;
            }
            return false;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean b(defpackage.xoz xozVar, long j) {
        if (this.d && xozVar == defpackage.xoz.SENSOR_DRIVING_STATUS_DATA) {
            return true;
        }
        try {
            defpackage.rvu rvuVar = this.a;
            if (rvuVar != null) {
                return rvuVar.k(xozVar, j);
            }
            return false;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public final int[] c() {
        int[] iArr = this.c;
        return iArr != null ? iArr : new int[]{11};
    }
}
