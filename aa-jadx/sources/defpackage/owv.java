package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owv extends defpackage.ijw implements defpackage.oww {
    public owv() {
        super("com.google.android.apps.auto.sdk.IStatusBarController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcel);
                defpackage.ijx.d(parcel);
                q(charSequenceB);
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zU = u();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 3:
                t();
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                s();
                parcel2.writeNoException();
                return true;
            case 12:
                i();
                parcel2.writeNoException();
                return true;
            case 13:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                n(i2);
                parcel2.writeNoException();
                return true;
            case 14:
                r();
                parcel2.writeNoException();
                return true;
            case 15:
                e();
                parcel2.writeNoException();
                return true;
            case 16:
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                l(i3);
                parcel2.writeNoException();
                return true;
            case 17:
                float f = parcel.readFloat();
                defpackage.ijx.d(parcel);
                k(f);
                parcel2.writeNoException();
                return true;
            case 18:
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                parcel2.writeNoException();
                return true;
            case 19:
                boolean zJ = defpackage.ijx.j(parcel);
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                p(zJ, zJ2);
                parcel2.writeNoException();
                return true;
            case 20:
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                m(i4);
                parcel2.writeNoException();
                return true;
            case 21:
                boolean zJ3 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                o(zJ3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
