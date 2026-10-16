package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public interface rml extends IInterface {
    int e(int i) throws RemoteException;

    CharSequence f(int i) throws RemoteException;

    CharSequence g(int i, int i2) throws RemoteException;

    CharSequence h(int i, int i2) throws RemoteException;

    void i(rmc rmcVar) throws RemoteException;

    boolean j() throws RemoteException;

    boolean k(int i) throws RemoteException;

    boolean l(CharSequence charSequence, int i) throws RemoteException;

    boolean m(int i, int i2) throws RemoteException;

    boolean n() throws RemoteException;

    boolean o() throws RemoteException;

    boolean p(int i) throws RemoteException;

    boolean q(int i) throws RemoteException;

    boolean r(String str, Bundle bundle) throws RemoteException;

    boolean s(boolean z) throws RemoteException;

    boolean t(KeyEvent keyEvent) throws RemoteException;

    boolean u(int i, int i2) throws RemoteException;

    boolean v(CharSequence charSequence, int i) throws RemoteException;

    boolean w(int i, int i2) throws RemoteException;
}
