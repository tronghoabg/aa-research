package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.core.os.IResultReceiver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    IResultReceiver f478a;

    ResultReceiver(Parcel parcel) {
        this.f478a = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    public final void a(int i2, Bundle bundle) {
        IResultReceiver iResultReceiver = this.f478a;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f478a == null) {
                this.f478a = new b();
            }
            parcel.writeStrongBinder(this.f478a.asBinder());
        }
    }
}
