package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddn {
    public final java.lang.String a;
    public final defpackage.afan b;

    public ddn(java.lang.String str, defpackage.afan afanVar) {
        this.a = str;
        this.b = afanVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddn)) {
            return false;
        }
        defpackage.ddn ddnVar = (defpackage.ddn) obj;
        return defpackage.afga.f(this.a, ddnVar.a) && defpackage.afga.f(this.b, ddnVar.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
