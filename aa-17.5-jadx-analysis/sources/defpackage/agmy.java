package defpackage;

/* loaded from: classes3.dex */
public final class agmy extends agng {
    private final byte value;

    public agmy(byte b) {
        super(null);
        this.value = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agmy) && this.value == ((agmy) obj).value;
    }

    @Override // defpackage.agng
    public Byte getValue() {
        return Byte.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
