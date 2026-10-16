package defpackage;

/* loaded from: classes.dex */
public final class agy implements agr {
    private final int a;
    private final agq b;
    private final long c;
    private final int d;

    public agy(int i, agq agqVar, int i2) {
        this.a = i;
        this.b = agqVar;
        this.d = i2;
        if (i <= 0) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.c = ((agx) agqVar).a * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.c;
        long jMin = Math.min(j / j2, this.a - 1);
        if (this.d != 1 && jMin % 2 != 0) {
            return ((jMin + 1) * j2) - j;
        }
        Long.signum(jMin);
        return j - (jMin * j2);
    }

    private final aei g(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        long j2 = this.c;
        return j > j2 ? d(j2, aeiVar, aeiVar2, aeiVar3) : aeiVar2;
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a * this.c;
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return d(a(aeiVar, aeiVar2, aeiVar3), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.b.c(f(j), aeiVar, aeiVar2, g(j, aeiVar, aeiVar3, aeiVar2));
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.b.d(f(j), aeiVar, aeiVar2, g(j, aeiVar, aeiVar3, aeiVar2));
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }
}
