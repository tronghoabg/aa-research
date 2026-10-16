package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sot implements java.util.concurrent.Executor {
    public static android.content.Context a;
    private static volatile defpackage.sot b;

    private sot() {
    }

    public static defpackage.sot a(android.content.Context context) {
        defpackage.sot sotVar;
        defpackage.sot sotVar2 = b;
        if (sotVar2 != null) {
            return sotVar2;
        }
        synchronized (defpackage.sot.class) {
            sotVar = b;
            if (sotVar == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                a = applicationContext;
                sotVar = new defpackage.sot();
                b = sotVar;
            }
        }
        return sotVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        defpackage.sos.a.post(runnable);
    }
}
