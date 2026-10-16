package defpackage;

/* loaded from: classes3.dex */
final class adoo implements adzi {
    public final adzi a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public adoo(adzi adziVar, Runnable runnable) {
        this.a = adziVar;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
