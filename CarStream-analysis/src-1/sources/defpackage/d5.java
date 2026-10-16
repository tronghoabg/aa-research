package defpackage;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class d5 implements f5 {
    public static f5 b;
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.f5
    public final void cancel(String str, int i, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            if (this.a.transact(2, parcelObtain, null, 1) || e5.getDefaultImpl() == null) {
                return;
            }
            e5.getDefaultImpl().cancel(str, i, str2);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.f5
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcelObtain.writeString(str);
            if (this.a.transact(3, parcelObtain, null, 1) || e5.getDefaultImpl() == null) {
                return;
            }
            e5.getDefaultImpl().cancelAll(str);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.f5
    public final void notify(String str, int i, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.a.transact(1, parcelObtain, null, 1) || e5.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                e5.getDefaultImpl().notify(str, i, str2, notification);
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
