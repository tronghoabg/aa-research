package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class err implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public err(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v47, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, obw] */
    /* JADX WARN: Type inference failed for: r5v2, types: [eqg, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws afbj {
        defpackage.eqp eqpVar;
        int i = 10;
        int i2 = 9;
        int i3 = 3;
        boolean z = false;
        int i4 = 1;
        byte[] bArr = null;
        java.lang.Object[] objArr = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.eqp) this.a).m(this.b.invoke(obj));
                return defpackage.afbk.a;
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                defpackage.eqf eqfVar = (defpackage.eqf) entry.getKey();
                defpackage.eqh eqhVar = (defpackage.eqh) entry.getValue();
                while (true) {
                    defpackage.eqi eqiVar = (defpackage.eqi) this.b;
                    if (eqhVar.a.compareTo(eqiVar.e) < 0 && !eqiVar.c && eqiVar.b.b(eqfVar)) {
                        java.util.List list = eqiVar.d;
                        list.add(eqhVar.a);
                        defpackage.epv epvVar = defpackage.epw.Companion;
                        defpackage.epw epwVarB = defpackage.epv.b(eqhVar.a);
                        if (epwVarB == null) {
                            defpackage.epx epxVar = eqhVar.a;
                            java.util.Objects.toString(epxVar);
                            throw new java.lang.IllegalStateException("no event up from ".concat(java.lang.String.valueOf(epxVar)));
                        }
                        eqhVar.a(this.a, epwVarB);
                        defpackage.afga.bu(list);
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.eqp eqpVar2 = (defpackage.eqp) this.a;
                java.lang.Object objE = eqpVar2.e();
                defpackage.afgq afgqVar = (defpackage.afgq) this.b;
                if (afgqVar.a || ((objE == null && obj != null) || (objE != null && !defpackage.afga.f(objE, obj)))) {
                    afgqVar.a = false;
                    eqpVar2.m(obj);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ntl ntlVar = (defpackage.ntl) obj;
                ntlVar.getClass();
                java.lang.Object obj2 = this.a;
                new defpackage.err((java.lang.Object) ntlVar, obj2, 4, (char[]) (objArr == true ? 1 : 0)).invoke(defpackage.jmk.a);
                defpackage.jmk jmkVar = defpackage.jmk.b;
                defpackage.jmk jmkVar2 = defpackage.jmk.c;
                ntlVar.g(jmkVar, new defpackage.jmk[]{jmkVar2, jmkVar}, null);
                java.lang.Object obj3 = this.b;
                new defpackage.acn(ntlVar, obj2, obj3, 17).invoke(jmkVar2);
                defpackage.jmk jmkVar3 = defpackage.jmk.d;
                defpackage.jmk jmkVar4 = defpackage.jmk.e;
                ntlVar.g(jmkVar3, new defpackage.jmk[]{jmkVar4}, null);
                new defpackage.acn(ntlVar, obj2, obj3, 18).invoke(jmkVar4);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.jmk jmkVar5 = (defpackage.jmk) obj;
                jmkVar5.getClass();
                defpackage.djm djmVar = new defpackage.djm(this.a, i2);
                defpackage.ntl ntlVar2 = (defpackage.ntl) this.b;
                ntlVar2.f(jmkVar5, djmVar);
                ntlVar2.g(jmkVar5, new defpackage.jmk[]{defpackage.jmk.b}, null);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object objE2 = ((defpackage.eqp) this.a).e();
                objE2.getClass();
                ((defpackage.eqp) this.b).m(defpackage.eqr.t((java.lang.Integer) obj, ((java.lang.Number) objE2).intValue()));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                java.lang.Integer num2 = (java.lang.Integer) ((defpackage.ksi) this.b).d.e();
                num.getClass();
                ((defpackage.eqp) this.a).m(defpackage.eqr.t(num2, num.intValue()));
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj4 = this.a;
                defpackage.yqm yqmVar = defpackage.lpx.a;
                return new defpackage.lpw(defpackage.tcu.l(defpackage.tcu.v(defpackage.loo.b(), new defpackage.lnc(i)), defpackage.tcu.v((defpackage.eqp) obj4, new defpackage.lpc((defpackage.qsh) obj, this.b, 5))), new defpackage.lsn(i4));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.tcu.w((defpackage.eqp) this.a, new defpackage.lpc(this.b, (defpackage.qsh) obj, i3));
            case 9:
                defpackage.cim cimVar = (defpackage.cim) obj;
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                cimVar.getClass();
                if (((java.lang.Boolean) this.a.a()).booleanValue() && !((java.lang.Boolean) this.b.a()).booleanValue()) {
                    z = true;
                }
                cimVar.a(z);
                return defpackage.afbk.a;
            case 10:
                defpackage.yqm yqmVar3 = defpackage.nif.a;
                ((defpackage.chw) obj).getClass();
                ?? r1 = this.a;
                defpackage.nje njeVar = r1.a() == defpackage.nje.a ? defpackage.nje.b : (defpackage.nje) r1.a();
                ?? r0 = this.b;
                defpackage.nif.a.l().y("FocusProperties onEnter %s", njeVar);
                java.lang.Object obj5 = r0.get(njeVar);
                obj5.getClass();
                ((defpackage.cit) obj5).a(7);
                return defpackage.afbk.a;
            case 11:
                defpackage.cim cimVar2 = (defpackage.cim) obj;
                defpackage.yqm yqmVar4 = defpackage.nif.a;
                cimVar2.getClass();
                cimVar2.f(new defpackage.err(this.a, this.b, i, bArr));
                return defpackage.afbk.a;
            case 12:
                defpackage.npc npcVar = (defpackage.npc) obj;
                npcVar.getClass();
                defpackage.non nonVar = (defpackage.non) this.b;
                defpackage.eqp eqpVar3 = nonVar.b;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                defpackage.eqp eqpVarF = defpackage.ebo.f(eqpVar3, new defpackage.tci(2));
                defpackage.nok nokVar = defpackage.nok.a;
                npcVar.f(eqpVarF, nokVar);
                defpackage.tci tciVar = new defpackage.tci(3);
                defpackage.eqp eqpVar4 = nonVar.g;
                defpackage.eqp eqpVarA = defpackage.tcu.a(nonVar.d, defpackage.ebo.f(eqpVar4, tciVar));
                defpackage.nok nokVar2 = defpackage.nok.c;
                npcVar.f(eqpVarA, nokVar2);
                npcVar.f((defpackage.eqp) this.a, nokVar);
                npcVar.f(defpackage.ebo.f(nonVar.f, new defpackage.tci(3)), defpackage.nok.b);
                npcVar.f(defpackage.ebo.f(eqpVar4, new defpackage.tci(3)), nokVar2);
                npcVar.f(nonVar.c, defpackage.nok.d);
                return new defpackage.eqs(nokVar);
            case 13:
                defpackage.cml cmlVar = (defpackage.cml) obj;
                cmlVar.getClass();
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32));
                long jO = cmlVar.o() & 4294967295L;
                ?? r2 = this.a;
                float fC = r2.c(fIntBitsToFloat, java.lang.Float.intBitsToFloat((int) jO));
                defpackage.obs obsVar = (defpackage.obs) this.b.invoke();
                defpackage.cmi cmiVarR = cmlVar.r();
                long jA = cmiVarR.a();
                cmiVarR.b().g();
                try {
                    cmiVarR.c.k(fC, fC, 0L);
                    defpackage.dai.aH(cmlVar, r2.e(), -72057594037927936L, new defpackage.cmo(2.0f, 0.0f, 0, 0, 30), 20);
                    defpackage.dai.aH(cmlVar, r2.e(), obsVar.b(), null, 60);
                    return defpackage.afbk.a;
                } finally {
                    cmiVarR.b().e();
                    cmiVarR.h(jA);
                }
            case 14:
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return (obj == null || (eqpVar = (defpackage.eqp) this.b.invoke(obj)) == null) ? this.a : eqpVar;
            case 15:
                java.lang.Object obj6 = this.a;
                defpackage.tcn tcnVar = (defpackage.tcn) obj6;
                boolean z2 = tcnVar.h;
                defpackage.eqp eqpVar5 = (defpackage.eqp) obj6;
                java.lang.Object objE3 = eqpVar5.e();
                if (z2) {
                    ((defpackage.tck) obj6).b(true);
                    eqpVar5.m(obj);
                } else {
                    eqpVar5.m(obj);
                    ((defpackage.tck) obj6).b(true);
                }
                if (!((java.lang.Boolean) tcnVar.j.invoke(objE3, obj)).booleanValue()) {
                    ((defpackage.tck) obj6).a();
                    aiwg aiwgVar = tcnVar.m;
                    if (aiwgVar != null) {
                        aiwgVar.s((java.util.concurrent.CancellationException) null);
                    }
                }
                aiwg aiwgVar2 = tcnVar.m;
                if (aiwgVar2 == null || !aiwgVar2.t()) {
                    tcnVar.u();
                }
                aiwg aiwgVar3 = tcnVar.l;
                if (aiwgVar3 != null) {
                    aiwgVar3.s((java.util.concurrent.CancellationException) null);
                }
                aiuw aiuwVar = tcnVar.k;
                if (aiuwVar == null) {
                    defpackage.afga.d("coroutineScope");
                    aiuwVar = null;
                }
                tcnVar.l = ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bej((j$.time.Duration) this.b, tcnVar, (defpackage.afdk) null, 9), 3);
                return defpackage.afbk.a;
            default:
                return ((java.lang.Boolean) obj).booleanValue() ? this.b : this.a;
        }
    }

    public /* synthetic */ err(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ err(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
