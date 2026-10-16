package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agoj extends defpackage.agog {
    private final short value;

    public agoj(short s) {
        super(null);
        this.value = s;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agoj) && this.value == ((defpackage.agoj) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Short getValue() {
        return java.lang.Short.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
