package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oym implements defpackage.oyl, defpackage.eqg {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SYS.GhSystem");
    private final defpackage.eqi c = new defpackage.eqi(this, true);
    public final defpackage.oyk b = new defpackage.oyo();

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oyl
    public final void a() throws wfo {
        ((defpackage.yqj) a.l().ai((char) 6119)).u("start");
        defpackage.wfp.c();
        this.c.f(defpackage.epx.d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.oyl
    public final void b() throws wfo {
        ((defpackage.yqj) a.l().ai((char) 6120)).u("stop");
        defpackage.wfp.c();
        this.c.f(defpackage.epx.c);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.c;
    }
}
