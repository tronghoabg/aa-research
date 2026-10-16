package c7;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571g implements Parcelable {
    public static final Parcelable.Creator<C1571g> CREATOR = new C1567c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f19687a;

    public C1571g(IBinder iBinder) {
        this.f19687a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f19687a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C1571g) obj).f19687a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f19687a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Messenger messenger = this.f19687a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
