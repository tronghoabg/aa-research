package defpackage;

/* loaded from: classes3.dex */
public final class txt implements vae {
    Runnable a;

    @Override // defpackage.vae
    public final void a(uzy uzyVar) {
        Runnable runnable;
        boolean z;
        synchronized (this) {
            runnable = this.a;
            Boolean bool = (Boolean) uzyVar.c();
            z = false;
            if (bool != null && bool.booleanValue()) {
                this.a = null;
                z = true;
            }
        }
        if (!z || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final synchronized void b(Runnable runnable) {
        this.a = runnable;
    }
}
