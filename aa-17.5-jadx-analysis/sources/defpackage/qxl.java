package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qxl extends ijo implements qxm {
    private final WeakReference a;

    public qxl(rog rogVar) {
        super("com.google.android.gms.car.ICarNavigationStatusEventListener");
        this.a = new WeakReference(rogVar);
    }

    @Override // defpackage.qxm
    public final void e(int i, int i2, int i3, int i4, int i5) {
        rog rogVar = (rog) this.a.get();
        if (rogVar != null) {
            if (omc.c("CAR.SENSOR", 3)) {
                rrd.d(3, "CAR.SENSOR", null, "onStart(%d, %d, %d, %d, %d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            }
            rogVar.b = i;
            rogVar.c = i2;
            rogVar.d = i3;
            rogVar.e = i4;
            rogVar.f = i5;
            Handler handler = rogVar.g;
            handler.sendMessage(handler.obtainMessage(1));
        }
    }

    @Override // defpackage.qxm
    public final void f() {
        rog rogVar = (rog) this.a.get();
        if (rogVar != null) {
            Handler handler = rogVar.g;
            handler.sendMessage(handler.obtainMessage(2));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            ijp.d(parcel);
            e(i2, i3, i4, i5, i6);
        } else {
            if (i != 2) {
                return false;
            }
            f();
        }
        return true;
    }
}
