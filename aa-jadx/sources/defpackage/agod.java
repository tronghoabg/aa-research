package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agod extends defpackage.agog {
    private final float value;

    public agod(float f) {
        super(null);
        this.value = f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agod) && java.lang.Float.compare(this.value, ((defpackage.agod) obj).value) == 0;
    }

    @Override // defpackage.agog
    public java.lang.Float getValue() {
        return java.lang.Float.valueOf(this.value);
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.value);
    }
}
