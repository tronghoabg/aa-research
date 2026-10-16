package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lnc implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ lnc(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        int iQ;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.valueOf(defpackage.lni.r((android.content.ComponentName) obj));
            case 1:
                defpackage.yqm yqmVar = defpackage.lni.a;
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.lke) obj).c;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.List<lph> list = (java.util.List) obj;
                defpackage.lol lolVar = defpackage.lom.a;
                if (list == null || list.isEmpty()) {
                    defpackage.afce afceVar = defpackage.afce.a;
                    defpackage.afdo afdoVar = defpackage.tcu.a;
                    return new defpackage.eqs(afceVar);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                for (lph lphVar : list) {
                    arrayList.add(defpackage.tcu.B(defpackage.actz.F() ? defpackage.lpg.j().a(lphVar) : defpackage.lpg.j().e(lphVar), new defpackage.llr(lphVar, 6)));
                }
                defpackage.lnc lncVar = new defpackage.lnc(4);
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return new defpackage.tcl(arrayList, lncVar);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List list2 = (java.util.List) obj;
                defpackage.lol lolVar2 = defpackage.lom.a;
                list2.getClass();
                java.util.List listAO = defpackage.afga.aO(list2);
                if (!defpackage.acmw.j()) {
                    return listAO;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAO) {
                    if (hashSet.add(((lph) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                int i = defpackage.loo.a;
                if (mqjVar == null || mqjVar.b != defpackage.mqg.MEDIA || defpackage.mkt.f.equals(mqjVar.a())) {
                    return null;
                }
                return mqjVar.a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((lpf) obj).b;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((lpf) obj).a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((lph) obj).a;
            case 9:
                lok lokVar = (los) obj;
                boolean z2 = lokVar instanceof lok;
                defpackage.yqm yqmVar2 = defpackage.lpx.a;
                if (!z2) {
                    lpm lpmVar = new lpm(lokVar.d().b, (com.google.android.apps.auto.components.media.compat.AaPlaybackState) null, (defpackage.lmk) null, false, android.os.Bundle.EMPTY, (defpackage.lma) null);
                    defpackage.afdo afdoVar3 = defpackage.tcu.a;
                    return new defpackage.eqs(lpmVar);
                }
                lok lokVar2 = lokVar;
                defpackage.eqp eqpVar = lokVar2.e;
                defpackage.eqp eqpVar2 = lokVar2.f;
                defpackage.eqp eqpVar3 = lokVar2.h;
                android.os.Bundle bundleA = lokVar2.a();
                defpackage.afdo afdoVar4 = defpackage.tcu.a;
                return defpackage.tcu.f(eqpVar, eqpVar2, eqpVar3, new defpackage.eqs(bundleA), new dxt(lokVar2, 8));
            case 10:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.yqm yqmVar3 = defpackage.lpx.a;
                if (componentName != null) {
                    return defpackage.ygw.q(defpackage.ebo.g(defpackage.lpg.j().f(componentName), new defpackage.lnc(9)));
                }
                int i2 = defpackage.ygw.d;
                return defpackage.ymx.a;
            case 11:
                int i3 = lqc.a;
                return defpackage.tna.aJ((los) obj);
            case 12:
                defpackage.yqm yqmVar4 = defpackage.lqf.a;
                return (lny) defpackage.lot.b((loq) obj, lny.class);
            case 13:
                lny lnyVar = (lny) obj;
                defpackage.yqm yqmVar5 = defpackage.lqf.a;
                return defpackage.tcu.w(defpackage.lqf.c(lnyVar, lnyVar.c(), 0), new defpackage.lnc(14));
            case 14:
                return defpackage.ygw.o((java.util.List) obj);
            case 15:
                defpackage.yqm yqmVar6 = defpackage.lqf.a;
                return (lon) defpackage.lot.b((lop) obj, lon.class);
            case 16:
                return new lmm((lkc) obj);
            case 17:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                if (lmkVar != null) {
                    lmkVar.h();
                    z = android.text.TextUtils.isEmpty(lmkVar.h().S()) ? false : true;
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                return new lmn((lkc) obj);
            case 19:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                return java.lang.Boolean.valueOf((aaPlaybackState == null || (iQ = aaPlaybackState.Q()) == 0 || iQ == 7) ? false : true);
            default:
                defpackage.yqm yqmVar7 = defpackage.lqz.a;
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
        }
    }
}
