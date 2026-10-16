package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlc implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nlc(aitx aitxVar, kjk kjkVar, npe npeVar, int i, bym bymVar, int i2) {
        this.f = i2;
        this.b = aitxVar;
        this.c = kjkVar;
        this.d = npeVar;
        this.a = i;
        this.e = bymVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aitx, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        if (this.f == 0) {
            ahnc.d(this.b, null, 0, new nld((kjk) this.c, (npe) this.d, this.a, (bym) this.e, (afck) null, 0), 3);
            return afak.a;
        }
        int i = hej.a;
        Object obj = this.d;
        if (obj != null) {
            ?? r0 = ((gms) obj).a;
            int size = r0.size();
            int i2 = 0;
            while (i2 < size) {
                ((ajab) r0.get(i2)).d(Boolean.valueOf(i2 == this.a));
                i2++;
            }
        }
        han hanVar = (han) this.c;
        afdr afdrVar = hanVar.f;
        if (afdrVar != null) {
            afdrVar.invoke();
        }
        affv affvVar = (affv) this.b;
        Object obj2 = affvVar.a;
        if (obj2 != null) {
            Object obj3 = this.e;
            ajab ajabVar = (ajab) obj2;
            ajabVar.d(Boolean.valueOf(true ^ ((Boolean) ajabVar.b()).booleanValue()));
            gbw gbwVar = hanVar.i;
            glp glpVarT = ((geu) obj3).t();
            if (gbwVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            glpVarT.g(gbwVar.a, ((Boolean) ((ajab) affvVar.a).b()).booleanValue());
        }
        return afak.a;
    }

    public /* synthetic */ nlc(gms gmsVar, int i, han hanVar, affv affvVar, geu geuVar, int i2) {
        this.f = i2;
        this.d = gmsVar;
        this.a = i;
        this.c = hanVar;
        this.b = affvVar;
        this.e = geuVar;
    }
}
