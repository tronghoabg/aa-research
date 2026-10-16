package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnk implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.os.Bundle b;
    final /* synthetic */ defpackage.rng c;

    public rnk(defpackage.rng rngVar, java.lang.String str, android.os.Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = rngVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        return java.lang.Boolean.valueOf(this.c.a.performPrivateCommand(this.a, this.b));
    }
}
