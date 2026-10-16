package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public final class qvy extends ijn implements qwa {
    public qvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallListener");
    }

    @Override // defpackage.qwa
    public final void e(KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEvent);
        gk(1, parcelGh);
    }

    @Override // defpackage.qwa
    public final void f(boolean z, int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        gk(2, parcelGh);
    }

    @Override // defpackage.qwa
    public final void g(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(3, parcelGh);
    }

    @Override // defpackage.qwa
    public final void h(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(11, parcelGh);
    }

    @Override // defpackage.qwa
    public final void i(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(4, parcelGh);
    }

    @Override // defpackage.qwa
    public final void j(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeStringList(list);
        gk(9, parcelGh);
    }

    @Override // defpackage.qwa
    public final void k(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeTypedList(list);
        gk(7, parcelGh);
    }

    @Override // defpackage.qwa
    public final void l(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeTypedList(list);
        gk(12, parcelGh);
    }

    @Override // defpackage.qwa
    public final void m(CarCall carCall, String str, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeString(str);
        ijp.g(parcelGh, bundle);
        gk(13, parcelGh);
    }

    @Override // defpackage.qwa
    public final void n(CarCall carCall, CarCall.Details details) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, details);
        gk(8, parcelGh);
    }

    @Override // defpackage.qwa
    public final void o(CarCall carCall, CarCall carCall2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, carCall2);
        gk(6, parcelGh);
    }

    @Override // defpackage.qwa
    public final void p(CarCall carCall, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeString(str);
        gk(10, parcelGh);
    }

    @Override // defpackage.qwa
    public final void q(CarCall carCall, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(i);
        gk(5, parcelGh);
    }
}
