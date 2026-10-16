package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzo extends ijo implements qzp {
    private final ParcelFileDescriptor a;

    public qzo(ParcelFileDescriptor parcelFileDescriptor) {
        super("com.google.android.gms.car.IFdBinder");
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.qzp
    public final ParcelFileDescriptor e() {
        return this.a;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        parcel2.writeNoException();
        ijp.h(parcel2, parcelFileDescriptor);
        return true;
    }
}
