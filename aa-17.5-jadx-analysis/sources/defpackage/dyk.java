package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dyk extends Binder implements dyl {
    private final afec a;
    private final afec b;
    private final afec c;

    public dyk(afec afecVar, afec afecVar2, afec afecVar3) {
        attachInterface(this, "androidx.core.telecom.extensions.IMeetingSummaryStateListener");
        this.a = afecVar;
        this.b = afecVar2;
        this.c = afecVar3;
    }

    @Override // defpackage.dyl
    public final void a() {
        this.c.invoke(afak.a);
    }

    @Override // defpackage.dyl
    public final void b(String str) {
        str.getClass();
        this.a.invoke(str);
    }

    @Override // defpackage.dyl
    public final void c(int i) {
        this.b.invoke(Integer.valueOf(i));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
            return true;
        }
        if (i == 1) {
            b(parcel.readString());
        } else if (i == 2) {
            c(parcel.readInt());
        } else {
            if (i != 3) {
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
