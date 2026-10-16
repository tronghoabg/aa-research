package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eia implements defpackage.afhl {
    public final java.lang.String a;
    private final defpackage.affc b;
    private final aiuw c;
    private final java.lang.Object d = new java.lang.Object();
    private volatile defpackage.efh e;

    public eia(java.lang.String str, defpackage.affc affcVar, aiuw aiuwVar) {
        this.a = str;
        this.b = affcVar;
        this.c = aiuwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afhl
    public final /* synthetic */ java.lang.Object getValue(java.lang.Object obj, defpackage.afja afjaVar) {
        defpackage.efh efhVar;
        android.content.Context context = (android.content.Context) obj;
        afjaVar.getClass();
        defpackage.efh efhVar2 = this.e;
        if (efhVar2 != null) {
            return efhVar2;
        }
        synchronized (this.d) {
            if (this.e == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                defpackage.affc affcVar = this.b;
                applicationContext.getClass();
                ?? Invoke = affcVar.invoke(applicationContext);
                ajcw ajcwVar = this.c;
                defpackage.egp egpVar = new defpackage.egp(eij.a, new defpackage.eig(new defpackage.bxn(applicationContext, this, 6), 0));
                defpackage.afdo afdoVarPlus = ajcwVar.a;
                if (afdoVarPlus.get(aiwg.d) == null) {
                    afdoVarPlus = afdoVarPlus.plus(new aiwi((aiwg) null));
                }
                defpackage.efg efgVar = new defpackage.efg(egpVar, afdoVarPlus);
                efgVar.b(Invoke);
                this.e = new eif(new eif(efgVar.a()));
            }
            efhVar = this.e;
            efhVar.getClass();
        }
        return efhVar;
    }
}
