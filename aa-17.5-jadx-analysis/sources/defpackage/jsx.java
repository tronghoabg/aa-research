package defpackage;

import androidx.car.app.model.Row;

/* loaded from: classes2.dex */
public final class jsx {
    public final jtb a;
    public final Row b;
    private final uf c;

    public jsx(jtb jtbVar, uf ufVar, Row row) {
        jtbVar.getClass();
        this.a = jtbVar;
        this.c = ufVar;
        this.b = row;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsx)) {
            return false;
        }
        jsx jsxVar = (jsx) obj;
        return affa.f(this.a, jsxVar.a) && affa.f(this.c, jsxVar.c) && affa.f(this.b, jsxVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AlphaJumpItem(key=" + this.a + ", item=" + this.c + ", row=" + this.b + ")";
    }
}
