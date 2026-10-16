package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbl extends android.os.Binder {
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Class b;
    final /* synthetic */ int c;
    final /* synthetic */ com.google.android.apps.auto.components.notifications.listener.AbstractParceledList d;

    public mbl(com.google.android.apps.auto.components.notifications.listener.AbstractParceledList abstractParceledList, int i, java.lang.Class cls, int i2) {
        this.a = i;
        this.b = cls;
        this.c = i2;
        this.d = abstractParceledList;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        int i4 = com.google.android.apps.auto.components.notifications.listener.AbstractParceledList.b;
        int i5 = this.a;
        while (i3 < i5 && parcel2.dataSize() < 65536) {
            parcel2.writeInt(1);
            android.os.Parcelable parcelable = (android.os.Parcelable) this.d.a.get(i3);
            com.google.android.apps.auto.components.notifications.listener.AbstractParceledList.b(this.b, parcelable.getClass());
            parcelable.writeToParcel(parcel2, this.c);
            i3++;
        }
        if (i3 < i5) {
            parcel2.writeInt(0);
        }
        return true;
    }
}
