package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class stc extends defpackage.ijw implements android.os.IInterface {
    public stc() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public void a() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = (com.google.android.gms.googlehelp.GoogleHelp) defpackage.ijx.a(parcel, com.google.android.gms.googlehelp.GoogleHelp.CREATOR);
                defpackage.ijx.d(parcel);
                c(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                throw new java.lang.UnsupportedOperationException();
            case 4:
                throw new java.lang.UnsupportedOperationException();
            case 5:
                throw new java.lang.UnsupportedOperationException();
            case 6:
                throw new java.lang.UnsupportedOperationException();
            case 7:
                a();
                return true;
            case 8:
                b();
                return true;
            case 9:
                parcel.readInt();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 10:
                throw new java.lang.UnsupportedOperationException();
            case 11:
                throw new java.lang.UnsupportedOperationException();
            case 12:
                throw new java.lang.UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 14:
                throw new java.lang.UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 16:
                throw new java.lang.UnsupportedOperationException();
            case 17:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 19:
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }
}
