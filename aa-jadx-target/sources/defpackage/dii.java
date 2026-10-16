package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dii implements defpackage.dig {
    private final java.lang.String a = "wght";
    private final int b;

    public dii(int i) {
        this.b = i;
    }

    @Override // defpackage.dig
    public final java.lang.String a() {
        return this.a;
    }

    @Override // defpackage.dig
    public final float b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dii)) {
            return false;
        }
        defpackage.dii diiVar = (defpackage.dii) obj;
        return defpackage.afga.f(this.a, diiVar.a) && this.b == diiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ")";
    }

    @Override // defpackage.dig
    public final void c() {
    }
}
