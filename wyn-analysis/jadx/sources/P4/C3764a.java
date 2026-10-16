package p4;

import android.os.IBinder;
import android.os.Parcel;
import com.android.vending.licensing.ILicensingService;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3764a implements ILicensingService {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f43236a;

    @Override // com.android.vending.licensing.ILicensingService
    public final void P(long j8, String str, InterfaceC3767d interfaceC3767d) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            parcelObtain.writeLong(j8);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(interfaceC3767d);
            this.f43236a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f43236a;
    }
}
