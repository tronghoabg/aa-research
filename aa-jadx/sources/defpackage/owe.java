package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owe extends defpackage.ijw implements defpackage.owf {
    public owe() {
        super("com.google.android.apps.auto.sdk.IDrawerController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.owc owaVar;
        switch (i) {
            case 1:
                boolean zI = i();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 2:
                boolean zJ = j();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 3:
                f();
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    owaVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IDrawerCallback");
                    owaVar = iInterfaceQueryLocalInterface instanceof defpackage.owc ? (defpackage.owc) iInterfaceQueryLocalInterface : new defpackage.owa(strongBinder);
                }
                defpackage.ijx.d(parcel);
                g(owaVar);
                parcel2.writeNoException();
                return true;
            case 6:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                h(i2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
