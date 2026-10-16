package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ikt implements defpackage.xyd {
    private final /* synthetic */ int a;

    public /* synthetic */ ikt(int i) {
        this.a = i;
    }

    @Override // defpackage.xyd
    public final java.lang.Object a(java.lang.Object obj) {
        boolean zB = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return ((uem) obj).a();
            case 1:
                return ((rcd) obj).a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((rcc) obj).a();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.yqm yqmVar = defpackage.jod.a;
                if (!java.lang.Boolean.TRUE.equals(bool)) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jod.a.h()).ai((char) 2437)).u("ICar release task succeeded but did not release ICar.");
                }
                return bool;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = koc.a;
                return new defpackage.htw((rse) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(j$.util.Objects.nonNull((android.bluetooth.BluetoothDevice) obj));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.htw.o(obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.rqt.a((android.content.Context) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.rqt.a((android.content.Context) obj);
            case 9:
                return (pmv) obj;
            case 10:
                return java.lang.Long.valueOf(((pui) obj).a);
            case 11:
                return pws.b;
            case 12:
                uem uemVar = new uem();
                for (pxg pxgVar : (java.util.List) obj) {
                    if (pxgVar != null) {
                        uemVar.c(pxgVar);
                    }
                }
                return uemVar;
            case 13:
                return java.lang.Integer.valueOf(((zcl) obj).b);
            case 14:
                defpackage.oup oupVar = (defpackage.oup) obj;
                defpackage.ouq ouqVar = oupVar.f;
                if (ouqVar == null) {
                    ouqVar = defpackage.ouq.a;
                }
                defpackage.abqv abqvVar = ouqVar.c;
                if (abqvVar == null) {
                    abqvVar = defpackage.abqv.a;
                }
                return new rfm(abqvVar, new rfl(oupVar, 1));
            case 15:
                ouy ouyVar = (ouy) obj;
                ovb ovbVar = ouyVar.f;
                if (ovbVar == null) {
                    ovbVar = ovb.a;
                }
                defpackage.abqv abqvVar2 = ovbVar.c;
                if (abqvVar2 == null) {
                    abqvVar2 = defpackage.abqv.a;
                }
                return new rfm(abqvVar2, new rfl(ouyVar, 0));
            case 16:
                return ((defpackage.ovn) obj).name();
            case 17:
                return ((defpackage.sds) obj).name();
            case 18:
                double d = 1.0d;
                for (defpackage.sjo sjoVar : (java.util.List) obj) {
                    zB &= sjoVar.b();
                    d *= sjoVar.e;
                }
                return defpackage.sjo.a(zB, d);
            case 19:
                boolean z = ((com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) obj).a;
                java.util.WeakHashMap weakHashMap = skj.b;
                return java.lang.Boolean.valueOf(z);
            default:
                return ((szm) obj).b;
        }
    }
}
