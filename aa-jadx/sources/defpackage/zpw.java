package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpw {
    public final byte[] a;

    public zpw(byte[] bArr) {
        this.a = bArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = this.a.length;
        sb.append(length);
        sb.append(" :: [ ");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        defpackage.zpv zpvVar = new defpackage.zpv(this);
        while (length > 0) {
            sb2.append(java.lang.Integer.toHexString(zpvVar.b()));
            sb2.append(", ");
            length--;
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(" ]");
        return sb2.toString();
    }
}
