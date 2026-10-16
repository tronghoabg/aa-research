package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpl implements defpackage.xyd {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpl(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.xyd
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.abor aborVarN = defpackage.yyq.a.n();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.hardware.usb.action.USB_STATE");
                defpackage.kpt kptVar = (defpackage.kpt) this.a;
                android.content.Context context = kptVar.b;
                android.content.Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                boolean booleanExtra = intentRegisterReceiver == null ? false : intentRegisterReceiver.getBooleanExtra("connected", false);
                aborVarN.t();
                defpackage.yyq yyqVar = (defpackage.yyq) aborVarN.b;
                yyqVar.b |= 1;
                yyqVar.c = booleanExtra;
                boolean zY = kptVar.y();
                aborVarN.t();
                defpackage.yyq yyqVar2 = (defpackage.yyq) aborVarN.b;
                yyqVar2.b |= 8;
                yyqVar2.f = zY;
                boolean z = kptVar.o;
                aborVarN.t();
                defpackage.yyq yyqVar3 = (defpackage.yyq) aborVarN.b;
                yyqVar3.b |= 16;
                yyqVar3.g = z;
                aborVarN.t();
                defpackage.yyq yyqVar4 = (defpackage.yyq) aborVarN.b;
                yyqVar4.b |= 2;
                yyqVar4.d = zBooleanValue;
                aborVarN.t();
                defpackage.yyq yyqVar5 = (defpackage.yyq) aborVarN.b;
                yyqVar5.b |= 4;
                yyqVar5.e = zBooleanValue;
                android.content.Intent intentRegisterReceiver2 = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                int intExtra = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("plugged", 0) : 0;
                if (intExtra > 0) {
                    aborVarN.t();
                    defpackage.yyq yyqVar6 = (defpackage.yyq) aborVarN.b;
                    yyqVar6.b |= 32;
                    yyqVar6.h = intExtra;
                }
                return (defpackage.yyq) aborVarN.q();
            case 1:
                return ((defpackage.imi) this.a).m((com.google.android.gms.car.display.CarDisplayId) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.ref) this.a).E();
                return null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return this.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                boolean zG = ((defpackage.nub) obj).g();
                defpackage.rqu rquVar = zG ? defpackage.rqu.b : defpackage.rqu.c;
                if (((defpackage.rqv) this.a).b.getAndSet(rquVar) != rquVar) {
                    defpackage.rqv.a.l().ai(8220).M("Checkbox changed to %s. ThreadName: %s", rquVar, java.lang.Thread.currentThread().getName());
                }
                return java.lang.Boolean.valueOf(zG);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.siu siuVar = (defpackage.siu) obj;
                if (siuVar != null) {
                    defpackage.abot abotVar = ((defpackage.sim) this.a).p;
                    defpackage.acbp acbpVar = ((defpackage.acbo) abotVar.b).l;
                    if (acbpVar == null) {
                        acbpVar = defpackage.acbp.a;
                    }
                    defpackage.abot abotVar2 = (defpackage.abot) acbpVar.K();
                    defpackage.acbp acbpVar2 = ((defpackage.acbo) abotVar.b).l;
                    if (acbpVar2 == null) {
                        acbpVar2 = defpackage.acbp.a;
                    }
                    zqk zqkVar = acbpVar2.e;
                    if (zqkVar == null) {
                        zqkVar = zqk.a;
                    }
                    defpackage.abor aborVarK = zqkVar.K();
                    java.lang.String strB = siuVar.b();
                    aborVarK.t();
                    zqk zqkVar2 = aborVarK.b;
                    strB.getClass();
                    zqkVar2.c = strB;
                    zqi zqiVarA = siuVar.a();
                    aborVarK.t();
                    zqk zqkVar3 = aborVarK.b;
                    zqiVarA.getClass();
                    zqkVar3.d = zqiVarA;
                    zqkVar3.b |= 1;
                    abotVar2.t();
                    defpackage.acbp acbpVar3 = (defpackage.acbp) abotVar2.b;
                    zqk zqkVarQ = aborVarK.q();
                    zqkVarQ.getClass();
                    acbpVar3.e = zqkVarQ;
                    acbpVar3.b |= 4;
                    defpackage.acbp acbpVar4 = (defpackage.acbp) abotVar2.q();
                    abotVar.t();
                    defpackage.acbo acboVar = (defpackage.acbo) abotVar.b;
                    acbpVar4.getClass();
                    acboVar.l = acbpVar4;
                    acboVar.b |= 268435456;
                }
                return null;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.sjw) this.a).a((defpackage.sim) obj, defpackage.sjo.c);
            default:
                java.lang.String str = (java.lang.String) obj;
                return defpackage.wde.a("", str, (byte[]) ((defpackage.wde) this.a).c.get(str));
        }
    }
}
