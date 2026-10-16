package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbv {
    final /* synthetic */ com.google.android.gms.carsetup.CarSetupServiceImpl a;
    private int b;
    private long c;

    public sbv(com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl) {
        this.a = carSetupServiceImpl;
        b(0);
    }

    public final synchronized int a() {
        return this.b;
    }

    public final synchronized void b(int i) {
        this.b = i;
        if (i == 1) {
            this.c = android.os.SystemClock.elapsedRealtime();
        }
    }

    public final synchronized boolean c() {
        if (this.b == 0) {
            return false;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.c;
        if (jElapsedRealtime < 10000) {
            return true;
        }
        defpackage.scl sclVar = this.a.i;
        if (sclVar == null || !sclVar.k) {
            return false;
        }
        return jElapsedRealtime < 300000;
    }

    public final synchronized boolean d() {
        if (this.b != 2) {
            return false;
        }
        this.b = 3;
        return true;
    }
}
