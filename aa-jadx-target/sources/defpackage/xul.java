package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class xul implements java.lang.Runnable {
    public defpackage.zgm a;
    public java.util.concurrent.Executor b;

    public xul(defpackage.zgm zgmVar, java.util.concurrent.Executor executor) {
        this.a = zgmVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
