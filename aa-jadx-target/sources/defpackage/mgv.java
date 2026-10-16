package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgv {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.Preflight.Event");
    public final java.util.Set a = new java.util.HashSet();
    private final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void a(defpackage.mgt mgtVar) {
        defpackage.wfp.c();
        this.c.post(new defpackage.kfq(this, mgtVar, 2));
    }

    public final void b(defpackage.mgu mguVar) {
        defpackage.wfp.c();
        if (this.a.add(mguVar)) {
            ((defpackage.yqj) b.l().ai((char) 4894)).y("registered listener %s", mguVar);
        } else {
            ((defpackage.yqj) b.l().ai((char) 4893)).y("listener already registered: %s", mguVar);
        }
    }

    public final void c(defpackage.mgu mguVar) {
        defpackage.wfp.c();
        this.a.remove(mguVar);
        ((defpackage.yqj) b.l().ai((char) 4895)).y("unregistered listener %s", mguVar);
    }
}
