package defpackage;

/* loaded from: classes2.dex */
public final class shz {
    public final int a;

    public shz(byte[] bArr) {
        this.a = 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof shz) && this.a == ((shz) obj).a;
    }

    public final int hashCode() {
        return this.a ^ (-615537384);
    }

    public final String toString() {
        return a.bq(Integer.toString(this.a - 1), "ComplianceProductData{productId=79508299, productIdOrigin=", "}");
    }

    public shz() {
        throw null;
    }
}
