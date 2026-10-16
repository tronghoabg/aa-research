package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igv {
    public static final defpackage.igv a = new defpackage.igv(defpackage.igu.a, 0);
    public static final defpackage.igv b = new defpackage.igv(defpackage.igu.f, 1);
    public final defpackage.igu c;
    public final int d;

    public igv(defpackage.igu iguVar, int i) {
        this.c = iguVar;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.igv igvVar = (defpackage.igv) obj;
        return this.c == igvVar.c && this.d == igvVar.d;
    }
}
