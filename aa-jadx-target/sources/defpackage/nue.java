package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class nue {
    public final defpackage.nug a;
    public final int b;
    public final boolean c;

    public nue(defpackage.nug nugVar, int i, boolean z) {
        this.a = nugVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nue)) {
            return false;
        }
        defpackage.nue nueVar = (defpackage.nue) obj;
        return this.b == nueVar.b && this.c == nueVar.c && this.a == nueVar.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Boolean.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "CellSignal{overlay=%s, level=%d, isDataConnected=%b}", this.a, java.lang.Integer.valueOf(this.b), java.lang.Boolean.valueOf(this.c));
    }
}
