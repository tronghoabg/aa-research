package defpackage;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.apps.auto.components.notifications.listener.AbstractParceledList;

/* loaded from: classes2.dex */
public final class mbe extends Binder {
    final /* synthetic */ int a;
    final /* synthetic */ Class b;
    final /* synthetic */ int c;
    final /* synthetic */ AbstractParceledList d;

    public mbe(AbstractParceledList abstractParceledList, int i, Class cls, int i2) {
        this.a = i;
        this.b = cls;
        this.c = i2;
        this.d = abstractParceledList;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        int i4 = AbstractParceledList.b;
        int i5 = this.a;
        while (i3 < i5 && parcel2.dataSize() < 65536) {
            parcel2.writeInt(1);
            Parcelable parcelable = (Parcelable) this.d.a.get(i3);
            AbstractParceledList.b(this.b, parcelable.getClass());
            parcelable.writeToParcel(parcel2, this.c);
            i3++;
        }
        if (i3 < i5) {
            parcel2.writeInt(0);
        }
        return true;
    }
}
