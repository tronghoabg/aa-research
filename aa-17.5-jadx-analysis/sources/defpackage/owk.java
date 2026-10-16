package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes2.dex */
public final class owk {
    public final ovz a;
    public int b = 0;
    public ouu c;
    private final boolean d;
    private final boolean e;

    public owk(ovz ovzVar, erb erbVar) {
        this.a = ovzVar;
        if (erbVar == null) {
            this.d = false;
            this.e = false;
            return;
        }
        CarInfo carInfo = (CarInfo) erbVar.a;
        boolean z = carInfo.g;
        boolean z2 = carInfo.o;
        this.d = z2;
        boolean z3 = carInfo.n;
        this.e = z3;
        if (z) {
            try {
                ovzVar.g();
            } catch (RemoteException e) {
                Log.e("CSL.StatusBarController", "error setting initial status bar state: ".concat(e.toString()));
                return;
            }
        }
        if (z2) {
            ovzVar.f();
        }
        if (z3) {
            ovzVar.h();
        }
    }
}
