package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nef implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ nef(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        nvb nvbVar;
        nvb nvbVar2;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                nvh nvhVar = (nvh) obj;
                int i = neg.q;
                nvhVar.getClass();
                nup nupVar = nvhVar.u;
                return (nupVar == null || (ghIcon = nupVar.b) == null) ? nvhVar.b : ghIcon;
            case 1:
                nvh nvhVar2 = (nvh) obj;
                int i2 = neg.q;
                nvhVar2.getClass();
                return nvhVar2.e;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                nvh nvhVar3 = (nvh) obj;
                int i3 = neg.q;
                nvhVar3.getClass();
                if (defpackage.ogv.a.c()) {
                    nup nupVar2 = nvhVar3.u;
                    return nupVar2 != null ? nupVar2.e : nvhVar3.p;
                }
                nup nupVar3 = nvhVar3.u;
                return (nupVar3 == null || (nvbVar = nupVar3.e) == null) ? nvhVar3.p : nvbVar;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                nvh nvhVar4 = (nvh) obj;
                int i4 = neg.q;
                nvhVar4.getClass();
                if (defpackage.ogv.a.c()) {
                    nup nupVar4 = nvhVar4.u;
                    return nupVar4 != null ? nupVar4.g : nvhVar4.q;
                }
                nup nupVar5 = nvhVar4.u;
                return (nupVar5 == null || (nvbVar2 = nupVar5.g) == null) ? nvhVar4.q : nvbVar2;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i5 = neg.q;
                ((nvh) obj).getClass();
                return null;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                neq neqVar = (neq) obj;
                defpackage.yqm yqmVar = nes.a;
                neqVar.getClass();
                return new neq(neqVar.a, neqVar.d, false, neqVar.c);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.yqm yqmVar2 = nes.a;
                phoneCall.getClass();
                return phoneCall.c;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall2 = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.yqm yqmVar3 = nes.a;
                phoneCall2.getClass();
                android.graphics.Bitmap bitmap = phoneCall2.h;
                if (bitmap != null) {
                    return new defpackage.gjv(null, bitmap, null);
                }
                defpackage.gjv gjvVar = defpackage.gjv.a;
                android.net.Uri uriB = jvb.d().b(phoneCall2.d, phoneCall2.c);
                uriB.getClass();
                return new defpackage.gjv(uriB, null, null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.util.List list = (java.util.List) obj;
                defpackage.yqm yqmVar4 = nes.a;
                list.getClass();
                return (com.google.android.apps.auto.components.telecom.PhoneCall) defpackage.afga.aB(list);
            case 9:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall3 = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.yqm yqmVar5 = nes.a;
                phoneCall3.getClass();
                return com.google.android.apps.auto.components.graphics.icon.GhIcon.j(phoneCall3.f);
            case 10:
                oeo oeoVar = (oeo) obj;
                defpackage.yqm yqmVar6 = nes.a;
                oeoVar.getClass();
                return java.lang.Boolean.valueOf(oeoVar.a);
            case 11:
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall4 = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.yqm yqmVar7 = nes.a;
                phoneCall4.getClass();
                return phoneCall4.b;
            case 12:
                oom oomVar = (oom) obj;
                oomVar.getClass();
                java.lang.String strM = defpackage.ool.m(oomVar.b);
                strM.getClass();
                return strM;
            case 13:
                oom oomVar2 = (oom) obj;
                oomVar2.getClass();
                java.lang.String strM2 = defpackage.ool.m(oomVar2.c);
                strM2.getClass();
                return strM2;
            case 14:
                defpackage.ngc ngcVar = defpackage.ngf.a;
                return defpackage.afbk.a;
            case 15:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar8 = nhd.a;
                defpackage.nji.a().l(zBooleanValue);
                return defpackage.afbk.a;
            case 16:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.yqm yqmVar9 = nhd.a;
                defpackage.nji.a().j(zBooleanValue2);
                return defpackage.afbk.a;
            case 17:
                defpackage.afja[] afjaVarArr = defpackage.nik.a;
                ((defpackage.rrv) obj).getClass();
                return defpackage.afbk.a;
            case 18:
                defpackage.yqm yqmVar10 = njd.a;
                return java.lang.Boolean.valueOf(defpackage.afga.f((java.lang.Boolean) obj, java.lang.Boolean.TRUE));
            case 19:
                return defpackage.tna.az((defpackage.cim) obj);
            default:
                return defpackage.tna.az((defpackage.cim) obj);
        }
    }
}
