package defpackage;

import defpackage.zeu;

/* loaded from: classes.dex */
final class zgx extends zeu.f implements Runnable {
    private final Runnable a;

    public zgx(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.zeu
    protected final String fO() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            p(th);
            throw th;
        }
    }
}
