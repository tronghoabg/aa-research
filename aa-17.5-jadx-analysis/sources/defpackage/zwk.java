package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zwk {
    public static final String a = "zwk";
    public boolean b = false;
    public vgp c = null;
    public vgp d = null;
    private final Executor e;

    public zwk(Executor executor) {
        this.e = executor;
    }

    public final void a() {
        synchronized (this) {
            if (this.b && (this.d != null || this.c != null)) {
                this.e.execute(new zte(this, 10));
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this) {
            this.b = z;
        }
        a();
    }
}
