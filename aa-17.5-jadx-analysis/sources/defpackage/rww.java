package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class rww extends ijn implements rwy {
    public rww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartupServiceCallback");
    }

    @Override // defpackage.rwy
    public final void a() throws RemoteException {
        gj(4, gh());
    }

    @Override // defpackage.rwy
    public final void b(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(9, parcelGh);
    }

    @Override // defpackage.rwy
    public final void c(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(1);
        gj(1, parcelGh);
    }

    @Override // defpackage.rwy
    public final void d(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(10, parcelGh);
    }

    @Override // defpackage.rwy
    public final void f() throws RemoteException {
        gj(8, gh());
    }

    @Override // defpackage.rwy
    public final void g(int i, int i2, String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeString(str);
        gj(2, parcelGh);
    }

    @Override // defpackage.rwy
    public final void h(boolean z, List list, int i, int i2, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeList(list);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeByteArray(bArr);
        gj(6, parcelGh);
    }

    @Override // defpackage.rwy
    public final void i(List list, byte[] bArr, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeList(list);
        parcelGh.writeByteArray(bArr);
        ijp.g(parcelGh, bundle);
        gj(7, parcelGh);
    }

    @Override // defpackage.rwy
    public final void j() throws RemoteException {
        gj(3, gh());
    }

    @Override // defpackage.rwy
    public final void k(List list, byte[] bArr) throws RemoteException {
        throw null;
    }
}
