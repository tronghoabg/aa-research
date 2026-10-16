package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface rwy extends IInterface {
    void a() throws RemoteException;

    void b(int i) throws RemoteException;

    void c(boolean z) throws RemoteException;

    void d(int i) throws RemoteException;

    void f() throws RemoteException;

    void g(int i, int i2, String str) throws RemoteException;

    void h(boolean z, List list, int i, int i2, byte[] bArr) throws RemoteException;

    void i(List list, byte[] bArr, Bundle bundle) throws RemoteException;

    void j() throws RemoteException;

    void k(List list, byte[] bArr) throws RemoteException;
}
