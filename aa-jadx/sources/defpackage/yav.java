package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yav extends defpackage.xzx {
    final /* synthetic */ java.util.concurrent.Callable a;

    public yav(java.util.concurrent.Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.xzx
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        return this.a.call();
    }
}
