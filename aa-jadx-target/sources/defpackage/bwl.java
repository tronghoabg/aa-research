package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwl {
    private final java.lang.Object a;
    private final java.lang.Object b;

    public bwl(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(java.lang.Object obj) {
        return obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).ordinal() : obj.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bwl)) {
            return false;
        }
        defpackage.bwl bwlVar = (defpackage.bwl) obj;
        return defpackage.afga.f(this.a, bwlVar.a) && defpackage.afga.f(this.b, bwlVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final java.lang.String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
