package defpackage;

/* loaded from: classes3.dex */
public final class afgv extends afgu implements afgx {
    static {
        new afgv((char) 1, (char) 0);
    }

    @Override // defpackage.afgu
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.afgx
    public final /* bridge */ /* synthetic */ Comparable c() {
        throw null;
    }

    @Override // defpackage.afgx
    public final /* bridge */ /* synthetic */ Comparable d() {
        throw null;
    }

    public final boolean e(char c) {
        return this.a <= c && c <= this.b;
    }

    @Override // defpackage.afgu
    public final boolean equals(Object obj) {
        if (obj instanceof afgv) {
            if (b() && ((afgv) obj).b()) {
                return true;
            }
            afgv afgvVar = (afgv) obj;
            return this.a == afgvVar.a && this.b == afgvVar.b;
        }
        return false;
    }

    @Override // defpackage.afgu
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.afgu
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
