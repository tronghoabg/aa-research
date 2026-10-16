package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nkn implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ nkn(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.nyi nyiVar = (defpackage.nyi) obj;
                defpackage.yqm yqmVar = defpackage.nkp.a;
                nyiVar.getClass();
                return java.lang.Boolean.valueOf(!nyiVar.a && nyiVar.b > 0);
            case 1:
                ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar2 = defpackage.nkp.a;
                return java.lang.Boolean.valueOf(defpackage.ebo.n().J());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.Map map = (java.util.Map) obj;
                defpackage.yqm yqmVar3 = defpackage.nkp.a;
                map.getClass();
                return (defpackage.mqj) map.get(com.google.android.gms.car.display.CarRegionId.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                defpackage.yqm yqmVar4 = defpackage.nkp.a;
                return java.lang.Boolean.valueOf(defpackage.afga.f(mqjVar != null ? mqjVar.a() : null, defpackage.mkt.s));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nne nneVar = (defpackage.nne) obj;
                nneVar.getClass();
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(nneVar.a.b());
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nneVar.c;
                return java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{numValueOf, ghIcon != null ? java.lang.Integer.valueOf(ghIcon.b()) : null, nneVar.d, java.lang.Boolean.valueOf(nneVar.e)}));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i = defpackage.nob.a;
                return defpackage.lxy.u((defpackage.abo) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.nod nodVar = (defpackage.nod) obj;
                int i2 = defpackage.nob.a;
                nodVar.getClass();
                return nodVar.r;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                nuv nuvVar = (nuv) obj;
                defpackage.yqm yqmVar5 = defpackage.non.a;
                if ((nuvVar != null ? nuvVar.c.x : null) == defpackage.nve.e) {
                    return nuvVar.c;
                }
                return null;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                nuv nuvVar2 = (nuv) obj;
                defpackage.yqm yqmVar6 = defpackage.non.a;
                if ((nuvVar2 != null ? nuvVar2.c.x : null) == defpackage.nve.c) {
                    return nuvVar2.c;
                }
                return null;
            case 9:
                defpackage.non.a.l().y("forcedWidgetState: %s", (defpackage.nok) obj);
                return obj;
            case 10:
                defpackage.non.a.l().y("regularWidgetState: %s", (defpackage.nok) obj);
                return obj;
            case 11:
                defpackage.non.a.l().y("RailWidgetUiState: %s", (defpackage.nod) obj);
                return obj;
            case 12:
                defpackage.yqm yqmVar7 = defpackage.nrm.c;
                return java.lang.Boolean.valueOf(((defpackage.nrl) obj) instanceof defpackage.nrk);
            case 13:
                android.telephony.ServiceState serviceState = (android.telephony.ServiceState) obj;
                if (serviceState != null && serviceState.getState() == 2) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 14:
                defpackage.nvo nvoVar = defpackage.nvq.a;
                return ((defpackage.nvr) obj).a;
            case 15:
                defpackage.abo aboVar = (defpackage.abo) obj;
                aboVar.getClass();
                defpackage.acf acfVar = new defpackage.acf(defpackage.acs.z(defpackage.ca.F(300, 300, null, 4), 2), defpackage.acs.A(defpackage.ca.F(200, 0, null, 4), 2), 0.0f, 12);
                aboVar.c(acfVar, new defpackage.adp(false, new defpackage.nog(6)));
                return acfVar;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.yhx yhxVar = defpackage.obg.a;
                return java.lang.Boolean.valueOf(iIntValue >= 3);
            case 17:
                defpackage.cla claVar = (defpackage.cla) obj;
                claVar.getClass();
                claVar.t(1);
                return defpackage.afbk.a;
            case 18:
                defpackage.ygw ygwVar = defpackage.oek.a;
                return (com.google.android.apps.auto.components.telecom.PhoneCall) defpackage.ysr.ai(((java.util.List) obj).iterator());
            case 19:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.ygw ygwVar2 = defpackage.oek.a;
                return java.lang.Boolean.valueOf((phoneCall == null || defpackage.oek.a.contains(phoneCall.b)) ? false : true);
            default:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall2 = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.ygw ygwVar3 = defpackage.oek.a;
                return java.lang.Boolean.valueOf((phoneCall2 == null || defpackage.oek.b.contains(phoneCall2.b)) ? false : true);
        }
    }
}
