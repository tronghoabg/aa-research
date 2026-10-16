package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afhu implements java.lang.Iterable, defpackage.afhc {
    public final char a;
    public final char b;
    private final int c = 1;

    public afhu(char c, char c2) {
        this.a = c;
        this.b = (char) defpackage.afga.o(c, c2, 1);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.afcc iterator() {
        return new defpackage.afcc(this.a, this.b);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afhu) {
            if (b() && ((defpackage.afhu) obj).b()) {
                return true;
            }
            defpackage.afhu afhuVar = (defpackage.afhu) obj;
            if (this.a != afhuVar.a || this.b != afhuVar.b) {
                return false;
            }
            int i = afhuVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public java.lang.String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
