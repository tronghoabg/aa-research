package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jog {
    public final defpackage.zhs a;
    public final defpackage.xzi b;
    private volatile boolean c;
    private volatile boolean d;

    public jog(defpackage.xzi xziVar, defpackage.xzi xziVar2, long j) {
        if (j <= 0) {
            this.a = a(xziVar);
        } else {
            this.a = defpackage.ysr.cr(new jof(this, xziVar, 0), j, java.util.concurrent.TimeUnit.MILLISECONDS, java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
        }
        this.b = defpackage.ysr.aQ(new defpackage.jbr(this, xziVar2, 4, null));
    }

    public final synchronized defpackage.zhs a(defpackage.xzi xziVar) {
        defpackage.ysr.bk(!this.c, "Should only connect once.");
        this.c = true;
        if (!this.d) {
            return (defpackage.zhs) xziVar.fF();
        }
        defpackage.zhn zhnVar = defpackage.zhn.a;
        if (zhnVar != null) {
            return zhnVar;
        }
        return new defpackage.zhn();
    }

    public final synchronized defpackage.zhs b(defpackage.xzi xziVar) {
        defpackage.ysr.bk(!this.d, "Should only release once.");
        this.d = true;
        if (this.c) {
            return (defpackage.zhs) xziVar.fF();
        }
        return defpackage.ysr.cp(java.lang.Boolean.TRUE);
    }
}
