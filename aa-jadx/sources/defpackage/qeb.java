package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qeb extends defpackage.ijw implements defpackage.qec {
    final /* synthetic */ com.google.android.enterprise.connectedapps.CrossProfileConnector_Service a;
    private final defpackage.erh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeb(com.google.android.enterprise.connectedapps.CrossProfileConnector_Service crossProfileConnector_Service) {
        super("com.google.android.enterprise.connectedapps.ICrossProfileService");
        this.a = crossProfileConnector_Service;
        this.b = new defpackage.erh((char[]) null, (byte[]) null);
    }

    @Override // defpackage.qec
    public final void e(long j, int i, int i2, byte[] bArr) {
        this.a.getApplicationContext();
        ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.b.a).a(j, i, i2, bArr);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qdz qdxVar;
        defpackage.qdz qdzVar;
        if (i == 1) {
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            defpackage.ijx.d(parcel);
            e(j, i2, i3, bArrCreateByteArray);
            parcel2.writeNoException();
        } else if (i == 2) {
            long j2 = parcel.readLong();
            parcel.readInt();
            android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
            defpackage.ijx.d(parcel);
            i(j2, bundle);
            parcel2.writeNoException();
        } else if (i == 3) {
            long j3 = parcel.readLong();
            int i4 = parcel.readInt();
            long j4 = parcel.readLong();
            int i5 = parcel.readInt();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                qdzVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
                if (iInterfaceQueryLocalInterface instanceof defpackage.qdz) {
                    qdzVar = (defpackage.qdz) iInterfaceQueryLocalInterface;
                } else {
                    qdxVar = new defpackage.qdx(strongBinder);
                }
                defpackage.ijx.d(parcel);
                byte[] bArrF = f(j3, i4, j4, i5, bArrCreateByteArray2, qdxVar);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrF);
            }
            qdxVar = qdzVar;
            defpackage.ijx.d(parcel);
            byte[] bArrF2 = f(j3, i4, j4, i5, bArrCreateByteArray2, qdxVar);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrF2);
        } else if (i == 4) {
            long j5 = parcel.readLong();
            int i6 = parcel.readInt();
            defpackage.ijx.d(parcel);
            byte[] bArrG = g(j5, i6);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrG);
        } else {
            if (i != 5) {
                return false;
            }
            long j6 = parcel.readLong();
            parcel.readInt();
            defpackage.ijx.d(parcel);
            android.os.Bundle bundleH = h(j6);
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, bundleH);
        }
        return true;
    }

    @Override // defpackage.qec
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, defpackage.qdz qdzVar) {
        return this.b.R(this.a.getApplicationContext(), j, i, j2, i2, bArr, qdzVar);
    }

    @Override // defpackage.qec
    public final byte[] g(long j, int i) {
        this.a.getApplicationContext();
        java.util.Map map = ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.b.a).a;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        byte[] bArr = (byte[]) map.get(lValueOf);
        int length = bArr.length;
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, 250000 * i, java.lang.Math.min(length, (i + 1) * 250000));
        if (i == ((int) java.lang.Math.ceil(((double) length) / 250000.0d)) - 1) {
            map.remove(lValueOf);
        }
        return bArrCopyOfRange;
    }

    @Override // defpackage.qec
    public final android.os.Bundle h(long j) {
        this.a.getApplicationContext();
        return (android.os.Bundle) ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.b.a).b.remove(java.lang.Long.valueOf(j));
    }

    @Override // defpackage.qec
    public final void i(long j, android.os.Bundle bundle) {
        this.a.getApplicationContext();
        ((com.google.android.enterprise.connectedapps.internal.BundleCallReceiver) this.b.a).c(j, bundle);
    }
}
