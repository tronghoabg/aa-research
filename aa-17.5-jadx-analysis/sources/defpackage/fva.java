package defpackage;

import androidx.car.app.model.Row;

/* loaded from: classes2.dex */
public final class fva {
    public final fvd a;
    public final Row b;
    private final uf c;

    public fva(fvd fvdVar, uf ufVar, Row row) {
        fvdVar.getClass();
        ufVar.getClass();
        row.getClass();
        this.a = fvdVar;
        this.c = ufVar;
        this.b = row;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fvaVar = (fva) obj;
        return affa.f(this.a, fvaVar.a) && affa.f(this.c, fvaVar.c) && affa.f(this.b, fvaVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AlphaJumpItem(key=" + this.a + ", item=" + this.c + ", row=" + this.b + ")";
    }
}
