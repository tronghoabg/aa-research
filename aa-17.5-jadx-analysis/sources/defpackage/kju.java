package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kju implements kka {
    public final int a;
    public final int b;
    private final List c;

    public kju(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
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
        if (!(obj instanceof kju)) {
            return false;
        }
        kju kjuVar = (kju) obj;
        return this.a == kjuVar.a && this.b == kjuVar.b && affa.f(this.c, kjuVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarIntPropertyConfig(minValue=" + this.a + ", maxValue=" + this.b + ", configArray=" + this.c + ")";
    }
}
