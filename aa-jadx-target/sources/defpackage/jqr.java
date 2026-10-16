package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqr implements defpackage.jbt {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.SelectSvcStarter");
    private final defpackage.ygw b;
    private final java.lang.Runnable c;

    public jqr(java.util.List list, java.lang.Runnable runnable) {
        this.b = defpackage.ygw.o(list);
        this.c = runnable;
    }

    @Override // defpackage.jbt
    public final void a() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2654)).u("All services have been started.");
        this.c.run();
    }

    @Override // defpackage.jbt
    public final boolean b(int i) {
        boolean zContains = this.b.contains(java.lang.Integer.valueOf(i));
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2655)).w("Ok to start service %d", i);
        return zContains;
    }
}
