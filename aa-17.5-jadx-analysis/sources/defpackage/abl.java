package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class abl implements afec {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abl(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        long jA;
        int iOrdinal;
        afec afecVar;
        afec afecVar2;
        int i = this.c;
        if (i == 0) {
            abm abmVar = (abm) this.b;
            if (affa.f(obj, abmVar.c.f())) {
                jA = abmVar.a(this.a);
            } else {
                bym bymVar = (bym) abmVar.c.f.a(obj);
                if (bymVar != null) {
                    jA = ((dlq) bymVar.a()).a;
                }
            }
            return new dlq(jA);
        }
        if (i == 1) {
            agc agcVar = (agc) obj;
            Object objF = agcVar.f();
            abm abmVar2 = (abm) this.b;
            if (affa.f(objF, abmVar2.c.f())) {
                jA = abmVar2.a(this.a);
            } else {
                bym bymVar2 = (bym) abmVar2.c.f.a(agcVar.f());
                jA = bymVar2 != null ? ((dlq) bymVar2.a()).a : 0L;
            }
            bym bymVar3 = (bym) abmVar2.c.f.a(agcVar.g());
            jA = bymVar3 != null ? ((dlq) bymVar3.a()).a : 0L;
            adi adiVar = (adi) abmVar2.b.a();
            if (adiVar != null) {
                aew aewVar = (aew) adiVar.b.invoke(new dlq(jA), new dlq(jA));
                if (aewVar != null) {
                    return aewVar;
                }
            }
            return new aft(1.0f, 400.0f, null);
        }
        if (i == 2) {
            int iOrdinal2 = ((acc) obj).ordinal();
            Object obj2 = this.b;
            long j = this.a;
            if (iOrdinal2 == 0) {
                abw abwVar = ((aco) obj2).e.b.c;
                if (abwVar != null) {
                    j = ((dlq) abwVar.b.invoke(new dlq(j))).a;
                }
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new aezs();
                }
                abw abwVar2 = ((aco) obj2).f.b.c;
                if (abwVar2 != null) {
                    j = ((dlq) abwVar2.b.invoke(new dlq(j))).a;
                }
            }
            return new dlq(j);
        }
        if (i != 3) {
            if (i != 4) {
                long jC = dlo.c(((dlo) ((adu) obj).d()).a, this.a);
                aza azaVar = (aza) this.b;
                azaVar.g(jC);
                azaVar.b.invoke();
                return afak.a;
            }
            acc accVar = (acc) obj;
            aco acoVar = (aco) this.b;
            adj adjVar = acoVar.e.b.b;
            long j2 = this.a;
            long j3 = (adjVar == null || (afecVar2 = adjVar.a) == null) ? 0L : ((dlo) afecVar2.invoke(new dlq(j2))).a;
            adj adjVar2 = acoVar.f.b.b;
            long j4 = (adjVar2 == null || (afecVar = adjVar2.a) == null) ? 0L : ((dlo) afecVar.invoke(new dlq(j2))).a;
            int iOrdinal3 = accVar.ordinal();
            if (iOrdinal3 == 0) {
                jA = j3;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    throw new aezs();
                }
                jA = j4;
            }
            return new dlo(jA);
        }
        acc accVar2 = (acc) obj;
        aco acoVar2 = (aco) this.b;
        if (acoVar2.j != null && acoVar2.a() != null && !affa.f(acoVar2.j, acoVar2.a()) && (iOrdinal = accVar2.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new aezs();
            }
            abw abwVar3 = acoVar2.f.b.c;
            if (abwVar3 != null) {
                long j5 = this.a;
                long j6 = ((dlq) abwVar3.b.invoke(new dlq(j5))).a;
                cfn cfnVarA = acoVar2.a();
                cfnVarA.getClass();
                dlr dlrVar = dlr.a;
                long jA2 = cfnVarA.a(j5, j6, dlrVar);
                cfn cfnVar = acoVar2.j;
                cfnVar.getClass();
                jA = dlo.c(jA2, cfnVar.a(j5, j6, dlrVar));
            }
        }
        return new dlo(jA);
    }
}
