package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rlh extends defpackage.ijw implements defpackage.rli {
    public rlh() {
        super("com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            com.google.android.gms.car.display.UiStyle uiStyle = (com.google.android.gms.car.display.UiStyle) defpackage.ijx.a(parcel, com.google.android.gms.car.display.UiStyle.CREATOR);
            defpackage.ijx.d(parcel);
            c(uiStyle);
            parcel2.writeNoException();
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
            java.lang.ClassLoader classLoader = defpackage.ijx.a;
            boolean z = parcel.readInt() != 0;
            defpackage.ijx.d(parcel);
            b(z);
            parcel2.writeNoException();
        } else {
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
