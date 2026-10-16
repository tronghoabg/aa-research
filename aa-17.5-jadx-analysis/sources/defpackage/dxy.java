package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dxy extends Binder implements dxz {
    private final afec a;
    private final afec b;

    public dxy(afec afecVar, afec afecVar2) {
        attachInterface(this, "androidx.core.telecom.extensions.ICallIconStateListener");
        this.a = afecVar;
        this.b = afecVar2;
    }

    @Override // defpackage.dxz
    public final void a() {
        this.b.invoke(afak.a);
    }

    @Override // defpackage.dxz
    public final void b(Uri uri) {
        uri.getClass();
        this.a.invoke(uri);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ICallIconStateListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ICallIconStateListener");
            return true;
        }
        if (i == 1) {
            b((Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null));
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            a();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
