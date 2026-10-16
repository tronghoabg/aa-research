package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zil extends defpackage.zhq {
    final /* synthetic */ defpackage.zim a;
    private final java.util.concurrent.Callable b;

    public zil(defpackage.zim zimVar, java.util.concurrent.Callable callable) {
        this.a = zimVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.zhq
    public final java.lang.Object a() throws java.lang.Exception {
        return this.b.call();
    }

    @Override // defpackage.zhq
    public final java.lang.String b() {
        return this.b.toString();
    }

    @Override // defpackage.zhq
    public final void d(java.lang.Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.zhq
    public final void e(java.lang.Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.zhq
    public final boolean g() {
        return this.a.isDone();
    }
}
