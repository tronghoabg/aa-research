package defpackage;

/* loaded from: classes.dex */
public final class aha implements agr {
    private final /* synthetic */ agt a;

    public aha(float f, float f2, aei aeiVar) {
        int[] iArr = agp.a;
        this.a = new agt((aeiVar == null && f == 1.0f && f2 == 1500.0f) ? aep.a : aeiVar != null ? new ago(aeiVar, f, f2, 1) : new ago(f, f2, 0));
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.a(aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.b(aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.c(j, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.d(j, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final boolean e() {
        return false;
    }
}
