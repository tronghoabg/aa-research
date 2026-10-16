package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tmr implements defpackage.tmt {
    private final java.util.Set a;

    public tmr(java.util.Set set) {
        this.a = set;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.tmt) it.next()).close();
        }
    }
}
