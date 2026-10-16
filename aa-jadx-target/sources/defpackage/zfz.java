package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class zfz extends defpackage.zhd implements java.lang.Runnable {
    public static final /* synthetic */ int d = 0;
    defpackage.zhs a;
    java.lang.Class b;
    java.lang.Object c;

    public zfz(defpackage.zhs zhsVar, java.lang.Class cls, java.lang.Object obj) {
        zhsVar.getClass();
        this.a = zhsVar;
        this.b = cls;
        this.c = obj;
    }

    public static defpackage.zhs f(defpackage.zhs zhsVar, java.lang.Class cls, defpackage.xyd xydVar, java.util.concurrent.Executor executor) {
        defpackage.zfy zfyVar = new defpackage.zfy(zhsVar, cls, xydVar);
        zhsVar.c(zfyVar, defpackage.ysr.ch(executor, zfyVar));
        return zfyVar;
    }

    public static defpackage.zhs g(defpackage.zhs zhsVar, java.lang.Class cls, defpackage.zgn zgnVar, java.util.concurrent.Executor executor) {
        defpackage.zfx zfxVar = new defpackage.zfx(zhsVar, cls, zgnVar);
        zhsVar.c(zfxVar, defpackage.ysr.ch(executor, zfxVar));
        return zfxVar;
    }

    @Override // defpackage.zga
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract java.lang.Object d(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception;

    public abstract void e(java.lang.Object obj);

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhs zhsVar = this.a;
        java.lang.Class cls = this.b;
        java.lang.Object obj = this.c;
        java.lang.String strEW = super.eW();
        java.lang.String strBV = zhsVar != null ? defpackage.a.bV(zhsVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strEW != null) {
                return strBV.concat(strEW);
            }
            return null;
        }
        return strBV + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objK;
        defpackage.zhs zhsVar = this.a;
        java.lang.Class cls = this.b;
        java.lang.Object obj = this.c;
        if (((obj == null) || ((zhsVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = zhsVar instanceof defpackage.zio ? ((defpackage.zio) zhsVar).j() : null;
            if (th == null) {
                defpackage.ysr.bn(zhsVar.isDone(), "Future was expected to be done: %s", zhsVar);
                objK = defpackage.a.K(zhsVar);
            } else {
                objK = null;
            }
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                cause = new java.lang.NullPointerException("Future type " + java.lang.String.valueOf(zhsVar.getClass()) + " threw " + java.lang.String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            o(objK);
            return;
        }
        if (!cls.isInstance(th)) {
            r(zhsVar);
            return;
        }
        try {
            java.lang.Object objD = d(obj, th);
            this.b = null;
            this.c = null;
            e(objD);
        } catch (java.lang.Throwable th2) {
            try {
                defpackage.ysr.cd(th2);
                p(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
