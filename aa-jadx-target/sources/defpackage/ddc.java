package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddc {
    private final android.content.res.Resources.Theme a;
    private final int b;

    public ddc(android.content.res.Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddc)) {
            return false;
        }
        defpackage.ddc ddcVar = (defpackage.ddc) obj;
        return defpackage.afga.f(this.a, ddcVar.a) && this.b == ddcVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
