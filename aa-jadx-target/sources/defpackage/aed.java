package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aed implements defpackage.bys {
    public defpackage.affc a;
    public final aiuw b;
    public defpackage.aeb c;
    public defpackage.aej d;
    public aiwg e;
    private final defpackage.bwx f = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);

    public aed(java.lang.Object obj, defpackage.bil bilVar, defpackage.aej aejVar, java.lang.Object obj2, java.lang.String str, defpackage.affc affcVar, aiuw aiuwVar) {
        this.a = affcVar;
        this.b = aiuwVar;
        this.c = new defpackage.aeb(obj, bilVar, obj2, str);
        this.d = b(aejVar, obj2);
    }

    public static final defpackage.aej b(defpackage.aej aejVar, java.lang.Object obj) {
        if (obj != null && (aejVar instanceof defpackage.aga)) {
            defpackage.aga agaVar = (defpackage.aga) aejVar;
            if (!defpackage.afga.f(agaVar.c, obj)) {
                return new defpackage.aga(agaVar.a, agaVar.b, obj);
            }
        }
        return aejVar;
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        java.lang.Object objA;
        defpackage.bys bysVar = (defpackage.bys) this.f.a();
        return (bysVar == null || (objA = bysVar.a()) == null) ? this.c.d() : objA;
    }
}
