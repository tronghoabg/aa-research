package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class rbw extends android.app.Service {
    public final defpackage.rbv a = new defpackage.rbv(this);
    public defpackage.reh b;
    public defpackage.qsh c;
    protected android.os.IBinder.DeathRecipient d;
    public boolean e;
    public defpackage.kwv f;

    public final void a() {
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            defpackage.rrx.a("CAR.CLIENT.PLS", null, "Projection end");
        }
        d();
        defpackage.reh rehVar = this.b;
        if (rehVar != null) {
            ((defpackage.rex) rehVar).e(false);
            this.b = null;
        }
        this.f = null;
        this.c = null;
    }

    public final void b(defpackage.rar rarVar) {
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            defpackage.rrx.a("CAR.CLIENT.PLS", null, "Projection teardown");
        }
        if (this.d != null) {
            boolean zUnlinkToDeath = rarVar.asBinder().unlinkToDeath(this.d, 0);
            this.e = !zUnlinkToDeath;
            if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
                defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "Projection unlinkToDeath %s", java.lang.Boolean.valueOf(zUnlinkToDeath));
            }
            this.d = null;
        }
        h();
    }

    public boolean i() {
        return true;
    }

    public void j(defpackage.qsh qshVar, android.os.Bundle bundle, defpackage.ntl ntlVar) {
        ntlVar.c(false);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return new defpackage.ran(this.a);
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void h() {
    }

    public void c(defpackage.qsh qshVar) {
    }

    public void g(android.os.Bundle bundle, defpackage.qsh qshVar) {
    }
}
