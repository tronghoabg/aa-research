package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class k9 extends Binder implements h5 {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ l9 a;

    public k9(l9 l9Var) {
        this.a = l9Var;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // defpackage.h5
    public final void a(int i, Bundle bundle) {
        l9 l9Var = this.a;
        Handler handler = l9Var.mHandler;
        if (handler != null) {
            handler.post(new t(l9Var, i, bundle));
        } else {
            l9Var.onReceiveResult(i, bundle);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel2.writeString("android.support.v4.os.IResultReceiver");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
