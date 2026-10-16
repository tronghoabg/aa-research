package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agi {
    final /* synthetic */ defpackage.agn a;
    private final defpackage.bwx b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
    private final defpackage.bil c;

    public agi(defpackage.agn agnVar, defpackage.bil bilVar) {
        this.a = agnVar;
        this.c = bilVar;
    }

    public final defpackage.agh a() {
        return (defpackage.agh) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [affc, java.lang.Object] */
    public final defpackage.bys b(defpackage.affc affcVar, java.lang.Object obj, defpackage.aep aepVar, defpackage.affc affcVar2) {
        defpackage.agh aghVarA = a();
        if (aghVarA == null) {
            defpackage.agn agnVar = this.a;
            java.lang.Object objInvoke = affcVar2.invoke(agnVar.e());
            defpackage.bil bilVar = this.c;
            defpackage.aep aepVar2 = (defpackage.aep) bilVar.b.invoke(affcVar2.invoke(agnVar.e()));
            aepVar2.d();
            defpackage.agh aghVar = new defpackage.agh(this, new defpackage.agl(agnVar, objInvoke, aepVar2, bilVar), affcVar, affcVar2);
            this.b.b(aghVar);
            agnVar.x(aghVar.a);
            aghVarA = aghVar;
        }
        defpackage.agn agnVar2 = this.a;
        aghVarA.c = affcVar2;
        aghVarA.b = affcVar;
        aghVarA.b(agnVar2.d(), obj, aepVar);
        return aghVarA;
    }
}
