package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjx implements kka {
    public final long a;
    public final long b;
    private final List c;

    public kjx(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        this.c = list;
    }

    @Override // defpackage.kka
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjx)) {
            return false;
        }
        kjx kjxVar = (kjx) obj;
        return this.a == kjxVar.a && this.b == kjxVar.b && affa.f(this.c, kjxVar.c);
    }

    public final int hashCode() {
        return (((a.g(this.a) * 31) + a.g(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarLongPropertyConfig(minValue=" + this.a + ", maxValue=" + this.b + ", configArray=" + this.c + ")";
    }
}
