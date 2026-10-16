package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tyr implements defpackage.vbb {
    java.lang.Runnable a;

    @Override // defpackage.vbb
    public final void a(defpackage.vav vavVar) {
        java.lang.Runnable runnable;
        boolean z;
        synchronized (this) {
            runnable = this.a;
            java.lang.Boolean bool = (java.lang.Boolean) vavVar.c();
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

    public final synchronized void b(java.lang.Runnable runnable) {
        this.a = runnable;
    }
}
