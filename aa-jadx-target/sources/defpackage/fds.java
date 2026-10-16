package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class fds implements java.lang.AutoCloseable {
    public final defpackage.fdq c;

    /* JADX WARN: Illegal instructions before constructor call */
    public fds(defpackage.fds fdsVar) {
        defpackage.fdq fdqVar = fdsVar.c;
        defpackage.fdg.a.incrementAndGet();
        this(fdqVar);
        boolean z = this.c.e;
    }

    public fds(defpackage.fdq fdqVar) {
        this.c = fdqVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
