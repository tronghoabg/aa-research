package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class zgh extends defpackage.zhd implements java.lang.Runnable {
    public static final /* synthetic */ int c = 0;
    defpackage.zhs a;
    java.lang.Object b;

    public zgh(defpackage.zhs zhsVar, java.lang.Object obj) {
        zhsVar.getClass();
        this.a = zhsVar;
        obj.getClass();
        this.b = obj;
    }

    public static defpackage.zhs f(defpackage.zhs zhsVar, defpackage.xyd xydVar, java.util.concurrent.Executor executor) {
        defpackage.zgg zggVar = new defpackage.zgg(zhsVar, xydVar);
        zhsVar.c(zggVar, defpackage.ysr.ch(executor, zggVar));
        return zggVar;
    }

    public static defpackage.zhs g(defpackage.zhs zhsVar, defpackage.zgn zgnVar, java.util.concurrent.Executor executor) {
        defpackage.zgf zgfVar = new defpackage.zgf(zhsVar, zgnVar);
        zhsVar.c(zgfVar, defpackage.ysr.ch(executor, zgfVar));
        return zgfVar;
    }

    @Override // defpackage.zga
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception;

    public abstract void e(java.lang.Object obj);

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhs zhsVar = this.a;
        java.lang.Object obj = this.b;
        java.lang.String strEW = super.eW();
        java.lang.String strBV = zhsVar != null ? defpackage.a.bV(zhsVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strEW != null) {
                return strBV.concat(strEW);
            }
            return null;
        }
        return strBV + "function=[" + obj.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.zhs zhsVar = this.a;
        java.lang.Object obj = this.b;
        if ((isCancelled() | (zhsVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (zhsVar.isCancelled()) {
            r(zhsVar);
            return;
        }
        try {
            defpackage.ysr.bn(zhsVar.isDone(), "Future was expected to be done: %s", zhsVar);
            try {
                java.lang.Object objD = d(obj, defpackage.a.K(zhsVar));
                this.b = null;
                e(objD);
            } catch (java.lang.Throwable th) {
                try {
                    defpackage.ysr.cd(th);
                    p(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (java.lang.Error e) {
            p(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e2) {
            p(e2.getCause());
        } catch (java.lang.Exception e3) {
            p(e3);
        }
    }
}
