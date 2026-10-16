package defpackage;

/* loaded from: classes.dex */
public final class agu {
    public final aey a;
    public aei b;
    public aei c;
    public final float d;
    private aei e;

    public agu(aey aeyVar) {
        this.a = aeyVar;
        this.d = aeyVar.a();
    }

    public final aei a(aei aeiVar, aei aeiVar2) {
        aei aeiVar3;
        aei aeiVarC = this.e;
        if (aeiVarC == null) {
            aeiVarC = aeiVar.c();
            this.e = aeiVarC;
        }
        if (aeiVarC == null) {
            affa.d("targetVector");
            aeiVarC = null;
        }
        int iB = aeiVarC.b();
        int i = 0;
        while (true) {
            aeiVar3 = this.e;
            if (i >= iB) {
                break;
            }
            if (aeiVar3 == null) {
                affa.d("targetVector");
                aeiVar3 = null;
            }
            aeiVar3.e(i, this.a.b(aeiVar.a(i), aeiVar2.a(i)));
            i++;
        }
        if (aeiVar3 != null) {
            return aeiVar3;
        }
        affa.d("targetVector");
        return null;
    }

    public final aei b(long j, aei aeiVar, aei aeiVar2) {
        aei aeiVar3;
        aei aeiVarC = this.c;
        if (aeiVarC == null) {
            aeiVarC = aeiVar.c();
            this.c = aeiVarC;
        }
        if (aeiVarC == null) {
            affa.d("velocityVector");
            aeiVarC = null;
        }
        int iB = aeiVarC.b();
        int i = 0;
        while (true) {
            aeiVar3 = this.c;
            if (i >= iB) {
                break;
            }
            if (aeiVar3 == null) {
                affa.d("velocityVector");
                aeiVar3 = null;
            }
            aey aeyVar = this.a;
            aeiVar.a(i);
            aeiVar3.e(i, aeyVar.e(j, aeiVar2.a(i)));
            i++;
        }
        if (aeiVar3 != null) {
            return aeiVar3;
        }
        affa.d("velocityVector");
        return null;
    }
}
