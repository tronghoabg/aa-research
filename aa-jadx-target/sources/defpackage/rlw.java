package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rlw {
    private static defpackage.zhs a = defpackage.ysr.cp(java.lang.Boolean.FALSE);
    public static defpackage.rlw i;

    public static defpackage.rlw m() {
        defpackage.rlw rlwVar = i;
        rlwVar.getClass();
        return rlwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n() {
        try {
            return ((java.lang.Boolean) a.get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    protected static synchronized defpackage.zhs o(android.content.Context context, java.util.concurrent.Executor executor) {
        defpackage.zim zimVar;
        zimVar = new defpackage.zim(new defpackage.imt(context, 3));
        executor.execute(zimVar);
        a = zimVar;
        return zimVar;
    }

    public abstract java.lang.Object b(defpackage.pbp pbpVar, rlv rlvVar) throws java.lang.Throwable;

    public abstract java.lang.Object c(defpackage.pbp pbpVar, rlv rlvVar, android.os.Handler handler, defpackage.rlu rluVar) throws java.lang.Throwable;

    public abstract void d(pby pbyVar);

    public abstract void e(pcb pcbVar, rls rlsVar);

    public abstract void f(pcb pcbVar, rlt rltVar);

    public abstract void h(defpackage.pbp pbpVar);

    public abstract void i();

    public abstract void k(defpackage.yyn yynVar);
}
