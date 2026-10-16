package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jar extends defpackage.ijw implements defpackage.jas {
    final /* synthetic */ defpackage.iyx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jar(defpackage.iyx iyxVar) {
        super("com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
        this.a = iyxVar;
    }

    @Override // defpackage.jas
    public final void e(long j, int i) {
        defpackage.iyx iyxVar = this.a;
        synchronized (((defpackage.iyw) iyxVar).b) {
            defpackage.iyv iyvVar = ((defpackage.iyw) iyxVar).e;
            if (iyvVar != null) {
                try {
                    iyvVar.b.e(j, i);
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
