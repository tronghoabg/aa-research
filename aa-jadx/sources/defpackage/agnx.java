package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agnx extends defpackage.agog {
    private final boolean value;

    public agnx(boolean z) {
        super(null);
        this.value = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agnx) && this.value == ((defpackage.agnx) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return defpackage.agnw.m(this.value);
    }
}
