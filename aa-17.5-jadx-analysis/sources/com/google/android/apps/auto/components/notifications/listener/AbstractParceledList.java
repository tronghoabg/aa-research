package com.google.android.apps.auto.components.notifications.listener;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.mbe;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AbstractParceledList<T extends Parcelable> implements Parcelable {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.ParceledList");
    public final List a;

    protected AbstractParceledList(Parcel parcel, ClassLoader classLoader) throws RemoteException {
        int i = parcel.readInt();
        this.a = new ArrayList(i);
        if (i <= 0) {
            return;
        }
        Parcelable.Creator creatorA = a();
        Class<?> cls = null;
        int i2 = 0;
        while (i2 < i && parcel.readInt() != 0) {
            Parcelable parcelableC = c(parcel, creatorA, classLoader);
            if (cls == null) {
                cls = parcelableC.getClass();
            } else {
                b(cls, parcelableC.getClass());
            }
            this.a.add(parcelableC);
            i2++;
        }
        if (i2 < i) {
            IBinder strongBinder = parcel.readStrongBinder();
            while (i2 < i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInt(i2);
                try {
                    strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (i2 < i && parcelObtain2.readInt() != 0) {
                        Parcelable parcelableC2 = c(parcelObtain2, creatorA, classLoader);
                        b(cls, parcelableC2.getClass());
                        this.a.add(parcelableC2);
                        i2++;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) c.h()).p(e)).ai(4710)).B("Failure retrieving array; only received %d of %d", i2, i);
                    return;
                }
            }
        }
    }

    public static void b(Class cls, Class cls2) {
        if (cls2.equals(cls)) {
            return;
        }
        throw new IllegalArgumentException("Can't unparcel type " + cls2.getName() + " in list of type " + cls.getName());
    }

    private static Parcelable c(Parcel parcel, Parcelable.Creator creator, ClassLoader classLoader) {
        return creator instanceof Parcelable.ClassLoaderCreator ? (Parcelable) ((Parcelable.ClassLoaderCreator) creator).createFromParcel(parcel, classLoader) : (Parcelable) creator.createFromParcel(parcel);
    }

    protected abstract Parcelable.Creator a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        Iterator it = this.a.iterator();
        int iDescribeContents = 0;
        while (it.hasNext()) {
            iDescribeContents |= ((Parcelable) it.next()).describeContents();
        }
        return iDescribeContents;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        if (size > 0) {
            Class<?> cls = ((Parcelable) list.get(0)).getClass();
            int i2 = 0;
            while (i2 < size && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                Parcelable parcelable = (Parcelable) list.get(i2);
                b(cls, parcelable.getClass());
                parcelable.writeToParcel(parcel, i);
                i2++;
            }
            if (i2 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new mbe(this, size, cls, i));
            }
        }
    }

    public AbstractParceledList(List list) {
        this.a = list;
    }
}
