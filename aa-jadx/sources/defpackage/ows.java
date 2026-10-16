package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ows extends defpackage.ijw implements defpackage.owt {
    public ows() {
        super("com.google.android.apps.auto.sdk.ISearchController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.owr owrVar;
        switch (i) {
            case 1:
                d();
                break;
            case 2:
                a();
                break;
            case 3:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.apps.auto.sdk.SearchItem.CREATOR);
                defpackage.ijx.d(parcel);
                c(arrayListCreateTypedArrayList);
                break;
            case 4:
                java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcel);
                defpackage.ijx.d(parcel);
                b(charSequenceB);
                break;
            case 5:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    owrVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ISearchCallback");
                    owrVar = iInterfaceQueryLocalInterface instanceof defpackage.owr ? (defpackage.owr) iInterfaceQueryLocalInterface : new defpackage.owr(strongBinder);
                }
                defpackage.ijx.d(parcel);
                h(owrVar);
                break;
            case 6:
                g();
                break;
            case 7:
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                f(string);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
