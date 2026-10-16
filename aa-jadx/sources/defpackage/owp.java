package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owp extends defpackage.ijw implements defpackage.owq {
    public owp() {
        super("com.google.android.apps.auto.sdk.IMenuController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.owo owoVar;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    owoVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IMenuAdapter");
                    owoVar = iInterfaceQueryLocalInterface instanceof defpackage.owo ? (defpackage.owo) iInterfaceQueryLocalInterface : new defpackage.owo(strongBinder);
                }
                defpackage.ijx.d(parcel);
                k(owoVar);
                break;
            case 2:
                c();
                break;
            case 3:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                d(i2);
                break;
            case 4:
                j();
                break;
            case 5:
                b();
                break;
            case 6:
                i();
                break;
            case 7:
                a();
                break;
            case 8:
                g();
                break;
            case 9:
                f();
                break;
            case 10:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.apps.auto.sdk.AlphaJumpKeyItem.CREATOR);
                defpackage.ijx.d(parcel);
                h(arrayListCreateTypedArrayList);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
