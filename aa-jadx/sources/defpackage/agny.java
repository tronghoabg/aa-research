package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agny extends defpackage.agog {
    private final byte value;

    public agny(byte b) {
        super(null);
        this.value = b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agny) && this.value == ((defpackage.agny) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Byte getValue() {
        return java.lang.Byte.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
