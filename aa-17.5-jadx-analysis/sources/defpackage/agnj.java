package defpackage;

/* loaded from: classes3.dex */
public final class agnj extends agng {
    private final short value;

    public agnj(short s) {
        super(null);
        this.value = s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnj) && this.value == ((agnj) obj).value;
    }

    @Override // defpackage.agng
    public Short getValue() {
        return Short.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
