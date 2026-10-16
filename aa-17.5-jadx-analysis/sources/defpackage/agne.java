package defpackage;

/* loaded from: classes3.dex */
public final class agne extends agng {
    private final int value;

    public agne(int i) {
        super(null);
        this.value = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agne) && this.value == ((agne) obj).value;
    }

    @Override // defpackage.agng
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
