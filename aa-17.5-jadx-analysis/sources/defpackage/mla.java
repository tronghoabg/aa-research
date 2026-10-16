package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.net.wifi.ScanResult;
import com.google.android.apps.auto.components.settings.connectacar.ConnectACarActivity;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class mla implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mla(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                yzy yzyVar = yzy.tx;
                mks mksVar = (mks) obj2;
                if (mksVar.m == null) {
                    throw new IllegalStateException("Fragment must be present to supply UiContext for action being logged.");
                }
                ebf.j().F(rrc.h(yxy.GEARHEAD, mksVar.m.l(), yzyVar).l());
                ((ConnectACarActivity) obj2).finish();
                return;
            case 1:
                ((mkz) this.a).q((kqg) obj);
                return;
            case 2:
                abnp abnpVarF = ((rrb) this.a).F();
                int iIntValue = ((Integer) obj).intValue();
                abnpVarF.t();
                yzn yznVar = (yzn) abnpVarF.b;
                yzn yznVar2 = yzn.a;
                yznVar.b |= 2;
                yznVar.d = iIntValue;
                return;
            case 3:
                Integer num = (Integer) obj;
                ((ype) ((ype) oer.a.f()).ai((char) 5614)).y("Forcing audioRoute=0x%x", num);
                ((oep) this.a).a.t(num.intValue());
                return;
            case 4:
                int iIntValue2 = ((Integer) obj).intValue();
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                yzn yznVar3 = (yzn) abnpVar.b;
                yzn yznVar4 = yzn.a;
                yznVar3.b |= 1;
                yznVar3.c = iIntValue2;
                return;
            case 5:
                ((dsx) this.a).g = (PendingIntent) obj;
                return;
            case 6:
                ((eqj) this.a).q((yfq) obj);
                return;
            case 7:
                if (oqx.a.contains(((oct) obj).a)) {
                    oqx oqxVar = (oqx) this.a;
                    oqxVar.u(oqxVar.b());
                    return;
                }
                return;
            case 8:
                if (oqy.a.contains(((oct) obj).a)) {
                    Object obj3 = this.a;
                    ((eqj) obj3).j(((oqy) obj3).a());
                    return;
                }
                return;
            case 9:
                Object obj4 = this.a;
                ozf.b().d((BluetoothDevice) obj4).c(new oez(obj4, 17), mki.a.d);
                return;
            case 10:
                ((pcz) this.a).b((ScanResult) obj);
                return;
            case 11:
                String str = (String) obj;
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                xpn xpnVar = (xpn) abnpVar2.b;
                xpn xpnVar2 = xpn.a;
                str.getClass();
                xpnVar.b |= 2;
                xpnVar.d = str;
                return;
            case 12:
                ((pgr) this.a).aA.w(new pfw((ozy) obj, true));
                return;
            case 13:
                ((pgr) this.a).aA.w(new pfw((ozy) obj, true));
                return;
            case 14:
                Object obj5 = this.a;
                xpu xpuVar = (xpu) obj;
                ((pgr) obj5).L();
                try {
                    ((zeu) ((pgr) obj5).P.i(((pgr) obj5).r, xpuVar)).s();
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    ((ype) ((ype) ((ype) pgr.a.h()).p(e)).ai((char) 6567)).u("Failed to update WPP info in data store.");
                    return;
                }
            case 15:
                ((pgr) this.a).O((pag) obj);
                return;
            case 16:
                pna pnaVar = ((pnc) this.a).a;
                pnaVar.getClass();
                ((uak) obj).a((abgi) new oya(pnaVar, 7).a());
                return;
            case 17:
                ((qsb) this.a).e((ackk) obj);
                return;
            case 18:
                String string = ((pzk) obj).toString();
                abnp abnpVar3 = (abnp) this.a;
                abnpVar3.t();
                acbv acbvVar = (acbv) abnpVar3.b;
                acbv acbvVar2 = acbv.a;
                acbvVar.c |= 256;
                acbvVar.A = string;
                return;
            case 19:
                abnp abnpVar4 = ((ptf) this.a).g;
                aain aainVar = (aain) obj;
                synchronized (abnpVar4) {
                    abnpVar4.t();
                    acbv acbvVar3 = (acbv) abnpVar4.b;
                    acbv acbvVar4 = acbv.a;
                    aainVar.getClass();
                    acbvVar3.J = aainVar;
                    acbvVar3.c |= 1073741824;
                }
                return;
            default:
                ((yfu) this.a).e(1, (String) obj);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
