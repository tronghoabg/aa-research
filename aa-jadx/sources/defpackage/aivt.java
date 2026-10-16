package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aivt extends defpackage.aivu {
    private final java.lang.Runnable a;

    public aivt(long j, java.lang.Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.aivu
    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        java.lang.Runnable runnable = this.a;
        java.util.Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
