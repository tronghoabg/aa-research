package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfa {
    public final java.lang.Object a;
    public final int b;
    public final int c;
    public final java.lang.String d;

    public dfa(java.lang.Object obj, int i, int i2, java.lang.String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        defpackage.dki.c("Reversed range is not supported");
    }

    public static /* synthetic */ defpackage.dfa a(defpackage.dfa dfaVar, java.lang.Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = dfaVar.a;
        }
        int i3 = (i2 & 2) != 0 ? dfaVar.b : 0;
        if ((i2 & 4) != 0) {
            i = dfaVar.c;
        }
        return new defpackage.dfa(obj, i3, i, dfaVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfa)) {
            return false;
        }
        defpackage.dfa dfaVar = (defpackage.dfa) obj;
        return defpackage.afga.f(this.a, dfaVar.a) && this.b == dfaVar.b && this.c == dfaVar.c && defpackage.afga.f(this.d, dfaVar.d);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
