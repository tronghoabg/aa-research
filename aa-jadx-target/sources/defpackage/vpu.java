package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vpu {
    public final java.util.concurrent.Executor a;
    public final java.util.Set b;
    public final defpackage.tmy c;
    public final defpackage.afak d;
    public final defpackage.vpq e;
    public defpackage.abor f;
    private final java.util.concurrent.Executor g;

    public vpu(java.util.concurrent.Executor executor, java.util.Set set, defpackage.vpq vpqVar, defpackage.tmy tmyVar, defpackage.afak afakVar) {
        this.a = executor;
        this.e = vpqVar;
        this.g = new defpackage.zie(executor);
        this.b = set;
        this.c = tmyVar;
        this.d = afakVar;
    }

    public final defpackage.zhs a(vps vpsVar) {
        return defpackage.ysr.cs(new vpt(this, vpsVar), this.g);
    }
}
