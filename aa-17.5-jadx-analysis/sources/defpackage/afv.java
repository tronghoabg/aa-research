package defpackage;

/* loaded from: classes.dex */
final class afv implements agn {
    private final agn a;
    private final long b;

    public afv(agn agnVar, long j) {
        this.a = agnVar;
        this.b = j;
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.a(aeiVar, aeiVar2, aeiVar3) + this.b;
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return d(a(aeiVar, aeiVar2, aeiVar3), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        long j2 = this.b;
        return j < j2 ? aeiVar : this.a.c(j - j2, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        long j2 = this.b;
        return j < j2 ? aeiVar3 : this.a.d(j - j2, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afv)) {
            return false;
        }
        afv afvVar = (afv) obj;
        return afvVar.b == this.b && affa.f(afvVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
