package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ogd extends ijn implements ogf {
    public ogd(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.telecom.service.ICarCall");
    }

    @Override // defpackage.ogf
    public final void A(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(13, parcelGh);
    }

    @Override // defpackage.ogf
    public final boolean B() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.ogf
    public final boolean C(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        Parcel parcelGi = gi(30, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.ogf
    public final boolean D(ogs ogsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, ogsVar);
        Parcel parcelGi = gi(7, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.ogf
    public final boolean E(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        Parcel parcelGi = gi(29, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.ogf
    public final boolean F(ogs ogsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, ogsVar);
        Parcel parcelGi = gi(8, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.ogf
    public final void G() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ogf
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.ogf
    public final int f() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.ogf
    public final CallAudioState g() throws RemoteException {
        Parcel parcelGi = gi(28, gh());
        CallAudioState callAudioState = (CallAudioState) ijp.a(parcelGi, CallAudioState.CREATOR);
        parcelGi.recycle();
        return callAudioState;
    }

    @Override // defpackage.ogf
    public final List h() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarCall.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.ogf
    public final void i(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(9, parcelGh);
    }

    @Override // defpackage.ogf
    public final void j(CarCall carCall, CarCall carCall2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, carCall2);
        gj(17, parcelGh);
    }

    @Override // defpackage.ogf
    public final void k(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(11, parcelGh);
    }

    @Override // defpackage.ogf
    public final void l() throws RemoteException {
        gj(20, gh());
    }

    @Override // defpackage.ogf
    public final void m(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(12, parcelGh);
    }

    @Override // defpackage.ogf
    public final void n(CarCall carCall, PhoneAccountHandle phoneAccountHandle, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        ijp.g(parcelGh, phoneAccountHandle);
        parcelGh.writeInt(0);
        gj(26, parcelGh);
    }

    @Override // defpackage.ogf
    public final void o(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gj(19, parcelGh);
    }

    @Override // defpackage.ogf
    public final void p(Uri uri, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ogf
    public final void q(CarCall carCall, char c) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(c);
        gj(14, parcelGh);
    }

    @Override // defpackage.ogf
    public final void r(CarCall carCall, boolean z) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ogf
    public final void s(CarCall carCall, boolean z, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(0);
        parcelGh.writeString("");
        gj(10, parcelGh);
    }

    @Override // defpackage.ogf
    public final void t(BluetoothDevice bluetoothDevice) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bluetoothDevice);
        gj(27, parcelGh);
    }

    @Override // defpackage.ogf
    public final void u(CarCall carCall, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeInt(z ? 1 : 0);
        gj(31, parcelGh);
    }

    @Override // defpackage.ogf
    public final void v(CarCall carCall, String str, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        parcelGh.writeString("android.telecom.event.LOCAL_CALL_SILENCE_STATE_CHANGED");
        ijp.g(parcelGh, bundle);
        gj(23, parcelGh);
    }

    @Override // defpackage.ogf
    public final void w(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(6, parcelGh);
    }

    @Override // defpackage.ogf
    public final void x(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(3, parcelGh);
    }

    @Override // defpackage.ogf
    public final void y(CarCall carCall) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ogf
    public final void z(CarCall carCall) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carCall);
        gj(15, parcelGh);
    }
}
