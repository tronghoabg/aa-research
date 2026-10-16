package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjf {
    public final java.util.concurrent.Executor a;
    public final defpackage.afdo b;
    public final java.util.concurrent.Executor c;
    public final defpackage.dzn d;
    public final int e;
    public final defpackage.dsy f;
    public final defpackage.dsy g;
    public final defpackage.dbc h;
    public final defpackage.gkc i;

    /* JADX WARN: Type inference failed for: r4v1, types: [dzn, java.lang.Object] */
    public fjf(defpackage.we weVar) {
        defpackage.aiut aiutVar = defpackage.aivl.a;
        int iMax = java.lang.Math.max(1, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4));
        defpackage.afdh afdhVar = defpackage.aiut.l;
        this.a = defpackage.aiaz.a(aiutVar.g(iMax));
        this.b = aiutVar;
        this.c = defpackage.aiaz.a(aiutVar);
        this.g = new defpackage.dsy(null, null, null);
        this.f = defpackage.fjl.a;
        this.i = new defpackage.gkc((char[]) null);
        this.e = 20;
        this.d = weVar.a;
        this.h = new defpackage.dbc();
    }
}
