package defpackage;

/* loaded from: classes.dex */
public class fdj implements AutoCloseable {
    public final fcy d;
    public final boolean e = false;
    public final Object f = new Object();
    public volatile boolean g;

    public fdj(fcy fcyVar) {
        this.d = fcyVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
