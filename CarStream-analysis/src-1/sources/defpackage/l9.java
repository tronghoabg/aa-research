package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class l9 implements Parcelable {
    public static final Parcelable.Creator<l9> CREATOR = new j9();
    final Handler mHandler;
    final boolean mLocal;
    h5 mReceiver;

    public l9(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void send(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new t(this, i, bundle));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        h5 h5Var = this.mReceiver;
        if (h5Var != null) {
            try {
                h5Var.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new k9(this);
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l9(Parcel parcel) {
        this.mLocal = false;
        h5 h5Var = null;
        this.mHandler = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = k9.b;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof h5)) {
                h5Var = (h5) iInterfaceQueryLocalInterface;
            } else {
                g5 g5Var = new g5();
                g5Var.a = strongBinder;
                h5Var = g5Var;
            }
        }
        this.mReceiver = h5Var;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }
}
