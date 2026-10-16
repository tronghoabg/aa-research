package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agob extends defpackage.agog {
    private final double value;

    public agob(double d) {
        super(null);
        this.value = d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agob) && java.lang.Double.compare(this.value, ((defpackage.agob) obj).value) == 0;
    }

    @Override // defpackage.agog
    public java.lang.Double getValue() {
        return java.lang.Double.valueOf(this.value);
    }

    public int hashCode() {
        return defpackage.agoa.m(this.value);
    }
}
