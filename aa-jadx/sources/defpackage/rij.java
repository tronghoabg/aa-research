package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rij extends defpackage.ijw implements defpackage.rik {
    public rij() {
        super("com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rin rilVar = null;
        if (i == 2) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
                rilVar = iInterfaceQueryLocalInterface instanceof defpackage.rin ? (defpackage.rin) iInterfaceQueryLocalInterface : new defpackage.ril(strongBinder);
            }
            defpackage.ijx.d(parcel);
            f(rilVar);
        } else if (i == 3) {
            com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest = (com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest) defpackage.ijx.a(parcel, com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest.CREATOR);
            defpackage.ijx.d(parcel);
            g(carLocalMediaPlaybackRequest);
        } else {
            if (i != 4) {
                return false;
            }
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
                rilVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rin ? (defpackage.rin) iInterfaceQueryLocalInterface2 : new defpackage.ril(strongBinder2);
            }
            defpackage.ijx.d(parcel);
            h(rilVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
