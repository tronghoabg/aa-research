package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wip {
    static volatile java.util.concurrent.Executor a;
    private static final java.lang.Object b = new java.lang.Object();

    public static java.util.concurrent.Executor a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new java.util.concurrent.ThreadPoolExecutor(1, 3, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.wio());
                    ((java.util.concurrent.ThreadPoolExecutor) a).allowCoreThreadTimeOut(true);
                }
            }
        }
        return a;
    }
}
