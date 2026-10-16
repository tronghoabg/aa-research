package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class frm implements java.io.Closeable {
    public final defpackage.frl a;
    public final /* synthetic */ defpackage.fro b;
    private boolean c;

    public frm(defpackage.fro froVar, defpackage.frl frlVar) {
        this.b = froVar;
        this.a = frlVar;
    }

    public final defpackage.ajor a(int i) {
        if (this.c) {
            throw new java.lang.IllegalStateException("snapshot is closed");
        }
        java.lang.Object obj = this.a.c.get(i);
        obj.getClass();
        return (defpackage.ajor) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.fro froVar = this.b;
        synchronized (froVar) {
            defpackage.frl frlVar = this.a;
            int i = frlVar.g - 1;
            frlVar.g = i;
            if (i == 0 && frlVar.f) {
                froVar.f(frlVar);
            }
        }
    }
}
