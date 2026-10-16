package defpackage;

/* loaded from: classes.dex */
public final class cmv extends cmw {
    private final long a;
    private float b = 1.0f;
    private cjw c;

    public cmv(long j) {
        this.a = j;
    }

    @Override // defpackage.cmw
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        czz.I(cmdVar, this.a, 0L, 0L, this.b, this.c, 86);
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.b = f;
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.c = cjwVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmv) && this.a == ((cmv) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ColorPainter(color=" + cjv.g(this.a) + ")";
    }
}
