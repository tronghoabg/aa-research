package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afhv extends defpackage.afhu implements defpackage.afhx {
    static {
        new defpackage.afhv((char) 1, (char) 0);
    }

    @Override // defpackage.afhu
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.afhx
    public final /* bridge */ /* synthetic */ java.lang.Comparable c() {
        throw null;
    }

    @Override // defpackage.afhx
    public final /* bridge */ /* synthetic */ java.lang.Comparable d() {
        throw null;
    }

    public final boolean e(char c) {
        return this.a <= c && c <= this.b;
    }

    @Override // defpackage.afhu
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afhv) {
            if (b() && ((defpackage.afhv) obj).b()) {
                return true;
            }
            defpackage.afhv afhvVar = (defpackage.afhv) obj;
            return this.a == afhvVar.a && this.b == afhvVar.b;
        }
        return false;
    }

    @Override // defpackage.afhu
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.afhu
    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
