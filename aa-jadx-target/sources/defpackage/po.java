package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class po extends defpackage.ca {
    public final java.lang.Object c;
    public final java.util.concurrent.ExecutorService d;
    public volatile android.os.Handler e;

    public po() {
        super(null);
        this.c = new java.lang.Object();
        this.d = java.util.concurrent.Executors.newFixedThreadPool(4, new defpackage.sto(1, null));
    }
}
