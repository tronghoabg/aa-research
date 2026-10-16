package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rex implements defpackage.reh {
    private final defpackage.zhs a;
    private final android.os.IBinder.DeathRecipient b;
    private volatile boolean c = false;
    private volatile boolean d = true;

    static {
        new defpackage.rde("Binder died");
    }

    @java.lang.Deprecated
    public rex(defpackage.qvl qvlVar, defpackage.reg regVar) {
        this.a = qvlVar == null ? defpackage.zho.a : new defpackage.zho(qvlVar);
        defpackage.rbt rbtVar = new defpackage.rbt(this, regVar, 2);
        this.b = rbtVar;
        try {
            qvlVar.asBinder().linkToDeath(rbtVar, 0);
        } catch (android.os.RemoteException unused) {
            defpackage.rrx.b("GH.SimpleCarClientCtor", null, "Unable to link death recipient to ICar.");
        }
    }

    @Override // defpackage.reh
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized defpackage.qvl a() {
        defpackage.ysr.bk(this.d, "Client not connected.");
        return (defpackage.qvl) defpackage.ysr.cx(this.a);
    }

    @Override // defpackage.reh
    public final synchronized defpackage.zhs b() {
        a();
        return defpackage.zho.a;
    }

    @Override // defpackage.reh
    public final void c() {
        e(false);
    }

    @Override // defpackage.reh
    public final synchronized boolean d() {
        return this.d;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean e(boolean z) {
        boolean z2 = this.d;
        this.d = false;
        if (z2) {
            this.c = z;
            if (this.c) {
                return true;
            }
            android.os.IBinder.DeathRecipient deathRecipient = this.b;
            if (deathRecipient != null) {
                try {
                    ((defpackage.qvl) defpackage.ysr.cx(this.a)).asBinder().unlinkToDeath(deathRecipient, 0);
                } catch (java.util.NoSuchElementException unused) {
                }
            }
        }
        return false;
    }
}
