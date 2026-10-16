package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qm implements defpackage.qt {
    private final /* synthetic */ int a;

    @Override // defpackage.qt
    public final java.lang.Object a(java.lang.Object obj) throws android.os.RemoteException {
        int i = this.a;
        if (i == 0) {
            ((androidx.car.app.ICarHost) obj).finish();
            return null;
        }
        if (i != 1) {
            return androidx.car.app.hardware.ICarHardwareHost.Stub.asInterface(((androidx.car.app.ICarHost) obj).getHost("hardware"));
        }
        ((androidx.car.app.IAppHost) obj).invalidate();
        return null;
    }
}
