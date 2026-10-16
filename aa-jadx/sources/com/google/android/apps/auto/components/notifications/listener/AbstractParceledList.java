package com.google.android.apps.auto.components.notifications.listener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractParceledList<T extends android.os.Parcelable> implements android.os.Parcelable {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.ParceledList");
    public final java.util.List a;

    protected AbstractParceledList(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int i = parcel.readInt();
        this.a = new java.util.ArrayList(i);
        if (i <= 0) {
            return;
        }
        android.os.Parcelable.Creator creatorA = a();
        java.lang.Class<?> cls = null;
        int i2 = 0;
        while (i2 < i && parcel.readInt() != 0) {
            android.os.Parcelable parcelableC = c(parcel, creatorA, classLoader);
            if (cls == null) {
                cls = parcelableC.getClass();
            } else {
                b(cls, parcelableC.getClass());
            }
            this.a.add(parcelableC);
            i2++;
        }
        if (i2 < i) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            while (i2 < i) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                parcelObtain.writeInt(i2);
                try {
                    strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (i2 < i && parcelObtain2.readInt() != 0) {
                        android.os.Parcelable parcelableC2 = c(parcelObtain2, creatorA, classLoader);
                        b(cls, parcelableC2.getClass());
                        this.a.add(parcelableC2);
                        i2++;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai(4713)).B("Failure retrieving array; only received %d of %d", i2, i);
                    return;
                }
            }
        }
    }

    public static void b(java.lang.Class cls, java.lang.Class cls2) {
        if (cls2.equals(cls)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Can't unparcel type " + cls2.getName() + " in list of type " + cls.getName());
    }

    private static android.os.Parcelable c(android.os.Parcel parcel, android.os.Parcelable.Creator creator, java.lang.ClassLoader classLoader) {
        return creator instanceof android.os.Parcelable.ClassLoaderCreator ? (android.os.Parcelable) ((android.os.Parcelable.ClassLoaderCreator) creator).createFromParcel(parcel, classLoader) : (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    protected abstract android.os.Parcelable.Creator a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        java.util.Iterator it = this.a.iterator();
        int iDescribeContents = 0;
        while (it.hasNext()) {
            iDescribeContents |= ((android.os.Parcelable) it.next()).describeContents();
        }
        return iDescribeContents;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        if (size > 0) {
            java.lang.Class<?> cls = ((android.os.Parcelable) list.get(0)).getClass();
            int i2 = 0;
            while (i2 < size && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i2);
                b(cls, parcelable.getClass());
                parcelable.writeToParcel(parcel, i);
                i2++;
            }
            if (i2 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new defpackage.mbl(this, size, cls, i));
            }
        }
    }

    public AbstractParceledList(java.util.List list) {
        this.a = list;
    }
}
