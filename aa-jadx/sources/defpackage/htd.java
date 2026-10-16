package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class htd implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread;
        thread = new java.lang.Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
