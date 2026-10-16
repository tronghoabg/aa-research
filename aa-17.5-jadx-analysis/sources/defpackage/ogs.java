package defpackage;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;

/* loaded from: classes.dex */
public interface ogs extends IInterface {
    void e(CallAudioState callAudioState) throws RemoteException;

    void f(CarCall carCall) throws RemoteException;

    void g(CarCall carCall) throws RemoteException;

    void h(CarCall carCall) throws RemoteException;

    void i(CarCall carCall, List list) throws RemoteException;

    void j(CarCall carCall, List list) throws RemoteException;

    void k(CarCall carCall, List list) throws RemoteException;

    void l(CarCall carCall, String str) throws RemoteException;

    void m(CarCall carCall, CarCall.Details details) throws RemoteException;

    void n(CarCall carCall, CarCall carCall2) throws RemoteException;

    void o(CarCall carCall, int i) throws RemoteException;

    void p(CarCall carCall, String str) throws RemoteException;

    void q(CarCall carCall, int i) throws RemoteException;

    void r(CarCall carCall, Uri uri) throws RemoteException;

    void s(CarCall carCall, boolean z) throws RemoteException;
}
