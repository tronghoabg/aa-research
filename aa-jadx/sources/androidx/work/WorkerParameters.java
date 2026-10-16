package androidx.work;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {
    public final java.util.UUID a;
    public final defpackage.fjj b;
    public final java.util.concurrent.Executor c;
    public final defpackage.afdo d;
    public final defpackage.fjo e;
    public final defpackage.dsy f;
    public final defpackage.ajer g;

    public WorkerParameters(java.util.UUID uuid, defpackage.fjj fjjVar, java.util.Collection collection, java.util.concurrent.Executor executor, defpackage.afdo afdoVar, defpackage.ajer ajerVar, defpackage.dsy dsyVar, defpackage.fjo fjoVar) {
        this.a = uuid;
        this.b = fjjVar;
        new java.util.HashSet(collection);
        this.c = executor;
        this.d = afdoVar;
        this.g = ajerVar;
        this.f = dsyVar;
        this.e = fjoVar;
    }
}
