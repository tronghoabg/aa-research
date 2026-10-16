package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class aka extends defpackage.affy implements defpackage.affg {
    public aka(java.lang.Object obj) {
        super(2, obj, defpackage.akb.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean zB;
        defpackage.cja cjaVar = (defpackage.cja) obj;
        defpackage.cja cjaVar2 = (defpackage.cja) obj2;
        defpackage.akb akbVar = (defpackage.akb) this.receiver;
        if (akbVar.A && (zB = cjaVar2.b()) != cjaVar.b()) {
            defpackage.affc affcVar = akbVar.b;
            if (affcVar != null) {
                affcVar.invoke(java.lang.Boolean.valueOf(zB));
            }
            if (zB) {
                ahoc.d(akbVar.N(), (defpackage.afdo) null, 4, new defpackage.adh(akbVar, (defpackage.afdk) null, 5), 1);
                defpackage.azu azuVarD = akbVar.d();
                if (azuVarD != null) {
                    azuVarD.d();
                } else {
                    azuVarD = null;
                }
                akbVar.d = azuVarD;
            } else {
                defpackage.azu azuVar = akbVar.d;
                if (azuVar != null) {
                    azuVar.a();
                }
                akbVar.d = null;
            }
            defpackage.cjv.r(akbVar).J();
            defpackage.ask askVar = akbVar.a;
            if (askVar != null) {
                if (zB) {
                    defpackage.asd asdVar = akbVar.c;
                    if (asdVar != null) {
                        akbVar.a(askVar, new defpackage.ase(asdVar));
                        akbVar.c = null;
                    }
                    defpackage.asd asdVar2 = new defpackage.asd();
                    akbVar.a(askVar, asdVar2);
                    akbVar.c = asdVar2;
                } else {
                    defpackage.asd asdVar3 = akbVar.c;
                    if (asdVar3 != null) {
                        akbVar.a(askVar, new defpackage.ase(asdVar3));
                        akbVar.c = null;
                    }
                }
            }
        }
        return defpackage.afbk.a;
    }
}
