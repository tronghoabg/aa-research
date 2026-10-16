package defpackage;

/* loaded from: classes.dex */
public final class agv implements agn {
    private final agq a;
    private final long b;
    private final int c;

    public agv(agq agqVar, int i) {
        this.a = agqVar;
        this.c = i;
        this.b = (agqVar.f() + agqVar.g()) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.b;
        long j3 = j / j2;
        if (this.c != 1 && j3 % 2 != 0) {
            return ((j3 + 1) * j2) - j;
        }
        Long.signum(j3);
        return j - (j3 * j2);
    }

    private final aei g(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        long j2 = this.b;
        return j > j2 ? this.a.d(j2, aeiVar, aeiVar3, aeiVar2) : aeiVar2;
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return d(Long.MAX_VALUE, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.c(f(j), aeiVar, aeiVar2, g(j, aeiVar, aeiVar3, aeiVar2));
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.d(f(j), aeiVar, aeiVar2, g(j, aeiVar, aeiVar3, aeiVar2));
    }

    @Override // defpackage.agn
    public final boolean e() {
        return true;
    }
}
