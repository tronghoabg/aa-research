package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sjz extends defpackage.ijw implements android.os.IInterface {
    public sjz() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                b(status);
                return true;
            case 2:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                parcel.readLong();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 4:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 5:
                parcel.readLong();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 6:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 7:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 8:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                a(status2);
                return true;
            case 9:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                c(status3);
                return true;
            default:
                return false;
        }
    }
}
