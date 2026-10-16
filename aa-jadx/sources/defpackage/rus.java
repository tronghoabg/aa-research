package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rus extends defpackage.ijw implements defpackage.rut {
    final /* synthetic */ defpackage.rtf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rus(defpackage.rtf rtfVar) {
        super("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
        this.a = rtfVar;
    }

    @Override // defpackage.rut
    public final void e(long j, int i) {
        defpackage.rtf rtfVar = this.a;
        synchronized (((defpackage.rte) rtfVar).b) {
            defpackage.rtd rtdVar = ((defpackage.rte) rtfVar).e;
            if (rtdVar != null) {
                try {
                    rtdVar.b.e(j, i);
                } catch (android.os.RemoteException unused) {
                }
            }
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        long j = parcel.readLong();
        int i2 = parcel.readInt();
        defpackage.ijx.d(parcel);
        e(j, i2);
        parcel2.writeNoException();
        return true;
    }
}
