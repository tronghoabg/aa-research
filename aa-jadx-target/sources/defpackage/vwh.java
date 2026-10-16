package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vwh implements defpackage.afak {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vwh(defpackage.afak afakVar, defpackage.xzi xziVar, defpackage.afak afakVar2, int i) {
        this.d = i;
        this.a = afakVar;
        this.b = xziVar;
        this.c = afakVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mkm] */
    /* JADX WARN: Type inference failed for: r7v1, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, xzi] */
    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        if (this.d == 0) {
            int i = defpackage.vwk.f;
            return (defpackage.vvu) (((java.lang.Boolean) this.a.a()).booleanValue() ? this.b.fF() : this.c.a());
        }
        int i2 = defpackage.qfs.g;
        defpackage.jrj jrjVar = defpackage.jrj.a;
        ?? r5 = this.a;
        return new defpackage.oit((android.content.Context) this.b, this.c, jrjVar, r5, j$.util.Optional.empty());
    }

    public /* synthetic */ vwh(android.content.Context context, java.util.concurrent.Executor executor, defpackage.mkm mkmVar, int i) {
        this.d = i;
        this.b = context;
        this.c = executor;
        this.a = mkmVar;
    }
}
