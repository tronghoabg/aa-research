package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njo implements defpackage.affc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ njo(boolean z, java.lang.Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        if (this.c != 0) {
            defpackage.cla claVar = (defpackage.cla) obj;
            defpackage.aga agaVar = defpackage.acs.a;
            claVar.s(!this.a && ((java.lang.Boolean) this.b.invoke()).booleanValue());
            return defpackage.afbk.a;
        }
        defpackage.cim cimVar = (defpackage.cim) obj;
        cimVar.getClass();
        cimVar.a(this.a && ((java.lang.Boolean) this.b.a()).booleanValue());
        return defpackage.afbk.a;
    }
}
