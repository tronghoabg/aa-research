package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tlk {
    public final int a;
    public final int b;

    public tlk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tlk)) {
            return false;
        }
        defpackage.tlk tlkVar = (defpackage.tlk) obj;
        return this.a == tlkVar.a && this.b == tlkVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "ThemeColors(darkThemeColor=" + this.a + ", lightThemeColor=" + this.b + ")";
    }
}
