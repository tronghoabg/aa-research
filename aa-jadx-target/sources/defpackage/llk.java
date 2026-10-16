package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class llk implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ llk(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                lok lokVar = (lok) obj;
                lokVar.getClass();
                return defpackage.ebo.f(lokVar.g, new defpackage.llk(5));
            case 1:
                return defpackage.tna.aC((los) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                lok lokVar2 = (lok) obj;
                lokVar2.getClass();
                return lokVar2.f;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                lok lokVar3 = (lok) obj;
                lokVar3.getClass();
                return lokVar3.c;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.lke lkeVar = (defpackage.lke) obj;
                lkeVar.getClass();
                java.lang.String str2 = lkeVar.b;
                str2.getClass();
                return lll.d(lkeVar.g, str2, lkeVar.f);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                ygwVar.getClass();
                return java.lang.Boolean.valueOf(!ygwVar.isEmpty());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                long jO = lmkVar.O("com.google.android.apps.auto.radio.HD_SUB_CHANNEL_ID");
                java.lang.String strQ = lmkVar.Q("com.google.android.apps.auto.radio.AVAILABLE_HD_SUB_CHANNELS");
                if (strQ == null) {
                    return jO > 0 ? defpackage.afga.Q(new defpackage.afau(java.lang.String.valueOf(jO), "")) : defpackage.afcf.a;
                }
                java.util.Map mapK = defpackage.xzd.d(";").j("=").k(strQ);
                mapK.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afga.P(mapK.size()));
                for (java.util.Map.Entry entry : mapK.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    if (defpackage.afga.f(entry.getKey(), java.lang.String.valueOf(jO))) {
                        str = "";
                    } else {
                        java.lang.Object value = entry.getValue();
                        value.getClass();
                        str = (java.lang.String) value;
                    }
                    linkedHashMap.put(key, str);
                }
                return linkedHashMap;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                lok lokVar4 = (lok) obj;
                lokVar4.getClass();
                return defpackage.tcu.d(lokVar4.e, lokVar4.f, new defpackage.kuy(11));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.tna.aC((los) obj);
            case 9:
                lok lokVar5 = (lok) obj;
                lokVar5.getClass();
                return lokVar5.b();
            case 10:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(defpackage.lnt.n(((java.lang.Number) it.next()).intValue()));
                }
                return arrayList;
            case 11:
                defpackage.to toVar = (defpackage.to) obj;
                toVar.getClass();
                defpackage.kry kryVar = defpackage.kry.D;
                defpackage.ksc kscVar = defpackage.ksi.a;
                toVar.a(androidx.car.app.model.CarColor.createCustom(kryVar.e(kscVar.a().c()), kryVar.c(kscVar.a().c())));
                return defpackage.afbk.a;
            case 12:
                lok lokVar6 = (los) obj;
                lokVar6.getClass();
                if (lokVar6 instanceof lok) {
                    return lokVar6;
                }
                return null;
            case 13:
                lob lobVar = (loq) obj;
                lobVar.getClass();
                if (lobVar instanceof lob) {
                    return lobVar;
                }
                return null;
            case 14:
                ((java.lang.String) obj).getClass();
                return defpackage.afbk.a;
            case 15:
                boolean z = ((loq) obj) instanceof loy;
                int i = defpackage.lmt.h;
                return java.lang.Boolean.valueOf(z);
            case 16:
                defpackage.yqm yqmVar = defpackage.lnb.a;
                return defpackage.lpg.j().b((android.content.ComponentName) obj);
            case 17:
                defpackage.yqm yqmVar2 = defpackage.lnb.a;
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
            case 18:
                lok lokVar7 = (los) obj;
                boolean z2 = lokVar7 instanceof lok;
                defpackage.yqm yqmVar3 = defpackage.lnb.a;
                if (z2) {
                    lok lokVar8 = lokVar7;
                    return defpackage.tcu.d(defpackage.ebo.e(defpackage.tcu.c(defpackage.tcu.w(lokVar8.e, new defpackage.llk(19)), -1L)), lokVar8.g, new defpackage.kuy(15));
                }
                lmu lmuVar = new lmu();
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(lmuVar);
            case 19:
                return java.lang.Long.valueOf(((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj).S());
            default:
                lph lphVar = (lph) obj;
                if (defpackage.lni.r(lphVar.a)) {
                    return null;
                }
                return lphVar;
        }
    }
}
