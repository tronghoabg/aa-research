package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class qsi {
    public volatile rvb a;
    public volatile rwp b;
    public int[] c;
    public boolean d;

    public final boolean a() {
        try {
            rvb rvbVar = this.a;
            if (rvbVar != null) {
                return rvbVar.a;
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(xny xnyVar, long j) {
        if (this.d && xnyVar == xny.SENSOR_DRIVING_STATUS_DATA) {
            return true;
        }
        try {
            rvb rvbVar = this.a;
            if (rvbVar != null) {
                return rvbVar.k(xnyVar, j);
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int[] c() {
        int[] iArr = this.c;
        return iArr != null ? iArr : new int[]{11};
    }
}
