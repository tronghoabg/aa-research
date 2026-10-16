package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbu implements java.lang.Runnable {
    public boolean a;
    public final /* synthetic */ com.google.android.gms.carsetup.CarSetupServiceImpl b;

    public sbu(com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl) {
        this.b = carSetupServiceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = defpackage.rvr.a().c(this.b.getApplicationContext());
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.rzu(this, 5, null));
    }
}
