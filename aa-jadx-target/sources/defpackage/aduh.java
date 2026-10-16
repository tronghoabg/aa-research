package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aduh implements adtk {
    public final adtk a;
    public volatile boolean b;
    public java.util.List c = new java.util.ArrayList();

    public aduh(adtk adtkVar) {
        this.a = adtkVar;
    }

    private final void b(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    public final void a(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar) {
        b(new defpackage.adsh(this, adorVar, adtjVar, adndVar, 2));
    }

    public final void c(defpackage.adnd adndVar) {
        b(new defpackage.aafx(this, adndVar, 16, (byte[]) null));
    }

    public final void d(aeax aeaxVar) {
        if (this.b) {
            this.a.d(aeaxVar);
        } else {
            b(new defpackage.aafx(this, aeaxVar, 15, (char[]) null));
        }
    }

    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new defpackage.adug(this, 2));
        }
    }
}
