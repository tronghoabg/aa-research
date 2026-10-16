package defpackage;

/* loaded from: classes2.dex */
final class aii implements agr {
    private final agr a;
    private final long b;

    public aii(agr agrVar, long j) {
        this.a = agrVar;
        this.b = j;
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.b;
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return afp.o(this, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.a.c(this.b - j, aeiVar2, aeiVar, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aei aeiVarD = this.a.d(this.b - j, aeiVar2, aeiVar, aeiVar3);
        if (aeiVarD instanceof aee) {
            return new aee(-((aee) aeiVarD).a);
        }
        if (aeiVarD instanceof aef) {
            aef aefVar = (aef) aeiVarD;
            return new aef(-aefVar.a, -aefVar.b);
        }
        if (aeiVarD instanceof aeg) {
            aeg aegVar = (aeg) aeiVarD;
            return new aeg(-aegVar.a, -aegVar.b, -aegVar.c);
        }
        if (!(aeiVarD instanceof aeh)) {
            throw new aezs();
        }
        aeh aehVar = (aeh) aeiVarD;
        return new aeh(-aehVar.a, -aehVar.b, -aehVar.c, -aehVar.d);
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }
}
