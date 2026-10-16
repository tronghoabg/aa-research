package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rpl extends ijo implements rpm {
    private final WeakReference a;

    public rpl(rps rpsVar) {
        super("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
        this.a = new WeakReference(rpsVar);
    }

    @Override // defpackage.rpm
    public final void e(int i) {
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Binder:onProjectionLifetimeStateChanged(state:%s)", Integer.valueOf(i));
        }
        rps rpsVar = (rps) this.a.get();
        if (rpsVar == null) {
            return;
        }
        rbe.h(new rgm(rpsVar, i, 3, null));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        ijp.d(parcel);
        e(i2);
        return true;
    }
}
