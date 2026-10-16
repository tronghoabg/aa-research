package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ehy {
    public defpackage.ehw a;
    public boolean b;
    private final defpackage.ehh c;
    private final java.util.concurrent.Callable d;
    private final java.util.List e = new java.util.ArrayList();
    private aiut f;

    public ehy(defpackage.ehh ehhVar, java.util.concurrent.Callable callable) {
        this.c = ehhVar;
        this.d = callable;
        aiut aiutVar = aivl.a;
        this.f = ajek.a;
    }

    public final void a(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.f = aiaz.b(executor);
    }

    public final defpackage.ndd b() {
        defpackage.efh efhVarA;
        if (this.b) {
            defpackage.ehx ehxVar = new defpackage.ehx(this.d, 0);
            defpackage.ehh ehhVar = this.c;
            ehv ehvVar = this.a;
            java.util.List list = this.e;
            aiuw aiuwVarB = ahoi.b(this.f.plus(new aixg((aiwg) null)));
            defpackage.efg efgVar = new defpackage.efg(new defpackage.egp(ehhVar, new defpackage.deh(aiuwVarB, 17), ehxVar), defpackage.dtn.f(aiuwVarB));
            if (ehvVar == null) {
                ehvVar = new ehv();
            }
            efgVar.b = ehvVar;
            efgVar.b(list);
            efhVarA = efgVar.a();
        } else {
            defpackage.efg efgVar2 = new defpackage.efg(new defpackage.egp(this.c, new defpackage.ehx(this.d, 2)), ahoi.b(this.f.plus(new aixg((aiwg) null))).a);
            defpackage.ehw ehwVar = this.a;
            if (ehwVar != null) {
                efgVar2.b = ehwVar;
            }
            efgVar2.b(this.e);
            efhVarA = efgVar2.a();
        }
        return new defpackage.ndd((defpackage.egk) efhVarA, (defpackage.afdo) this.f);
    }
}
