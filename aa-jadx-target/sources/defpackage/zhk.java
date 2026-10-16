package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zhk {
    public final boolean a;
    public final java.lang.Object b;

    public zhk(defpackage.tmy tmyVar, defpackage.xyn xynVar) {
        this.b = tmyVar;
        this.a = xynVar.f();
    }

    public final defpackage.zhs a(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new defpackage.zgs((defpackage.ygm) this.b, this.a, executor, callable);
    }

    public zhk(boolean z, defpackage.ygw ygwVar) {
        this.a = z;
        this.b = ygwVar;
    }
}
