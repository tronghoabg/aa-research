package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyn extends defpackage.ijw implements defpackage.qyo {
    public final /* synthetic */ defpackage.xgy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyn(defpackage.xgy xgyVar) {
        super("com.google.android.gms.car.ICarPhoneStatusEventListener");
        this.a = xgyVar;
    }

    @Override // defpackage.qyo
    public final void e(android.view.KeyEvent keyEvent) {
        defpackage.wfp.e(new xgx(this, keyEvent));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            parcel.readString();
            parcel.readString();
            parcel.readInt();
            defpackage.ijx.d(parcel);
            return true;
        }
        if (i != 3) {
            return false;
        }
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
        defpackage.ijx.d(parcel);
        e(keyEvent);
        return true;
    }

    @Override // defpackage.qyo
    public final void f(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException {
    }
}
