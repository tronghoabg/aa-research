package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public interface zhv extends java.util.concurrent.ExecutorService {
    defpackage.zhs c(java.lang.Runnable runnable);

    defpackage.zhs d(java.util.concurrent.Callable callable);

    defpackage.zhs e(java.lang.Runnable runnable, java.lang.Object obj);

    @Override // java.util.concurrent.ExecutorService
    java.util.List invokeAll(java.util.Collection collection) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException;
}
