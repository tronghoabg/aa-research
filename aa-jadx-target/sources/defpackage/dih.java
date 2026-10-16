package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dih implements defpackage.dig {
    private final java.lang.String a;
    private final float b;

    public dih(java.lang.String str, float f) {
        this.a = str;
        this.b = f;
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
        if (obj instanceof defpackage.dih) {
            defpackage.dih dihVar = (defpackage.dih) obj;
            if (defpackage.afga.f(this.a, dihVar.a) && this.b == dihVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ")";
    }

    @Override // defpackage.dig
    public final void c() {
    }
}
