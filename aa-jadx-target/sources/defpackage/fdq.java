package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class fdq implements java.lang.AutoCloseable {
    public final defpackage.fdf d;
    public final boolean e = false;
    public final java.lang.Object f = new java.lang.Object();
    public volatile boolean g;

    public fdq(defpackage.fdf fdfVar) {
        this.d = fdfVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
