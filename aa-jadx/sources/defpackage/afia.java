package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afia extends defpackage.afhy implements defpackage.afhx {
    public static final defpackage.afia d = new defpackage.afia(1, 0);

    public afia(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.afhy
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

    public final java.lang.Integer e() {
        return java.lang.Integer.valueOf(this.b);
    }

    @Override // defpackage.afhy
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afia) {
            if (b() && ((defpackage.afia) obj).b()) {
                return true;
            }
            defpackage.afia afiaVar = (defpackage.afia) obj;
            return this.a == afiaVar.a && this.b == afiaVar.b;
        }
        return false;
    }

    public final java.lang.Integer f() {
        return java.lang.Integer.valueOf(this.a);
    }

    @Override // defpackage.afhy
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.afhy
    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
