package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zgq extends defpackage.zgr {
    final /* synthetic */ defpackage.zgs a;
    private final java.util.concurrent.Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgq(defpackage.zgs zgsVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        super(zgsVar, executor);
        this.a = zgsVar;
        this.c = callable;
    }

    @Override // defpackage.zhq
    public final java.lang.Object a() throws java.lang.Exception {
        return this.c.call();
    }

    @Override // defpackage.zhq
    public final java.lang.String b() {
        return this.c.toString();
    }

    @Override // defpackage.zgr
    public final void c(java.lang.Object obj) {
        this.a.o(obj);
    }
}
