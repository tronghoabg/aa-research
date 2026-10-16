package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3174f implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f39192a;

    public final void R(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f39192a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39192a;
    }
}
