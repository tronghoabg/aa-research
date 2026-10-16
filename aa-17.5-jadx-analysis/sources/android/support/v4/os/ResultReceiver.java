package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.dvx;
import defpackage.dvy;
import defpackage.dvz;
import defpackage.ec;
import defpackage.x;

/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new x(13);
    final boolean a;
    public final Handler b;
    dvz c;

    public ResultReceiver(Parcel parcel) {
        this.a = false;
        dvz dvxVar = null;
        this.b = null;
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            dvxVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dvz)) ? new dvx(strongBinder) : (dvz) iInterfaceQueryLocalInterface;
        }
        this.c = dvxVar;
    }

    public final void b(int i, Bundle bundle) {
        if (this.a) {
            Handler handler = this.b;
            if (handler != null) {
                handler.post(new ec(this, i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        dvz dvzVar = this.c;
        if (dvzVar != null) {
            try {
                dvzVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new dvy(this);
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }

    public ResultReceiver(Handler handler) {
        this.a = true;
        this.b = handler;
    }

    public void a(int i, Bundle bundle) {
    }
}
