package defpackage;

/* loaded from: classes.dex */
public final class tdk {
    public final int a;
    public final String b;

    public tdk(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdk)) {
            return false;
        }
        tdk tdkVar = (tdk) obj;
        return this.a == tdkVar.a && affa.f(this.b, tdkVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PackageInfo(id=" + this.a + ", name=" + this.b + ")";
    }
}
