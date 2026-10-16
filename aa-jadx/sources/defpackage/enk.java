package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class enk {
    public final long a;
    public final long b;

    public enk(long j, long j2) {
        this.a = j2 == 0 ? 0L : j;
        this.b = j2 == 0 ? 1L : j2;
    }

    public final java.lang.String toString() {
        return this.a + "/" + this.b;
    }
}
