package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjn {
    public java.lang.String a;
    public boolean b = false;
    public defpackage.biy c = null;
    private final java.lang.String d;

    public bjn(java.lang.String str, java.lang.String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bjn)) {
            return false;
        }
        defpackage.bjn bjnVar = (defpackage.bjn) obj;
        return defpackage.afga.f(this.d, bjnVar.d) && defpackage.afga.f(this.a, bjnVar.a) && this.b == bjnVar.b && defpackage.afga.f(this.c, bjnVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = true != this.b ? 1237 : 1231;
        defpackage.biy biyVar = this.c;
        return (((iHashCode * 31) + i) * 31) + (biyVar == null ? 0 : biyVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ")";
    }
}
