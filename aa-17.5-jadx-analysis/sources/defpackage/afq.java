package defpackage;

/* loaded from: classes.dex */
public final class afq implements aew {
    private final int a;
    private final aer b;
    private final long c = 0;
    private final int d;

    public afq(int i, aer aerVar, int i2) {
        this.a = i;
        this.b = aerVar;
        this.d = i2;
    }

    @Override // defpackage.aec
    public final agr c(bii biiVar) {
        return new agy(this.a, ((afk) this.b).c(biiVar), this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afq)) {
            return false;
        }
        afq afqVar = (afq) obj;
        if (afqVar.a != this.a || !affa.f(afqVar.b, this.b) || afqVar.d != this.d) {
            return false;
        }
        long j = afqVar.c;
        return true;
    }

    public final int hashCode() {
        return ((((this.a * 31) + this.b.hashCode()) * 31) + this.d) * 31;
    }
}
