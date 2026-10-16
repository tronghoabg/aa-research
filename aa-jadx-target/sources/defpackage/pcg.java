package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pcg extends defpackage.ijw implements defpackage.pch {
    public final /* synthetic */ defpackage.pbn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcg(defpackage.pbn pbnVar) {
        super("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedServiceCallback");
        this.a = pbnVar;
    }

    @Override // defpackage.pch
    public final void e(int i) throws android.os.RemoteException {
        this.a.e.post(new defpackage.hif(this, i, 17));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            defpackage.pbn pbnVar = this.a;
            pbnVar.e.post(new pbl(this, 0));
        } else {
            if (i != 3) {
                return false;
            }
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(i2);
        }
        parcel2.writeNoException();
        return true;
    }
}
