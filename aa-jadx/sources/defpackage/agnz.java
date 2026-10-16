package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agnz extends defpackage.agog {
    private final char value;

    public agnz(char c) {
        super(null);
        this.value = c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agnz) && this.value == ((defpackage.agnz) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Character getValue() {
        return java.lang.Character.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}
