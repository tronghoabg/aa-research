package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adzb {
    public final java.lang.Object a;
    java.util.concurrent.Future b;
    public boolean c;

    public adzb(java.lang.Object obj) {
        this.a = obj;
    }

    public final java.util.concurrent.Future a() {
        this.c = true;
        return this.b;
    }

    final void b(java.util.concurrent.Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.c;
            if (!z) {
                this.b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
