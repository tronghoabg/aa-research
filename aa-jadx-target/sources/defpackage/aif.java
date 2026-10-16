package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aif implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aif(int i, java.lang.Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [gks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [gks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, tf] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, vd] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, rl] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, rl] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, rl] */
    /* JADX WARN: Type inference failed for: r11v37, types: [gks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v53, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        lwy lwyVar;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.skb skbVar = (defpackage.skb) obj;
                int i = this.a;
                skbVar.a = i;
                java.util.List list = ((aig) this.b).b;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ahx ahxVar = (ahx) list.get(i2);
                    skbVar.h(ahxVar.b, (int) (i * ahxVar.a)).b = ahxVar.c;
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.skb skbVar2 = (defpackage.skb) obj;
                int i3 = this.a;
                skbVar2.a = i3;
                java.util.List list2 = ((aie) this.b).b;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ahx ahxVar2 = (ahx) list2.get(i4);
                    skbVar2.h(ahxVar2.b, (int) (i3 * ahxVar2.a)).b = ahxVar2.c;
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                java.lang.Object obj2 = this.b;
                if (obj2 != null) {
                    int i5 = this.a;
                    float f = brh.a;
                    defpackage.cux cuxVar = (defpackage.cux) obj2;
                    cuwVar.x(cuxVar, 0, (i5 - cuxVar.b) / 2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cgf cgfVar = bsk.a;
                ((defpackage.cuw) obj).r((defpackage.cux) this.b, -this.a, 0, 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cgf cgfVar2 = bsk.a;
                ((defpackage.cuw) obj).r((defpackage.cux) this.b, 0, -this.a, 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((defpackage.cjc) obj).k(this.a));
                defpackage.afgv afgvVar = (defpackage.afgv) this.b;
                afgvVar.a = boolValueOf;
                java.lang.Boolean bool = (java.lang.Boolean) afgvVar.a;
                bool.booleanValue();
                return bool;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                gep gepVar = (gep) obj;
                gepVar.getClass();
                this.b.sendKeyDown(this.a, gepVar);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                gep gepVar2 = (gep) obj;
                gepVar2.getClass();
                this.b.sendKeyLongPress(this.a, gepVar2);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                gep gepVar3 = (gep) obj;
                gepVar3.getClass();
                this.b.sendCancel(this.a, gepVar3);
                return defpackage.afbk.a;
            case 9:
                gep gepVar4 = (gep) obj;
                gepVar4.getClass();
                this.b.sendSelected(this.a, gepVar4);
                return defpackage.afbk.a;
            case 10:
                gep gepVar5 = (gep) obj;
                gepVar5.getClass();
                this.b.sendKeyDown(this.a, gepVar5);
                return defpackage.afbk.a;
            case 11:
                gep gepVar6 = (gep) obj;
                gepVar6.getClass();
                this.b.sendKeyUp(this.a, gepVar6);
                return defpackage.afbk.a;
            case 12:
                gep gepVar7 = (gep) obj;
                gepVar7.getClass();
                this.b.sendKeyLongPress(this.a, gepVar7);
                return defpackage.afbk.a;
            case 13:
                gep gepVar8 = (gep) obj;
                gepVar8.getClass();
                this.b.sendKeyUp(this.a, gepVar8);
                return defpackage.afbk.a;
            case 14:
                defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
                cuwVar2.getClass();
                cuwVar2.x((defpackage.cux) this.b, 0, this.a);
                return defpackage.afbk.a;
            case 15:
                defpackage.to toVar = (defpackage.to) obj;
                int i6 = llj.a;
                toVar.getClass();
                if (((ohy) this.b).a == lle.a) {
                    int i7 = this.a;
                    toVar.a(androidx.car.app.model.CarColor.createCustom(i7, i7));
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.ygw ygwVar = ((lon) obj).a;
                defpackage.yqm yqmVar = defpackage.lqf.a;
                defpackage.ygw ygwVar2 = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVar).limit(2L).map(new lqe((lny) this.b, this.a)).collect(defpackage.yds.a);
                ygwVar2.isEmpty();
                return defpackage.tcu.k(ygwVar2);
            case 17:
                java.util.List<jra> list3 = (java.util.List) obj;
                lwu lwuVar = lwv.a;
                list3.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list3, 10));
                for (jra jraVar : list3) {
                    java.lang.String str = jraVar.b;
                    if (str != null) {
                        java.lang.String string = java.util.UUID.randomUUID().toString();
                        string.getClass();
                        lwyVar = new lwy(string, lwx.c, str, 1.0d, new lww((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, jraVar.a), true);
                    } else {
                        java.lang.String string2 = java.util.UUID.randomUUID().toString();
                        string2.getClass();
                        java.lang.String str2 = jraVar.a;
                        lwx lwxVar = lwx.b;
                        str2.getClass();
                        lwyVar = new lwy(string2, lwxVar, str2, 1.0d, new lww((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null), true);
                    }
                    arrayList.add(lwyVar);
                }
                lwv.c.l().R("Returning %d insights for %s %d", java.lang.Integer.valueOf(arrayList.size()), this.b, java.lang.Integer.valueOf(this.a));
                return arrayList;
            case 18:
                defpackage.cim cimVar = (defpackage.cim) obj;
                defpackage.yqm yqmVar2 = defpackage.mzk.a;
                cimVar.getClass();
                cimVar.a(this.a == ((defpackage.bby) this.b).j());
                return defpackage.afbk.a;
            default:
                this.b.invoke(defpackage.szw.p(this.a, (tbp) obj));
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ aif(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
