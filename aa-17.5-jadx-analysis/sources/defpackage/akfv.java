package defpackage;

/* loaded from: classes2.dex */
public final class akfv extends akcl {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public akfv(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.akcl
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.akcl
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.akcl
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.akcl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akfv) {
            akfv akfvVar = (akfv) obj;
            if (this.c.equals(akfvVar.c) && this.g == akfvVar.g && this.f == akfvVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akcl
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.akcl
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.akcl
    public final boolean k() {
        return true;
    }

    @Override // defpackage.akcl
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.akcl
    public final long f(long j) {
        return j;
    }
}
