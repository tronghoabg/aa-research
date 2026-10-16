package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sit {
    public final int a;

    public sit(byte[] bArr) {
        this.a = 4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.sit) && this.a == ((defpackage.sit) obj).a;
    }

    public final int hashCode() {
        return this.a ^ (-615537384);
    }

    public final java.lang.String toString() {
        return defpackage.a.bp(java.lang.Integer.toString(this.a - 1), "ComplianceProductData{productId=79508299, productIdOrigin=", "}");
    }

    public sit() {
        throw null;
    }
}
