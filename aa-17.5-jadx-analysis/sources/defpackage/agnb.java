package defpackage;

/* loaded from: classes3.dex */
public final class agnb extends agng {
    private final double value;

    public agnb(double d) {
        super(null);
        this.value = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnb) && Double.compare(this.value, ((agnb) obj).value) == 0;
    }

    @Override // defpackage.agng
    public Double getValue() {
        return Double.valueOf(this.value);
    }

    public int hashCode() {
        return agna.m(this.value);
    }
}
