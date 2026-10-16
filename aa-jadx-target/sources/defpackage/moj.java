package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class moj implements defpackage.lhn {
    public static final /* synthetic */ int b = 0;
    public final defpackage.eqs a = new defpackage.eqs();
    private boolean c;

    static {
        defpackage.yqm.c("GH.GhSugDataManager");
    }

    public static defpackage.moj a() {
        return (defpackage.moj) defpackage.mkp.a.b(defpackage.moj.class, new defpackage.mbf(9));
    }

    public final synchronized void b(java.util.List list, android.content.ComponentName componentName) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.mjc(componentName, 3));
        int i = defpackage.ygw.d;
        this.a.j((java.util.List) map.collect(defpackage.yds.a));
    }

    @Override // defpackage.lhn
    public final void d() {
        synchronized (this) {
            int i = defpackage.ygw.d;
            this.a.j(defpackage.ymx.a);
            this.c = false;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        synchronized (this) {
            defpackage.ysr.bk(!this.c, "start() was called when the instance was already started");
            this.c = true;
        }
    }
}
