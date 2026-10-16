package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface rwv extends IInterface {
    qup b() throws RemoteException;

    rwp c(rws rwsVar) throws RemoteException;

    void d(long j, int i, Bundle bundle, rwy rwyVar) throws RemoteException;

    void f() throws RemoteException;

    void g(long j, ParcelFileDescriptor parcelFileDescriptor, rwy rwyVar) throws RemoteException;

    void h(long j, rwy rwyVar) throws RemoteException;

    void i(long j, int i) throws RemoteException;

    void j(long j, List list, List list2, rwm rwmVar) throws RemoteException;

    void k(long j, List list, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) throws RemoteException;

    void l(long j, List list, List list2, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) throws RemoteException;

    void m(long j) throws RemoteException;

    void n(long j, Bundle bundle) throws RemoteException;

    void o(boolean z, boolean z2) throws RemoteException;

    boolean r(long j) throws RemoteException;

    boolean s(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) throws RemoteException;

    @Deprecated
    void t() throws RemoteException;

    void u() throws RemoteException;
}
