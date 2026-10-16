package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ccs {
    public int a;

    public ccs(byte[] bArr) {
        this.a = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ccs) && this.a == ((defpackage.ccs) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "DeltaCounter(count=" + this.a + ")";
    }

    public ccs() {
        this(null);
    }
}
