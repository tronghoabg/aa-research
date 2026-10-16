package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfl {
    public final defpackage.dfm a;
    public final int b;
    public final int c;

    public dfl(defpackage.dfm dfmVar, int i, int i2) {
        this.a = dfmVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfl)) {
            return false;
        }
        defpackage.dfl dflVar = (defpackage.dfl) obj;
        return defpackage.afga.f(this.a, dflVar.a) && this.b == dflVar.b && this.c == dflVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
