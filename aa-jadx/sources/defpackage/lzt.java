package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lzt {
    public final java.lang.String a;
    public final int b;

    public lzt(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lzt)) {
            return false;
        }
        defpackage.lzt lztVar = (defpackage.lzt) obj;
        return this.b == lztVar.b && this.a.equals(lztVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "PackageInfoSpec{packageName='" + this.a + "', minVersionCode=" + this.b + "}";
    }
}
