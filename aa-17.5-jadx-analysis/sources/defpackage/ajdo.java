package defpackage;

/* loaded from: classes3.dex */
final class ajdo extends ajdn {
    public final Runnable a;

    public ajdo(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String strA = aiua.a(runnable);
        String strB = aiua.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = ajdp.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
