package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.RadioProgramInfo;
import java.util.List;

/* loaded from: classes2.dex */
public final class qyc extends ijn implements qye {
    public qyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarRadioCallback");
    }

    @Override // defpackage.qye
    public final void e(List list) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeTypedList(list);
        gk(5, parcelGh);
    }

    @Override // defpackage.qye
    public final void f(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gk(2, parcelGh);
    }

    @Override // defpackage.qye
    public final void g(RadioProgramInfo radioProgramInfo, boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, radioProgramInfo);
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gk(3, parcelGh);
    }

    @Override // defpackage.qye
    public final void h(List list) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeTypedList(list);
        gk(4, parcelGh);
    }

    @Override // defpackage.qye
    public final void i(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }
}
