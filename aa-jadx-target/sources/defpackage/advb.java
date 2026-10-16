package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class advb implements aeaq {
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return java.util.concurrent.Executors.newCachedThreadPool(defpackage.adve.i("grpc-default-executor-%d"));
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((java.util.concurrent.ExecutorService) obj).shutdown();
    }

    public final java.lang.String toString() {
        return "grpc-default-executor";
    }
}
