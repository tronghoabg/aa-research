package defpackage;

/* loaded from: classes2.dex */
public final class gsx extends gwc {
    public final geu a;
    private final gsv b;
    private final aizz c;
    private final aiyk d;
    private final aiyk e;
    private final aiyk f;

    /* JADX WARN: Multi-variable type inference failed */
    public gsx(geu geuVar) {
        Object jycVar;
        char c;
        this.a = geuVar;
        gsv gsvVar = new gsv(geuVar);
        this.b = gsvVar;
        ajab ajabVar = d().e;
        this.c = ajabVar;
        ajab ajabVar2 = ((hgq) geuVar.F(hgq.class)).a;
        this.e = ajabVar2;
        aiyk aiykVarM = dtx.m(((gtt) geuVar.F(gtt.class)).a());
        this.f = aiykVarM;
        jxz jxzVar = new jxz(this.n, 6);
        if (((ggk) geuVar.F(ggk.class)).i()) {
            jycVar = new jyc(this.o, gsvVar.e, new gra(gsvVar, (afck) null, 3), 5);
            c = 0;
        } else {
            jycVar = gsvVar.f;
            jyc jycVar2 = new jyc(this.o, gsvVar.e, new grz(gsvVar, 2, (char[]) null), 5);
            aitx aitxVarB = ahni.b(aium.a);
            gfw gfwVar = new gfw(jycVar2, (afck) null, 6, (char[]) null);
            c = 0;
            ahnc.d(aitxVarB, null, 0, gfwVar, 3);
        }
        ajab ajabVar3 = ((gie) geuVar.F(gie.class)).a;
        ajab ajabVar4 = this.o;
        aiyk[] aiykVarArr = new aiyk[7];
        aiykVarArr[c] = jxzVar;
        aiykVarArr[1] = ajabVar;
        aiykVarArr[2] = jycVar;
        aiykVarArr[3] = ajabVar3;
        aiykVarArr[4] = ajabVar4;
        aiykVarArr[5] = ajabVar2;
        aiykVarArr[6] = aiykVarM;
        this.d = new fuu(aiykVarArr, this, 15);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.d;
    }

    public final gts d() {
        return (gts) this.a.F(gts.class);
    }
}
