package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uit {
    protected final defpackage.ukp b;
    protected final int c;

    public uit(defpackage.ukp ukpVar, int i) {
        this.b = ukpVar;
        this.c = i;
    }

    public boolean equals(java.lang.Object obj) {
        defpackage.uit uitVar;
        return (obj instanceof defpackage.uit) && (uitVar = (defpackage.uit) obj) != null && this.b.equals(uitVar.b) && this.c == uitVar.c;
    }

    public int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.c;
    }
}
