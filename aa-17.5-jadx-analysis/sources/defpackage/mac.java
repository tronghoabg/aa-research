package defpackage;

import android.bluetooth.BluetoothDevice;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class mac implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ mac(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int i = mad.d;
                ((eqm) obj2).j(0);
                break;
            case 1:
                ((ype) ((ype) ((ype) kyw.a.h()).p((Throwable) obj)).ai(3612)).u("stopVoiceSession failed");
                lah.a().d((ywj) obj2);
                break;
            case 2:
                Integer num = (Integer) obj;
                Long l = (Long) obj2;
                ((ype) mos.a.l().ai(5127)).M("Display state %d. Total duration: %d ms", num, l);
                int iIntValue = num.intValue();
                yzy yzyVar = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 6 ? yzy.qf : yzy.qe : yzy.qd : yzy.qc : yzy.qb : yzy.qa;
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.NO_FACET, yzyVar);
                rrbVarH.u(l.longValue());
                ohsVarJ.F(rrbVarH.l());
                break;
            case 3:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                ((ype) oyw.a.l().ai((char) 6209)).y("Broadcast expired, unable to fetch Uuids for: %s", bluetoothDevice);
                Object obj3 = ((trd) obj2).b;
                int i2 = yfq.d;
                ((dnw) obj3).b(new oyv(bluetoothDevice, yls.a));
                break;
            case 4:
                ((aetq) obj).add(obj2);
                break;
            case 5:
                ((aeug) obj).add(obj2);
                break;
            case 6:
                ((aeul) obj).add(obj2);
                break;
            default:
                ((aexh) obj).add(obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
