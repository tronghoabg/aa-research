package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class kpf implements xwx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.xwx
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                abnp abnpVarN = yxl.a.n();
                IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_STATE");
                kpn kpnVar = (kpn) this.a;
                Context context = kpnVar.b;
                Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                boolean booleanExtra = intentRegisterReceiver == null ? false : intentRegisterReceiver.getBooleanExtra("connected", false);
                abnpVarN.t();
                yxl yxlVar = (yxl) abnpVarN.b;
                yxlVar.b |= 1;
                yxlVar.c = booleanExtra;
                boolean zY = kpnVar.y();
                abnpVarN.t();
                yxl yxlVar2 = (yxl) abnpVarN.b;
                yxlVar2.b |= 8;
                yxlVar2.f = zY;
                boolean z = kpnVar.o;
                abnpVarN.t();
                yxl yxlVar3 = (yxl) abnpVarN.b;
                yxlVar3.b |= 16;
                yxlVar3.g = z;
                abnpVarN.t();
                yxl yxlVar4 = (yxl) abnpVarN.b;
                yxlVar4.b |= 2;
                yxlVar4.d = zBooleanValue;
                abnpVarN.t();
                yxl yxlVar5 = (yxl) abnpVarN.b;
                yxlVar5.b |= 4;
                yxlVar5.e = zBooleanValue;
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                int intExtra = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("plugged", 0) : 0;
                if (intExtra > 0) {
                    abnpVarN.t();
                    yxl yxlVar6 = (yxl) abnpVarN.b;
                    yxlVar6.b |= 32;
                    yxlVar6.h = intExtra;
                }
                return (yxl) abnpVarN.q();
            case 1:
                return ((ima) this.a).m((CarDisplayId) obj);
            case 2:
                ((rdj) this.a).E();
                return null;
            case 3:
                return this.a;
            case 4:
                boolean zG = ((ntn) obj).g();
                rqa rqaVar = zG ? rqa.b : rqa.c;
                if (((rqb) this.a).b.getAndSet(rqaVar) != rqaVar) {
                    rqb.a.l().ai(8195).M("Checkbox changed to %s. ThreadName: %s", rqaVar, Thread.currentThread().getName());
                }
                return Boolean.valueOf(zG);
            case 5:
                sia siaVar = (sia) obj;
                if (siaVar != null) {
                    abnr abnrVar = ((shr) this.a).p;
                    acan acanVar = ((acam) abnrVar.b).l;
                    if (acanVar == null) {
                        acanVar = acan.a;
                    }
                    abnr abnrVar2 = (abnr) acanVar.K();
                    acan acanVar2 = ((acam) abnrVar.b).l;
                    if (acanVar2 == null) {
                        acanVar2 = acan.a;
                    }
                    zpg zpgVar = acanVar2.e;
                    if (zpgVar == null) {
                        zpgVar = zpg.a;
                    }
                    abnp abnpVarK = zpgVar.K();
                    String strB = siaVar.b();
                    abnpVarK.t();
                    zpg zpgVar2 = (zpg) abnpVarK.b;
                    strB.getClass();
                    zpgVar2.c = strB;
                    zpe zpeVarA = siaVar.a();
                    abnpVarK.t();
                    zpg zpgVar3 = (zpg) abnpVarK.b;
                    zpeVarA.getClass();
                    zpgVar3.d = zpeVarA;
                    zpgVar3.b |= 1;
                    abnrVar2.t();
                    acan acanVar3 = (acan) abnrVar2.b;
                    zpg zpgVar4 = (zpg) abnpVarK.q();
                    zpgVar4.getClass();
                    acanVar3.e = zpgVar4;
                    acanVar3.b |= 4;
                    acan acanVar4 = (acan) abnrVar2.q();
                    abnrVar.t();
                    acam acamVar = (acam) abnrVar.b;
                    acanVar4.getClass();
                    acamVar.l = acanVar4;
                    acamVar.b |= 268435456;
                }
                return null;
            case 6:
                return ((sjc) this.a).a((shr) obj, siu.c);
            default:
                String str = (String) obj;
                return wci.a("", str, (byte[]) ((wci) this.a).c.get(str));
        }
    }
}
