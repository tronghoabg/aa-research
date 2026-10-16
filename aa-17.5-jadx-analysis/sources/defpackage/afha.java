package defpackage;

/* loaded from: classes.dex */
public final class afha extends afgy implements afgx {
    public static final afha d = new afha(1, 0);

    public afha(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.afgy
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

    public final Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.afgy
    public final boolean equals(Object obj) {
        if (obj instanceof afha) {
            if (b() && ((afha) obj).b()) {
                return true;
            }
            afha afhaVar = (afha) obj;
            return this.a == afhaVar.a && this.b == afhaVar.b;
        }
        return false;
    }

    public final Integer f() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.afgy
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.afgy
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
