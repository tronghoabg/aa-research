package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public final class ogq extends ijn implements ogs {
    public ogq(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.telecom.service.ICarCallListener");
    }

    @Override // defpackage.ogs
    public final void e(CallAudioState callAudioState) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, callAudioState);
        gk(2, parcelGh);
    }

    @Override // defpackage.ogs
    public final void f(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(3, parcelGh);
    }

    @Override // defpackage.ogs
    public final void g(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(11, parcelGh);
    }

    @Override // defpackage.ogs
    public final void h(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gk(4, parcelGh);
    }

    @Override // defpackage.ogs
    public final void i(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeStringList(list);
        gk(9, parcelGh);
    }

    @Override // defpackage.ogs
    public final void j(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeTypedList(list);
        gk(7, parcelGh);
    }

    @Override // defpackage.ogs
    public final void k(CarCall carCall, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeTypedList(list);
        gk(12, parcelGh);
    }

    @Override // defpackage.ogs
    public final void l(CarCall carCall, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeString(str);
        gk(15, parcelGh);
    }

    @Override // defpackage.ogs
    public final void m(CarCall carCall, CarCall.Details details) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, details);
        gk(8, parcelGh);
    }

    @Override // defpackage.ogs
    public final void n(CarCall carCall, CarCall carCall2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, carCall2);
        gk(6, parcelGh);
    }

    @Override // defpackage.ogs
    public final void o(CarCall carCall, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(i);
        gk(14, parcelGh);
    }

    @Override // defpackage.ogs
    public final void p(CarCall carCall, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeString(str);
        gk(10, parcelGh);
    }

    @Override // defpackage.ogs
    public final void q(CarCall carCall, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(i);
        gk(5, parcelGh);
    }

    @Override // defpackage.ogs
    public final void r(CarCall carCall, Uri uri) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, uri);
        gk(16, parcelGh);
    }

    @Override // defpackage.ogs
    public final void s(CarCall carCall, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(z ? 1 : 0);
        gk(17, parcelGh);
    }
}
