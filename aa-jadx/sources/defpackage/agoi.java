package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agoi extends defpackage.agog {
    private final long value;

    public agoi(long j) {
        super(null);
        this.value = j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agoi) && this.value == ((defpackage.agoi) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Long getValue() {
        return java.lang.Long.valueOf(this.value);
    }

    public int hashCode() {
        return defpackage.agoh.m(this.value);
    }
}
