package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vmd implements java.util.concurrent.RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9786)).y("Service rejected execution of %s", runnable);
    }
}
