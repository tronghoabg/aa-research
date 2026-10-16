package defpackage;

/* loaded from: classes2.dex */
public abstract class ajam extends ajal {
    protected final aiyk d;

    public ajam(aiyk aiykVar, afco afcoVar, int i, int i2) {
        super(afcoVar, i, i2);
        this.d = aiykVar;
    }

    @Override // defpackage.ajal
    public final Object b(aixv aixvVar, afck afckVar) {
        return g(new ajbf(aixvVar), afckVar);
    }

    public abstract Object g(aiyl aiylVar, afck afckVar);

    @Override // defpackage.ajal, defpackage.aiyk
    public final Object hR(aiyl aiylVar, afck afckVar) {
        if (this.b == -3) {
            afco afcoVarHH = afckVar.hH();
            afco afcoVarA = aits.a(afcoVarHH, this.a);
            if (affa.f(afcoVarA, afcoVarHH)) {
                return g(aiylVar, afckVar);
            }
            bwi bwiVar = afcl.k;
            if (affa.f(afcoVarA.get(bwiVar), afcoVarHH.get(bwiVar))) {
                afco afcoVarHH2 = afckVar.hH();
                if (!(aiylVar instanceof ajbf) && !(aiylVar instanceof ajba)) {
                    aiylVar = new ajbi(aiylVar, afcoVarHH2);
                }
                return aipe.a(afcoVarA, aiylVar, ajdb.a(afcoVarA), new epm(this, (afck) null, 6), afckVar);
            }
        }
        return ajal.h(this, aiylVar, afckVar);
    }

    @Override // defpackage.ajal
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
