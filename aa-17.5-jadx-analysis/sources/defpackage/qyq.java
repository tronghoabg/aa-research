package defpackage;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface qyq extends IInterface {
    ParcelFileDescriptor a(qyt qytVar) throws RemoteException;

    ParcelFileDescriptor f(qyt qytVar) throws RemoteException;

    String g(qyt qytVar) throws RemoteException;

    void j(qyt qytVar, int i) throws RemoteException;

    void k(qyt qytVar, int i) throws RemoteException;

    void l(qyt qytVar, int i) throws RemoteException;

    void o(qyt qytVar) throws RemoteException;

    boolean s(qyt qytVar) throws RemoteException;

    byte[] t(qyt qytVar) throws RemoteException;
}
