package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class act implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ act(int i) {
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r5v32, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v54, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v56, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [bys, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = true;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.a.aj((defpackage.cux) this.a, (defpackage.cuw) obj);
            case 1:
                defpackage.agj agjVar = (defpackage.agj) obj;
                defpackage.acj acjVar = defpackage.acj.a;
                defpackage.acj acjVar2 = defpackage.acj.b;
                boolean zH = agjVar.h(acjVar, acjVar2);
                java.lang.Object obj2 = this.a;
                if (zH) {
                    defpackage.adq adqVar = ((defpackage.acv) obj2).e.b.b;
                    return adqVar != null ? adqVar.b : defpackage.acs.d;
                }
                if (!agjVar.h(acjVar2, defpackage.acj.c)) {
                    return defpackage.acs.d;
                }
                defpackage.adq adqVar2 = ((defpackage.acv) obj2).f.b.b;
                return adqVar2 != null ? adqVar2.b : defpackage.acs.d;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.a.aj((defpackage.cux) this.a, (defpackage.cuw) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.agj agjVar2 = (defpackage.agj) obj;
                defpackage.acj acjVar3 = defpackage.acj.a;
                defpackage.acj acjVar4 = defpackage.acj.b;
                boolean zH2 = agjVar2.h(acjVar3, acjVar4);
                java.lang.Object obj3 = this.a;
                if (zH2) {
                    defpackage.ack ackVar = ((defpackage.adw) obj3).b.b;
                    return defpackage.acs.c;
                }
                if (!agjVar2.h(acjVar4, defpackage.acj.c)) {
                    return defpackage.acs.c;
                }
                defpackage.adt adtVar = ((defpackage.adw) obj3).c.b.e;
                return defpackage.acs.c;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                return this.a.invoke(l);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.agq(this.a, 1);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.agq(this.a, 0);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj4 = this.a;
                defpackage.dej dejVar = defpackage.def.a;
                java.util.List listSingletonList = java.util.Collections.singletonList(obj4);
                listSingletonList.getClass();
                ((defpackage.dek) obj).a(dejVar, listSingletonList);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.akc akcVar = (defpackage.akc) obj;
                if (defpackage.afga.f(akcVar.d(), "waiting")) {
                    ((defpackage.afgv) this.a).a = akcVar;
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                defpackage.czh czhVar = (defpackage.czh) obj;
                if (!(czhVar instanceof defpackage.akd)) {
                    throw new java.lang.IllegalStateException("Node is not a GestureNode instance");
                }
                java.lang.Boolean bool = (java.lang.Boolean) this.a.invoke(((defpackage.akd) czhVar).a);
                bool.booleanValue();
                return bool;
            case 10:
                java.lang.Object obj5 = this.a;
                defpackage.dek dekVar = (defpackage.dek) obj;
                defpackage.dej dejVar2 = defpackage.def.a;
                java.util.List listSingletonList2 = java.util.Collections.singletonList(obj5);
                listSingletonList2.getClass();
                dekVar.a(dejVar2, listSingletonList2);
                dekVar.a(defpackage.def.A, new defpackage.ddw(5));
                return defpackage.afbk.a;
            case 11:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                defpackage.all allVar = (defpackage.all) this.a;
                float fC = allVar.c() + fFloatValue + allVar.c;
                float fD = defpackage.afqt.d(fC, 0.0f, allVar.b());
                float fC2 = fD - allVar.c();
                int iRound = java.lang.Math.round(fC2);
                allVar.f(allVar.c() + iRound);
                allVar.c = fC2 - iRound;
                if (fC != fD) {
                    fFloatValue = fC2;
                }
                return java.lang.Float.valueOf(fFloatValue);
            case 12:
                this.a.invoke();
                return defpackage.afbk.a;
            case 13:
                defpackage.crd crdVar = (defpackage.crd) obj;
                this.a.invoke(crdVar, new defpackage.cji(defpackage.tq.o(crdVar)));
                crdVar.b();
                return defpackage.afbk.a;
            case 14:
                defpackage.akc akcVar2 = (defpackage.akc) obj;
                defpackage.affh affhVar = defpackage.aon.a;
                return java.lang.Boolean.valueOf(akcVar2 instanceof defpackage.aol ? ((java.lang.Boolean) this.a.invoke(akcVar2)).booleanValue() : true);
            case 15:
                return java.lang.Boolean.valueOf(defpackage.ca.aF((defpackage.aqp) this.a, java.lang.Float.intBitsToFloat((int) (4294967295L & ((defpackage.apx) obj).a))));
            case 16:
                java.lang.Float f = (java.lang.Float) obj;
                f.floatValue();
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.affc) this.a.a()).invoke(f)).floatValue());
            case 17:
                long j = ((defpackage.cji) obj).a;
                defpackage.aqp aqpVar = (defpackage.aqp) this.a;
                return new defpackage.cji(aqpVar.c(aqpVar.h, j, aqpVar.g));
            case 18:
                return java.lang.Boolean.valueOf(defpackage.ca.aF((defpackage.aqp) this.a, java.lang.Float.intBitsToFloat((int) (4294967295L & ((defpackage.apx) obj).a))));
            case 19:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
            default:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ act(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
