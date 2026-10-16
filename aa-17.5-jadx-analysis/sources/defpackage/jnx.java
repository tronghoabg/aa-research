package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jnx implements zfj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jnx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.zfj
    public final zgp a() {
        int i = this.c;
        if (i == 0) {
            return ((jny) this.a).a(this.b);
        }
        if (i != 1) {
            vvy vvyVar = (vvy) this.a;
            return vvyVar.b(((vvv) vvyVar.d.a()).c(this.b));
        }
        aitu aituVar = dof.a;
        ?? r0 = this.a;
        ncp ncpVar = (ncp) this.b;
        return dof.a(ncpVar.b, new ehs(ncpVar, (dzh) r0, (afck) null, 0));
    }

    public /* synthetic */ jnx(ncp ncpVar, dzh dzhVar, int i) {
        this.c = i;
        this.b = ncpVar;
        this.a = dzhVar;
    }
}
