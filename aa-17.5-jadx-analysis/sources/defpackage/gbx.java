package defpackage;

/* loaded from: classes2.dex */
public final class gbx implements hju {
    public final gfk a;
    public final gfk b;
    public final afec c;
    public final int d;
    public final int e;

    public gbx() {
        this(new gfq(), new gfq(), null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbx)) {
            return false;
        }
        gbx gbxVar = (gbx) obj;
        return affa.f(this.a, gbxVar.a) && affa.f(this.b, gbxVar.b) && affa.f(this.c, gbxVar.c) && this.d == gbxVar.d && this.e == gbxVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afec afecVar = this.c;
        return (((((iHashCode * 31) + (afecVar == null ? 0 : afecVar.hashCode())) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "NumberPickerUiModel(incrementIcon=" + this.a + ", decrementIcon=" + this.b + ", onValueChanged=" + this.c + ", initialValue=" + this.d + ", minValue=" + this.e + ")";
    }

    public gbx(gfk gfkVar, gfk gfkVar2, afec afecVar, int i, int i2) {
        this.a = gfkVar;
        this.b = gfkVar2;
        this.c = afecVar;
        this.d = i;
        this.e = i2;
    }
}
