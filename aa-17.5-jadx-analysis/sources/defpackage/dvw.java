package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public final class dvw {
    public boolean a;
    public boolean b;
    public whk c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            whk whkVar = this.c;
            if (whkVar != null) {
                try {
                    whkVar.b();
                } catch (Throwable th) {
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
