package defpackage;

/* loaded from: classes.dex */
public final class lzm {
    public final String a;
    public final int b;

    public lzm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzm)) {
            return false;
        }
        lzm lzmVar = (lzm) obj;
        return this.b == lzmVar.b && this.a.equals(lzmVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PackageInfoSpec{packageName='" + this.a + "', minVersionCode=" + this.b + "}";
    }
}
