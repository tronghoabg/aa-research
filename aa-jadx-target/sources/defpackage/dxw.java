package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dxw extends defpackage.afee implements defpackage.affg {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(aack aackVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = aackVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [dzo, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.c;
        if (i == 0) {
            defpackage.dxw dxwVar = new defpackage.dxw((defpackage.sr) this.b, afdkVar, 0, null);
            dxwVar.a = obj;
            return dxwVar;
        }
        if (i == 1) {
            defpackage.dxw dxwVar2 = new defpackage.dxw((aack) this.b, afdkVar, 1);
            dxwVar2.a = obj;
            return dxwVar2;
        }
        if (i == 2) {
            defpackage.dxw dxwVar3 = new defpackage.dxw((defpackage.sr) this.b, afdkVar, 2);
            dxwVar3.a = obj;
            return dxwVar3;
        }
        if (i == 3) {
            defpackage.dxw dxwVar4 = new defpackage.dxw((dzo) this.b, afdkVar, 3);
            dxwVar4.a = obj;
            return dxwVar4;
        }
        if (i == 4) {
            defpackage.dxw dxwVar5 = new defpackage.dxw((defpackage.eqb) this.b, afdkVar, 4);
            dxwVar5.a = obj;
            return dxwVar5;
        }
        java.lang.Object obj2 = this.b;
        if (i != 5) {
            defpackage.dxw dxwVar6 = new defpackage.dxw((gzz) obj2, afdkVar, 6);
            dxwVar6.a = obj;
            return dxwVar6;
        }
        defpackage.dxw dxwVar7 = new defpackage.dxw((gzo) obj2, afdkVar, 5);
        dxwVar7.a = obj;
        return dxwVar7;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [dys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [dzo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [eqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [dyg, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        boolean z;
        defpackage.affc affcVar;
        java.lang.String str;
        defpackage.affc affcVar2;
        defpackage.affc affcVar3;
        int i = this.c;
        if (i == 0) {
            defpackage.afga.cz(obj);
            android.net.Uri uri = (android.net.Uri) this.a;
            uri.getClass();
            ((defpackage.sr) this.b).a.b(uri);
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            android.os.Bundle bundle = ((dxs) this.a).d;
            if (bundle != null && !bundle.isEmpty()) {
                java.lang.Object obj2 = this.b;
                int i2 = android.os.Build.VERSION.SDK_INT;
                java.lang.Object obj3 = ((se) ((aack) obj2).a).a;
                z = (i2 >= 31 ? a$.ExternalSyntheticApiModelOutline0.m(((android.telecom.Call) obj3).getDetails()) : ((android.telecom.Call) obj3).getState()) != 9;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i == 2) {
            defpackage.afga.cz(obj);
            java.lang.String str2 = (java.lang.String) this.a;
            str2.getClass();
            ((defpackage.sr) this.b).a.b(str2);
            return defpackage.afbk.a;
        }
        if (i == 3) {
            java.lang.Object obj4 = this.a;
            defpackage.afga.cz(obj);
            java.lang.Object objA = this.b.a(obj4);
            objA.getClass();
            return objA;
        }
        if (i == 4) {
            defpackage.afga.cz(obj);
            aiuw aiuwVar = (aiuw) this.a;
            ?? r4 = this.b;
            defpackage.epy epyVar = ((defpackage.eqb) r4).a;
            if (epyVar.a().compareTo(defpackage.epx.b) >= 0) {
                epyVar.c(r4);
            } else {
                defpackage.afgz.r(aiuwVar.c(), null);
            }
            return defpackage.afbk.a;
        }
        if (i != 5) {
            defpackage.afga.cz(obj);
            hbh hbhVar = (hbh) this.a;
            gzz gzzVar = (gzz) this.b;
            gzzVar.e.b();
            if (hbhVar.i == 1) {
                hab habVar = gzzVar.f;
                habVar.a = 0;
                habVar.b = 0;
                habVar.c = 0;
                habVar.d = 0;
            }
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        hjy hjyVar = (hjy) this.a;
        java.lang.Object obj5 = this.b;
        gzo gzoVar = (gzo) obj5;
        gzoVar.e = hjyVar;
        int i3 = hjyVar.b - 1;
        if (i3 == 0) {
            java.lang.String str3 = hjyVar.a;
            if (str3.length() > 0 || (str = gzoVar.g) == null || str.length() == 0) {
                gzoVar.f = str3;
                gzr gzrVar = (gzr) ((gwm) obj5).n.b();
                if (gzrVar != null && (affcVar = gzrVar.g) != null) {
                    affcVar.invoke(str3);
                }
            } else {
                ((defpackage.ype) gzo.a.f().o(defpackage.yqn.a, "CarApp.H.Search").ai(92)).y("Ignoring empty TRANSCRIBING event to prevent wiping search. searchBarText: %s", gzoVar.g);
            }
        } else if (i3 != 1) {
            gzoVar.f = "";
            gzr gzrVar2 = (gzr) ((gwm) obj5).n.b();
            if (gzrVar2 != null && (affcVar3 = gzrVar2.g) != null) {
                affcVar3.invoke("");
            }
        } else {
            java.lang.String str4 = hjyVar.a;
            gzoVar.f = str4;
            gzr gzrVar3 = (gzr) ((gwm) obj5).n.b();
            if (gzrVar3 != null && (affcVar2 = gzrVar3.h) != null) {
                affcVar2.invoke(str4);
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((defpackage.dxw) b((android.net.Uri) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.dxw) b((dxs) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            return ((defpackage.dxw) b((java.lang.String) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 3) {
            return ((defpackage.dxw) b(obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 4) {
            return ((defpackage.dxw) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 5) {
            return ((defpackage.dxw) b((hbh) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.dxw) b((hjy) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(dzo dzoVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = dzoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(defpackage.eqb eqbVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = eqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(gzo gzoVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = gzoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(gzz gzzVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = gzzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(defpackage.sr srVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.b = srVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw(defpackage.sr srVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.c = i;
        this.b = srVar;
    }
}
