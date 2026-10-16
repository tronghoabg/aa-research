package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class ajv extends afey implements afeg {
    public ajv(Object obj) {
        super(2, obj, ajw.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean zB;
        cis cisVar = (cis) obj;
        cis cisVar2 = (cis) obj2;
        ajw ajwVar = (ajw) this.receiver;
        if (ajwVar.A && (zB = cisVar2.b()) != cisVar.b()) {
            afec afecVar = ajwVar.b;
            if (afecVar != null) {
                afecVar.invoke(Boolean.valueOf(zB));
            }
            if (zB) {
                ahnc.d(ajwVar.N(), null, 4, new ada(ajwVar, (afck) null, 5), 1);
                azp azpVarD = ajwVar.d();
                if (azpVarD != null) {
                    azpVarD.d();
                } else {
                    azpVarD = null;
                }
                ajwVar.d = azpVarD;
            } else {
                azp azpVar = ajwVar.d;
                if (azpVar != null) {
                    azpVar.a();
                }
                ajwVar.d = null;
            }
            bzi.q(ajwVar).J();
            asf asfVar = ajwVar.a;
            if (asfVar != null) {
                if (zB) {
                    ary aryVar = ajwVar.c;
                    if (aryVar != null) {
                        ajwVar.a(asfVar, new arz(aryVar));
                        ajwVar.c = null;
                    }
                    ary aryVar2 = new ary();
                    ajwVar.a(asfVar, aryVar2);
                    ajwVar.c = aryVar2;
                } else {
                    ary aryVar3 = ajwVar.c;
                    if (aryVar3 != null) {
                        ajwVar.a(asfVar, new arz(aryVar3));
                        ajwVar.c = null;
                    }
                }
            }
        }
        return afak.a;
    }
}
