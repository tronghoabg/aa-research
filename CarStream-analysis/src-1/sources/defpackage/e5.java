package defpackage;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class e5 extends Binder implements f5 {
    private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public static f5 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof f5)) {
            return (f5) iInterfaceQueryLocalInterface;
        }
        d5 d5Var = new d5();
        d5Var.a = iBinder;
        return d5Var;
    }

    public static f5 getDefaultImpl() {
        return d5.b;
    }

    public static boolean setDefaultImpl(f5 f5Var) {
        if (d5.b != null) {
            throw new IllegalStateException("setDefaultImpl() called twice");
        }
        if (f5Var == null) {
            return false;
        }
        d5.b = f5Var;
        return true;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface(DESCRIPTOR);
            notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface(DESCRIPTOR);
            cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            return true;
        }
        if (i == 3) {
            parcel.enforceInterface(DESCRIPTOR);
            cancelAll(parcel.readString());
            return true;
        }
        if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel2.writeString(DESCRIPTOR);
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
