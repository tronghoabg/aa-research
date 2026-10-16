package defpackage;

/* loaded from: classes.dex */
public final class ccm {
    public int a;

    public ccm(byte[] bArr) {
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccm) && this.a == ((ccm) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ")";
    }

    public ccm() {
        this(null);
    }
}
