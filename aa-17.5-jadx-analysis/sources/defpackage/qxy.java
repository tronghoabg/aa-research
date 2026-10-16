package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;

/* loaded from: classes.dex */
public interface qxy extends IInterface {
    void A() throws RemoteException;

    void e(Bundle bundle) throws RemoteException;

    void f() throws RemoteException;

    void g() throws RemoteException;

    void h(Bundle bundle) throws RemoteException;

    void i() throws RemoteException;

    void j(KeyEventCompleteData keyEventCompleteData) throws RemoteException;

    void k(boolean z) throws RemoteException;

    void l(TouchEventCompleteData touchEventCompleteData) throws RemoteException;

    void m() throws RemoteException;

    void n() throws RemoteException;

    void o() throws RemoteException;

    void p(int i) throws RemoteException;

    void q() throws RemoteException;

    void r() throws RemoteException;

    void s(Surface surface) throws RemoteException;

    void t() throws RemoteException;

    void u() throws RemoteException;

    void v() throws RemoteException;

    void w() throws RemoteException;

    void x(Intent intent) throws RemoteException;

    void y(Bundle bundle) throws RemoteException;

    void z(rml rmlVar, EditorInfo editorInfo) throws RemoteException;
}
