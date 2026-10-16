package defpackage;

/* loaded from: classes3.dex */
public final class zot {
    public final byte[] a;

    public zot(byte[] bArr) {
        this.a = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length;
        sb.append(length);
        sb.append(" :: [ ");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        zos zosVar = new zos(this);
        while (length > 0) {
            sb2.append(Integer.toHexString(zosVar.b()));
            sb2.append(", ");
            length--;
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(" ]");
        return sb2.toString();
    }
}
