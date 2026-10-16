package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioProgramSelector;

/* loaded from: classes2.dex */
public final class qxz extends ijn implements qyb {
    public qxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarRadio");
    }

    @Override // defpackage.qyb
    public final RadioConfiguration f() throws RemoteException {
        Parcel parcelGi = gi(9, gh());
        RadioConfiguration radioConfiguration = (RadioConfiguration) ijp.a(parcelGi, RadioConfiguration.CREATOR);
        parcelGi.recycle();
        return radioConfiguration;
    }

    @Override // defpackage.qyb
    public final void n(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(4, parcelGh);
    }

    @Override // defpackage.qyb
    public final void o(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gj(8, parcelGh);
    }

    @Override // defpackage.qyb
    public final void s(qye qyeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qyeVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.qyb
    public final void t(qye qyeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qyeVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.qyb
    public final void u(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(6, parcelGh);
    }

    @Override // defpackage.qyb
    public final void v(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(7, parcelGh);
    }

    @Override // defpackage.qyb
    public final void w(RadioProgramSelector radioProgramSelector) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, radioProgramSelector);
        gj(3, parcelGh);
    }

    @Override // defpackage.qyb
    public final void x(qye qyeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qyeVar);
        gj(2, parcelGh);
    }
}
