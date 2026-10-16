package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zhi implements java.lang.Runnable {
    final defpackage.zhs a;
    final defpackage.zhh b;

    public zhi(defpackage.zhs zhsVar, defpackage.zhh zhhVar) {
        this.a = zhsVar;
        this.b = zhhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable thJ;
        defpackage.zhs zhsVar = this.a;
        if ((zhsVar instanceof defpackage.zio) && (thJ = ((defpackage.zio) zhsVar).j()) != null) {
            this.b.a(thJ);
            return;
        }
        try {
            defpackage.ysr.bn(zhsVar.isDone(), "Future was expected to be done: %s", zhsVar);
            this.b.b(defpackage.a.K(zhsVar));
        } catch (java.util.concurrent.ExecutionException e) {
            this.b.a(e.getCause());
        } catch (java.lang.Throwable th) {
            this.b.a(th);
        }
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.a(this.b);
        return xymVarBy.toString();
    }
}
