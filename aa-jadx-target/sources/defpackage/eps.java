package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eps extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = affcVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aizj, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                defpackage.eps epsVar = new defpackage.eps((aizj) this.b, afdkVar, 0);
                epsVar.c = obj;
                return epsVar;
            case 1:
                defpackage.eps epsVar2 = new defpackage.eps((defpackage.affg) this.b, afdkVar, 1);
                epsVar2.c = obj;
                return epsVar2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.eps epsVar3 = new defpackage.eps((defpackage.affg) this.b, afdkVar, 2, (byte[]) null);
                epsVar3.c = obj;
                return epsVar3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.eps epsVar4 = new defpackage.eps((defpackage.affc) this.b, afdkVar, 3);
                epsVar4.c = obj;
                return epsVar4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.eps epsVar5 = new defpackage.eps((aizj) this.b, afdkVar, 4, (byte[]) null);
                epsVar5.c = obj;
                return epsVar5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.eps epsVar6 = new defpackage.eps((ajbk) this.b, afdkVar, 5);
                epsVar6.c = obj;
                return epsVar6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.eps epsVar7 = new defpackage.eps((ajbl) this.b, afdkVar, 6);
                epsVar7.c = obj;
                return epsVar7;
            default:
                defpackage.eps epsVar8 = new defpackage.eps((aizk) this.b, afdkVar, 7);
                epsVar8.c = obj;
                return epsVar8;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                defpackage.afdr afdrVar = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    defpackage.tc tcVar = (defpackage.tc) this.c;
                    ?? r2 = this.b;
                    defpackage.epr eprVar = new defpackage.epr(tcVar, 2);
                    this.a = 1;
                    if (r2.hd(eprVar, this) == afdrVar) {
                        return afdrVar;
                    }
                }
                return defpackage.afbk.a;
            case 1:
                eii eiiVar = (eii) this.c;
                defpackage.afdr afdrVar2 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    ?? r6 = this.b;
                    this.c = null;
                    this.a = 1;
                    obj = r6.invoke(eiiVar, this);
                    if (obj == afdrVar2) {
                        return afdrVar2;
                    }
                }
                eii eiiVar2 = (eii) obj;
                eiiVar2.getClass();
                ((java.util.concurrent.atomic.AtomicBoolean) eiiVar2.a.a).set(true);
                return eiiVar2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afdr afdrVar3 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aiuw aiuwVar = (aiuw) this.c;
                    ?? r3 = this.b;
                    this.a = 1;
                    if (r3.invoke(aiuwVar, this) == afdrVar3) {
                        return afdrVar3;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.afdr afdrVar4 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                if (((aiuw) this.c).c().get(ezo.a) == null) {
                    throw new java.lang.IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                ?? r7 = this.b;
                this.a = 1;
                java.lang.Object objInvoke = r7.invoke(this);
                return objInvoke == afdrVar4 ? afdrVar4 : objInvoke;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afdr afdrVar5 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aiyu aiyuVar = (aiyu) this.c;
                    ?? r4 = this.b;
                    jyd jydVar = new jyd(aiyuVar, 4);
                    this.a = 1;
                    if (r4.hd(jydVar, this) == afdrVar5) {
                        return afdrVar5;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afdr afdrVar6 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aiyu aiyuVar2 = (aiyu) this.c;
                    java.lang.Object obj2 = this.b;
                    this.a = 1;
                    if (((ajbk) obj2).b(aiyuVar2, this) == afdrVar6) {
                        return afdrVar6;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afdr afdrVar7 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aizk aizkVar = (aizk) this.c;
                    java.lang.Object obj3 = this.b;
                    this.a = 1;
                    if (((ajbl) obj3).g(aizkVar, this) == afdrVar7) {
                        return afdrVar7;
                    }
                }
                return defpackage.afbk.a;
            default:
                defpackage.afdr afdrVar8 = defpackage.afdr.a;
                int i = this.a;
                defpackage.afga.cz(obj);
                if (i == 0) {
                    java.lang.Object obj4 = this.c;
                    ?? r5 = this.b;
                    this.a = 1;
                    if (r5.a(obj4, this) == afdrVar8) {
                        return afdrVar8;
                    }
                }
                return defpackage.afbk.a;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.eps) b((defpackage.tc) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.eps) b((eii) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.eps) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.eps) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.eps) b((aiyu) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.eps) b((aiyu) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.eps) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.eps) b(obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(defpackage.affg affgVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.d = i;
        this.b = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(aizj aizjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = aizjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(aizj aizjVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.d = i;
        this.b = aizjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(aizk aizkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = aizkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(ajbk ajbkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = ajbkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eps(ajbl ajblVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = ajblVar;
    }
}
