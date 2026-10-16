package defpackage;

/* loaded from: classes3.dex */
public final class agnd extends agng {
    private final float value;

    public agnd(float f) {
        super(null);
        this.value = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnd) && Float.compare(this.value, ((agnd) obj).value) == 0;
    }

    @Override // defpackage.agng
    public Float getValue() {
        return Float.valueOf(this.value);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }
}
