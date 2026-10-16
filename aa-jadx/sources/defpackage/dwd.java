package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class dwd {
    public boolean a;
    public boolean b;
    public defpackage.wij c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            defpackage.wij wijVar = this.c;
            if (wijVar != null) {
                try {
                    wijVar.b();
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
