package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u.f;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489b implements InterfaceC1491d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f19097a;

    public final boolean R(f fVar, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            gc.b.O(parcelObtain, uri);
            gc.b.O(parcelObtain, bundle);
            int size = arrayList.size();
            parcelObtain.writeInt(size);
            for (int i5 = 0; i5 < size; i5++) {
                gc.b.O(parcelObtain, (Parcelable) arrayList.get(i5));
            }
            this.f19097a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean S(f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            this.f19097a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final int T(f fVar, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeString(str);
            gc.b.O(parcelObtain, bundle);
            this.f19097a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean U(f fVar, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            gc.b.O(parcelObtain, uri);
            this.f19097a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean V(f fVar, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            gc.b.O(parcelObtain, uri);
            gc.b.O(parcelObtain, bundle);
            this.f19097a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean W(f fVar, int i5, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeStrongInterface(fVar);
            parcelObtain.writeInt(i5);
            gc.b.O(parcelObtain, uri);
            gc.b.O(parcelObtain, bundle);
            this.f19097a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean X() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1491d.f19099U8);
            parcelObtain.writeLong(0L);
            this.f19097a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19097a;
    }
}
