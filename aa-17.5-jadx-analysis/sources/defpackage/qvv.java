package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qvv extends ijn implements qvx {
    public qvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCall");
    }

    @Override // defpackage.qvx
    public final void A() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final void B() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qvx
    public final int f() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qvx
    public final List g() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarCall.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvx
    public final void h(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(9, parcelGh);
    }

    @Override // defpackage.qvx
    public final void i(CarCall carCall, CarCall carCall2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, carCall2);
        gj(17, parcelGh);
    }

    @Override // defpackage.qvx
    public final void j(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(11, parcelGh);
    }

    @Override // defpackage.qvx
    public final void k() throws RemoteException {
        gj(20, gh());
    }

    @Override // defpackage.qvx
    public final void l(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(12, parcelGh);
    }

    @Override // defpackage.qvx
    public final void m(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gj(19, parcelGh);
    }

    @Override // defpackage.qvx
    public final void n(CarCall carCall, char c) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(c);
        gj(14, parcelGh);
    }

    @Override // defpackage.qvx
    public final void o(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(6, parcelGh);
    }

    @Override // defpackage.qvx
    public final void p(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(3, parcelGh);
    }

    @Override // defpackage.qvx
    public final void q(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(15, parcelGh);
    }

    @Override // defpackage.qvx
    public final void r(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(13, parcelGh);
    }

    @Override // defpackage.qvx
    public final boolean s() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qvx
    public final boolean t(qwa qwaVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwaVar);
        Parcel parcelGi = gi(7, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qvx
    public final boolean u(qwa qwaVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwaVar);
        Parcel parcelGi = gi(8, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qvx
    public final void v(CarCall carCall, PhoneAccountHandle phoneAccountHandle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, phoneAccountHandle);
        parcelGh.writeInt(0);
        gj(26, parcelGh);
    }

    @Override // defpackage.qvx
    public final void w() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final void x() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final void y() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final void z(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(0);
        parcelGh.writeString(null);
        gj(10, parcelGh);
    }
}
