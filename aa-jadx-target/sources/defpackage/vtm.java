package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtm {
    public final defpackage.afak a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public vtm(defpackage.vud vudVar, defpackage.xzi xziVar, defpackage.xzi xziVar2, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.wde wdeVar, defpackage.afak afakVar) {
        this.g = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.b = vudVar;
        this.c = xziVar;
        this.d = xziVar2;
        this.e = executor;
        this.f = wdeVar.d(executor, aclmVar, null);
        this.a = afakVar;
    }

    public vtm(defpackage.vpu vpuVar, defpackage.xyn xynVar, defpackage.tmy tmyVar, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4) {
        this.b = vpuVar;
        this.d = xynVar;
        this.f = tmyVar;
        this.e = afakVar;
        this.a = afakVar2;
        this.g = afakVar3;
        this.c = afakVar4;
    }
}
