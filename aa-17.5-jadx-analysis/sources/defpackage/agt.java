package defpackage;

/* loaded from: classes.dex */
public final class agt implements agr {
    private final aej a;
    private aei b;
    private aei c;
    private aei d;

    public agt(aex aexVar) {
        this(new ags(aexVar));
    }

    @Override // defpackage.agn
    public final long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        int iB = aeiVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.a(i).e(aeiVar.a(i), aeiVar2.a(i), aeiVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.agn
    public final aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aei aeiVar4;
        aei aeiVarC = this.d;
        if (aeiVarC == null) {
            aeiVarC = aeiVar3.c();
            this.d = aeiVarC;
        }
        if (aeiVarC == null) {
            affa.d("endVelocityVector");
            aeiVarC = null;
        }
        int iB = aeiVarC.b();
        int i = 0;
        while (true) {
            aeiVar4 = this.d;
            if (i >= iB) {
                break;
            }
            if (aeiVar4 == null) {
                affa.d("endVelocityVector");
                aeiVar4 = null;
            }
            aeiVar4.e(i, this.a.a(i).b(aeiVar.a(i), aeiVar2.a(i), aeiVar3.a(i)));
            i++;
        }
        if (aeiVar4 != null) {
            return aeiVar4;
        }
        affa.d("endVelocityVector");
        return null;
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aei aeiVar4;
        aei aeiVarC = this.b;
        if (aeiVarC == null) {
            aeiVarC = aeiVar.c();
            this.b = aeiVarC;
        }
        if (aeiVarC == null) {
            affa.d("valueVector");
            aeiVarC = null;
        }
        int iB = aeiVarC.b();
        int i = 0;
        while (true) {
            aeiVar4 = this.b;
            if (i >= iB) {
                break;
            }
            if (aeiVar4 == null) {
                affa.d("valueVector");
                aeiVar4 = null;
            }
            aeiVar4.e(i, this.a.a(i).c(j, aeiVar.a(i), aeiVar2.a(i), aeiVar3.a(i)));
            i++;
        }
        if (aeiVar4 != null) {
            return aeiVar4;
        }
        affa.d("valueVector");
        return null;
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        aei aeiVar4;
        aei aeiVarC = this.c;
        if (aeiVarC == null) {
            aeiVarC = aeiVar3.c();
            this.c = aeiVarC;
        }
        if (aeiVarC == null) {
            affa.d("velocityVector");
            aeiVarC = null;
        }
        int iB = aeiVarC.b();
        int i = 0;
        while (true) {
            aeiVar4 = this.c;
            if (i >= iB) {
                break;
            }
            if (aeiVar4 == null) {
                affa.d("velocityVector");
                aeiVar4 = null;
            }
            aeiVar4.e(i, this.a.a(i).d(j, aeiVar.a(i), aeiVar2.a(i), aeiVar3.a(i)));
            i++;
        }
        if (aeiVar4 != null) {
            return aeiVar4;
        }
        affa.d("velocityVector");
        return null;
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }

    public agt(aej aejVar) {
        this.a = aejVar;
    }
}
