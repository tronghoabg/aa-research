package defpackage;

/* loaded from: classes2.dex */
public final class mwy {
    public final krt a;
    public final boolean b;
    public final Integer c;
    public final boolean d = lel.a.a().b();

    public mwy(krt krtVar, boolean z, Integer num) {
        this.a = krtVar;
        this.b = z;
        this.c = num;
    }

    public final long a(bux buxVar) {
        return cjn.i(d(this.a.a, 85, 85, 40, buxVar));
    }

    public final long b(bux buxVar) {
        return cjn.i(d(this.a.e, 25, 32, 92, buxVar));
    }

    public final long c(bux buxVar) {
        return cjn.i(d(this.a.e, 90, 90, 15, buxVar));
    }

    public final int d(abzz abzzVar, int i, int i2, int i3, bux buxVar) {
        if (this.b) {
            buxVar.v(-91193281);
            if (true != ca.bl(buxVar)) {
                i = i2;
            }
            buxVar.o();
        } else {
            if (!leh.a.a().b()) {
                buxVar.v(1936730548);
                buxVar.o();
                return abzzVar.a(i2);
            }
            buxVar.v(-91023835);
            if (true != ca.bl(buxVar)) {
                i = i3;
            }
            buxVar.o();
        }
        i2 = i;
        return abzzVar.a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwy)) {
            return false;
        }
        mwy mwyVar = (mwy) obj;
        return affa.f(this.a, mwyVar.a) && this.b == mwyVar.b && affa.f(this.c, mwyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        return ((iHashCode + a.f(this.b)) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ComposeMediaPalette(basePalette=" + this.a + ", forceDark=" + this.b + ", darkestColor=" + this.c + ")";
    }
}
