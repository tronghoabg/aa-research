package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ajeo extends defpackage.ajen {
    public final java.lang.Runnable a;

    public ajeo(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.a;
        java.lang.String strA = defpackage.aiuz.a(runnable);
        java.lang.String strB = defpackage.aiuz.b(runnable);
        long j = this.g;
        boolean z = this.h;
        java.lang.String str = defpackage.ajep.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
