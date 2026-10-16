package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public interface ogf extends IInterface {
    void A(CarCall carCall) throws RemoteException;

    boolean B() throws RemoteException;

    boolean C(CarCall carCall) throws RemoteException;

    boolean D(ogs ogsVar) throws RemoteException;

    boolean E(CarCall carCall) throws RemoteException;

    boolean F(ogs ogsVar) throws RemoteException;

    void G() throws RemoteException;

    int e() throws RemoteException;

    int f() throws RemoteException;

    CallAudioState g() throws RemoteException;

    List h() throws RemoteException;

    void i(CarCall carCall) throws RemoteException;

    void j(CarCall carCall, CarCall carCall2) throws RemoteException;

    void k(CarCall carCall) throws RemoteException;

    void l() throws RemoteException;

    void m(CarCall carCall) throws RemoteException;

    void n(CarCall carCall, PhoneAccountHandle phoneAccountHandle, boolean z) throws RemoteException;

    void o(String str) throws RemoteException;

    void p(Uri uri, Bundle bundle) throws RemoteException;

    void q(CarCall carCall, char c) throws RemoteException;

    void r(CarCall carCall, boolean z) throws RemoteException;

    void s(CarCall carCall, boolean z, String str) throws RemoteException;

    void t(BluetoothDevice bluetoothDevice) throws RemoteException;

    void u(CarCall carCall, boolean z) throws RemoteException;

    void v(CarCall carCall, String str, Bundle bundle) throws RemoteException;

    void w(int i) throws RemoteException;

    void x(boolean z) throws RemoteException;

    void y(CarCall carCall) throws RemoteException;

    void z(CarCall carCall) throws RemoteException;
}
